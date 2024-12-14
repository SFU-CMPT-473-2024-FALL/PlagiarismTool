const express = require('express');
const multer = require('multer');
const fs = require('fs');
const path = require('path');
const cors = require('cors');

const app = express();
const PORT = 3000;

app.use(cors());

//Test folder path
const testFolderPath = path.join(__dirname, 'test');

//Clear all files in the test folder before uploading files
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

app.use(express.json());
app.use(express.static(path.join(__dirname, 'public')));
app.post('/upload', upload.array('files'), (req, res) => {
    const firstFileName = req.body.firstFileName;

    if (firstFileName) {
        const oldPath = path.join(testFolderPath, firstFileName);
        const newPath = path.join(testFolderPath, `0000_${firstFileName}`);

        //Add prefix to the first file 
        fs.rename(oldPath, newPath, err => {
            if (err) {
                console.error('Error renaming first file:', err);
                return res.status(500).json({ message: 'Failed to rename first file' });
            }
            console.log(`Renamed first file: ${firstFileName} -> 0_Initial_File_${firstFileName}`);
            res.status(200).json({ message: 'Files uploaded successfully!' });
        });
    } else {
        res.status(200).json({ message: 'Files uploaded successfully!' });
    }
});

app.post('/clear-folder', (req, res) => {
    clearTestFolder();
    res.status(200).json({ message: 'Folder cleared successfully!' });
});

app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});
