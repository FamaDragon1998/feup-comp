parser grammar JjQueryParser;

options {
	tokenVocab = JjQueryLexer;
}

src
:
	(
		JAVA
		| jQuery
	)+ EOF
;

jQuery
:
	JQBegin
	(
		in
		| out
		| assign
	)* JQEnd
;

in
:
	IN ID SEMICOLON
;

out
:
	OUT ID SEMICOLON
;

assign
:
	ID EQUALS DOLLAR OPEN_PARENTHESIS QUOTES ID selector ID QUOTES
	CLOSE_PARENTHESIS SEMICOLON
;

selector
:
	OPEN_BRACKET ID OP APOSTROPHE ID APOSTROPHE CLOSE_BRACKET
;
