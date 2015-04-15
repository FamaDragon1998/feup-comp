grammar JjQuery;

import Tokens;

JAVA
:
	'a' NEWLINE*
;

main
:
	JAVA
	(
		(
			JQUERYBLOCKSTART jQueryBlock
		)* JAVA
	)?
	| JAVA
	(
		(
			JQUERYBLOCKSTART jQueryBlock JAVA
		)*
	)?
;

jQueryBlock
:
	(
		jQuery SINGLE_LINE_COMMENT? NEWLINE*
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
