# PlagiarismTool

Base 

To run:

1. In root folder:

javac src/PlagiarismTool.java 

java -cp . src.PlagiarismTool test



ANTLR

To run:

1. In Plagiarism/srcANTLR folder, compile grammar file using:

java -jar ../lib/antlr-4.13.2-complete.jar PlagiarismTool.g4

2. In root (PLAGIARISMTOOL) folder; compile using:

javac -d bin srcANTLR/PlagiarismToolBaseListener.java srcANTLR/PlagiarismToolLexer.java srcANTLR/PlagiarismToolListener.java srcANTLR/PlagiarismToolParser.java srcANTLR/PlagiarismToolANTLR.java
 
java -cp "bin;lib/antlr-4.13.2-complete.jar" PlagiarismToolANTLR test
