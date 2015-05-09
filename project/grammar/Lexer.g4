lexer grammar Lexer;

tokens {
	WHITESPACE_CHANNEL,
	COMMENTS_CHANNEL
}

// Default mode rules (the SEA)

JAVA
:
	.
;

JQBegin
:
	'/*@jQ' -> pushMode ( JQUERY )
;

mode JQUERY;

JQEnd
:
	'*/' -> popMode
;

IN
:
	'in'
;

OUT
:
	'out'
;

ID
:
	[a-zA-Z_] [a-zA-Z0-9_]*
;

QUOTES
:
	'\"'
;

APOSTROPHE
:
	'\''
;

SEMICOLON
:
	';'
;

EQUALS
:
	'='
;

DOLLAR
:
	'$'
;

OP
:
	'*='
	| '|='
	| '~='
	| '$='
	| '='
	| '!='
	| '^='
;

OPEN_PARENTHESIS
:
	'('
;

CLOSE_PARENTHESIS
:
	')'
;

OPEN_BRACKET
:
	'['
;

CLOSE_BRACKET
:
	']'
;

WS
:
	[ \t\r\n]+ -> channel ( WHITESPACE_CHANNEL )
;

SINGLE_LINE_COMMENT
:
	'//' .*? '\n' -> channel ( COMMENTS_CHANNEL )
;
