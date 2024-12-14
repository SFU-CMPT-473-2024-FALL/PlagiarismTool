const fs = require('fs');
const path = require('path');
// const parser = require('./parse-java.js');
const { constructSyntaxTree } = require('./parse-java');
// const winnow = require('./winnow');
const { winnow } = require('./winnow');

const args = process.argv.slice(2);


async function main() {
    if (args.length != 1) {
        console.log("Usage: node tree-sitter.js <path_to_test_folder>");
        return;
    }

    // make it appear that the test path is relative to root directory
    const testFolder = path.resolve(__dirname, "../" + args[0]);
    if (!fs.existsSync(testFolder) || !fs.statSync(testFolder).isDirectory()) {
        console.log("Invalid folder path: ", testFolder);
        return;
    }

    var files = [];
    try {
      const entries = fs.readdirSync(testFolder);
      
      for (const entry of entries) {
        const fullPath = path.join(testFolder, entry);
        if (fs.statSync(fullPath).isFile()) {
          files.push(fullPath);
        }
      }
    } catch (err) {
      console.log("ERROR: couldn't read the directory");
      return;
    }

    if (files.length < 2) {
        console.log("Not enough files in the folder to compare");
        return;
    }

    const baseFile = files[0];
    const baseTree = constructSyntaxTree(baseFile);

    for (let i=1; i < files.length; i++) {
        const otherFile = files[i]; 
        const otherTree = constructSyntaxTree(otherFile);

        const similarityMetric = await winnow(baseTree, otherTree);
        console.log(`Plagiarism percentage (Jaccard Similarity): ${similarityMetric * 100}`);
    }
}

main();


// const dataDir = path.resolve(__dirname, "../data/dataset");
// const plagInsertDir = "";
// const plagInsertAfterReorderDir = "";
// const plagReorderDir = path.resolve(__dirname, "../data/plags/reorder");

// function getSubdirectories(parentDir) {
//     return fs.readdirSync(parentDir)
//         .map(file => path.join(parentDir, file))
//         .filter(filePath => fs.statSync(filePath).isDirectory());
// }

// function getJavaFile(subdir) {
//     const files = fs.readdirSync(subdir);
//     return files
//         .map(file => path.join(subdir, file))
//         .find(filePath => path.extname(filePath) === '.java');
// }

// async function main() {
//     const datasetSubdirs = getSubdirectories(dataDir);
//     const plagiarizedSubdirs = getSubdirectories(plagReorderDir);

//     if (datasetSubdirs.length !== plagiarizedSubdirs.length) {
//         console.log("NUM DIRS NOT MATCHING!");
//         return;
//     }

//     let fileCount = 0;

//     for (let i = 0; i < datasetSubdirs.length; i++) {
//         const datasetSubdir = datasetSubdirs[i];
//         const plagiarizedSubdir = plagiarizedSubdirs[i];

//         const datasetFile = getJavaFile(datasetSubdir);
//         const plagiarizedFile = getJavaFile(plagiarizedSubdir);

//         if (datasetFile && plagiarizedFile) {
//             //const datasetPath = path.join(dataDir, datasetSubdir, datasetFile);
//             //const plagiarizedPath = path.join(plagReorderDir, plagiarizedSubdir, plagiarizedFile);

//             try {
//                 const originalTree = constructSyntaxTree(datasetFile);
//                 const plagiarizedTree = constructSyntaxTree(plagiarizedFile);

//                 const similarityMetric = await winnow(originalTree, plagiarizedTree);
//                 console.log(`Similarity between '${datasetFile}' and '${plagiarizedFile}': ${similarityMetric}`);

//                 fileCount++;
//             } catch (error) {
//                 console.error(`Error processing files: ${datasetFile} and ${plagiarizedFile}`, error);
//             }
//         } else {
//             console.log(`No Java file found in subdirectory: ${datasetSubdir}`);
//         }
//     }

//     console.log(`**************** ${fileCount} FILES READ!`);
// }
