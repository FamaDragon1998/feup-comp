grammar JjQuery;

import Tokens;

main
:
	java
	(
		jQueryBlock+ java
	)*
;

java
:
	.*?
;

/*
java
:
	row*?
;

row
:
	TEXT NEWLINE?
;

TEXT
:
	~[\n\r]+
;
*/
jQueryBlock
:
	JQUERYBLOCKSTART
	(
		jQueryStatement SINGLE_LINE_COMMENT?
	)* JQUERYBLOCKEND
;

jQueryStatement
:
	in
	| out
	| assign
;

in
:
	'in' ID SEMICOLON
;

out
:
	'out' ID SEMICOLON
;

assign
:
	ID '=' DOLLAR OPEN_PARENTHESIS QUOTES ID selector ID QUOTES CLOSE_PARENTHESIS
	SEMICOLON
;

selector
:
	OPEN_BRACKET ID OP APOSTROPHE ID APOSTROPHE CLOSE_BRACKET
;
