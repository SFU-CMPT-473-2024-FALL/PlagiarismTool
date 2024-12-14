const Parser = require('tree-sitter');
const Java = require('tree-sitter-java');
const fs = require('fs');
const path = require('path')


const parser = new Parser();
parser.setLanguage(Java);

function constructSyntaxTree(javaPath) {
    const javaSource = fs.readFileSync(javaPath, 'utf8');
    const tree = parser.parse(javaSource);
    const rootNode = tree.rootNode;

    console.log("Root node kind: " + rootNode.type);

    const treeStr = stringifyTree(rootNode, javaSource, 0);
    return treeStr;
}


function stringifyTree(node, source, indentLevel) {
    let result = '';
    const indent = '  '.repeat(indentLevel);
    
    result += `${indent}(${node.type}`;
    
    if (node.namedChildCount === 0) {
        const text = source.slice(node.startByte, node.endByte);
        result += ` "${text}"`;
    }

    result += ')';

    for (let i = 0; i < node.namedChildCount; i++) {
        result += '\n';
        result += stringifyTree(node.namedChild(i), source, indentLevel + 1);
    }

    return result;
}

module.exports = { constructSyntaxTree };



/*

// Load Java code from a file (replace with the path to your Java file)
const code = fs.readFileSync('../data/dataset/0/pa.java', 'utf8');

// Initialize the parser and set the language to Java
const parser = new Parser();
parser.setLanguage(Java);

// Parse the code
const tree = parser.parse(code);

// Print the syntax tree
console.log(tree.rootNode.toString());

*/


