const fs = require('fs');
const path = require('path');
// const parser = require('./parse-java.js');
const { constructSyntaxTree } = require('./parse-java');
// const winnow = require('./winnow');
const { winnow } = require('./winnow');

const dataDir = path.resolve(__dirname, "../data/dataset");
const plagInsertDir = "";
const plagInsertAfterReorderDir = "";
const plagReorderDir = path.resolve(__dirname, "../data/plags/reorder");

function getSubdirectories(parentDir) {
    return fs.readdirSync(parentDir)
        .map(file => path.join(parentDir, file))
        .filter(filePath => fs.statSync(filePath).isDirectory());
}

function getJavaFile(subdir) {
    const files = fs.readdirSync(subdir);
    return files
        .map(file => path.join(subdir, file))
        .find(filePath => path.extname(filePath) === '.java');
}

async function main() {
    const datasetSubdirs = getSubdirectories(dataDir);
    const plagiarizedSubdirs = getSubdirectories(plagReorderDir);

    if (datasetSubdirs.length !== plagiarizedSubdirs.length) {
        console.log("NUM DIRS NOT MATCHING!");
        return;
    }

    let fileCount = 0;

    for (let i = 0; i < datasetSubdirs.length; i++) {
        const datasetSubdir = datasetSubdirs[i];
        const plagiarizedSubdir = plagiarizedSubdirs[i];

        const datasetFile = getJavaFile(datasetSubdir);
        const plagiarizedFile = getJavaFile(plagiarizedSubdir);

        if (datasetFile && plagiarizedFile) {
            //const datasetPath = path.join(dataDir, datasetSubdir, datasetFile);
            //const plagiarizedPath = path.join(plagReorderDir, plagiarizedSubdir, plagiarizedFile);

            try {
                const originalTree = constructSyntaxTree(datasetFile);
                const plagiarizedTree = constructSyntaxTree(plagiarizedFile);

                const similarityMetric = await winnow(originalTree, plagiarizedTree);
                console.log(`Similarity between '${datasetFile}' and '${plagiarizedFile}': ${similarityMetric}`);

                fileCount++;
            } catch (error) {
                console.error(`Error processing files: ${datasetFile} and ${plagiarizedFile}`, error);
            }
        } else {
            console.log(`No Java file found in subdirectory: ${datasetSubdir}`);
        }
    }

    console.log(`**************** ${fileCount} FILES READ!`);
}

main();