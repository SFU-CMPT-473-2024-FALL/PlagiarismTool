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
	[a-zA-Z_][a-zA-Z_0-9]*; 
NUMBER: DIGIT+; 
SYMBOL:
	[;{}(),.<>[\]]; 
OPERATOR: [=+*/!%-]; 
STRING: '"' (~["\r\n])* '"'; 
ESCAPED: '\\' .; 
WHITESPACE: [ \t\r\n]+ -> skip; 

COMMENT: '//' ~[\r\n]* -> skip; 
BLOCK_COMMENT:
	'/*' .*? '*/' -> skip; 

fragment DIGIT: [0-9];