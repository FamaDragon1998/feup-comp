parser grammar Parser;

options {
	tokenVocab = Lexer;
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
