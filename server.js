const express = require('express');
const multer = require('multer');
const fs = require('fs');
const path = require('path');
const cors = require('cors');
const { exec } = require('child_process');
const app = express();
const PORT = 3000;
const testFolderPath = path.join(__dirname, 'test');

app.use(cors());
app.use(express.json());
app.use(express.static(path.join(__dirname, 'public')));

const clearTestFolder = () => {
    fs.readdir(testFolderPath, (err, files) => {
        if (err) console.error('Error reading test folder:', err);
        files.forEach(file => {
            fs.unlink(path.join(testFolderPath, file), err => {
                if (err) console.error('Error deleting file:', err);
            });
        });
    });
};

const storage = multer.diskStorage({
    destination: (req, file, cb) => {
        cb(null, testFolderPath);
    },
    filename: (req, file, cb) => {
        cb(null, file.originalname);
    },
});
const upload = multer({ storage });

app.post('/upload', upload.array('files'), (req, res) => {
    const firstFileName = req.body.firstFileName;

    if (firstFileName) {
        const oldPath = path.join(testFolderPath, firstFileName);
        const newPath = path.join(testFolderPath, `0000_${firstFileName}`);

        fs.rename(oldPath, newPath, err => {
            if (err) {
                console.error('Error renaming first file:', err);
                return res.status(500).json({ message: 'Failed to rename first file' });
            }
            console.log(`Renamed first file: ${firstFileName} -> 0000_${firstFileName}`);
            res.status(200).json({ message: 'Files uploaded successfully!' });
        });
    } else {
        res.status(200).json({ message: 'Files uploaded successfully!' });
    }
});

app.get('/compare-files', (req, res) => {
    const comparisonMethod = req.query.method;
    let command = '';

    if (comparisonMethod === 'standard') {
        command = 'javac src/PlagiarismTool.java && java -cp . src.PlagiarismTool test';
    } else if (comparisonMethod === 'antlr') {
        const antlrScript = `
            @echo off
            "java" -jar "lib/antlr-4.13.2-complete.jar" -o "srcANTLR" "srcANTLR/PlagiarismTool.g4"
            "javac" -cp "lib/antlr-4.13.2-complete.jar" -d "srcANTLR/bin" "srcANTLR/PlagiarismToolBaseListener.java" "srcANTLR/PlagiarismToolLexer.java" "srcANTLR/PlagiarismToolListener.java" "srcANTLR/PlagiarismToolParser.java" "srcANTLR/PlagiarismToolANTLR.java"
            "java" -cp "srcANTLR/bin;lib/antlr-4.13.2-complete.jar" PlagiarismToolANTLR test
        `;

        const scriptPath = path.join(__dirname, 'run-antlr.bat');
        fs.writeFileSync(scriptPath, antlrScript);
        command = `"cmd.exe" /c "${scriptPath}"`;
    } else if (comparisonMethod === 'tree-sitter') {
        command = 'node srcTreesitter/tree-sitter.js test'; 
    } else {
        return res.status(400).json({ message: `Error with method: ${comparisonMethod}` });
    }

    exec(command, (err, stdout, stderr) => {
        if (comparisonMethod === 'antlr') {
            fs.unlinkSync(path.join(__dirname, 'run-antlr.bat'));
        }

        if (err) {
            console.error('Error from execution:', err);
            return res.status(500).json({ message: 'Error from comparison', details: err.message });
        }

        if (stderr) {
            console.error('Standard error output:', stderr);
        }

        console.log('Output:', stdout);
        res.status(200).json({ results: stdout });
    });
});


app.post('/clear-folder', (req, res) => {
    clearTestFolder();
    res.status(200).json({ message: 'Folder cleared successfully!' });
});

app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});
