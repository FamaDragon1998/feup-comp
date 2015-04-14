grammar JjQuery;

WS
:
	[ \t\r\n]+ -> channel ( HIDDEN )
; // skip spaces, tabs, newlines

WORD
:
	[A-Za-z_] [A-Za-z0-9_]*
;

SINGLE_LINE_COMMENT
:
	'//' ~[\r\n]* '\r'? '\n' -> skip
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

main
:
	WORD jQueryBlock* WORD
;

/*
TE
:
	~[JQUERYBLOCKSTART]*
;

test
:
	TE jQuery JQUERYBLOCKEND
; */
jQueryBlock
:
	JQUERYBLOCKSTART jQuery* JQUERYBLOCKEND
;

jQuery
:
	in
	| out
	| define
;

in
:
	'in' WORD ';'
;

out
:
	'out' WORD ';'
;

define
:
	WORD '=' '$' '(' '\"' WORD '[' WORD '*=' '\'' WORD '\'' ']' WORD '\"' ')' ';'
;
