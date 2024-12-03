grammar PlagiarismTool;

diagrams: diagram+;

diagram: section+;

section: WORD ':' body?;

body: textline+;

textline: (
		WORD
		| NUMBER
		| SYMBOL
		| OPERATOR
		| STRING
		| ESCAPED
		| WHITESPACE
	)+;

WORD:
	[a-zA-Z_][a-zA-Z_0-9]*; // Matches identifiers and keywords
NUMBER: DIGIT+; // Matches numbers
SYMBOL:
	[;{}(),.<>[\]]; // Matches common symbols including brackets
OPERATOR: [=+*/!%-]; // Matches operators
STRING: '"' (~["\r\n])* '"'; // Matches string literals
ESCAPED: '\\' .; // Matches escaped sequences like \n, \t
WHITESPACE: [ \t\r\n]+ -> skip; // Skips whitespace

COMMENT: '//' ~[\r\n]* -> skip; // Skips single-line comments
BLOCK_COMMENT:
	'/*' .*? '*/' -> skip; // Skips multi-line comments

fragment DIGIT: [0-9];