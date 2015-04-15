grammar JjQuery;

WS
:
	[ \t\r\n]+ -> skip
; // skip spaces, tabs, newlines

INT
:
	[0-9]+
;

NEWLINE
:
	'\r'? '\n'
;

OPEN
:
	'('
;

CLOSE
:
	')'
;

OP
:
	'*='
;

ID
:
	[a-zA-Z] [a-zA-Z0-9]*
;

SINGLE_LINE_COMMENT
:
	'//' ~[\r\n]* -> skip
;

MULTI_LINE_COMMENT
:
	(
		'/**/'
		| '/*' ~['@jQ'] .*? '*/'
	) -> skip
;

JQUERYBLOCKSTART
:
	'/*@jQ'
;

JQUERYBLOCKEND
:
	'*/'
;

/*
main
:
	JAVA JQUERYBLOCKSTART jQueryBlock
;

JAVA
:
	.*
;
*/
jQueryBlock
:
	jQuery* JQUERYBLOCKEND
;

jQuery
:
	in
	| out
	| define
;

in
:
	'in' ID ';'
;

out
:
	'out' ID ';'
;

define
:
	ID '=' '$' OPEN '\"' ID '[' ID OP '\'' ID '\'' ']' ID '\"' CLOSE ';'
;
