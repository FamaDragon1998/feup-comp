parser grammar Parser;

options {
	tokenVocab = Lexer;
} // use tokens from ModeTagsLexer.g4

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
