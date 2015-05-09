lexer grammar Lexer;

@lexer::members {
    public static final int WHITESPACE = 1;
    public static final int COMMENTS = 2;
}

// Default mode rules (the SEA)

JAVA
:
	.
;

JQBegin
:
	'/*@jQ' -> pushMode ( JQUERY )
;

WS
:
	[ \t\r\n]+ -> channel ( WHITESPACE ) // channel(1)

;

SINGLE_LINE_COMMENT
:
	'//' .*? '\n' -> channel ( COMMENTS ) // channel(2)

;

mode JQUERY;

JQEnd
:
	'*/' -> popMode
;

IN
:
	'in'
;

OUT
:
	'out'
;

ID
:
	[a-zA-Z_] [a-zA-Z0-9_]*
;

SEMICOLON
:
	';'
;
