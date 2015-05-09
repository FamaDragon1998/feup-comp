lexer grammar Tokens;

@lexer::members {
    public static final int WHITESPACE = 1;
    public static final int COMMENTS = 2;
}

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
	| '='
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

DOLLAR
:
	'$'
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
	'//' .*? '\n' -> channel ( COMMENTS ) // channel(1)

;

//MULTI_LINE_COMMENT
//:
//	(
//		'/**/'
//		| '/*' ~['@jQ'] .*? '*/'
//	) -> skip
//;

WS
:
	[ \t\r\n]+ -> channel ( WHITESPACE ) // channel(2)

;
