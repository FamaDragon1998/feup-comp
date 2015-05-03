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

jQueryBlock
:
	JQUERYBLOCKSTART
	(
		jQuery SINGLE_LINE_COMMENT?
	)* JQUERYBLOCKEND
;

jQuery
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
	ID ASSIGN DOLLAR OPEN_PARENTHESES QUOTES ID selector ID QUOTES
	CLOSE_PARENTHESES SEMICOLON
;

selector
:
	OPEN_BRACKET ID OP APOSTROPHE ID APOSTROPHE CLOSE_BRACKET
;
