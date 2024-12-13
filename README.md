# PlagiarismTool
Note: Contains only winnowing and winnowing + ANTLR implementation

Base 

To run:

1. In root folder:

```bash
javac src/PlagiarismTool.java 
```
```bash
java -cp . src.PlagiarismTool test
```


ANTLR

To run:

1. In Plagiarism/srcANTLR folder, compile grammar file using:
```bash
java -jar ../lib/antlr-4.13.2-complete.jar PlagiarismTool.g4
```

2. In root (PLAGIARISMTOOL) folder; compile using:

```bash
javac -cp "lib/antlr-4.13.2-complete.jar" -d bin \
srcANTLR/PlagiarismToolBaseListener.java \
srcANTLR/PlagiarismToolLexer.java \
srcANTLR/PlagiarismToolListener.java \
srcANTLR/PlagiarismToolParser.java \
srcANTLR/PlagiarismToolANTLR.java
```
 
Windows:

```bash
java -cp "bin;lib/antlr-4.13.2-complete.jar" PlagiarismToolANTLR test
```

Linux:

```bash
java -cp "bin:lib/antlr-4.13.2-complete.jar" PlagiarismToolANTLR test
```
