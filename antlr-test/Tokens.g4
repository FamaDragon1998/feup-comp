lexer grammar Tokens;

ID
:
	[a-zA-Z] [a-zA-Z0-9]*
;

INT
:
	[0-9]+
;

OP
:
	'*='
	| '|='
	| '~='
	| '$='

	// TODO
	// | '='

	| '!='
	| '^='
;

JQUERYBLOCKSTART
:
	'/*@jQ'
;

JQUERYBLOCKEND
:
	NEWLINE? '*/'
;

ASSIGN
:
	'='
;

DOLLAR
:
	'$'
;

OPEN_PARENTHESES
:
	'('
;

CLOSE_PARENTHESES
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

NEWLINE
:
	'\r'? '\n'
;

SINGLE_LINE_COMMENT
:
	'//' ~[\r\n]*
;

MULTI_LINE_COMMENT
:
	(
		'/**/'
		| '/*' ~['@jQ'] .*? '*/'
	) -> skip
;

WS
:
	[ \t\r\n]+ -> skip
; // skip spaces, tabs, newlines
