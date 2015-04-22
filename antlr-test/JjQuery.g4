grammar JjQuery;

import Tokens;

main
:
	block*
;


block
:
	(
		java | jQueryBlock
	)
;

java
:
	'a' NEWLINE*
;

jQueryBlock
:
	(
		JQUERYBLOCKSTART NEWLINE* jQuery SINGLE_LINE_COMMENT? NEWLINE*
	)* JQUERYBLOCKEND NEWLINE*
;

jQuery
:
	in
	| out
	| assign
;

in
:
	'in' ID ';'
;

out
:
	'out' ID ';'
;

assign
:
	ID ASSIGN DOLLAR OPEN_PARENTHESES QUOTES ID selector ID QUOTES
	CLOSE_PARENTHESES SEMICOLON
;

selector
:
	OPEN_BRACKET ID OP APOSTROPHE ID APOSTROPHE CLOSE_BRACKET
;
