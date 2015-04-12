grammar JjQuery;

r
:
	WORD '/*@jQ' jquery '*/' WORD
;

WS
:
	[ \t\r\n]+ -> skip
; // skip spaces, tabs, newlines

WORD
:
	[A-Za-z_] [A-Za-z0-9_]*
;

//TEST : [\s\S]*(?=\/\*@jQ) ;

jquery
:
	in out define
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
