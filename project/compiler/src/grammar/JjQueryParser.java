package grammar;

// Generated from JjQueryParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class JjQueryParser extends Parser {
	static {
		// RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int APOSTROPHE = 116, THROW = 46, STATIC = 40,
			INTERFACE = 30, AND_ASSIGN = 97, SEMICOLON = 117, BREAK = 6,
			BYTE = 7, ELSE = 17, ID = 114, IF = 24, ENUM = 18, SUB = 84,
			IN = 112, BANG = 71, LPAREN = 59, DOT = 67, JQEnd = 111, CASE = 8,
			OUT = 113, AT = 105, LINE_COMMENT = 109, StringLiteral = 57,
			ELLIPSIS = 106, LBRACK = 63, JQBegin = 110, PUBLIC = 37,
			THROWS = 47, DOLLAR = 118, NullLiteral = 58, RSHIFT_ASSIGN = 102,
			LBRACE = 61, GOTO = 25, OPEN_PARENTHESIS = 120, SUB_ASSIGN = 94,
			SEMI = 65, CHAR = 10, CLOSE_BRACKET = 123, COLONCOLON = 92,
			ASSIGN = 68, COMMENT = 108, IMPORT = 27, ARROW = 91, BITOR = 88,
			CATCH = 9, MUL_ASSIGN = 95, DOUBLE = 16, PROTECTED = 36, LONG = 31,
			COMMA = 66, BITAND = 87, PRIVATE = 35, CONTINUE = 13, DIV = 86,
			FloatingPointLiteral = 54, LE = 76, QUOTES = 115,
			CharacterLiteral = 56, VOLATILE = 51, EXTENDS = 19,
			INSTANCEOF = 28, NEW = 33, ADD = 83, LT = 70, CLASS = 11, DO = 15,
			FINALLY = 21, Identifier = 104, CONST = 12, PACKAGE = 34,
			OR_ASSIGN = 98, TRY = 49, IntegerLiteral = 53, SYNCHRONIZED = 44,
			CLOSE_PARENTHESIS = 121, MUL = 85, FOR = 23, FINAL = 20,
			RPAREN = 60, CARET = 89, URSHIFT_ASSIGN = 103, BOOLEAN = 5,
			NOTEQUAL = 78, RBRACK = 64, RBRACE = 62, AND = 79, THIS = 45,
			SWITCH = 43, VOID = 50, TRANSIENT = 48, INC = 81, FLOAT = 22,
			NATIVE = 32, DIV_ASSIGN = 96, BooleanLiteral = 55, ABSTRACT = 3,
			STRICTFP = 41, INT = 29, QUESTION = 73, RETURN = 38,
			SINGLE_LINE_COMMENT = 125, LSHIFT_ASSIGN = 101,
			COMMENTS_CHANNEL = 2, ADD_ASSIGN = 93, WS = 107, GE = 77, OP = 119,
			SUPER = 42, OR = 80, DEC = 82, MOD = 90, XOR_ASSIGN = 99,
			ASSERT = 4, EQUAL = 75, OPEN_BRACKET = 122, IMPLEMENTS = 26,
			COLON = 74, GT = 69, SHORT = 39, MOD_ASSIGN = 100, JQUERY_WS = 124,
			WHILE = 52, TILDE = 72, WHITESPACE_CHANNEL = 1, DEFAULT = 14;
	public static final String[] tokenNames = { "<INVALID>",
			"WHITESPACE_CHANNEL", "COMMENTS_CHANNEL", "'abstract'", "'assert'",
			"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'",
			"'class'", "'const'", "'continue'", "'default'", "'do'",
			"'double'", "'else'", "'enum'", "'extends'", "'final'",
			"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'",
			"'import'", "'instanceof'", "'int'", "'interface'", "'long'",
			"'native'", "'new'", "'package'", "'private'", "'protected'",
			"'public'", "'return'", "'short'", "'static'", "'strictfp'",
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'",
			"'throws'", "'transient'", "'try'", "'void'", "'volatile'",
			"'while'", "IntegerLiteral", "FloatingPointLiteral",
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'",
			"LPAREN", "RPAREN", "'{'", "'}'", "LBRACK", "RBRACK", "SEMI",
			"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'",
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'",
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'",
			"'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='",
			"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'",
			"WS", "COMMENT", "LINE_COMMENT", "'/*@jQ'", "'*/'", "'in'",
			"'out'", "ID", "'\"'", "'''", "SEMICOLON", "'$'", "OP",
			"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACKET",
			"CLOSE_BRACKET", "JQUERY_WS", "SINGLE_LINE_COMMENT" };
	public static final int RULE_literal = 0,
			RULE_type = 1,
			RULE_primitiveType = 2,
			RULE_numericType = 3,
			RULE_integralType = 4,
			RULE_floatingPointType = 5,
			RULE_referenceType = 6,
			RULE_classOrInterfaceType = 7,
			RULE_classType = 8,
			RULE_classType_lf_classOrInterfaceType = 9,
			RULE_classType_lfno_classOrInterfaceType = 10,
			RULE_interfaceType = 11,
			RULE_interfaceType_lf_classOrInterfaceType = 12,
			RULE_interfaceType_lfno_classOrInterfaceType = 13,
			RULE_typeVariable = 14,
			RULE_arrayType = 15,
			RULE_dims = 16,
			RULE_typeParameter = 17,
			RULE_typeParameterModifier = 18,
			RULE_typeBound = 19,
			RULE_additionalBound = 20,
			RULE_typeArguments = 21,
			RULE_typeArgumentList = 22,
			RULE_typeArgument = 23,
			RULE_wildcard = 24,
			RULE_wildcardBounds = 25,
			RULE_packageName = 26,
			RULE_typeName = 27,
			RULE_packageOrTypeName = 28,
			RULE_expressionName = 29,
			RULE_methodName = 30,
			RULE_ambiguousName = 31,
			RULE_compilationUnit = 32,
			RULE_packageDeclaration = 33,
			RULE_packageModifier = 34,
			RULE_importDeclaration = 35,
			RULE_singleTypeImportDeclaration = 36,
			RULE_typeImportOnDemandDeclaration = 37,
			RULE_singleStaticImportDeclaration = 38,
			RULE_staticImportOnDemandDeclaration = 39,
			RULE_typeDeclaration = 40,
			RULE_classDeclaration = 41,
			RULE_normalClassDeclaration = 42,
			RULE_classModifier = 43,
			RULE_typeParameters = 44,
			RULE_typeParameterList = 45,
			RULE_superclass = 46,
			RULE_superinterfaces = 47,
			RULE_interfaceTypeList = 48,
			RULE_classBody = 49,
			RULE_classBodyDeclaration = 50,
			RULE_classMemberDeclaration = 51,
			RULE_fieldDeclaration = 52,
			RULE_fieldModifier = 53,
			RULE_variableDeclaratorList = 54,
			RULE_variableDeclarator = 55,
			RULE_variableDeclaratorId = 56,
			RULE_variableInitializer = 57,
			RULE_unannType = 58,
			RULE_unannPrimitiveType = 59,
			RULE_unannReferenceType = 60,
			RULE_unannClassOrInterfaceType = 61,
			RULE_unannClassType = 62,
			RULE_unannClassType_lf_unannClassOrInterfaceType = 63,
			RULE_unannClassType_lfno_unannClassOrInterfaceType = 64,
			RULE_unannInterfaceType = 65,
			RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66,
			RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67,
			RULE_unannTypeVariable = 68,
			RULE_unannArrayType = 69,
			RULE_methodDeclaration = 70,
			RULE_methodModifier = 71,
			RULE_methodHeader = 72,
			RULE_result = 73,
			RULE_methodDeclarator = 74,
			RULE_formalParameterList = 75,
			RULE_formalParameters = 76,
			RULE_formalParameter = 77,
			RULE_variableModifier = 78,
			RULE_lastFormalParameter = 79,
			RULE_receiverParameter = 80,
			RULE_throws_ = 81,
			RULE_exceptionTypeList = 82,
			RULE_exceptionType = 83,
			RULE_methodBody = 84,
			RULE_instanceInitializer = 85,
			RULE_staticInitializer = 86,
			RULE_constructorDeclaration = 87,
			RULE_constructorModifier = 88,
			RULE_constructorDeclarator = 89,
			RULE_simpleTypeName = 90,
			RULE_constructorBody = 91,
			RULE_explicitConstructorInvocation = 92,
			RULE_enumDeclaration = 93,
			RULE_enumBody = 94,
			RULE_enumConstantList = 95,
			RULE_enumConstant = 96,
			RULE_enumConstantModifier = 97,
			RULE_enumBodyDeclarations = 98,
			RULE_interfaceDeclaration = 99,
			RULE_normalInterfaceDeclaration = 100,
			RULE_interfaceModifier = 101,
			RULE_extendsInterfaces = 102,
			RULE_interfaceBody = 103,
			RULE_interfaceMemberDeclaration = 104,
			RULE_constantDeclaration = 105,
			RULE_constantModifier = 106,
			RULE_interfaceMethodDeclaration = 107,
			RULE_interfaceMethodModifier = 108,
			RULE_annotationTypeDeclaration = 109,
			RULE_annotationTypeBody = 110,
			RULE_annotationTypeMemberDeclaration = 111,
			RULE_annotationTypeElementDeclaration = 112,
			RULE_annotationTypeElementModifier = 113,
			RULE_defaultValue = 114,
			RULE_annotation = 115,
			RULE_normalAnnotation = 116,
			RULE_elementValuePairList = 117,
			RULE_elementValuePair = 118,
			RULE_elementValue = 119,
			RULE_elementValueArrayInitializer = 120,
			RULE_elementValueList = 121,
			RULE_markerAnnotation = 122,
			RULE_singleElementAnnotation = 123,
			RULE_arrayInitializer = 124,
			RULE_variableInitializerList = 125,
			RULE_block = 126,
			RULE_blockStatements = 127,
			RULE_blockStatement = 128,
			RULE_localVariableDeclarationStatement = 129,
			RULE_localVariableDeclaration = 130,
			RULE_statement = 131,
			RULE_statementNoShortIf = 132,
			RULE_statementWithoutTrailingSubstatement = 133,
			RULE_emptyStatement = 134,
			RULE_labeledStatement = 135,
			RULE_labeledStatementNoShortIf = 136,
			RULE_expressionStatement = 137,
			RULE_statementExpression = 138,
			RULE_ifThenStatement = 139,
			RULE_ifThenElseStatement = 140,
			RULE_ifThenElseStatementNoShortIf = 141,
			RULE_assertStatement = 142,
			RULE_switchStatement = 143,
			RULE_switchBlock = 144,
			RULE_switchBlockStatementGroup = 145,
			RULE_switchLabels = 146,
			RULE_switchLabel = 147,
			RULE_enumConstantName = 148,
			RULE_whileStatement = 149,
			RULE_whileStatementNoShortIf = 150,
			RULE_doStatement = 151,
			RULE_forStatement = 152,
			RULE_forStatementNoShortIf = 153,
			RULE_basicForStatement = 154,
			RULE_basicForStatementNoShortIf = 155,
			RULE_forInit = 156,
			RULE_forUpdate = 157,
			RULE_statementExpressionList = 158,
			RULE_enhancedForStatement = 159,
			RULE_enhancedForStatementNoShortIf = 160,
			RULE_breakStatement = 161,
			RULE_continueStatement = 162,
			RULE_returnStatement = 163,
			RULE_throwStatement = 164,
			RULE_synchronizedStatement = 165,
			RULE_tryStatement = 166,
			RULE_catches = 167,
			RULE_catchClause = 168,
			RULE_catchFormalParameter = 169,
			RULE_catchType = 170,
			RULE_finally_ = 171,
			RULE_tryWithResourcesStatement = 172,
			RULE_resourceSpecification = 173,
			RULE_resourceList = 174,
			RULE_resource = 175,
			RULE_primary = 176,
			RULE_primaryNoNewArray = 177,
			RULE_primaryNoNewArray_lf_arrayAccess = 178,
			RULE_primaryNoNewArray_lfno_arrayAccess = 179,
			RULE_primaryNoNewArray_lf_primary = 180,
			RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 181,
			RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 182,
			RULE_primaryNoNewArray_lfno_primary = 183,
			RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 184,
			RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 185,
			RULE_classInstanceCreationExpression = 186,
			RULE_classInstanceCreationExpression_lf_primary = 187,
			RULE_classInstanceCreationExpression_lfno_primary = 188,
			RULE_typeArgumentsOrDiamond = 189, RULE_fieldAccess = 190,
			RULE_fieldAccess_lf_primary = 191,
			RULE_fieldAccess_lfno_primary = 192, RULE_arrayAccess = 193,
			RULE_arrayAccess_lf_primary = 194,
			RULE_arrayAccess_lfno_primary = 195, RULE_methodInvocation = 196,
			RULE_methodInvocation_lf_primary = 197,
			RULE_methodInvocation_lfno_primary = 198, RULE_argumentList = 199,
			RULE_methodReference = 200, RULE_methodReference_lf_primary = 201,
			RULE_methodReference_lfno_primary = 202,
			RULE_arrayCreationExpression = 203, RULE_dimExprs = 204,
			RULE_dimExpr = 205, RULE_constantExpression = 206,
			RULE_expression = 207, RULE_lambdaExpression = 208,
			RULE_lambdaParameters = 209,
			RULE_inferredFormalParameterList = 210, RULE_lambdaBody = 211,
			RULE_assignmentExpression = 212, RULE_assignment = 213,
			RULE_leftHandSide = 214, RULE_assignmentOperator = 215,
			RULE_conditionalExpression = 216,
			RULE_conditionalOrExpression = 217,
			RULE_conditionalAndExpression = 218,
			RULE_inclusiveOrExpression = 219, RULE_exclusiveOrExpression = 220,
			RULE_andExpression = 221, RULE_equalityExpression = 222,
			RULE_relationalExpression = 223, RULE_shiftExpression = 224,
			RULE_additiveExpression = 225, RULE_multiplicativeExpression = 226,
			RULE_unaryExpression = 227, RULE_preIncrementExpression = 228,
			RULE_preDecrementExpression = 229,
			RULE_unaryExpressionNotPlusMinus = 230,
			RULE_postfixExpression = 231, RULE_postIncrementExpression = 232,
			RULE_postIncrementExpression_lf_postfixExpression = 233,
			RULE_postDecrementExpression = 234,
			RULE_postDecrementExpression_lf_postfixExpression = 235,
			RULE_castExpression = 236, RULE_jQuery = 237, RULE_assign = 238,
			RULE_selector = 239, RULE_attributeSelector = 240,
			RULE_methodSelector = 241;
	public static final String[] ruleNames = { "literal", "type",
			"primitiveType", "numericType", "integralType",
			"floatingPointType", "referenceType", "classOrInterfaceType",
			"classType", "classType_lf_classOrInterfaceType",
			"classType_lfno_classOrInterfaceType", "interfaceType",
			"interfaceType_lf_classOrInterfaceType",
			"interfaceType_lfno_classOrInterfaceType", "typeVariable",
			"arrayType", "dims", "typeParameter", "typeParameterModifier",
			"typeBound", "additionalBound", "typeArguments",
			"typeArgumentList", "typeArgument", "wildcard", "wildcardBounds",
			"packageName", "typeName", "packageOrTypeName", "expressionName",
			"methodName", "ambiguousName", "compilationUnit",
			"packageDeclaration", "packageModifier", "importDeclaration",
			"singleTypeImportDeclaration", "typeImportOnDemandDeclaration",
			"singleStaticImportDeclaration", "staticImportOnDemandDeclaration",
			"typeDeclaration", "classDeclaration", "normalClassDeclaration",
			"classModifier", "typeParameters", "typeParameterList",
			"superclass", "superinterfaces", "interfaceTypeList", "classBody",
			"classBodyDeclaration", "classMemberDeclaration",
			"fieldDeclaration", "fieldModifier", "variableDeclaratorList",
			"variableDeclarator", "variableDeclaratorId",
			"variableInitializer", "unannType", "unannPrimitiveType",
			"unannReferenceType", "unannClassOrInterfaceType",
			"unannClassType", "unannClassType_lf_unannClassOrInterfaceType",
			"unannClassType_lfno_unannClassOrInterfaceType",
			"unannInterfaceType",
			"unannInterfaceType_lf_unannClassOrInterfaceType",
			"unannInterfaceType_lfno_unannClassOrInterfaceType",
			"unannTypeVariable", "unannArrayType", "methodDeclaration",
			"methodModifier", "methodHeader", "result", "methodDeclarator",
			"formalParameterList", "formalParameters", "formalParameter",
			"variableModifier", "lastFormalParameter", "receiverParameter",
			"throws_", "exceptionTypeList", "exceptionType", "methodBody",
			"instanceInitializer", "staticInitializer",
			"constructorDeclaration", "constructorModifier",
			"constructorDeclarator", "simpleTypeName", "constructorBody",
			"explicitConstructorInvocation", "enumDeclaration", "enumBody",
			"enumConstantList", "enumConstant", "enumConstantModifier",
			"enumBodyDeclarations", "interfaceDeclaration",
			"normalInterfaceDeclaration", "interfaceModifier",
			"extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration",
			"constantDeclaration", "constantModifier",
			"interfaceMethodDeclaration", "interfaceMethodModifier",
			"annotationTypeDeclaration", "annotationTypeBody",
			"annotationTypeMemberDeclaration",
			"annotationTypeElementDeclaration",
			"annotationTypeElementModifier", "defaultValue", "annotation",
			"normalAnnotation", "elementValuePairList", "elementValuePair",
			"elementValue", "elementValueArrayInitializer", "elementValueList",
			"markerAnnotation", "singleElementAnnotation", "arrayInitializer",
			"variableInitializerList", "block", "blockStatements",
			"blockStatement", "localVariableDeclarationStatement",
			"localVariableDeclaration", "statement", "statementNoShortIf",
			"statementWithoutTrailingSubstatement", "emptyStatement",
			"labeledStatement", "labeledStatementNoShortIf",
			"expressionStatement", "statementExpression", "ifThenStatement",
			"ifThenElseStatement", "ifThenElseStatementNoShortIf",
			"assertStatement", "switchStatement", "switchBlock",
			"switchBlockStatementGroup", "switchLabels", "switchLabel",
			"enumConstantName", "whileStatement", "whileStatementNoShortIf",
			"doStatement", "forStatement", "forStatementNoShortIf",
			"basicForStatement", "basicForStatementNoShortIf", "forInit",
			"forUpdate", "statementExpressionList", "enhancedForStatement",
			"enhancedForStatementNoShortIf", "breakStatement",
			"continueStatement", "returnStatement", "throwStatement",
			"synchronizedStatement", "tryStatement", "catches", "catchClause",
			"catchFormalParameter", "catchType", "finally_",
			"tryWithResourcesStatement", "resourceSpecification",
			"resourceList", "resource", "primary", "primaryNoNewArray",
			"primaryNoNewArray_lf_arrayAccess",
			"primaryNoNewArray_lfno_arrayAccess",
			"primaryNoNewArray_lf_primary",
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary",
			"primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary",
			"primaryNoNewArray_lfno_primary",
			"primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary",
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary",
			"classInstanceCreationExpression",
			"classInstanceCreationExpression_lf_primary",
			"classInstanceCreationExpression_lfno_primary",
			"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary",
			"fieldAccess_lfno_primary", "arrayAccess",
			"arrayAccess_lf_primary", "arrayAccess_lfno_primary",
			"methodInvocation", "methodInvocation_lf_primary",
			"methodInvocation_lfno_primary", "argumentList", "methodReference",
			"methodReference_lf_primary", "methodReference_lfno_primary",
			"arrayCreationExpression", "dimExprs", "dimExpr",
			"constantExpression", "expression", "lambdaExpression",
			"lambdaParameters", "inferredFormalParameterList", "lambdaBody",
			"assignmentExpression", "assignment", "leftHandSide",
			"assignmentOperator", "conditionalExpression",
			"conditionalOrExpression", "conditionalAndExpression",
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression",
			"equalityExpression", "relationalExpression", "shiftExpression",
			"additiveExpression", "multiplicativeExpression",
			"unaryExpression", "preIncrementExpression",
			"preDecrementExpression", "unaryExpressionNotPlusMinus",
			"postfixExpression", "postIncrementExpression",
			"postIncrementExpression_lf_postfixExpression",
			"postDecrementExpression",
			"postDecrementExpression_lf_postfixExpression", "castExpression",
			"jQuery", "assign", "selector", "attributeSelector",
			"methodSelector" };

	@Override
	public String getGrammarFileName() {
		return "JjQueryParser.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public JjQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() {
			return getToken(JjQueryParser.StringLiteral, 0);
		}

		public TerminalNode NullLiteral() {
			return getToken(JjQueryParser.NullLiteral, 0);
		}

		public TerminalNode IntegerLiteral() {
			return getToken(JjQueryParser.IntegerLiteral, 0);
		}

		public TerminalNode FloatingPointLiteral() {
			return getToken(JjQueryParser.FloatingPointLiteral, 0);
		}

		public TerminalNode BooleanLiteral() {
			return getToken(JjQueryParser.BooleanLiteral, 0);
		}

		public TerminalNode CharacterLiteral() {
			return getToken(JjQueryParser.CharacterLiteral, 0);
		}

		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_literal;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLiteral(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(484);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral)
						| (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(488);
			switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(486);
					primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(487);
					referenceType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode BOOLEAN() {
			return getToken(JjQueryParser.BOOLEAN, 0);
		}

		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class, 0);
		}

		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primitiveType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType()
			throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx,
				getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(504);
			switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(490);
								annotation();
							}
						}
						setState(495);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(496);
					numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(497);
								annotation();
							}
						}
						setState(502);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(503);
					match(BOOLEAN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class, 0);
		}

		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class, 0);
		}

		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_numericType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterNumericType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(508);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
					setState(506);
					integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
					setState(507);
					floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode SHORT() {
			return getToken(JjQueryParser.SHORT, 0);
		}

		public TerminalNode LONG() {
			return getToken(JjQueryParser.LONG, 0);
		}

		public TerminalNode BYTE() {
			return getToken(JjQueryParser.BYTE, 0);
		}

		public TerminalNode CHAR() {
			return getToken(JjQueryParser.CHAR, 0);
		}

		public TerminalNode INT() {
			return getToken(JjQueryParser.INT, 0);
		}

		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_integralType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterIntegralType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx,
				getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(510);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE)
						| (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() {
			return getToken(JjQueryParser.DOUBLE, 0);
		}

		public TerminalNode FLOAT() {
			return getToken(JjQueryParser.FLOAT, 0);
		}

		public FloatingPointTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_floatingPointType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFloatingPointType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType()
			throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx,
				getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(512);
				_la = _input.LA(1);
				if (!(_la == DOUBLE || _la == FLOAT)) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class, 0);
		}

		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class, 0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_referenceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterReferenceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType()
			throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx,
				getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(517);
			switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(514);
					classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(515);
					typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(516);
					arrayType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}

		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(
				int i) {
			return getRuleContext(
					ClassType_lf_classOrInterfaceTypeContext.class, i);
		}

		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(
					ClassType_lfno_classOrInterfaceTypeContext.class, 0);
		}

		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(
					InterfaceType_lfno_classOrInterfaceTypeContext.class, 0);
		}

		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}

		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(
				int i) {
			return getRuleContext(
					InterfaceType_lf_classOrInterfaceTypeContext.class, i);
		}

		public ClassOrInterfaceTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType()
			throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(521);
				switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
				case 1: {
					setState(519);
					classType_lfno_classOrInterfaceType();
				}
					break;
				case 2: {
					setState(520);
					interfaceType_lfno_classOrInterfaceType();
				}
					break;
				}
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							setState(525);
							switch (getInterpreter().adaptivePredict(_input, 7,
									_ctx)) {
							case 1: {
								setState(523);
								classType_lf_classOrInterfaceType();
							}
								break;
							case 2: {
								setState(524);
								interfaceType_lf_classOrInterfaceType();
							}
								break;
							}
						}
					}
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterClassType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(552);
			switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(530);
								annotation();
							}
						}
						setState(535);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(536);
					match(Identifier);
					setState(538);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(537);
							typeArguments();
						}
					}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(540);
					classOrInterfaceType();
					setState(541);
					match(DOT);
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(542);
								annotation();
							}
						}
						setState(547);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(548);
					match(Identifier);
					setState(550);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(549);
							typeArguments();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public ClassType_lf_classOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classType_lf_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassType_lf_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType()
			throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(554);
				match(DOT);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(555);
							annotation();
						}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(561);
				match(Identifier);
				setState(563);
				switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
				case 1: {
					setState(562);
					typeArguments();
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public ClassType_lfno_classOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classType_lfno_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassType_lfno_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType()
			throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(565);
							annotation();
						}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(571);
				match(Identifier);
				setState(573);
				switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
				case 1: {
					setState(572);
					typeArguments();
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType()
			throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx,
				getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(575);
				classType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends
			ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(
					ClassType_lf_classOrInterfaceTypeContext.class, 0);
		}

		public InterfaceType_lf_classOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceType_lf_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceType_lf_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType()
			throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(577);
				classType_lf_classOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends
			ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(
					ClassType_lfno_classOrInterfaceTypeContext.class, 0);
		}

		public InterfaceType_lfno_classOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceType_lfno_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceType_lfno_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType()
			throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(579);
				classType_lfno_classOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeVariable;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx,
				getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(581);
							annotation();
						}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(587);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterArrayType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(598);
			switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(589);
					primitiveType();
					setState(590);
					dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(592);
					classOrInterfaceType();
					setState(593);
					dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(595);
					typeVariable();
					setState(596);
					dims();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dims;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDims(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(600);
							annotation();
						}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(606);
				match(LBRACK);
				setState(607);
				match(RBRACK);
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(611);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == AT) {
									{
										{
											setState(608);
											annotation();
										}
									}
									setState(613);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(614);
								match(LBRACK);
								setState(615);
								match(RBRACK);
							}
						}
					}
					setState(620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}

		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class, i);
		}

		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class, 0);
		}

		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter()
			throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx,
				getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(621);
							typeParameterModifier();
						}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(627);
				match(Identifier);
				setState(629);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(628);
						typeBound();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TypeParameterModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameterModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterTypeParameterModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier()
			throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(
				_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(631);
				annotation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class, 0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(JjQueryParser.EXTENDS, 0);
		}

		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}

		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class, i);
		}

		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeBound;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeBound(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(643);
			switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(633);
					match(EXTENDS);
					setState(634);
					typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(635);
					match(EXTENDS);
					setState(636);
					classOrInterfaceType();
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == BITAND) {
						{
							{
								setState(637);
								additionalBound();
							}
						}
						setState(642);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class, 0);
		}

		public TerminalNode BITAND() {
			return getToken(JjQueryParser.BITAND, 0);
		}

		public AdditionalBoundContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_additionalBound;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAdditionalBound(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound()
			throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx,
				getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(645);
				match(BITAND);
				setState(646);
				interfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class, 0);
		}

		public TerminalNode LT() {
			return getToken(JjQueryParser.LT, 0);
		}

		public TerminalNode GT() {
			return getToken(JjQueryParser.GT, 0);
		}

		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArguments;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments()
			throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx,
				getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(648);
				match(LT);
				setState(649);
				typeArgumentList();
				setState(650);
				match(GT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public TypeArgumentListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArgumentList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeArgumentList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList()
			throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx,
				getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(652);
				typeArgument();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(653);
							match(COMMA);
							setState(654);
							typeArgument();
						}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class, 0);
		}

		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArgument;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeArgument(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx,
				getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(662);
			switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(660);
					referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(661);
					wildcard();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode QUESTION() {
			return getToken(JjQueryParser.QUESTION, 0);
		}

		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_wildcard;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterWildcard(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(664);
							annotation();
						}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(670);
				match(QUESTION);
				setState(672);
				_la = _input.LA(1);
				if (_la == EXTENDS || _la == SUPER) {
					{
						setState(671);
						wildcardBounds();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(JjQueryParser.EXTENDS, 0);
		}

		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_wildcardBounds;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterWildcardBounds(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds()
			throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx,
				getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(678);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
					setState(674);
					match(EXTENDS);
					setState(675);
					referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
					setState(676);
					match(SUPER);
					setState(677);
					referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class, 0);
		}

		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPackageName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx,
				_parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(681);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PackageNameContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_packageName);
								setState(683);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(684);
								match(DOT);
								setState(685);
								match(Identifier);
							}
						}
					}
					setState(690);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class, 0);
		}

		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(696);
			switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(691);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(692);
					packageOrTypeName(0);
					setState(693);
					match(DOT);
					setState(694);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class, 0);
		}

		public PackageOrTypeNameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageOrTypeName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPackageOrTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName()
			throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx,
				_parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(699);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PackageOrTypeNameContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_packageOrTypeName);
								setState(701);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(702);
								match(DOT);
								setState(703);
								match(Identifier);
							}
						}
					}
					setState(708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class, 0);
		}

		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExpressionName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName()
			throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx,
				getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(714);
			switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(709);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(710);
					ambiguousName(0);
					setState(711);
					match(DOT);
					setState(712);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(716);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class, 0);
		}

		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ambiguousName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAmbiguousName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName()
			throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx,
				_parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(719);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new AmbiguousNameContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_ambiguousName);
								setState(721);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(722);
								match(DOT);
								setState(723);
								match(Identifier);
							}
						}
					}
					setState(728);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 36, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class, i);
		}

		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class, i);
		}

		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}

		public TerminalNode EOF() {
			return getToken(JjQueryParser.EOF, 0);
		}

		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class, 0);
		}

		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}

		public CompilationUnitContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compilationUnit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCompilationUnit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit()
			throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx,
				getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(730);
				switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
				case 1: {
					setState(729);
					packageDeclaration();
				}
					break;
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == IMPORT) {
					{
						{
							setState(732);
							importDeclaration();
						}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << CLASS)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << INTERFACE)
						| (1L << PRIVATE)
						| (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == SEMI || _la == AT) {
					{
						{
							setState(738);
							typeDeclaration();
						}
					}
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(744);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() {
			return getTokens(JjQueryParser.Identifier);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier(int i) {
			return getToken(JjQueryParser.Identifier, i);
		}

		public TerminalNode PACKAGE() {
			return getToken(JjQueryParser.PACKAGE, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}

		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class, i);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public PackageDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPackageDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration()
			throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 66, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(746);
							packageModifier();
						}
					}
					setState(751);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(752);
				match(PACKAGE);
				setState(753);
				match(Identifier);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == DOT) {
					{
						{
							setState(754);
							match(DOT);
							setState(755);
							match(Identifier);
						}
					}
					setState(760);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(761);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public PackageModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPackageModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier()
			throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx,
				getState());
		enterRule(_localctx, 68, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(763);
				annotation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class, 0);
		}

		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,
					0);
		}

		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class, 0);
		}

		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class, 0);
		}

		public ImportDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_importDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration()
			throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 70, RULE_importDeclaration);
		try {
			setState(769);
			switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(765);
					singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(766);
					typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(767);
					singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(768);
					staticImportOnDemandDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends
			ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode IMPORT() {
			return getToken(JjQueryParser.IMPORT, 0);
		}

		public SingleTypeImportDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_singleTypeImportDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSingleTypeImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration()
			throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 72, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(771);
				match(IMPORT);
				setState(772);
				typeName();
				setState(773);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends
			ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class, 0);
		}

		public TerminalNode IMPORT() {
			return getToken(JjQueryParser.IMPORT, 0);
		}

		public TerminalNode MUL() {
			return getToken(JjQueryParser.MUL, 0);
		}

		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeImportOnDemandDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterTypeImportOnDemandDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration()
			throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 74, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(775);
				match(IMPORT);
				setState(776);
				packageOrTypeName(0);
				setState(777);
				match(DOT);
				setState(778);
				match(MUL);
				setState(779);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends
			ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode IMPORT() {
			return getToken(JjQueryParser.IMPORT, 0);
		}

		public SingleStaticImportDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_singleStaticImportDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSingleStaticImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration()
			throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 76, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(781);
				match(IMPORT);
				setState(782);
				match(STATIC);
				setState(783);
				typeName();
				setState(784);
				match(DOT);
				setState(785);
				match(Identifier);
				setState(786);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends
			ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode IMPORT() {
			return getToken(JjQueryParser.IMPORT, 0);
		}

		public TerminalNode MUL() {
			return getToken(JjQueryParser.MUL, 0);
		}

		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_staticImportOnDemandDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStaticImportOnDemandDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration()
			throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 78, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(788);
				match(IMPORT);
				setState(789);
				match(STATIC);
				setState(790);
				typeName();
				setState(791);
				match(DOT);
				setState(792);
				match(MUL);
				setState(793);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class, 0);
		}

		public TypeDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration()
			throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		try {
			setState(798);
			switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(795);
					classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(796);
					interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(797);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class, 0);
		}

		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class, 0);
		}

		public ClassDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterClassDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration()
			throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(802);
			switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(800);
					normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(801);
					enumDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class, i);
		}

		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class, 0);
		}

		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class, 0);
		}

		public NormalClassDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_normalClassDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterNormalClassDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration()
			throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 84, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << FINAL)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == AT) {
					{
						{
							setState(804);
							classModifier();
						}
					}
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(810);
				match(CLASS);
				setState(811);
				match(Identifier);
				setState(813);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(812);
						typeParameters();
					}
				}

				setState(816);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(815);
						superclass();
					}
				}

				setState(819);
				_la = _input.LA(1);
				if (_la == IMPLEMENTS) {
					{
						setState(818);
						superinterfaces();
					}
				}

				setState(821);
				classBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JjQueryParser.STRICTFP, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterClassModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier()
			throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx,
				getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(831);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(823);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(824);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(825);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(826);
					match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
					setState(827);
					match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
					setState(828);
					match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
					setState(829);
					match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
					setState(830);
					match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class, 0);
		}

		public TerminalNode LT() {
			return getToken(JjQueryParser.LT, 0);
		}

		public TerminalNode GT() {
			return getToken(JjQueryParser.GT, 0);
		}

		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters()
			throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx,
				getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(833);
				match(LT);
				setState(834);
				typeParameterList();
				setState(835);
				match(GT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}

		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public TypeParameterListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTypeParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList()
			throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx,
				getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(837);
				typeParameter();
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(838);
							match(COMMA);
							setState(839);
							typeParameter();
						}
					}
					setState(844);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() {
			return getToken(JjQueryParser.EXTENDS, 0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_superclass;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSuperclass(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(845);
				match(EXTENDS);
				setState(846);
				classType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class, 0);
		}

		public TerminalNode IMPLEMENTS() {
			return getToken(JjQueryParser.IMPLEMENTS, 0);
		}

		public SuperinterfacesContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_superinterfaces;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSuperinterfaces(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces()
			throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx,
				getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(848);
				match(IMPLEMENTS);
				setState(849);
				interfaceTypeList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}

		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public InterfaceTypeListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceTypeList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInterfaceTypeList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList()
			throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx,
				getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(851);
				interfaceType();
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(852);
							match(COMMA);
							setState(853);
							interfaceType();
						}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}

		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class, i);
		}

		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterClassBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(859);
				match(LBRACE);
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << BOOLEAN)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << INT)
						| (1L << INTERFACE)
						| (1L << LONG)
						| (1L << NATIVE)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << SHORT)
						| (1L << STATIC)
						| (1L << STRICTFP)
						| (1L << SYNCHRONIZED)
						| (1L << TRANSIENT)
						| (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
					{
						{
							setState(860);
							classBodyDeclaration();
						}
					}
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(866);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class, 0);
		}

		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class, 0);
		}

		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class, 0);
		}

		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class, 0);
		}

		public ClassBodyDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classBodyDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassBodyDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration()
			throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(872);
			switch (getInterpreter().adaptivePredict(_input, 53, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(868);
					classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(869);
					instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(870);
					staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(871);
					constructorDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class, 0);
		}

		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class, 0);
		}

		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class, 0);
		}

		public ClassMemberDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classMemberDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassMemberDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration()
			throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(879);
			switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(874);
					fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(875);
					methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(876);
					classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(877);
					interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(878);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class, 0);
		}

		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class, i);
		}

		public FieldDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFieldDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration()
			throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL)
						| (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC)
						| (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)
						|| _la == AT) {
					{
						{
							setState(881);
							fieldModifier();
						}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(887);
				unannType();
				setState(888);
				variableDeclaratorList();
				setState(889);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode TRANSIENT() {
			return getToken(JjQueryParser.TRANSIENT, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode VOLATILE() {
			return getToken(JjQueryParser.VOLATILE, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFieldModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier()
			throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx,
				getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(899);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(891);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(892);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(893);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(894);
					match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
					setState(895);
					match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
					setState(896);
					match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
					setState(897);
					match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
					setState(898);
					match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public VariableDeclaratorListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclaratorList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableDeclaratorList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList()
			throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(
				_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(901);
				variableDeclarator();
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(902);
							match(COMMA);
							setState(903);
							variableDeclarator();
						}
					}
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public VariableDeclaratorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator()
			throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(
				_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(909);
				variableDeclaratorId();
				setState(912);
				_la = _input.LA(1);
				if (_la == ASSIGN) {
					{
						setState(910);
						match(ASSIGN);
						setState(911);
						variableInitializer();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public VariableDeclaratorIdContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclaratorId;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableDeclaratorId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId()
			throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(
				_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(914);
				match(Identifier);
				setState(916);
				_la = _input.LA(1);
				if (_la == LBRACK || _la == AT) {
					{
						setState(915);
						dims();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public VariableInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer()
			throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(
				_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(920);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(918);
					expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
					setState(919);
					arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class, 0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class, 0);
		}

		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnannType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(924);
			switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(922);
					unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(923);
					unannReferenceType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() {
			return getToken(JjQueryParser.BOOLEAN, 0);
		}

		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class, 0);
		}

		public UnannPrimitiveTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannPrimitiveType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType()
			throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(
				_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(928);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
					setState(926);
					numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
					setState(927);
					match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class, 0);
		}

		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
		}

		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class, 0);
		}

		public UnannReferenceTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannReferenceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannReferenceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType()
			throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(933);
			switch (getInterpreter().adaptivePredict(_input, 63, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(930);
					unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(931);
					unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(932);
					unannArrayType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends
			ParserRuleContext {
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(
					UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,
					0);
		}

		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(
				int i) {
			return getRuleContext(
					UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,
					i);
		}

		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(
					UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,
					0);
		}

		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(
				int i) {
			return getRuleContext(
					UnannClassType_lf_unannClassOrInterfaceTypeContext.class, i);
		}

		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}

		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}

		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType()
			throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(937);
				switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
				case 1: {
					setState(935);
					unannClassType_lfno_unannClassOrInterfaceType();
				}
					break;
				case 2: {
					setState(936);
					unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
					break;
				}
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 66, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							setState(941);
							switch (getInterpreter().adaptivePredict(_input,
									65, _ctx)) {
							case 1: {
								setState(939);
								unannClassType_lf_unannClassOrInterfaceType();
							}
								break;
							case 2: {
								setState(940);
								unannInterfaceType_lf_unannClassOrInterfaceType();
							}
								break;
							}
						}
					}
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 66, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannClassType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnannClassType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType()
			throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx,
				getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(962);
			switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(946);
					match(Identifier);
					setState(948);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(947);
							typeArguments();
						}
					}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(950);
					unannClassOrInterfaceType();
					setState(951);
					match(DOT);
					setState(955);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(952);
								annotation();
							}
						}
						setState(957);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(958);
					match(Identifier);
					setState(960);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(959);
							typeArguments();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext
			extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public UnannClassType_lf_unannClassOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannClassType_lf_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType()
			throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 126,
				RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(964);
				match(DOT);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(965);
							annotation();
						}
					}
					setState(970);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(971);
				match(Identifier);
				setState(973);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(972);
						typeArguments();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext
			extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannClassType_lfno_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType()
			throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 128,
				RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(975);
				match(Identifier);
				setState(977);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(976);
						typeArguments();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class, 0);
		}

		public UnannInterfaceTypeContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType()
			throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(979);
				unannClassType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext
			extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(
					UnannClassType_lf_unannClassOrInterfaceTypeContext.class, 0);
		}

		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannInterfaceType_lf_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType()
			throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 132,
				RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(981);
				unannClassType_lf_unannClassOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext
			extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(
					UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,
					0);
		}

		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType()
			throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(
				_ctx, getState());
		enterRule(_localctx, 134,
				RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(983);
				unannClassType_lfno_unannClassOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public UnannTypeVariableContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannTypeVariable;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnannTypeVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable()
			throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx,
				getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(985);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class, 0);
		}

		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class, 0);
		}

		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unannArrayType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnannArrayType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType()
			throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx,
				getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(996);
			switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(987);
					unannPrimitiveType();
					setState(988);
					dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(990);
					unannClassOrInterfaceType();
					setState(991);
					dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(993);
					unannTypeVariable();
					setState(994);
					dims();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class, 0);
		}

		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class, 0);
		}

		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}

		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class, i);
		}

		public MethodDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration()
			throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << FINAL)
						| (1L << NATIVE)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << STATIC)
						| (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0)
						|| _la == AT) {
					{
						{
							setState(998);
							methodModifier();
						}
					}
					setState(1003);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1004);
				methodHeader();
				setState(1005);
				methodBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode NATIVE() {
			return getToken(JjQueryParser.NATIVE, 0);
		}

		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JjQueryParser.STRICTFP, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode SYNCHRONIZED() {
			return getToken(JjQueryParser.SYNCHRONIZED, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier()
			throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx,
				getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1017);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1007);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1008);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(1009);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(1010);
					match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
					setState(1011);
					match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
					setState(1012);
					match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
					setState(1013);
					match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
					setState(1014);
					match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
					setState(1015);
					match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
					setState(1016);
					match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public ResultContext result() {
			return getRuleContext(ResultContext.class, 0);
		}

		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodHeader;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodHeader(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx,
				getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1036);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(1019);
					result();
					setState(1020);
					methodDeclarator();
					setState(1022);
					_la = _input.LA(1);
					if (_la == THROWS) {
						{
							setState(1021);
							throws_();
						}
					}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
					setState(1024);
					typeParameters();
					setState(1028);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(1025);
								annotation();
							}
						}
						setState(1030);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1031);
					result();
					setState(1032);
					methodDeclarator();
					setState(1034);
					_la = _input.LA(1);
					if (_la == THROWS) {
						{
							setState(1033);
							throws_();
						}
					}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_result;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterResult(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1040);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
					setState(1038);
					unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
					setState(1039);
					match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public MethodDeclaratorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator()
			throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx,
				getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1042);
				match(Identifier);
				setState(1043);
				match(LPAREN);
				setState(1045);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FINAL) | (1L << FLOAT) | (1L << INT)
						| (1L << LONG) | (1L << SHORT))) != 0)
						|| _la == Identifier || _la == AT) {
					{
						setState(1044);
						formalParameterList();
					}
				}

				setState(1047);
				match(RPAREN);
				setState(1049);
				_la = _input.LA(1);
				if (_la == LBRACK || _la == AT) {
					{
						setState(1048);
						dims();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class, 0);
		}

		public TerminalNode COMMA() {
			return getToken(JjQueryParser.COMMA, 0);
		}

		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class, 0);
		}

		public FormalParameterListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList()
			throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(
				_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1056);
			switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1051);
					formalParameters();
					setState(1052);
					match(COMMA);
					setState(1053);
					lastFormalParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1055);
					lastFormalParameter();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class, 0);
		}

		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public FormalParametersContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFormalParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters()
			throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx,
				getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1074);
			switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1058);
					formalParameter();
					setState(1063);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
					while (_alt != 2
							&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1059);
									match(COMMA);
									setState(1060);
									formalParameter();
								}
							}
						}
						setState(1065);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 85,
								_ctx);
					}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1066);
					receiverParameter();
					setState(1071);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 86, _ctx);
					while (_alt != 2
							&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(1067);
									match(COMMA);
									setState(1068);
									formalParameter();
								}
							}
						}
						setState(1073);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 86,
								_ctx);
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public FormalParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter()
			throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx,
				getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1076);
							variableModifier();
						}
					}
					setState(1081);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1082);
				unannType();
				setState(1083);
				variableDeclaratorId();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public VariableModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterVariableModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier()
			throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx,
				getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1087);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1085);
					annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
					setState(1086);
					match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class, 0);
		}

		public TerminalNode ELLIPSIS() {
			return getToken(JjQueryParser.ELLIPSIS, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public LastFormalParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lastFormalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterLastFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter()
			throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(
				_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1106);
			switch (getInterpreter().adaptivePredict(_input, 92, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == FINAL || _la == AT) {
						{
							{
								setState(1089);
								variableModifier();
							}
						}
						setState(1094);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1095);
					unannType();
					setState(1099);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(1096);
								annotation();
							}
						}
						setState(1101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1102);
					match(ELLIPSIS);
					setState(1103);
					variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1105);
					formalParameter();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public ReceiverParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_receiverParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterReceiverParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter()
			throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx,
				getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(1108);
							annotation();
						}
					}
					setState(1113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1114);
				unannType();
				setState(1117);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1115);
						match(Identifier);
						setState(1116);
						match(DOT);
					}
				}

				setState(1119);
				match(THIS);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() {
			return getToken(JjQueryParser.THROWS, 0);
		}

		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class, 0);
		}

		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_throws_;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterThrows_(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1121);
				match(THROWS);
				setState(1122);
				exceptionTypeList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public ExceptionTypeListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exceptionTypeList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExceptionTypeList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList()
			throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx,
				getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1124);
				exceptionType();
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(1125);
							match(COMMA);
							setState(1126);
							exceptionType();
						}
					}
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class, 0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exceptionType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExceptionType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType()
			throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx,
				getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1134);
			switch (getInterpreter().adaptivePredict(_input, 96, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1132);
					classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1133);
					typeVariable();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1138);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
					setState(1136);
					block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
					setState(1137);
					match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public InstanceInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_instanceInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInstanceInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer()
			throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(
				_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1140);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public StaticInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_staticInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterStaticInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer()
			throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx,
				getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1142);
				match(STATIC);
				setState(1143);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class, 0);
		}

		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class, 0);
		}

		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class, 0);
		}

		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}

		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class, i);
		}

		public ConstructorDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstructorDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration()
			throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE)
						| (1L << PROTECTED) | (1L << PUBLIC))) != 0)
						|| _la == AT) {
					{
						{
							setState(1145);
							constructorModifier();
						}
					}
					setState(1150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1151);
				constructorDeclarator();
				setState(1153);
				_la = _input.LA(1);
				if (_la == THROWS) {
					{
						setState(1152);
						throws_();
					}
				}

				setState(1155);
				constructorBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public ConstructorModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstructorModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier()
			throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(
				_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1161);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1157);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1158);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(1159);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(1160);
					match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class, 0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ConstructorDeclaratorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstructorDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator()
			throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(
				_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1164);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(1163);
						typeParameters();
					}
				}

				setState(1166);
				simpleTypeName();
				setState(1167);
				match(LPAREN);
				setState(1169);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FINAL) | (1L << FLOAT) | (1L << INT)
						| (1L << LONG) | (1L << SHORT))) != 0)
						|| _la == Identifier || _la == AT) {
					{
						setState(1168);
						formalParameterList();
					}
				}

				setState(1171);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_simpleTypeName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSimpleTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName()
			throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx,
				getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1173);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class, 0);
		}

		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class, 0);
		}

		public ConstructorBodyContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterConstructorBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody()
			throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx,
				getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1175);
				match(LBRACE);
				setState(1177);
				switch (getInterpreter().adaptivePredict(_input, 103, _ctx)) {
				case 1: {
					setState(1176);
					explicitConstructorInvocation();
				}
					break;
				}
				setState(1180);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK)
						| (1L << BYTE) | (1L << CHAR) | (1L << CLASS)
						| (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE)
						| (1L << ENUM) | (1L << FINAL) | (1L << FLOAT)
						| (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED)
						| (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT)
						| (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER)
						| (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS)
						| (1L << THROW) | (1L << TRY) | (1L << VOID)
						| (1L << WHILE) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (Identifier - 65)) | (1L << (AT - 65)) | (1L << (JQBegin - 65)))) != 0)) {
					{
						setState(1179);
						blockStatements();
					}
				}

				setState(1182);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public ExplicitConstructorInvocationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_explicitConstructorInvocation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterExplicitConstructorInvocation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation()
			throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(
				_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1230);
			switch (getInterpreter().adaptivePredict(_input, 113, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1185);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1184);
							typeArguments();
						}
					}

					setState(1187);
					match(THIS);
					setState(1188);
					match(LPAREN);
					setState(1190);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(1189);
							argumentList();
						}
					}

					setState(1192);
					match(RPAREN);
					setState(1193);
					match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1195);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1194);
							typeArguments();
						}
					}

					setState(1197);
					match(SUPER);
					setState(1198);
					match(LPAREN);
					setState(1200);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(1199);
							argumentList();
						}
					}

					setState(1202);
					match(RPAREN);
					setState(1203);
					match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1204);
					expressionName();
					setState(1205);
					match(DOT);
					setState(1207);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1206);
							typeArguments();
						}
					}

					setState(1209);
					match(SUPER);
					setState(1210);
					match(LPAREN);
					setState(1212);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(1211);
							argumentList();
						}
					}

					setState(1214);
					match(RPAREN);
					setState(1215);
					match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1217);
					primary();
					setState(1218);
					match(DOT);
					setState(1220);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(1219);
							typeArguments();
						}
					}

					setState(1222);
					match(SUPER);
					setState(1223);
					match(LPAREN);
					setState(1225);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(1224);
							argumentList();
						}
					}

					setState(1227);
					match(RPAREN);
					setState(1228);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class, 0);
		}

		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}

		public TerminalNode ENUM() {
			return getToken(JjQueryParser.ENUM, 0);
		}

		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class, i);
		}

		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class, 0);
		}

		public EnumDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration()
			throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx,
				getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << FINAL)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == AT) {
					{
						{
							setState(1232);
							classModifier();
						}
					}
					setState(1237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1238);
				match(ENUM);
				setState(1239);
				match(Identifier);
				setState(1241);
				_la = _input.LA(1);
				if (_la == IMPLEMENTS) {
					{
						setState(1240);
						superinterfaces();
					}
				}

				setState(1243);
				enumBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class, 0);
		}

		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public TerminalNode COMMA() {
			return getToken(JjQueryParser.COMMA, 0);
		}

		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1245);
				match(LBRACE);
				setState(1247);
				_la = _input.LA(1);
				if (_la == Identifier || _la == AT) {
					{
						setState(1246);
						enumConstantList();
					}
				}

				setState(1250);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(1249);
						match(COMMA);
					}
				}

				setState(1253);
				_la = _input.LA(1);
				if (_la == SEMI) {
					{
						setState(1252);
						enumBodyDeclarations();
					}
				}

				setState(1255);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public EnumConstantListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstantList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumConstantList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList()
			throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx,
				getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1257);
				enumConstant();
				setState(1262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 119, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1258);
								match(COMMA);
								setState(1259);
								enumConstant();
							}
						}
					}
					setState(1264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 119, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}

		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class, i);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstant;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx,
				getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(1265);
							enumConstantModifier();
						}
					}
					setState(1270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1271);
				match(Identifier);
				setState(1277);
				_la = _input.LA(1);
				if (_la == LPAREN) {
					{
						setState(1272);
						match(LPAREN);
						setState(1274);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
								| (1L << BYTE)
								| (1L << CHAR)
								| (1L << DOUBLE)
								| (1L << FLOAT)
								| (1L << INT)
								| (1L << LONG)
								| (1L << NEW)
								| (1L << SHORT)
								| (1L << SUPER)
								| (1L << THIS)
								| (1L << VOID)
								| (1L << IntegerLiteral)
								| (1L << FloatingPointLiteral)
								| (1L << BooleanLiteral)
								| (1L << CharacterLiteral)
								| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
								|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
										| (1L << (TILDE - 71))
										| (1L << (INC - 71))
										| (1L << (DEC - 71))
										| (1L << (ADD - 71))
										| (1L << (SUB - 71))
										| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
							{
								setState(1273);
								argumentList();
							}
						}

						setState(1276);
						match(RPAREN);
					}
				}

				setState(1280);
				_la = _input.LA(1);
				if (_la == LBRACE) {
					{
						setState(1279);
						classBody();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public EnumConstantModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstantModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEnumConstantModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier()
			throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(
				_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1282);
				annotation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}

		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class, i);
		}

		public EnumBodyDeclarationsContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumBodyDeclarations;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEnumBodyDeclarations(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations()
			throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(
				_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1284);
				match(SEMI);
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << BOOLEAN)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << INT)
						| (1L << INTERFACE)
						| (1L << LONG)
						| (1L << NATIVE)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << SHORT)
						| (1L << STATIC)
						| (1L << STRICTFP)
						| (1L << SYNCHRONIZED)
						| (1L << TRANSIENT)
						| (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
					{
						{
							setState(1285);
							classBodyDeclaration();
						}
					}
					setState(1290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class, 0);
		}

		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class, 0);
		}

		public InterfaceDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration()
			throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1293);
			switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1291);
					normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1292);
					annotationTypeDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends
			ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class, 0);
		}

		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}

		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class, i);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class, 0);
		}

		public TerminalNode INTERFACE() {
			return getToken(JjQueryParser.INTERFACE, 0);
		}

		public NormalInterfaceDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_normalInterfaceDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterNormalInterfaceDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration()
			throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == AT) {
					{
						{
							setState(1295);
							interfaceModifier();
						}
					}
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1301);
				match(INTERFACE);
				setState(1302);
				match(Identifier);
				setState(1304);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(1303);
						typeParameters();
					}
				}

				setState(1307);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(1306);
						extendsInterfaces();
					}
				}

				setState(1309);
				interfaceBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JjQueryParser.STRICTFP, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JjQueryParser.PROTECTED, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JjQueryParser.PRIVATE, 0);
		}

		public InterfaceModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInterfaceModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier()
			throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx,
				getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1318);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1311);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1312);
					match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
					setState(1313);
					match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
					setState(1314);
					match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
					setState(1315);
					match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
					setState(1316);
					match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
					setState(1317);
					match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(JjQueryParser.EXTENDS, 0);
		}

		public ExtendsInterfacesContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_extendsInterfaces;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExtendsInterfaces(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces()
			throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx,
				getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1320);
				match(EXTENDS);
				setState(1321);
				interfaceTypeList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(
				int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class, i);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}

		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInterfaceBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody()
			throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx,
				getState());
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1323);
				match(LBRACE);
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << BOOLEAN)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << DEFAULT)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << INT)
						| (1L << INTERFACE)
						| (1L << LONG)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (LT - 65)) | (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
					{
						{
							setState(1324);
							interfaceMemberDeclaration();
						}
					}
					setState(1329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1330);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends
			ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class, 0);
		}

		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class, 0);
		}

		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class, 0);
		}

		public InterfaceMemberDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceMemberDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceMemberDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration()
			throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1337);
			switch (getInterpreter().adaptivePredict(_input, 131, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1332);
					constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1333);
					interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1334);
					classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1335);
					interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1336);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class, i);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}

		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class, 0);
		}

		public ConstantDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstantDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration()
			throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL)
						| (1L << PUBLIC) | (1L << STATIC))) != 0)
						|| _la == AT) {
					{
						{
							setState(1339);
							constantModifier();
						}
					}
					setState(1344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1345);
				unannType();
				setState(1346);
				variableDeclaratorList();
				setState(1347);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JjQueryParser.FINAL, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public ConstantModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterConstantModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier()
			throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx,
				getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1353);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1349);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1350);
					match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
					setState(1351);
					match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
					setState(1352);
					match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends
			ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class, 0);
		}

		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}

		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class, 0);
		}

		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class, i);
		}

		public InterfaceMethodDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceMethodDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration()
			throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| _la == AT) {
					{
						{
							setState(1355);
							interfaceMethodModifier();
						}
					}
					setState(1360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1361);
				methodHeader();
				setState(1362);
				methodBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends
			ParserRuleContext {
		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JjQueryParser.STATIC, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JjQueryParser.STRICTFP, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public TerminalNode DEFAULT() {
			return getToken(JjQueryParser.DEFAULT, 0);
		}

		public InterfaceMethodModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_interfaceMethodModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInterfaceMethodModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier()
			throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(
				_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1370);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1364);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1365);
					match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
					setState(1366);
					match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
					setState(1367);
					match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
					setState(1368);
					match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
					setState(1369);
					match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends
			ParserRuleContext {
		public TerminalNode AT() {
			return getToken(JjQueryParser.AT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class, 0);
		}

		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}

		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class, i);
		}

		public TerminalNode INTERFACE() {
			return getToken(JjQueryParser.INTERFACE, 0);
		}

		public AnnotationTypeDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration()
			throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 136, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1372);
								interfaceModifier();
							}
						}
					}
					setState(1377);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 136, _ctx);
				}
				setState(1378);
				match(AT);
				setState(1379);
				match(INTERFACE);
				setState(1380);
				match(Identifier);
				setState(1381);
				annotationTypeBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(
				int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,
					i);
		}

		public AnnotationTypeBodyContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody()
			throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(
				_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1383);
				match(LBRACE);
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << BOOLEAN)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << INT)
						| (1L << INTERFACE)
						| (1L << LONG)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << SHORT)
						| (1L << STATIC) | (1L << STRICTFP))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (Identifier - 65)) | (1L << (AT - 65)))) != 0)) {
					{
						{
							setState(1384);
							annotationTypeMemberDeclaration();
						}
					}
					setState(1389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1390);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends
			ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(
					AnnotationTypeElementDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class, 0);
		}

		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class, 0);
		}

		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeMemberDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeMemberDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration()
			throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1397);
			switch (getInterpreter().adaptivePredict(_input, 138, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1392);
					annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1393);
					constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1394);
					classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1395);
					interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1396);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends
			ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public AnnotationTypeElementModifierContext annotationTypeElementModifier(
				int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class, i);
		}

		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}

		public AnnotationTypeElementDeclarationContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeElementDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeElementDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration()
			throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == ABSTRACT || _la == PUBLIC || _la == AT) {
					{
						{
							setState(1399);
							annotationTypeElementModifier();
						}
					}
					setState(1404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1405);
				unannType();
				setState(1406);
				match(Identifier);
				setState(1407);
				match(LPAREN);
				setState(1408);
				match(RPAREN);
				setState(1410);
				_la = _input.LA(1);
				if (_la == LBRACK || _la == AT) {
					{
						setState(1409);
						dims();
					}
				}

				setState(1413);
				_la = _input.LA(1);
				if (_la == DEFAULT) {
					{
						setState(1412);
						defaultValue();
					}
				}

				setState(1415);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends
			ParserRuleContext {
		public TerminalNode ABSTRACT() {
			return getToken(JjQueryParser.ABSTRACT, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JjQueryParser.PUBLIC, 0);
		}

		public AnnotationTypeElementModifierContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotationTypeElementModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAnnotationTypeElementModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier()
			throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(
				_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1420);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1417);
					annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
					setState(1418);
					match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
					setState(1419);
					match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() {
			return getToken(JjQueryParser.DEFAULT, 0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_defaultValue;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDefaultValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx,
				getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1422);
				match(DEFAULT);
				setState(1423);
				elementValue();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class, 0);
		}

		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class, 0);
		}

		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class, 0);
		}

		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1428);
			switch (getInterpreter().adaptivePredict(_input, 143, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1425);
					normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1426);
					markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1427);
					singleElementAnnotation();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() {
			return getToken(JjQueryParser.AT, 0);
		}

		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public NormalAnnotationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_normalAnnotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterNormalAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation()
			throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx,
				getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1430);
				match(AT);
				setState(1431);
				typeName();
				setState(1432);
				match(LPAREN);
				setState(1434);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1433);
						elementValuePairList();
					}
				}

				setState(1436);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}

		public ElementValuePairListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValuePairList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterElementValuePairList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList()
			throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(
				_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1438);
				elementValuePair();
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(1439);
							match(COMMA);
							setState(1440);
							elementValuePair();
						}
					}
					setState(1445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		public ElementValuePairContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValuePair;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterElementValuePair(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair()
			throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx,
				getState());
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1446);
				match(Identifier);
				setState(1447);
				match(ASSIGN);
				setState(1448);
				elementValue();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValue;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterElementValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx,
				getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1453);
			switch (getInterpreter().adaptivePredict(_input, 146, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1450);
					conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1451);
					elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1452);
					annotation();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends
			ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class, 0);
		}

		public TerminalNode COMMA() {
			return getToken(JjQueryParser.COMMA, 0);
		}

		public ElementValueArrayInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValueArrayInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterElementValueArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer()
			throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(
				_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1455);
				match(LBRACE);
				setState(1457);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1456);
						elementValueList();
					}
				}

				setState(1460);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(1459);
						match(COMMA);
					}
				}

				setState(1462);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public ElementValueListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValueList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterElementValueList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList()
			throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx,
				getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1464);
				elementValue();
				setState(1469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 149, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1465);
								match(COMMA);
								setState(1466);
								elementValue();
							}
						}
					}
					setState(1471);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 149, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() {
			return getToken(JjQueryParser.AT, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public MarkerAnnotationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_markerAnnotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMarkerAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation()
			throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx,
				getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1472);
				match(AT);
				setState(1473);
				typeName();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends
			ParserRuleContext {
		public TerminalNode AT() {
			return getToken(JjQueryParser.AT, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		public SingleElementAnnotationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_singleElementAnnotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSingleElementAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation()
			throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(
				_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1475);
				match(AT);
				setState(1476);
				typeName();
				setState(1477);
				match(LPAREN);
				setState(1478);
				elementValue();
				setState(1479);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public TerminalNode COMMA() {
			return getToken(JjQueryParser.COMMA, 0);
		}

		public ArrayInitializerContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer()
			throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx,
				getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1481);
				match(LBRACE);
				setState(1483);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1482);
						variableInitializerList();
					}
				}

				setState(1486);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(1485);
						match(COMMA);
					}
				}

				setState(1488);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends
			ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class, i);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public VariableInitializerListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableInitializerList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterVariableInitializerList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList()
			throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(
				_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1490);
				variableInitializer();
				setState(1495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 152, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1491);
								match(COMMA);
								setState(1492);
								variableInitializer();
							}
						}
					}
					setState(1497);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 152, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class, 0);
		}

		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_block;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1498);
				match(LBRACE);
				setState(1500);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK)
						| (1L << BYTE) | (1L << CHAR) | (1L << CLASS)
						| (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE)
						| (1L << ENUM) | (1L << FINAL) | (1L << FLOAT)
						| (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED)
						| (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT)
						| (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER)
						| (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS)
						| (1L << THROW) | (1L << TRY) | (1L << VOID)
						| (1L << WHILE) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (Identifier - 65)) | (1L << (AT - 65)) | (1L << (JQBegin - 65)))) != 0)) {
					{
						setState(1499);
						blockStatements();
					}
				}

				setState(1502);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}

		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class, i);
		}

		public BlockStatementsContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockStatements;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBlockStatements(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements()
			throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx,
				getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1504);
				blockStatement();
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT)
						| (1L << ASSERT)
						| (1L << BOOLEAN)
						| (1L << BREAK)
						| (1L << BYTE)
						| (1L << CHAR)
						| (1L << CLASS)
						| (1L << CONTINUE)
						| (1L << DO)
						| (1L << DOUBLE)
						| (1L << ENUM)
						| (1L << FINAL)
						| (1L << FLOAT)
						| (1L << FOR)
						| (1L << IF)
						| (1L << INT)
						| (1L << LONG)
						| (1L << NEW)
						| (1L << PRIVATE)
						| (1L << PROTECTED)
						| (1L << PUBLIC)
						| (1L << RETURN)
						| (1L << SHORT)
						| (1L << STATIC)
						| (1L << STRICTFP)
						| (1L << SUPER)
						| (1L << SWITCH)
						| (1L << SYNCHRONIZED)
						| (1L << THIS)
						| (1L << THROW)
						| (1L << TRY)
						| (1L << VOID)
						| (1L << WHILE)
						| (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral)
						| (1L << CharacterLiteral)
						| (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0)
						|| ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SEMI - 65))
								| (1L << (INC - 65))
								| (1L << (DEC - 65))
								| (1L << (Identifier - 65)) | (1L << (AT - 65)) | (1L << (JQBegin - 65)))) != 0)) {
					{
						{
							setState(1505);
							blockStatement();
						}
					}
					setState(1510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public JQueryContext jQuery() {
			return getRuleContext(JQueryContext.class, 0);
		}

		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(
					LocalVariableDeclarationStatementContext.class, 0);
		}

		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBlockStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement()
			throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx,
				getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1515);
			switch (getInterpreter().adaptivePredict(_input, 155, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1511);
					localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1512);
					classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1513);
					statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1514);
					jQuery();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends
			ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public LocalVariableDeclarationStatementContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_localVariableDeclarationStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterLocalVariableDeclarationStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement()
			throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(
				_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1517);
				localVariableDeclaration();
				setState(1518);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends
			ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class, 0);
		}

		public LocalVariableDeclarationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_localVariableDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterLocalVariableDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration()
			throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(
				_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1520);
							variableModifier();
						}
					}
					setState(1525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1526);
				unannType();
				setState(1527);
				variableDeclaratorList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class, 0);
		}

		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class, 0);
		}

		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class, 0);
		}

		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class, 0);
		}

		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class, 0);
		}

		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(
					StatementWithoutTrailingSubstatementContext.class, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(1535);
			switch (getInterpreter().adaptivePredict(_input, 157, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1529);
					statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1530);
					labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1531);
					ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1532);
					ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1533);
					whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1534);
					forStatement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class, 0);
		}

		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class, 0);
		}

		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class, 0);
		}

		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class, 0);
		}

		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(
					StatementWithoutTrailingSubstatementContext.class, 0);
		}

		public StatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf()
			throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(1542);
			switch (getInterpreter().adaptivePredict(_input, 158, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1537);
					statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1538);
					labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1539);
					ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1540);
					whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1541);
					forStatementNoShortIf();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends
			ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class, 0);
		}

		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class, 0);
		}

		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class, 0);
		}

		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class, 0);
		}

		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class, 0);
		}

		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class, 0);
		}

		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class, 0);
		}

		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class, 0);
		}

		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class, 0);
		}

		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class, 0);
		}

		public StatementWithoutTrailingSubstatementContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementWithoutTrailingSubstatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStatementWithoutTrailingSubstatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement()
			throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(
				_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1556);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
					setState(1544);
					block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
					setState(1545);
					emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
					setState(1546);
					expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
					setState(1547);
					assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
					setState(1548);
					switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
					setState(1549);
					doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
					setState(1550);
					breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
					setState(1551);
					continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
					setState(1552);
					returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
					setState(1553);
					synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
					setState(1554);
					throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
					setState(1555);
					tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_emptyStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEmptyStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement()
			throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx,
				getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1558);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public LabeledStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_labeledStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLabeledStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement()
			throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx,
				getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1560);
				match(Identifier);
				setState(1561);
				match(COLON);
				setState(1562);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends
			ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public LabeledStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_labeledStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterLabeledStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf()
			throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1564);
				match(Identifier);
				setState(1565);
				match(COLON);
				setState(1566);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class, 0);
		}

		public ExpressionStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterExpressionStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement()
			throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(
				_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1568);
				statementExpression();
				setState(1569);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class, 0);
		}

		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class, 0);
		}

		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class, 0);
		}

		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class, 0);
		}

		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,
					0);
		}

		public StatementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStatementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression()
			throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(1578);
			switch (getInterpreter().adaptivePredict(_input, 160, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1571);
					assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1572);
					preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1573);
					preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1574);
					postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1575);
					postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1576);
					methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1577);
					classInstanceCreationExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() {
			return getToken(JjQueryParser.IF, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public IfThenStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifThenStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterIfThenStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement()
			throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx,
				getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1580);
				match(IF);
				setState(1581);
				match(LPAREN);
				setState(1582);
				expression();
				setState(1583);
				match(RPAREN);
				setState(1584);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() {
			return getToken(JjQueryParser.ELSE, 0);
		}

		public TerminalNode IF() {
			return getToken(JjQueryParser.IF, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public IfThenElseStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifThenElseStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterIfThenElseStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement()
			throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(
				_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1586);
				match(IF);
				setState(1587);
				match(LPAREN);
				setState(1588);
				expression();
				setState(1589);
				match(RPAREN);
				setState(1590);
				statementNoShortIf();
				setState(1591);
				match(ELSE);
				setState(1592);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends
			ParserRuleContext {
		public TerminalNode ELSE() {
			return getToken(JjQueryParser.ELSE, 0);
		}

		public TerminalNode IF() {
			return getToken(JjQueryParser.IF, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class, i);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifThenElseStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterIfThenElseStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf()
			throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1594);
				match(IF);
				setState(1595);
				match(LPAREN);
				setState(1596);
				expression();
				setState(1597);
				match(RPAREN);
				setState(1598);
				statementNoShortIf();
				setState(1599);
				match(ELSE);
				setState(1600);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public TerminalNode ASSERT() {
			return getToken(JjQueryParser.ASSERT, 0);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public AssertStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assertStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAssertStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement()
			throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx,
				getState());
		enterRule(_localctx, 284, RULE_assertStatement);
		try {
			setState(1612);
			switch (getInterpreter().adaptivePredict(_input, 161, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1602);
					match(ASSERT);
					setState(1603);
					expression();
					setState(1604);
					match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1606);
					match(ASSERT);
					setState(1607);
					expression();
					setState(1608);
					match(COLON);
					setState(1609);
					expression();
					setState(1610);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class, 0);
		}

		public TerminalNode SWITCH() {
			return getToken(JjQueryParser.SWITCH, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public SwitchStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSwitchStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement()
			throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx,
				getState());
		enterRule(_localctx, 286, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1614);
				match(SWITCH);
				setState(1615);
				match(LPAREN);
				setState(1616);
				expression();
				setState(1617);
				match(RPAREN);
				setState(1618);
				switchBlock();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode RBRACE() {
			return getToken(JjQueryParser.RBRACE, 0);
		}

		public TerminalNode LBRACE() {
			return getToken(JjQueryParser.LBRACE, 0);
		}

		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class, i);
		}

		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}

		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}

		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class, i);
		}

		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSwitchBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1620);
				match(LBRACE);
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 162, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1621);
								switchBlockStatementGroup();
							}
						}
					}
					setState(1626);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 162, _ctx);
				}
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == CASE || _la == DEFAULT) {
					{
						{
							setState(1627);
							switchLabel();
						}
					}
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1633);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends
			ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class, 0);
		}

		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class, 0);
		}

		public SwitchBlockStatementGroupContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchBlockStatementGroup;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSwitchBlockStatementGroup(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup()
			throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(
				_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1635);
				switchLabels();
				setState(1636);
				blockStatements();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}

		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class, i);
		}

		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchLabels;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSwitchLabels(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx,
				getState());
		enterRule(_localctx, 292, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1638);
				switchLabel();
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == CASE || _la == DEFAULT) {
					{
						{
							setState(1639);
							switchLabel();
						}
					}
					setState(1644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() {
			return getToken(JjQueryParser.CASE, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class, 0);
		}

		public TerminalNode DEFAULT() {
			return getToken(JjQueryParser.DEFAULT, 0);
		}

		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class, 0);
		}

		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchLabel;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSwitchLabel(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabel);
		try {
			setState(1655);
			switch (getInterpreter().adaptivePredict(_input, 165, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1645);
					match(CASE);
					setState(1646);
					constantExpression();
					setState(1647);
					match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1649);
					match(CASE);
					setState(1650);
					enumConstantName();
					setState(1651);
					match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1653);
					match(DEFAULT);
					setState(1654);
					match(COLON);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public EnumConstantNameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstantName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterEnumConstantName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName()
			throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx,
				getState());
		enterRule(_localctx, 296, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1657);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public TerminalNode WHILE() {
			return getToken(JjQueryParser.WHILE, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterWhileStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement()
			throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx,
				getState());
		enterRule(_localctx, 298, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1659);
				match(WHILE);
				setState(1660);
				match(LPAREN);
				setState(1661);
				expression();
				setState(1662);
				match(RPAREN);
				setState(1663);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends
			ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode WHILE() {
			return getToken(JjQueryParser.WHILE, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public WhileStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterWhileStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf()
			throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1665);
				match(WHILE);
				setState(1666);
				match(LPAREN);
				setState(1667);
				expression();
				setState(1668);
				match(RPAREN);
				setState(1669);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() {
			return getToken(JjQueryParser.DO, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public TerminalNode WHILE() {
			return getToken(JjQueryParser.WHILE, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_doStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDoStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1671);
				match(DO);
				setState(1672);
				statement();
				setState(1673);
				match(WHILE);
				setState(1674);
				match(LPAREN);
				setState(1675);
				expression();
				setState(1676);
				match(RPAREN);
				setState(1677);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class, 0);
		}

		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class, 0);
		}

		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterForStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx,
				getState());
		enterRule(_localctx, 304, RULE_forStatement);
		try {
			setState(1681);
			switch (getInterpreter().adaptivePredict(_input, 166, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1679);
					basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1680);
					enhancedForStatement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class, 0);
		}

		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class, 0);
		}

		public ForStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterForStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf()
			throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatementNoShortIf);
		try {
			setState(1685);
			switch (getInterpreter().adaptivePredict(_input, 167, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1683);
					basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1684);
					enhancedForStatementNoShortIf();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(JjQueryParser.SEMI);
		}

		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class, 0);
		}

		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class, 0);
		}

		public TerminalNode FOR() {
			return getToken(JjQueryParser.FOR, 0);
		}

		public TerminalNode SEMI(int i) {
			return getToken(JjQueryParser.SEMI, i);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BasicForStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_basicForStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBasicForStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement()
			throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx,
				getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1687);
				match(FOR);
				setState(1688);
				match(LPAREN);
				setState(1690);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FINAL) | (1L << FLOAT) | (1L << INT)
						| (1L << LONG) | (1L << NEW) | (1L << SHORT)
						| (1L << SUPER) | (1L << THIS) | (1L << VOID)
						| (1L << IntegerLiteral) | (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral) | (1L << CharacterLiteral)
						| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81))
								| (1L << (DEC - 81))
								| (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
					{
						setState(1689);
						forInit();
					}
				}

				setState(1692);
				match(SEMI);
				setState(1694);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1693);
						expression();
					}
				}

				setState(1696);
				match(SEMI);
				setState(1698);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81))
								| (1L << (DEC - 81))
								| (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
					{
						setState(1697);
						forUpdate();
					}
				}

				setState(1700);
				match(RPAREN);
				setState(1701);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends
			ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(JjQueryParser.SEMI);
		}

		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class, 0);
		}

		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class, 0);
		}

		public TerminalNode FOR() {
			return getToken(JjQueryParser.FOR, 0);
		}

		public TerminalNode SEMI(int i) {
			return getToken(JjQueryParser.SEMI, i);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BasicForStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_basicForStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterBasicForStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf()
			throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1703);
				match(FOR);
				setState(1704);
				match(LPAREN);
				setState(1706);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FINAL) | (1L << FLOAT) | (1L << INT)
						| (1L << LONG) | (1L << NEW) | (1L << SHORT)
						| (1L << SUPER) | (1L << THIS) | (1L << VOID)
						| (1L << IntegerLiteral) | (1L << FloatingPointLiteral)
						| (1L << BooleanLiteral) | (1L << CharacterLiteral)
						| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81))
								| (1L << (DEC - 81))
								| (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
					{
						setState(1705);
						forInit();
					}
				}

				setState(1708);
				match(SEMI);
				setState(1710);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1709);
						expression();
					}
				}

				setState(1712);
				match(SEMI);
				setState(1714);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (INC - 81))
								| (1L << (DEC - 81))
								| (1L << (Identifier - 81)) | (1L << (AT - 81)))) != 0)) {
					{
						setState(1713);
						forUpdate();
					}
				}

				setState(1716);
				match(RPAREN);
				setState(1717);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class, 0);
		}

		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class, 0);
		}

		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forInit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterForInit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forInit);
		try {
			setState(1721);
			switch (getInterpreter().adaptivePredict(_input, 174, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1719);
					statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1720);
					localVariableDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class, 0);
		}

		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forUpdate;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterForUpdate(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1723);
				statementExpressionList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends
			ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public StatementExpressionListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementExpressionList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterStatementExpressionList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList()
			throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(
				_ctx, getState());
		enterRule(_localctx, 316, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1725);
				statementExpression();
				setState(1730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(1726);
							match(COMMA);
							setState(1727);
							statementExpression();
						}
					}
					setState(1732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public TerminalNode FOR() {
			return getToken(JjQueryParser.FOR, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public EnhancedForStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enhancedForStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEnhancedForStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement()
			throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(
				_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1733);
				match(FOR);
				setState(1734);
				match(LPAREN);
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1735);
							variableModifier();
						}
					}
					setState(1740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1741);
				unannType();
				setState(1742);
				variableDeclaratorId();
				setState(1743);
				match(COLON);
				setState(1744);
				expression();
				setState(1745);
				match(RPAREN);
				setState(1746);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends
			ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public TerminalNode FOR() {
			return getToken(JjQueryParser.FOR, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enhancedForStatementNoShortIf;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEnhancedForStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf()
			throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(
				_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1748);
				match(FOR);
				setState(1749);
				match(LPAREN);
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1750);
							variableModifier();
						}
					}
					setState(1755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1756);
				unannType();
				setState(1757);
				variableDeclaratorId();
				setState(1758);
				match(COLON);
				setState(1759);
				expression();
				setState(1760);
				match(RPAREN);
				setState(1761);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode BREAK() {
			return getToken(JjQueryParser.BREAK, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_breakStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterBreakStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement()
			throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx,
				getState());
		enterRule(_localctx, 322, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1763);
				match(BREAK);
				setState(1765);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1764);
						match(Identifier);
					}
				}

				setState(1767);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode CONTINUE() {
			return getToken(JjQueryParser.CONTINUE, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public ContinueStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_continueStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterContinueStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement()
			throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx,
				getState());
		enterRule(_localctx, 324, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1769);
				match(CONTINUE);
				setState(1771);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1770);
						match(Identifier);
					}
				}

				setState(1773);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() {
			return getToken(JjQueryParser.RETURN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ReturnStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_returnStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterReturnStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement()
			throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx,
				getState());
		enterRule(_localctx, 326, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1775);
				match(RETURN);
				setState(1777);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(1776);
						expression();
					}
				}

				setState(1779);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode THROW() {
			return getToken(JjQueryParser.THROW, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_throwStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterThrowStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement()
			throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx,
				getState());
		enterRule(_localctx, 328, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1781);
				match(THROW);
				setState(1782);
				expression();
				setState(1783);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TerminalNode SYNCHRONIZED() {
			return getToken(JjQueryParser.SYNCHRONIZED, 0);
		}

		public SynchronizedStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_synchronizedStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterSynchronizedStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement()
			throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(
				_ctx, getState());
		enterRule(_localctx, 330, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1785);
				match(SYNCHRONIZED);
				setState(1786);
				match(LPAREN);
				setState(1787);
				expression();
				setState(1788);
				match(RPAREN);
				setState(1789);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() {
			return getToken(JjQueryParser.TRY, 0);
		}

		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class, 0);
		}

		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class, 0);
		}

		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tryStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterTryStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx,
				getState());
		enterRule(_localctx, 332, RULE_tryStatement);
		int _la;
		try {
			setState(1803);
			switch (getInterpreter().adaptivePredict(_input, 182, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1791);
					match(TRY);
					setState(1792);
					block();
					setState(1793);
					catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1795);
					match(TRY);
					setState(1796);
					block();
					setState(1798);
					_la = _input.LA(1);
					if (_la == CATCH) {
						{
							setState(1797);
							catches();
						}
					}

					setState(1800);
					finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1802);
					tryWithResourcesStatement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class, i);
		}

		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}

		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catches;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCatches(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1805);
				catchClause();
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == CATCH) {
					{
						{
							setState(1806);
							catchClause();
						}
					}
					setState(1811);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode CATCH() {
			return getToken(JjQueryParser.CATCH, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catchClause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCatchClause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1812);
				match(CATCH);
				setState(1813);
				match(LPAREN);
				setState(1814);
				catchFormalParameter();
				setState(1815);
				match(RPAREN);
				setState(1816);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class, 0);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public CatchFormalParameterContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catchFormalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterCatchFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter()
			throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(
				_ctx, getState());
		enterRule(_localctx, 338, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1818);
							variableModifier();
						}
					}
					setState(1823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1824);
				catchType();
				setState(1825);
				variableDeclaratorId();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class, 0);
		}

		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class, i);
		}

		public List<TerminalNode> BITOR() {
			return getTokens(JjQueryParser.BITOR);
		}

		public TerminalNode BITOR(int i) {
			return getToken(JjQueryParser.BITOR, i);
		}

		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}

		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catchType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCatchType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1827);
				unannClassType();
				setState(1832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == BITOR) {
					{
						{
							setState(1828);
							match(BITOR);
							setState(1829);
							classType();
						}
					}
					setState(1834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() {
			return getToken(JjQueryParser.FINALLY, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_finally_;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFinally_(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1835);
				match(FINALLY);
				setState(1836);
				block();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends
			ParserRuleContext {
		public TerminalNode TRY() {
			return getToken(JjQueryParser.TRY, 0);
		}

		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class, 0);
		}

		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class, 0);
		}

		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TryWithResourcesStatementContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tryWithResourcesStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterTryWithResourcesStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement()
			throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(
				_ctx, getState());
		enterRule(_localctx, 344, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1838);
				match(TRY);
				setState(1839);
				resourceSpecification();
				setState(1840);
				block();
				setState(1842);
				_la = _input.LA(1);
				if (_la == CATCH) {
					{
						setState(1841);
						catches();
					}
				}

				setState(1845);
				_la = _input.LA(1);
				if (_la == FINALLY) {
					{
						setState(1844);
						finally_();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JjQueryParser.SEMI, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class, 0);
		}

		public ResourceSpecificationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_resourceSpecification;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterResourceSpecification(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification()
			throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(
				_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1847);
				match(LPAREN);
				setState(1848);
				resourceList();
				setState(1850);
				_la = _input.LA(1);
				if (_la == SEMI) {
					{
						setState(1849);
						match(SEMI);
					}
				}

				setState(1852);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class, i);
		}

		public List<TerminalNode> SEMI() {
			return getTokens(JjQueryParser.SEMI);
		}

		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}

		public TerminalNode SEMI(int i) {
			return getToken(JjQueryParser.SEMI, i);
		}

		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_resourceList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterResourceList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx,
				getState());
		enterRule(_localctx, 348, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1854);
				resource();
				setState(1859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 189, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1855);
								match(SEMI);
								setState(1856);
								resource();
							}
						}
					}
					setState(1861);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 189, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_resource;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterResource(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == FINAL || _la == AT) {
					{
						{
							setState(1862);
							variableModifier();
						}
					}
					setState(1867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1868);
				unannType();
				setState(1869);
				variableDeclaratorId();
				setState(1870);
				match(ASSIGN);
				setState(1871);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(
				int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class, i);
		}

		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,
					0);
		}

		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class, 0);
		}

		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}

		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPrimary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1875);
				switch (getInterpreter().adaptivePredict(_input, 191, _ctx)) {
				case 1: {
					setState(1873);
					primaryNoNewArray_lfno_primary();
				}
					break;
				case 2: {
					setState(1874);
					arrayCreationExpression();
				}
					break;
				}
				setState(1880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 192, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(1877);
								primaryNoNewArray_lf_primary();
							}
						}
					}
					setState(1882);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 192, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class, 0);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,
					0);
		}

		public PrimaryNoNewArrayContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPrimaryNoNewArray(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray()
			throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx,
				getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1912);
			switch (getInterpreter().adaptivePredict(_input, 194, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1883);
					literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1884);
					typeName();
					setState(1889);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(1885);
								match(LBRACK);
								setState(1886);
								match(RBRACK);
							}
						}
						setState(1891);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1892);
					match(DOT);
					setState(1893);
					match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1895);
					match(VOID);
					setState(1896);
					match(DOT);
					setState(1897);
					match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1898);
					match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1899);
					typeName();
					setState(1900);
					match(DOT);
					setState(1901);
					match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1903);
					match(LPAREN);
					setState(1904);
					expression();
					setState(1905);
					match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1907);
					classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(1908);
					fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(1909);
					arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(1910);
					methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(1911);
					methodReference();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends
			ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lf_arrayAccess;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lf_arrayAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess()
			throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(
				_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends
			ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,
					0);
		}

		public PrimaryNoNewArray_lfno_arrayAccessContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lfno_arrayAccess;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess()
			throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(
				_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1944);
			switch (getInterpreter().adaptivePredict(_input, 196, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1916);
					literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1917);
					typeName();
					setState(1922);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(1918);
								match(LBRACK);
								setState(1919);
								match(RBRACK);
							}
						}
						setState(1924);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1925);
					match(DOT);
					setState(1926);
					match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1928);
					match(VOID);
					setState(1929);
					match(DOT);
					setState(1930);
					match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1931);
					match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1932);
					typeName();
					setState(1933);
					match(DOT);
					setState(1934);
					match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1936);
					match(LPAREN);
					setState(1937);
					expression();
					setState(1938);
					match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1940);
					classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(1941);
					fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(1942);
					methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(1943);
					methodReference();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends
			ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(
					ClassInstanceCreationExpression_lf_primaryContext.class, 0);
		}

		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class, 0);
		}

		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class, 0);
		}

		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class, 0);
		}

		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class, 0);
		}

		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1951);
			switch (getInterpreter().adaptivePredict(_input, 197, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1946);
					classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1947);
					fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1948);
					arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1949);
					methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1950);
					methodReference_lf_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext
			extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 362,
				RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext
			extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(
					ClassInstanceCreationExpression_lf_primaryContext.class, 0);
		}

		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class, 0);
		}

		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class, 0);
		}

		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class, 0);
		}

		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 364,
				RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1959);
			switch (getInterpreter().adaptivePredict(_input, 198, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1955);
					classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1956);
					fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1957);
					methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1958);
					methodReference_lf_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends
			ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(
					ClassInstanceCreationExpression_lfno_primaryContext.class,
					0);
		}

		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class, 0);
		}

		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2001);
			switch (getInterpreter().adaptivePredict(_input, 201, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1961);
					literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1962);
					typeName();
					setState(1967);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(1963);
								match(LBRACK);
								setState(1964);
								match(RBRACK);
							}
						}
						setState(1969);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1970);
					match(DOT);
					setState(1971);
					match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1973);
					unannPrimitiveType();
					setState(1978);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(1974);
								match(LBRACK);
								setState(1975);
								match(RBRACK);
							}
						}
						setState(1980);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1981);
					match(DOT);
					setState(1982);
					match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1984);
					match(VOID);
					setState(1985);
					match(DOT);
					setState(1986);
					match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(1987);
					match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(1988);
					typeName();
					setState(1989);
					match(DOT);
					setState(1990);
					match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(1992);
					match(LPAREN);
					setState(1993);
					expression();
					setState(1994);
					match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(1996);
					classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(1997);
					fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(1998);
					arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(1999);
					methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
					setState(2000);
					methodReference_lfno_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext
			extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 368,
				RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext
			extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(
					ClassInstanceCreationExpression_lfno_primaryContext.class,
					0);
		}

		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public TerminalNode THIS() {
			return getToken(JjQueryParser.THIS, 0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode VOID() {
			return getToken(JjQueryParser.VOID, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JjQueryParser.CLASS, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary()
			throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 370,
				RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2044);
			switch (getInterpreter().adaptivePredict(_input, 204, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2005);
					literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2006);
					typeName();
					setState(2011);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(2007);
								match(LBRACK);
								setState(2008);
								match(RBRACK);
							}
						}
						setState(2013);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2014);
					match(DOT);
					setState(2015);
					match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2017);
					unannPrimitiveType();
					setState(2022);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LBRACK) {
						{
							{
								setState(2018);
								match(LBRACK);
								setState(2019);
								match(RBRACK);
							}
						}
						setState(2024);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2025);
					match(DOT);
					setState(2026);
					match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2028);
					match(VOID);
					setState(2029);
					match(DOT);
					setState(2030);
					match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2031);
					match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(2032);
					typeName();
					setState(2033);
					match(DOT);
					setState(2034);
					match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(2036);
					match(LPAREN);
					setState(2037);
					expression();
					setState(2038);
					match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
					setState(2040);
					classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
					setState(2041);
					fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
					setState(2042);
					methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
					setState(2043);
					methodReference_lfno_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public List<TerminalNode> Identifier() {
			return getTokens(JjQueryParser.Identifier);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier(int i) {
			return getToken(JjQueryParser.Identifier, i);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public ClassInstanceCreationExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classInstanceCreationExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassInstanceCreationExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression()
			throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 372, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2129);
			switch (getInterpreter().adaptivePredict(_input, 222, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2046);
					match(NEW);
					setState(2048);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2047);
							typeArguments();
						}
					}

					setState(2053);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2050);
								annotation();
							}
						}
						setState(2055);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2056);
					match(Identifier);
					setState(2067);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == DOT) {
						{
							{
								setState(2057);
								match(DOT);
								setState(2061);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == AT) {
									{
										{
											setState(2058);
											annotation();
										}
									}
									setState(2063);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(2064);
								match(Identifier);
							}
						}
						setState(2069);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2071);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2070);
							typeArgumentsOrDiamond();
						}
					}

					setState(2073);
					match(LPAREN);
					setState(2075);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2074);
							argumentList();
						}
					}

					setState(2077);
					match(RPAREN);
					setState(2079);
					_la = _input.LA(1);
					if (_la == LBRACE) {
						{
							setState(2078);
							classBody();
						}
					}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2081);
					expressionName();
					setState(2082);
					match(DOT);
					setState(2083);
					match(NEW);
					setState(2085);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2084);
							typeArguments();
						}
					}

					setState(2090);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2087);
								annotation();
							}
						}
						setState(2092);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2093);
					match(Identifier);
					setState(2095);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2094);
							typeArgumentsOrDiamond();
						}
					}

					setState(2097);
					match(LPAREN);
					setState(2099);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2098);
							argumentList();
						}
					}

					setState(2101);
					match(RPAREN);
					setState(2103);
					_la = _input.LA(1);
					if (_la == LBRACE) {
						{
							setState(2102);
							classBody();
						}
					}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2105);
					primary();
					setState(2106);
					match(DOT);
					setState(2107);
					match(NEW);
					setState(2109);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2108);
							typeArguments();
						}
					}

					setState(2114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2111);
								annotation();
							}
						}
						setState(2116);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2117);
					match(Identifier);
					setState(2119);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2118);
							typeArgumentsOrDiamond();
						}
					}

					setState(2121);
					match(LPAREN);
					setState(2123);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2122);
							argumentList();
						}
					}

					setState(2125);
					match(RPAREN);
					setState(2127);
					_la = _input.LA(1);
					if (_la == LBRACE) {
						{
							setState(2126);
							classBody();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext
			extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public ClassInstanceCreationExpression_lf_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classInstanceCreationExpression_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassInstanceCreationExpression_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary()
			throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 374,
				RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2131);
				match(DOT);
				setState(2132);
				match(NEW);
				setState(2134);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(2133);
						typeArguments();
					}
				}

				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(2136);
							annotation();
						}
					}
					setState(2141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2142);
				match(Identifier);
				setState(2144);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(2143);
						typeArgumentsOrDiamond();
					}
				}

				setState(2146);
				match(LPAREN);
				setState(2148);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(2147);
						argumentList();
					}
				}

				setState(2150);
				match(RPAREN);
				setState(2152);
				switch (getInterpreter().adaptivePredict(_input, 227, _ctx)) {
				case 1: {
					setState(2151);
					classBody();
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext
			extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public List<TerminalNode> Identifier() {
			return getTokens(JjQueryParser.Identifier);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier(int i) {
			return getToken(JjQueryParser.Identifier, i);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public ClassInstanceCreationExpression_lfno_primaryContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classInstanceCreationExpression_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterClassInstanceCreationExpression_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary()
			throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 376,
				RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2213);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
					setState(2154);
					match(NEW);
					setState(2156);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2155);
							typeArguments();
						}
					}

					setState(2161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2158);
								annotation();
							}
						}
						setState(2163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2164);
					match(Identifier);
					setState(2175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == DOT) {
						{
							{
								setState(2165);
								match(DOT);
								setState(2169);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == AT) {
									{
										{
											setState(2166);
											annotation();
										}
									}
									setState(2171);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(2172);
								match(Identifier);
							}
						}
						setState(2177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2179);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2178);
							typeArgumentsOrDiamond();
						}
					}

					setState(2181);
					match(LPAREN);
					setState(2183);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2182);
							argumentList();
						}
					}

					setState(2185);
					match(RPAREN);
					setState(2187);
					switch (getInterpreter().adaptivePredict(_input, 234, _ctx)) {
					case 1: {
						setState(2186);
						classBody();
					}
						break;
					}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(2189);
					expressionName();
					setState(2190);
					match(DOT);
					setState(2191);
					match(NEW);
					setState(2193);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2192);
							typeArguments();
						}
					}

					setState(2198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == AT) {
						{
							{
								setState(2195);
								annotation();
							}
						}
						setState(2200);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2201);
					match(Identifier);
					setState(2203);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2202);
							typeArgumentsOrDiamond();
						}
					}

					setState(2205);
					match(LPAREN);
					setState(2207);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2206);
							argumentList();
						}
					}

					setState(2209);
					match(RPAREN);
					setState(2211);
					switch (getInterpreter().adaptivePredict(_input, 239, _ctx)) {
					case 1: {
						setState(2210);
						classBody();
					}
						break;
					}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode LT() {
			return getToken(JjQueryParser.LT, 0);
		}

		public TerminalNode GT() {
			return getToken(JjQueryParser.GT, 0);
		}

		public TypeArgumentsOrDiamondContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArgumentsOrDiamond;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterTypeArgumentsOrDiamond(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond()
			throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(
				_ctx, getState());
		enterRule(_localctx, 378, RULE_typeArgumentsOrDiamond);
		try {
			setState(2218);
			switch (getInterpreter().adaptivePredict(_input, 241, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2215);
					typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2216);
					match(LT);
					setState(2217);
					match(GT);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldAccess;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterFieldAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fieldAccess);
		try {
			setState(2233);
			switch (getInterpreter().adaptivePredict(_input, 242, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2220);
					primary();
					setState(2221);
					match(DOT);
					setState(2222);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2224);
					match(SUPER);
					setState(2225);
					match(DOT);
					setState(2226);
					match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2227);
					typeName();
					setState(2228);
					match(DOT);
					setState(2229);
					match(SUPER);
					setState(2230);
					match(DOT);
					setState(2231);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public FieldAccess_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldAccess_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterFieldAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary()
			throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2235);
				match(DOT);
				setState(2236);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends
			ParserRuleContext {
		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public FieldAccess_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldAccess_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterFieldAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary()
			throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lfno_primary);
		try {
			setState(2247);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
					setState(2238);
					match(SUPER);
					setState(2239);
					match(DOT);
					setState(2240);
					match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
					setState(2241);
					typeName();
					setState(2242);
					match(DOT);
					setState(2243);
					match(SUPER);
					setState(2244);
					match(DOT);
					setState(2245);
					match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(
					PrimaryNoNewArray_lfno_arrayAccessContext.class, 0);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(
				int i) {
			return getRuleContext(
					PrimaryNoNewArray_lf_arrayAccessContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}

		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayAccess;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterArrayAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2259);
				switch (getInterpreter().adaptivePredict(_input, 244, _ctx)) {
				case 1: {
					setState(2249);
					expressionName();
					setState(2250);
					match(LBRACK);
					setState(2251);
					expression();
					setState(2252);
					match(RBRACK);
				}
					break;
				case 2: {
					setState(2254);
					primaryNoNewArray_lfno_arrayAccess();
					setState(2255);
					match(LBRACK);
					setState(2256);
					expression();
					setState(2257);
					match(RBRACK);
				}
					break;
				}
				setState(2268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(2261);
							primaryNoNewArray_lf_arrayAccess();
							setState(2262);
							match(LBRACK);
							setState(2263);
							expression();
							setState(2264);
							match(RBRACK);
						}
					}
					setState(2270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(
					PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,
					0);
		}

		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
				int i) {
			return getRuleContext(
					PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,
					i);
		}

		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public ArrayAccess_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayAccess_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterArrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary()
			throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2271);
					primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
					setState(2272);
					match(LBRACK);
					setState(2273);
					expression();
					setState(2274);
					match(RBRACK);
				}
				setState(2283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 246, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2276);
								primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
								setState(2277);
								match(LBRACK);
								setState(2278);
								expression();
								setState(2279);
								match(RBRACK);
							}
						}
					}
					setState(2285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 246, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends
			ParserRuleContext {
		public TerminalNode RBRACK(int i) {
			return getToken(JjQueryParser.RBRACK, i);
		}

		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(
					PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,
					0);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}

		public TerminalNode LBRACK(int i) {
			return getToken(JjQueryParser.LBRACK, i);
		}

		public List<TerminalNode> RBRACK() {
			return getTokens(JjQueryParser.RBRACK);
		}

		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
				int i) {
			return getRuleContext(
					PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,
					i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public List<TerminalNode> LBRACK() {
			return getTokens(JjQueryParser.LBRACK);
		}

		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayAccess_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterArrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary()
			throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2296);
				switch (getInterpreter().adaptivePredict(_input, 247, _ctx)) {
				case 1: {
					setState(2286);
					expressionName();
					setState(2287);
					match(LBRACK);
					setState(2288);
					expression();
					setState(2289);
					match(RBRACK);
				}
					break;
				case 2: {
					setState(2291);
					primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
					setState(2292);
					match(LBRACK);
					setState(2293);
					expression();
					setState(2294);
					match(RBRACK);
				}
					break;
				}
				setState(2305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 248, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2298);
								primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
								setState(2299);
								match(LBRACK);
								setState(2300);
								expression();
								setState(2301);
								match(RBRACK);
							}
						}
					}
					setState(2307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 248, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public MethodInvocationContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodInvocation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodInvocation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation()
			throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx,
				getState());
		enterRule(_localctx, 392, RULE_methodInvocation);
		int _la;
		try {
			setState(2376);
			switch (getInterpreter().adaptivePredict(_input, 260, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2308);
					methodName();
					setState(2309);
					match(LPAREN);
					setState(2311);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2310);
							argumentList();
						}
					}

					setState(2313);
					match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2315);
					typeName();
					setState(2316);
					match(DOT);
					setState(2318);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2317);
							typeArguments();
						}
					}

					setState(2320);
					match(Identifier);
					setState(2321);
					match(LPAREN);
					setState(2323);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2322);
							argumentList();
						}
					}

					setState(2325);
					match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2327);
					expressionName();
					setState(2328);
					match(DOT);
					setState(2330);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2329);
							typeArguments();
						}
					}

					setState(2332);
					match(Identifier);
					setState(2333);
					match(LPAREN);
					setState(2335);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2334);
							argumentList();
						}
					}

					setState(2337);
					match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2339);
					primary();
					setState(2340);
					match(DOT);
					setState(2342);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2341);
							typeArguments();
						}
					}

					setState(2344);
					match(Identifier);
					setState(2345);
					match(LPAREN);
					setState(2347);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2346);
							argumentList();
						}
					}

					setState(2349);
					match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2351);
					match(SUPER);
					setState(2352);
					match(DOT);
					setState(2354);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2353);
							typeArguments();
						}
					}

					setState(2356);
					match(Identifier);
					setState(2357);
					match(LPAREN);
					setState(2359);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2358);
							argumentList();
						}
					}

					setState(2361);
					match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(2362);
					typeName();
					setState(2363);
					match(DOT);
					setState(2364);
					match(SUPER);
					setState(2365);
					match(DOT);
					setState(2367);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2366);
							typeArguments();
						}
					}

					setState(2369);
					match(Identifier);
					setState(2370);
					match(LPAREN);
					setState(2372);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2371);
							argumentList();
						}
					}

					setState(2374);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public MethodInvocation_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodInvocation_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMethodInvocation_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary()
			throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2378);
				match(DOT);
				setState(2380);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(2379);
						typeArguments();
					}
				}

				setState(2382);
				match(Identifier);
				setState(2383);
				match(LPAREN);
				setState(2385);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
						| (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE)
						| (1L << FLOAT) | (1L << INT) | (1L << LONG)
						| (1L << NEW) | (1L << SHORT) | (1L << SUPER)
						| (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral)
						| (1L << FloatingPointLiteral) | (1L << BooleanLiteral)
						| (1L << CharacterLiteral) | (1L << StringLiteral)
						| (1L << NullLiteral) | (1L << LPAREN))) != 0)
						|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
								| (1L << (TILDE - 71))
								| (1L << (INC - 71))
								| (1L << (DEC - 71))
								| (1L << (ADD - 71))
								| (1L << (SUB - 71))
								| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
					{
						setState(2384);
						argumentList();
					}
				}

				setState(2387);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JjQueryParser.DOT);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class, 0);
		}

		public TerminalNode DOT(int i) {
			return getToken(JjQueryParser.DOT, i);
		}

		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodInvocation_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMethodInvocation_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary()
			throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2445);
			switch (getInterpreter().adaptivePredict(_input, 272, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2389);
					methodName();
					setState(2390);
					match(LPAREN);
					setState(2392);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2391);
							argumentList();
						}
					}

					setState(2394);
					match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2396);
					typeName();
					setState(2397);
					match(DOT);
					setState(2399);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2398);
							typeArguments();
						}
					}

					setState(2401);
					match(Identifier);
					setState(2402);
					match(LPAREN);
					setState(2404);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2403);
							argumentList();
						}
					}

					setState(2406);
					match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2408);
					expressionName();
					setState(2409);
					match(DOT);
					setState(2411);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2410);
							typeArguments();
						}
					}

					setState(2413);
					match(Identifier);
					setState(2414);
					match(LPAREN);
					setState(2416);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2415);
							argumentList();
						}
					}

					setState(2418);
					match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2420);
					match(SUPER);
					setState(2421);
					match(DOT);
					setState(2423);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2422);
							typeArguments();
						}
					}

					setState(2425);
					match(Identifier);
					setState(2426);
					match(LPAREN);
					setState(2428);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2427);
							argumentList();
						}
					}

					setState(2430);
					match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2431);
					typeName();
					setState(2432);
					match(DOT);
					setState(2433);
					match(SUPER);
					setState(2434);
					match(DOT);
					setState(2436);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2435);
							typeArguments();
						}
					}

					setState(2438);
					match(Identifier);
					setState(2439);
					match(LPAREN);
					setState(2441);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG)
							| (1L << NEW)
							| (1L << SHORT)
							| (1L << SUPER)
							| (1L << THIS)
							| (1L << VOID)
							| (1L << IntegerLiteral)
							| (1L << FloatingPointLiteral)
							| (1L << BooleanLiteral)
							| (1L << CharacterLiteral)
							| (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0)
							|| ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (BANG - 71))
									| (1L << (TILDE - 71))
									| (1L << (INC - 71))
									| (1L << (DEC - 71))
									| (1L << (ADD - 71))
									| (1L << (SUB - 71))
									| (1L << (Identifier - 71)) | (1L << (AT - 71)))) != 0)) {
						{
							setState(2440);
							argumentList();
						}
					}

					setState(2443);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_argumentList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterArgumentList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx,
				getState());
		enterRule(_localctx, 398, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2447);
				expression();
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(2448);
							match(COMMA);
							setState(2449);
							expression();
						}
					}
					setState(2454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public TerminalNode COLONCOLON() {
			return getToken(JjQueryParser.COLONCOLON, 0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public MethodReferenceContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodReference;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodReference(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference()
			throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx,
				getState());
		enterRule(_localctx, 400, RULE_methodReference);
		int _la;
		try {
			setState(2502);
			switch (getInterpreter().adaptivePredict(_input, 280, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2455);
					expressionName();
					setState(2456);
					match(COLONCOLON);
					setState(2458);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2457);
							typeArguments();
						}
					}

					setState(2460);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2462);
					referenceType();
					setState(2463);
					match(COLONCOLON);
					setState(2465);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2464);
							typeArguments();
						}
					}

					setState(2467);
					match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2469);
					primary();
					setState(2470);
					match(COLONCOLON);
					setState(2472);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2471);
							typeArguments();
						}
					}

					setState(2474);
					match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2476);
					match(SUPER);
					setState(2477);
					match(COLONCOLON);
					setState(2479);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2478);
							typeArguments();
						}
					}

					setState(2481);
					match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2482);
					typeName();
					setState(2483);
					match(DOT);
					setState(2484);
					match(SUPER);
					setState(2485);
					match(COLONCOLON);
					setState(2487);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2486);
							typeArguments();
						}
					}

					setState(2489);
					match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(2491);
					classType();
					setState(2492);
					match(COLONCOLON);
					setState(2494);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2493);
							typeArguments();
						}
					}

					setState(2496);
					match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
					setState(2498);
					arrayType();
					setState(2499);
					match(COLONCOLON);
					setState(2500);
					match(NEW);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode COLONCOLON() {
			return getToken(JjQueryParser.COLONCOLON, 0);
		}

		public MethodReference_lf_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodReference_lf_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMethodReference_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary()
			throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2504);
				match(COLONCOLON);
				setState(2506);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(2505);
						typeArguments();
					}
				}

				setState(2508);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends
			ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JjQueryParser.SUPER, 0);
		}

		public TerminalNode DOT() {
			return getToken(JjQueryParser.DOT, 0);
		}

		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public TerminalNode COLONCOLON() {
			return getToken(JjQueryParser.COLONCOLON, 0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class, 0);
		}

		public MethodReference_lfno_primaryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodReference_lfno_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMethodReference_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary()
			throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(
				_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2550);
			switch (getInterpreter().adaptivePredict(_input, 287, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2510);
					expressionName();
					setState(2511);
					match(COLONCOLON);
					setState(2513);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2512);
							typeArguments();
						}
					}

					setState(2515);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2517);
					referenceType();
					setState(2518);
					match(COLONCOLON);
					setState(2520);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2519);
							typeArguments();
						}
					}

					setState(2522);
					match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2524);
					match(SUPER);
					setState(2525);
					match(COLONCOLON);
					setState(2527);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2526);
							typeArguments();
						}
					}

					setState(2529);
					match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2530);
					typeName();
					setState(2531);
					match(DOT);
					setState(2532);
					match(SUPER);
					setState(2533);
					match(COLONCOLON);
					setState(2535);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2534);
							typeArguments();
						}
					}

					setState(2537);
					match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
					setState(2539);
					classType();
					setState(2540);
					match(COLONCOLON);
					setState(2542);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(2541);
							typeArguments();
						}
					}

					setState(2544);
					match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
					setState(2546);
					arrayType();
					setState(2547);
					match(COLONCOLON);
					setState(2548);
					match(NEW);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends
			ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class, 0);
		}

		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class, 0);
		}

		public TerminalNode NEW() {
			return getToken(JjQueryParser.NEW, 0);
		}

		public ArrayCreationExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayCreationExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterArrayCreationExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression()
			throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayCreationExpression);
		try {
			setState(2574);
			switch (getInterpreter().adaptivePredict(_input, 290, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2552);
					match(NEW);
					setState(2553);
					primitiveType();
					setState(2554);
					dimExprs();
					setState(2556);
					switch (getInterpreter().adaptivePredict(_input, 288, _ctx)) {
					case 1: {
						setState(2555);
						dims();
					}
						break;
					}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2558);
					match(NEW);
					setState(2559);
					classOrInterfaceType();
					setState(2560);
					dimExprs();
					setState(2562);
					switch (getInterpreter().adaptivePredict(_input, 289, _ctx)) {
					case 1: {
						setState(2561);
						dims();
					}
						break;
					}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2564);
					match(NEW);
					setState(2565);
					primitiveType();
					setState(2566);
					dims();
					setState(2567);
					arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2569);
					match(NEW);
					setState(2570);
					classOrInterfaceType();
					setState(2571);
					dims();
					setState(2572);
					arrayInitializer();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}

		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class, i);
		}

		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dimExprs;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDimExprs(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2576);
				dimExpr();
				setState(2580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 291, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(2577);
								dimExpr();
							}
						}
					}
					setState(2582);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 291, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode RBRACK() {
			return getToken(JjQueryParser.RBRACK, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode LBRACK() {
			return getToken(JjQueryParser.LBRACK, 0);
		}

		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_dimExpr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterDimExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(2583);
							annotation();
						}
					}
					setState(2588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2589);
				match(LBRACK);
				setState(2590);
				expression();
				setState(2591);
				match(RBRACK);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ConstantExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constantExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConstantExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression()
			throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 412, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2593);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class, 0);
		}

		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class, 0);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expression);
		try {
			setState(2597);
			switch (getInterpreter().adaptivePredict(_input, 293, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2595);
					lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2596);
					assignmentExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class, 0);
		}

		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class, 0);
		}

		public TerminalNode ARROW() {
			return getToken(JjQueryParser.ARROW, 0);
		}

		public LambdaExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lambdaExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLambdaExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression()
			throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 416, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2599);
				lambdaParameters();
				setState(2600);
				match(ARROW);
				setState(2601);
				lambdaBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(JjQueryParser.Identifier, 0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public LambdaParametersContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lambdaParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLambdaParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters()
			throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx,
				getState());
		enterRule(_localctx, 418, RULE_lambdaParameters);
		int _la;
		try {
			setState(2613);
			switch (getInterpreter().adaptivePredict(_input, 295, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2603);
					match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2604);
					match(LPAREN);
					setState(2606);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN)
							| (1L << BYTE)
							| (1L << CHAR)
							| (1L << DOUBLE)
							| (1L << FINAL)
							| (1L << FLOAT)
							| (1L << INT)
							| (1L << LONG) | (1L << SHORT))) != 0)
							|| _la == Identifier || _la == AT) {
						{
							setState(2605);
							formalParameterList();
						}
					}

					setState(2608);
					match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2609);
					match(LPAREN);
					setState(2610);
					inferredFormalParameterList();
					setState(2611);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends
			ParserRuleContext {
		public List<TerminalNode> Identifier() {
			return getTokens(JjQueryParser.Identifier);
		}

		public TerminalNode Identifier(int i) {
			return getToken(JjQueryParser.Identifier, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JjQueryParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JjQueryParser.COMMA, i);
		}

		public InferredFormalParameterListContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_inferredFormalParameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInferredFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList()
			throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(
				_ctx, getState());
		enterRule(_localctx, 420, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2615);
				match(Identifier);
				setState(2620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(2616);
							match(COMMA);
							setState(2617);
							match(Identifier);
						}
					}
					setState(2622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lambdaBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLambdaBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaBody);
		try {
			setState(2625);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
					setState(2623);
					expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
					setState(2624);
					block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public AssignmentExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAssignmentExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression()
			throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 424, RULE_assignmentExpression);
		try {
			setState(2629);
			switch (getInterpreter().adaptivePredict(_input, 298, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2627);
					conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2628);
					assignment();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class, 0);
		}

		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2631);
				leftHandSide();
				setState(2632);
				assignmentOperator();
				setState(2633);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class, 0);
		}

		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class, 0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_leftHandSide;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterLeftHandSide(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx,
				getState());
		enterRule(_localctx, 428, RULE_leftHandSide);
		try {
			setState(2638);
			switch (getInterpreter().adaptivePredict(_input, 299, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2635);
					expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2636);
					fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2637);
					arrayAccess();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public TerminalNode MUL_ASSIGN() {
			return getToken(JjQueryParser.MUL_ASSIGN, 0);
		}

		public TerminalNode OR_ASSIGN() {
			return getToken(JjQueryParser.OR_ASSIGN, 0);
		}

		public TerminalNode DIV_ASSIGN() {
			return getToken(JjQueryParser.DIV_ASSIGN, 0);
		}

		public TerminalNode RSHIFT_ASSIGN() {
			return getToken(JjQueryParser.RSHIFT_ASSIGN, 0);
		}

		public TerminalNode MOD_ASSIGN() {
			return getToken(JjQueryParser.MOD_ASSIGN, 0);
		}

		public TerminalNode URSHIFT_ASSIGN() {
			return getToken(JjQueryParser.URSHIFT_ASSIGN, 0);
		}

		public TerminalNode SUB_ASSIGN() {
			return getToken(JjQueryParser.SUB_ASSIGN, 0);
		}

		public TerminalNode AND_ASSIGN() {
			return getToken(JjQueryParser.AND_ASSIGN, 0);
		}

		public TerminalNode LSHIFT_ASSIGN() {
			return getToken(JjQueryParser.LSHIFT_ASSIGN, 0);
		}

		public TerminalNode XOR_ASSIGN() {
			return getToken(JjQueryParser.XOR_ASSIGN, 0);
		}

		public TerminalNode ADD_ASSIGN() {
			return getToken(JjQueryParser.ADD_ASSIGN, 0);
		}

		public AssignmentOperatorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentOperator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAssignmentOperator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator()
			throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(
				_ctx, getState());
		enterRule(_localctx, 430, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2640);
				_la = _input.LA(1);
				if (!(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ASSIGN - 68))
						| (1L << (ADD_ASSIGN - 68))
						| (1L << (SUB_ASSIGN - 68))
						| (1L << (MUL_ASSIGN - 68))
						| (1L << (DIV_ASSIGN - 68))
						| (1L << (AND_ASSIGN - 68))
						| (1L << (OR_ASSIGN - 68))
						| (1L << (XOR_ASSIGN - 68))
						| (1L << (MOD_ASSIGN - 68))
						| (1L << (LSHIFT_ASSIGN - 68))
						| (1L << (RSHIFT_ASSIGN - 68)) | (1L << (URSHIFT_ASSIGN - 68)))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class, 0);
		}

		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class, 0);
		}

		public TerminalNode COLON() {
			return getToken(JjQueryParser.COLON, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode QUESTION() {
			return getToken(JjQueryParser.QUESTION, 0);
		}

		public ConditionalExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditionalExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConditionalExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression()
			throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 432, RULE_conditionalExpression);
		try {
			setState(2649);
			switch (getInterpreter().adaptivePredict(_input, 300, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2642);
					conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2643);
					conditionalOrExpression(0);
					setState(2644);
					match(QUESTION);
					setState(2645);
					expression();
					setState(2646);
					match(COLON);
					setState(2647);
					conditionalExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends
			ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class, 0);
		}

		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class, 0);
		}

		public TerminalNode OR() {
			return getToken(JjQueryParser.OR, 0);
		}

		public ConditionalOrExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditionalOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConditionalOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression()
			throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(
				_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2652);
					conditionalAndExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 301, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ConditionalOrExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_conditionalOrExpression);
								setState(2654);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2655);
								match(OR);
								setState(2656);
								conditionalAndExpression(0);
							}
						}
					}
					setState(2661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 301, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends
			ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class, 0);
		}

		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class, 0);
		}

		public TerminalNode AND() {
			return getToken(JjQueryParser.AND, 0);
		}

		public ConditionalAndExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditionalAndExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterConditionalAndExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression()
			throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(
				_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2663);
					inclusiveOrExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 302, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ConditionalAndExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_conditionalAndExpression);
								setState(2665);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2666);
								match(AND);
								setState(2667);
								inclusiveOrExpression(0);
							}
						}
					}
					setState(2672);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 302, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class, 0);
		}

		public TerminalNode BITOR() {
			return getToken(JjQueryParser.BITOR, 0);
		}

		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class, 0);
		}

		public InclusiveOrExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_inclusiveOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterInclusiveOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression()
			throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(
				_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2674);
					exclusiveOrExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 303, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new InclusiveOrExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_inclusiveOrExpression);
								setState(2676);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2677);
								match(BITOR);
								setState(2678);
								exclusiveOrExpression(0);
							}
						}
					}
					setState(2683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 303, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class, 0);
		}

		public TerminalNode CARET() {
			return getToken(JjQueryParser.CARET, 0);
		}

		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class, 0);
		}

		public ExclusiveOrExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_exclusiveOrExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterExclusiveOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression()
			throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(
				_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2685);
					andExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 304, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ExclusiveOrExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_exclusiveOrExpression);
								setState(2687);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2688);
								match(CARET);
								setState(2689);
								andExpression(0);
							}
						}
					}
					setState(2694);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 304, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class, 0);
		}

		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class, 0);
		}

		public TerminalNode BITAND() {
			return getToken(JjQueryParser.BITAND, 0);
		}

		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_andExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAndExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression()
			throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx,
				_parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2696);
					equalityExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 305, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new AndExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_andExpression);
								setState(2698);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2699);
								match(BITAND);
								setState(2700);
								equalityExpression(0);
							}
						}
					}
					setState(2705);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 305, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public TerminalNode EQUAL() {
			return getToken(JjQueryParser.EQUAL, 0);
		}

		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class, 0);
		}

		public TerminalNode NOTEQUAL() {
			return getToken(JjQueryParser.NOTEQUAL, 0);
		}

		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class, 0);
		}

		public EqualityExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_equalityExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterEqualityExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression()
			throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(
				_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2707);
					relationalExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 307, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2715);
							switch (getInterpreter().adaptivePredict(_input,
									306, _ctx)) {
							case 1: {
								_localctx = new EqualityExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_equalityExpression);
								setState(2709);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2710);
								match(EQUAL);
								setState(2711);
								relationalExpression(0);
							}
								break;
							case 2: {
								_localctx = new EqualityExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_equalityExpression);
								setState(2712);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2713);
								match(NOTEQUAL);
								setState(2714);
								relationalExpression(0);
							}
								break;
							}
						}
					}
					setState(2719);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 307, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public TerminalNode GE() {
			return getToken(JjQueryParser.GE, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TerminalNode LT() {
			return getToken(JjQueryParser.LT, 0);
		}

		public TerminalNode GT() {
			return getToken(JjQueryParser.GT, 0);
		}

		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class, 0);
		}

		public TerminalNode LE() {
			return getToken(JjQueryParser.LE, 0);
		}

		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class, 0);
		}

		public TerminalNode INSTANCEOF() {
			return getToken(JjQueryParser.INSTANCEOF, 0);
		}

		public RelationalExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_relationalExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterRelationalExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression()
			throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(
				_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2721);
					shiftExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 309, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2738);
							switch (getInterpreter().adaptivePredict(_input,
									308, _ctx)) {
							case 1: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2723);
								if (!(precpred(_ctx, 5)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 5)");
								setState(2724);
								match(LT);
								setState(2725);
								shiftExpression(0);
							}
								break;
							case 2: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2726);
								if (!(precpred(_ctx, 4)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 4)");
								setState(2727);
								match(GT);
								setState(2728);
								shiftExpression(0);
							}
								break;
							case 3: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2729);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 3)");
								setState(2730);
								match(LE);
								setState(2731);
								shiftExpression(0);
							}
								break;
							case 4: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2732);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2733);
								match(GE);
								setState(2734);
								shiftExpression(0);
							}
								break;
							case 5: {
								_localctx = new RelationalExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_relationalExpression);
								setState(2735);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2736);
								match(INSTANCEOF);
								setState(2737);
								referenceType();
							}
								break;
							}
						}
					}
					setState(2742);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 309, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LT() {
			return getTokens(JjQueryParser.LT);
		}

		public List<TerminalNode> GT() {
			return getTokens(JjQueryParser.GT);
		}

		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class, 0);
		}

		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class, 0);
		}

		public TerminalNode GT(int i) {
			return getToken(JjQueryParser.GT, i);
		}

		public TerminalNode LT(int i) {
			return getToken(JjQueryParser.LT, i);
		}

		public ShiftExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_shiftExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterShiftExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression()
			throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx,
				_parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2744);
					additiveExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 311, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2759);
							switch (getInterpreter().adaptivePredict(_input,
									310, _ctx)) {
							case 1: {
								_localctx = new ShiftExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_shiftExpression);
								setState(2746);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 3)");
								setState(2747);
								match(LT);
								setState(2748);
								match(LT);
								setState(2749);
								additiveExpression(0);
							}
								break;
							case 2: {
								_localctx = new ShiftExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_shiftExpression);
								setState(2750);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2751);
								match(GT);
								setState(2752);
								match(GT);
								setState(2753);
								additiveExpression(0);
							}
								break;
							case 3: {
								_localctx = new ShiftExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_shiftExpression);
								setState(2754);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2755);
								match(GT);
								setState(2756);
								match(GT);
								setState(2757);
								match(GT);
								setState(2758);
								additiveExpression(0);
							}
								break;
							}
						}
					}
					setState(2763);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 311, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public TerminalNode SUB() {
			return getToken(JjQueryParser.SUB, 0);
		}

		public TerminalNode ADD() {
			return getToken(JjQueryParser.ADD, 0);
		}

		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class, 0);
		}

		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class, 0);
		}

		public AdditiveExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_additiveExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterAdditiveExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression()
			throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(
				_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2765);
					multiplicativeExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(2775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 313, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2773);
							switch (getInterpreter().adaptivePredict(_input,
									312, _ctx)) {
							case 1: {
								_localctx = new AdditiveExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_additiveExpression);
								setState(2767);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2768);
								match(ADD);
								setState(2769);
								multiplicativeExpression(0);
							}
								break;
							case 2: {
								_localctx = new AdditiveExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_additiveExpression);
								setState(2770);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2771);
								match(SUB);
								setState(2772);
								multiplicativeExpression(0);
							}
								break;
							}
						}
					}
					setState(2777);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 313, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends
			ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class, 0);
		}

		public TerminalNode MOD() {
			return getToken(JjQueryParser.MOD, 0);
		}

		public TerminalNode DIV() {
			return getToken(JjQueryParser.DIV, 0);
		}

		public TerminalNode MUL() {
			return getToken(JjQueryParser.MUL, 0);
		}

		public MultiplicativeExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_multiplicativeExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterMultiplicativeExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression()
			throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p)
			throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(
				_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(2779);
					unaryExpression();
				}
				_ctx.stop = _input.LT(-1);
				setState(2792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 315, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(2790);
							switch (getInterpreter().adaptivePredict(_input,
									314, _ctx)) {
							case 1: {
								_localctx = new MultiplicativeExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_multiplicativeExpression);
								setState(2781);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 3)");
								setState(2782);
								match(MUL);
								setState(2783);
								unaryExpression();
							}
								break;
							case 2: {
								_localctx = new MultiplicativeExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_multiplicativeExpression);
								setState(2784);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 2)");
								setState(2785);
								match(DIV);
								setState(2786);
								unaryExpression();
							}
								break;
							case 3: {
								_localctx = new MultiplicativeExpressionContext(
										_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_multiplicativeExpression);
								setState(2787);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 1)");
								setState(2788);
								match(MOD);
								setState(2789);
								unaryExpression();
							}
								break;
							}
						}
					}
					setState(2794);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 315, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public TerminalNode SUB() {
			return getToken(JjQueryParser.SUB, 0);
		}

		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class, 0);
		}

		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class, 0);
		}

		public TerminalNode ADD() {
			return getToken(JjQueryParser.ADD, 0);
		}

		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class, 0);
		}

		public UnaryExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unaryExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterUnaryExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression()
			throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 454, RULE_unaryExpression);
		try {
			setState(2802);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
					setState(2795);
					preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
					setState(2796);
					preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
					setState(2797);
					match(ADD);
					setState(2798);
					unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
					setState(2799);
					match(SUB);
					setState(2800);
					unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
					setState(2801);
					unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public TerminalNode INC() {
			return getToken(JjQueryParser.INC, 0);
		}

		public PreIncrementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_preIncrementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPreIncrementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression()
			throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 456, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2804);
				match(INC);
				setState(2805);
				unaryExpression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() {
			return getToken(JjQueryParser.DEC, 0);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public PreDecrementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_preDecrementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPreDecrementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression()
			throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 458, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2807);
				match(DEC);
				setState(2808);
				unaryExpression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends
			ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class, 0);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class, 0);
		}

		public TerminalNode TILDE() {
			return getToken(JjQueryParser.TILDE, 0);
		}

		public TerminalNode BANG() {
			return getToken(JjQueryParser.BANG, 0);
		}

		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unaryExpressionNotPlusMinus;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterUnaryExpressionNotPlusMinus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus()
			throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(
				_ctx, getState());
		enterRule(_localctx, 460, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2816);
			switch (getInterpreter().adaptivePredict(_input, 317, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2810);
					postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2811);
					match(TILDE);
					setState(2812);
					unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2813);
					match(BANG);
					setState(2814);
					unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(2815);
					castExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}

		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(
				int i) {
			return getRuleContext(
					PostIncrementExpression_lf_postfixExpressionContext.class,
					i);
		}

		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(
				int i) {
			return getRuleContext(
					PostDecrementExpression_lf_postfixExpressionContext.class,
					i);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class, 0);
		}

		public PostfixExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postfixExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterPostfixExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression()
			throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 462, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(2820);
				switch (getInterpreter().adaptivePredict(_input, 318, _ctx)) {
				case 1: {
					setState(2818);
					primary();
				}
					break;
				case 2: {
					setState(2819);
					expressionName();
				}
					break;
				}
				setState(2826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 320, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							setState(2824);
							switch (_input.LA(1)) {
							case INC: {
								setState(2822);
								postIncrementExpression_lf_postfixExpression();
							}
								break;
							case DEC: {
								setState(2823);
								postDecrementExpression_lf_postfixExpression();
							}
								break;
							default:
								throw new NoViableAltException(this);
							}
						}
					}
					setState(2828);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 320, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends
			ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class, 0);
		}

		public TerminalNode INC() {
			return getToken(JjQueryParser.INC, 0);
		}

		public PostIncrementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postIncrementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPostIncrementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression()
			throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 464, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2829);
				postfixExpression();
				setState(2830);
				match(INC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext
			extends ParserRuleContext {
		public TerminalNode INC() {
			return getToken(JjQueryParser.INC, 0);
		}

		public PostIncrementExpression_lf_postfixExpressionContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postIncrementExpression_lf_postfixExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPostIncrementExpression_lf_postfixExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression()
			throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 466,
				RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2832);
				match(INC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends
			ParserRuleContext {
		public TerminalNode DEC() {
			return getToken(JjQueryParser.DEC, 0);
		}

		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class, 0);
		}

		public PostDecrementExpressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postDecrementExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPostDecrementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression()
			throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 468, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2834);
				postfixExpression();
				setState(2835);
				match(DEC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext
			extends ParserRuleContext {
		public TerminalNode DEC() {
			return getToken(JjQueryParser.DEC, 0);
		}

		public PostDecrementExpression_lf_postfixExpressionContext(
				ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_postDecrementExpression_lf_postfixExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.enterPostDecrementExpression_lf_postfixExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener)
						.exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression()
			throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(
				_ctx, getState());
		enterRule(_localctx, 470,
				RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2837);
				match(DEC);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class, 0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class, 0);
		}

		public TerminalNode LPAREN() {
			return getToken(JjQueryParser.LPAREN, 0);
		}

		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public TerminalNode RPAREN() {
			return getToken(JjQueryParser.RPAREN, 0);
		}

		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}

		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class, 0);
		}

		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class, i);
		}

		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_castExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterCastExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression()
			throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx,
				getState());
		enterRule(_localctx, 472, RULE_castExpression);
		int _la;
		try {
			setState(2866);
			switch (getInterpreter().adaptivePredict(_input, 323, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2839);
					match(LPAREN);
					setState(2840);
					primitiveType();
					setState(2841);
					match(RPAREN);
					setState(2842);
					unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2844);
					match(LPAREN);
					setState(2845);
					referenceType();
					setState(2849);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == BITAND) {
						{
							{
								setState(2846);
								additionalBound();
							}
						}
						setState(2851);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2852);
					match(RPAREN);
					setState(2853);
					unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(2855);
					match(LPAREN);
					setState(2856);
					referenceType();
					setState(2860);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == BITAND) {
						{
							{
								setState(2857);
								additionalBound();
							}
						}
						setState(2862);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2863);
					match(RPAREN);
					setState(2864);
					lambdaExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JQueryContext extends ParserRuleContext {
		public TerminalNode JQBegin() {
			return getToken(JjQueryParser.JQBegin, 0);
		}

		public TerminalNode JQEnd() {
			return getToken(JjQueryParser.JQEnd, 0);
		}

		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}

		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class, i);
		}

		public JQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jQuery;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterJQuery(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitJQuery(this);
		}
	}

	public final JQueryContext jQuery() throws RecognitionException {
		JQueryContext _localctx = new JQueryContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_jQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2868);
				match(JQBegin);
				setState(2872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == ID) {
					{
						{
							setState(2869);
							assign();
						}
					}
					setState(2874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2875);
				match(JQEnd);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode SEMICOLON() {
			return getToken(JjQueryParser.SEMICOLON, 0);
		}

		public TerminalNode CLOSE_PARENTHESIS() {
			return getToken(JjQueryParser.CLOSE_PARENTHESIS, 0);
		}

		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class, 0);
		}

		public List<TerminalNode> QUOTES() {
			return getTokens(JjQueryParser.QUOTES);
		}

		public TerminalNode DOLLAR() {
			return getToken(JjQueryParser.DOLLAR, 0);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
		}

		public TerminalNode QUOTES(int i) {
			return getToken(JjQueryParser.QUOTES, i);
		}

		public TerminalNode OPEN_PARENTHESIS() {
			return getToken(JjQueryParser.OPEN_PARENTHESIS, 0);
		}

		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assign;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2877);
				match(ID);
				setState(2878);
				match(OP);
				setState(2879);
				match(DOLLAR);
				setState(2880);
				match(OPEN_PARENTHESIS);
				setState(2881);
				match(QUOTES);
				setState(2882);
				match(ID);
				setState(2883);
				selector();
				setState(2884);
				match(ID);
				setState(2885);
				match(QUOTES);
				setState(2886);
				match(CLOSE_PARENTHESIS);
				setState(2887);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class, 0);
		}

		public AttributeSelectorContext attributeSelector() {
			return getRuleContext(AttributeSelectorContext.class, 0);
		}

		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_selector);
		try {
			setState(2891);
			switch (getInterpreter().adaptivePredict(_input, 325, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(2889);
					attributeSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(2890);
					methodSelector();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSelectorContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public TerminalNode OPEN_BRACKET() {
			return getToken(JjQueryParser.OPEN_BRACKET, 0);
		}

		public List<TerminalNode> APOSTROPHE() {
			return getTokens(JjQueryParser.APOSTROPHE);
		}

		public TerminalNode APOSTROPHE(int i) {
			return getToken(JjQueryParser.APOSTROPHE, i);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
		}

		public TerminalNode CLOSE_BRACKET() {
			return getToken(JjQueryParser.CLOSE_BRACKET, 0);
		}

		public AttributeSelectorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_attributeSelector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAttributeSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAttributeSelector(this);
		}
	}

	public final AttributeSelectorContext attributeSelector()
			throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx,
				getState());
		enterRule(_localctx, 480, RULE_attributeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2893);
				match(OPEN_BRACKET);
				setState(2894);
				match(ID);
				setState(2895);
				match(OP);
				setState(2896);
				match(APOSTROPHE);
				setState(2897);
				match(ID);
				setState(2898);
				match(APOSTROPHE);
				setState(2899);
				match(CLOSE_BRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSelectorContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode CLOSE_PARENTHESIS() {
			return getToken(JjQueryParser.CLOSE_PARENTHESIS, 0);
		}

		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public TerminalNode OPEN_BRACKET() {
			return getToken(JjQueryParser.OPEN_BRACKET, 0);
		}

		public List<TerminalNode> APOSTROPHE() {
			return getTokens(JjQueryParser.APOSTROPHE);
		}

		public TerminalNode APOSTROPHE(int i) {
			return getToken(JjQueryParser.APOSTROPHE, i);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
		}

		public TerminalNode OPEN_PARENTHESIS() {
			return getToken(JjQueryParser.OPEN_PARENTHESIS, 0);
		}

		public TerminalNode CLOSE_BRACKET() {
			return getToken(JjQueryParser.CLOSE_BRACKET, 0);
		}

		public MethodSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodSelector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterMethodSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitMethodSelector(this);
		}
	}

	public final MethodSelectorContext methodSelector()
			throws RecognitionException {
		MethodSelectorContext _localctx = new MethodSelectorContext(_ctx,
				getState());
		enterRule(_localctx, 482, RULE_methodSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2901);
				match(OPEN_BRACKET);
				setState(2902);
				match(ID);
				setState(2903);
				match(OPEN_PARENTHESIS);
				setState(2904);
				match(CLOSE_PARENTHESIS);
				setState(2905);
				match(OP);
				setState(2906);
				match(APOSTROPHE);
				setState(2907);
				match(ID);
				setState(2908);
				match(APOSTROPHE);
				setState(2909);
				match(CLOSE_BRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return packageName_sempred((PackageNameContext) _localctx,
					predIndex);
		case 28:
			return packageOrTypeName_sempred(
					(PackageOrTypeNameContext) _localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext) _localctx,
					predIndex);
		case 217:
			return conditionalOrExpression_sempred(
					(ConditionalOrExpressionContext) _localctx, predIndex);
		case 218:
			return conditionalAndExpression_sempred(
					(ConditionalAndExpressionContext) _localctx, predIndex);
		case 219:
			return inclusiveOrExpression_sempred(
					(InclusiveOrExpressionContext) _localctx, predIndex);
		case 220:
			return exclusiveOrExpression_sempred(
					(ExclusiveOrExpressionContext) _localctx, predIndex);
		case 221:
			return andExpression_sempred((AndExpressionContext) _localctx,
					predIndex);
		case 222:
			return equalityExpression_sempred(
					(EqualityExpressionContext) _localctx, predIndex);
		case 223:
			return relationalExpression_sempred(
					(RelationalExpressionContext) _localctx, predIndex);
		case 224:
			return shiftExpression_sempred((ShiftExpressionContext) _localctx,
					predIndex);
		case 225:
			return additiveExpression_sempred(
					(AdditiveExpressionContext) _localctx, predIndex);
		case 226:
			return multiplicativeExpression_sempred(
					(MultiplicativeExpressionContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	private boolean additiveExpression_sempred(
			AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean packageOrTypeName_sempred(
			PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean inclusiveOrExpression_sempred(
			InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean relationalExpression_sempred(
			RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean conditionalAndExpression_sempred(
			ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean multiplicativeExpression_sempred(
			MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean andExpression_sempred(AndExpressionContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean conditionalOrExpression_sempred(
			ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean exclusiveOrExpression_sempred(
			ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean equalityExpression_sempred(
			EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean packageName_sempred(PackageNameContext _localctx,
			int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\177\u0b62\4\2\t\2"
			+ "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
			+ ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
			+ "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
			+ "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"
			+ "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"
			+ "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"
			+ "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"
			+ "k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"
			+ "w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"
			+ "\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"
			+ "\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"
			+ "\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"
			+ "\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"
			+ "\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"
			+ "\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"
			+ "\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"
			+ "\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"
			+ "\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"
			+ "\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"
			+ "\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"
			+ "\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"
			+ "\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"
			+ "\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"
			+ "\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"
			+ "\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"
			+ "\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"
			+ "\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"
			+ "\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"
			+ "\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"
			+ "\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"
			+ "\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"
			+ "\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"
			+ "\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"
			+ "\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"
			+ "\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\3\2\3\2\3\3\3\3\5\3\u01eb\n\3"
			+ "\3\4\7\4\u01ee\n\4\f\4\16\4\u01f1\13\4\3\4\3\4\7\4\u01f5\n\4\f\4\16\4"
			+ "\u01f8\13\4\3\4\5\4\u01fb\n\4\3\5\3\5\5\5\u01ff\n\5\3\6\3\6\3\7\3\7\3"
			+ "\b\3\b\3\b\5\b\u0208\n\b\3\t\3\t\5\t\u020c\n\t\3\t\3\t\7\t\u0210\n\t\f"
			+ "\t\16\t\u0213\13\t\3\n\7\n\u0216\n\n\f\n\16\n\u0219\13\n\3\n\3\n\5\n\u021d"
			+ "\n\n\3\n\3\n\3\n\7\n\u0222\n\n\f\n\16\n\u0225\13\n\3\n\3\n\5\n\u0229\n"
			+ "\n\5\n\u022b\n\n\3\13\3\13\7\13\u022f\n\13\f\13\16\13\u0232\13\13\3\13"
			+ "\3\13\5\13\u0236\n\13\3\f\7\f\u0239\n\f\f\f\16\f\u023c\13\f\3\f\3\f\5"
			+ "\f\u0240\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u0249\n\20\f\20\16"
			+ "\20\u024c\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"
			+ "\5\21\u0259\n\21\3\22\7\22\u025c\n\22\f\22\16\22\u025f\13\22\3\22\3\22"
			+ "\3\22\7\22\u0264\n\22\f\22\16\22\u0267\13\22\3\22\3\22\7\22\u026b\n\22"
			+ "\f\22\16\22\u026e\13\22\3\23\7\23\u0271\n\23\f\23\16\23\u0274\13\23\3"
			+ "\23\3\23\5\23\u0278\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0281"
			+ "\n\25\f\25\16\25\u0284\13\25\5\25\u0286\n\25\3\26\3\26\3\26\3\27\3\27"
			+ "\3\27\3\27\3\30\3\30\3\30\7\30\u0292\n\30\f\30\16\30\u0295\13\30\3\31"
			+ "\3\31\5\31\u0299\n\31\3\32\7\32\u029c\n\32\f\32\16\32\u029f\13\32\3\32"
			+ "\3\32\5\32\u02a3\n\32\3\33\3\33\3\33\3\33\5\33\u02a9\n\33\3\34\3\34\3"
			+ "\34\3\34\3\34\3\34\7\34\u02b1\n\34\f\34\16\34\u02b4\13\34\3\35\3\35\3"
			+ "\35\3\35\3\35\5\35\u02bb\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02c3"
			+ "\n\36\f\36\16\36\u02c6\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u02cd\n\37"
			+ "\3 \3 \3!\3!\3!\3!\3!\3!\7!\u02d7\n!\f!\16!\u02da\13!\3\"\5\"\u02dd\n"
			+ "\"\3\"\7\"\u02e0\n\"\f\"\16\"\u02e3\13\"\3\"\7\"\u02e6\n\"\f\"\16\"\u02e9"
			+ "\13\"\3\"\3\"\3#\7#\u02ee\n#\f#\16#\u02f1\13#\3#\3#\3#\3#\7#\u02f7\n#"
			+ "\f#\16#\u02fa\13#\3#\3#\3$\3$\3%\3%\3%\3%\5%\u0304\n%\3&\3&\3&\3&\3\'"
			+ "\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3"
			+ "*\5*\u0321\n*\3+\3+\5+\u0325\n+\3,\7,\u0328\n,\f,\16,\u032b\13,\3,\3,"
			+ "\3,\5,\u0330\n,\3,\5,\u0333\n,\3,\5,\u0336\n,\3,\3,\3-\3-\3-\3-\3-\3-"
			+ "\3-\3-\5-\u0342\n-\3.\3.\3.\3.\3/\3/\3/\7/\u034b\n/\f/\16/\u034e\13/\3"
			+ "\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u0359\n\62\f\62\16\62"
			+ "\u035c\13\62\3\63\3\63\7\63\u0360\n\63\f\63\16\63\u0363\13\63\3\63\3\63"
			+ "\3\64\3\64\3\64\3\64\5\64\u036b\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u0372"
			+ "\n\65\3\66\7\66\u0375\n\66\f\66\16\66\u0378\13\66\3\66\3\66\3\66\3\66"
			+ "\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0386\n\67\38\38\38\78\u038b"
			+ "\n8\f8\168\u038e\138\39\39\39\59\u0393\n9\3:\3:\5:\u0397\n:\3;\3;\5;\u039b"
			+ "\n;\3<\3<\5<\u039f\n<\3=\3=\5=\u03a3\n=\3>\3>\3>\5>\u03a8\n>\3?\3?\5?"
			+ "\u03ac\n?\3?\3?\7?\u03b0\n?\f?\16?\u03b3\13?\3@\3@\5@\u03b7\n@\3@\3@\3"
			+ "@\7@\u03bc\n@\f@\16@\u03bf\13@\3@\3@\5@\u03c3\n@\5@\u03c5\n@\3A\3A\7A"
			+ "\u03c9\nA\fA\16A\u03cc\13A\3A\3A\5A\u03d0\nA\3B\3B\5B\u03d4\nB\3C\3C\3"
			+ "D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03e7\nG\3H\7H\u03ea\n"
			+ "H\fH\16H\u03ed\13H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03fc\nI"
			+ "\3J\3J\3J\5J\u0401\nJ\3J\3J\7J\u0405\nJ\fJ\16J\u0408\13J\3J\3J\3J\5J\u040d"
			+ "\nJ\5J\u040f\nJ\3K\3K\5K\u0413\nK\3L\3L\3L\5L\u0418\nL\3L\3L\5L\u041c"
			+ "\nL\3M\3M\3M\3M\3M\5M\u0423\nM\3N\3N\3N\7N\u0428\nN\fN\16N\u042b\13N\3"
			+ "N\3N\3N\7N\u0430\nN\fN\16N\u0433\13N\5N\u0435\nN\3O\7O\u0438\nO\fO\16"
			+ "O\u043b\13O\3O\3O\3O\3P\3P\5P\u0442\nP\3Q\7Q\u0445\nQ\fQ\16Q\u0448\13"
			+ "Q\3Q\3Q\7Q\u044c\nQ\fQ\16Q\u044f\13Q\3Q\3Q\3Q\3Q\5Q\u0455\nQ\3R\7R\u0458"
			+ "\nR\fR\16R\u045b\13R\3R\3R\3R\5R\u0460\nR\3R\3R\3S\3S\3S\3T\3T\3T\7T\u046a"
			+ "\nT\fT\16T\u046d\13T\3U\3U\5U\u0471\nU\3V\3V\5V\u0475\nV\3W\3W\3X\3X\3"
			+ "X\3Y\7Y\u047d\nY\fY\16Y\u0480\13Y\3Y\3Y\5Y\u0484\nY\3Y\3Y\3Z\3Z\3Z\3Z"
			+ "\5Z\u048c\nZ\3[\5[\u048f\n[\3[\3[\3[\5[\u0494\n[\3[\3[\3\\\3\\\3]\3]\5"
			+ "]\u049c\n]\3]\5]\u049f\n]\3]\3]\3^\5^\u04a4\n^\3^\3^\3^\5^\u04a9\n^\3"
			+ "^\3^\3^\5^\u04ae\n^\3^\3^\3^\5^\u04b3\n^\3^\3^\3^\3^\3^\5^\u04ba\n^\3"
			+ "^\3^\3^\5^\u04bf\n^\3^\3^\3^\3^\3^\3^\5^\u04c7\n^\3^\3^\3^\5^\u04cc\n"
			+ "^\3^\3^\3^\5^\u04d1\n^\3_\7_\u04d4\n_\f_\16_\u04d7\13_\3_\3_\3_\5_\u04dc"
			+ "\n_\3_\3_\3`\3`\5`\u04e2\n`\3`\5`\u04e5\n`\3`\5`\u04e8\n`\3`\3`\3a\3a"
			+ "\3a\7a\u04ef\na\fa\16a\u04f2\13a\3b\7b\u04f5\nb\fb\16b\u04f8\13b\3b\3"
			+ "b\3b\5b\u04fd\nb\3b\5b\u0500\nb\3b\5b\u0503\nb\3c\3c\3d\3d\7d\u0509\n"
			+ "d\fd\16d\u050c\13d\3e\3e\5e\u0510\ne\3f\7f\u0513\nf\ff\16f\u0516\13f\3"
			+ "f\3f\3f\5f\u051b\nf\3f\5f\u051e\nf\3f\3f\3g\3g\3g\3g\3g\3g\3g\5g\u0529"
			+ "\ng\3h\3h\3h\3i\3i\7i\u0530\ni\fi\16i\u0533\13i\3i\3i\3j\3j\3j\3j\3j\5"
			+ "j\u053c\nj\3k\7k\u053f\nk\fk\16k\u0542\13k\3k\3k\3k\3k\3l\3l\3l\3l\5l"
			+ "\u054c\nl\3m\7m\u054f\nm\fm\16m\u0552\13m\3m\3m\3m\3n\3n\3n\3n\3n\3n\5"
			+ "n\u055d\nn\3o\7o\u0560\no\fo\16o\u0563\13o\3o\3o\3o\3o\3o\3p\3p\7p\u056c"
			+ "\np\fp\16p\u056f\13p\3p\3p\3q\3q\3q\3q\3q\5q\u0578\nq\3r\7r\u057b\nr\f"
			+ "r\16r\u057e\13r\3r\3r\3r\3r\3r\5r\u0585\nr\3r\5r\u0588\nr\3r\3r\3s\3s"
			+ "\3s\5s\u058f\ns\3t\3t\3t\3u\3u\3u\5u\u0597\nu\3v\3v\3v\3v\5v\u059d\nv"
			+ "\3v\3v\3w\3w\3w\7w\u05a4\nw\fw\16w\u05a7\13w\3x\3x\3x\3x\3y\3y\3y\5y\u05b0"
			+ "\ny\3z\3z\5z\u05b4\nz\3z\5z\u05b7\nz\3z\3z\3{\3{\3{\7{\u05be\n{\f{\16"
			+ "{\u05c1\13{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3~\3~\5~\u05ce\n~\3~\5~\u05d1\n"
			+ "~\3~\3~\3\177\3\177\3\177\7\177\u05d8\n\177\f\177\16\177\u05db\13\177"
			+ "\3\u0080\3\u0080\5\u0080\u05df\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081"
			+ "\7\u0081\u05e5\n\u0081\f\u0081\16\u0081\u05e8\13\u0081\3\u0082\3\u0082"
			+ "\3\u0082\3\u0082\5\u0082\u05ee\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084"
			+ "\7\u0084\u05f4\n\u0084\f\u0084\16\u0084\u05f7\13\u0084\3\u0084\3\u0084"
			+ "\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0602"
			+ "\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0609\n\u0086"
			+ "\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"
			+ "\3\u0087\3\u0087\3\u0087\5\u0087\u0617\n\u0087\3\u0088\3\u0088\3\u0089"
			+ "\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b"
			+ "\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"
			+ "\u062d\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e"
			+ "\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f"
			+ "\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"
			+ "\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u064f"
			+ "\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"
			+ "\7\u0092\u0659\n\u0092\f\u0092\16\u0092\u065c\13\u0092\3\u0092\7\u0092"
			+ "\u065f\n\u0092\f\u0092\16\u0092\u0662\13\u0092\3\u0092\3\u0092\3\u0093"
			+ "\3\u0093\3\u0093\3\u0094\3\u0094\7\u0094\u066b\n\u0094\f\u0094\16\u0094"
			+ "\u066e\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"
			+ "\3\u0095\3\u0095\3\u0095\5\u0095\u067a\n\u0095\3\u0096\3\u0096\3\u0097"
			+ "\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098"
			+ "\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"
			+ "\3\u0099\3\u009a\3\u009a\5\u009a\u0694\n\u009a\3\u009b\3\u009b\5\u009b"
			+ "\u0698\n\u009b\3\u009c\3\u009c\3\u009c\5\u009c\u069d\n\u009c\3\u009c\3"
			+ "\u009c\5\u009c\u06a1\n\u009c\3\u009c\3\u009c\5\u009c\u06a5\n\u009c\3\u009c"
			+ "\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u06ad\n\u009d\3\u009d"
			+ "\3\u009d\5\u009d\u06b1\n\u009d\3\u009d\3\u009d\5\u009d\u06b5\n\u009d\3"
			+ "\u009d\3\u009d\3\u009d\3\u009e\3\u009e\5\u009e\u06bc\n\u009e\3\u009f\3"
			+ "\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u06c3\n\u00a0\f\u00a0\16\u00a0"
			+ "\u06c6\13\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u06cb\n\u00a1\f\u00a1"
			+ "\16\u00a1\u06ce\13\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"
			+ "\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u06da\n\u00a2\f\u00a2\16\u00a2"
			+ "\u06dd\13\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"
			+ "\3\u00a3\3\u00a3\5\u00a3\u06e8\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"
			+ "\5\u00a4\u06ee\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u06f4\n"
			+ "\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7"
			+ "\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"
			+ "\3\u00a8\3\u00a8\5\u00a8\u0709\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8"
			+ "\u070e\n\u00a8\3\u00a9\3\u00a9\7\u00a9\u0712\n\u00a9\f\u00a9\16\u00a9"
			+ "\u0715\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab"
			+ "\7\u00ab\u071e\n\u00ab\f\u00ab\16\u00ab\u0721\13\u00ab\3\u00ab\3\u00ab"
			+ "\3\u00ab\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u0729\n\u00ac\f\u00ac\16\u00ac"
			+ "\u072c\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae"
			+ "\5\u00ae\u0735\n\u00ae\3\u00ae\5\u00ae\u0738\n\u00ae\3\u00af\3\u00af\3"
			+ "\u00af\5\u00af\u073d\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\7"
			+ "\u00b0\u0744\n\u00b0\f\u00b0\16\u00b0\u0747\13\u00b0\3\u00b1\7\u00b1\u074a"
			+ "\n\u00b1\f\u00b1\16\u00b1\u074d\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"
			+ "\3\u00b1\3\u00b2\3\u00b2\5\u00b2\u0756\n\u00b2\3\u00b2\7\u00b2\u0759\n"
			+ "\u00b2\f\u00b2\16\u00b2\u075c\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3"
			+ "\7\u00b3\u0762\n\u00b3\f\u00b3\16\u00b3\u0765\13\u00b3\3\u00b3\3\u00b3"
			+ "\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"
			+ "\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"
			+ "\5\u00b3\u077b\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"
			+ "\7\u00b5\u0783\n\u00b5\f\u00b5\16\u00b5\u0786\13\u00b5\3\u00b5\3\u00b5"
			+ "\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"
			+ "\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"
			+ "\u079b\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u07a2\n"
			+ "\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u07aa\n"
			+ "\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u07b0\n\u00b9\f\u00b9\16"
			+ "\u00b9\u07b3\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"
			+ "\7\u00b9\u07bb\n\u00b9\f\u00b9\16\u00b9\u07be\13\u00b9\3\u00b9\3\u00b9"
			+ "\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"
			+ "\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"
			+ "\5\u00b9\u07d4\n\u00b9\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb"
			+ "\7\u00bb\u07dc\n\u00bb\f\u00bb\16\u00bb\u07df\13\u00bb\3\u00bb\3\u00bb"
			+ "\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u07e7\n\u00bb\f\u00bb\16\u00bb"
			+ "\u07ea\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"
			+ "\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"
			+ "\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u07ff\n\u00bb\3\u00bc\3\u00bc\5\u00bc"
			+ "\u0803\n\u00bc\3\u00bc\7\u00bc\u0806\n\u00bc\f\u00bc\16\u00bc\u0809\13"
			+ "\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u080e\n\u00bc\f\u00bc\16\u00bc"
			+ "\u0811\13\u00bc\3\u00bc\7\u00bc\u0814\n\u00bc\f\u00bc\16\u00bc\u0817\13"
			+ "\u00bc\3\u00bc\5\u00bc\u081a\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u081e\n\u00bc"
			+ "\3\u00bc\3\u00bc\5\u00bc\u0822\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"
			+ "\5\u00bc\u0828\n\u00bc\3\u00bc\7\u00bc\u082b\n\u00bc\f\u00bc\16\u00bc"
			+ "\u082e\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u0832\n\u00bc\3\u00bc\3\u00bc"
			+ "\5\u00bc\u0836\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u083a\n\u00bc\3\u00bc\3"
			+ "\u00bc\3\u00bc\3\u00bc\5\u00bc\u0840\n\u00bc\3\u00bc\7\u00bc\u0843\n\u00bc"
			+ "\f\u00bc\16\u00bc\u0846\13\u00bc\3\u00bc\3\u00bc\5\u00bc\u084a\n\u00bc"
			+ "\3\u00bc\3\u00bc\5\u00bc\u084e\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0852\n"
			+ "\u00bc\5\u00bc\u0854\n\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0859\n\u00bd"
			+ "\3\u00bd\7\u00bd\u085c\n\u00bd\f\u00bd\16\u00bd\u085f\13\u00bd\3\u00bd"
			+ "\3\u00bd\5\u00bd\u0863\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0867\n\u00bd\3"
			+ "\u00bd\3\u00bd\5\u00bd\u086b\n\u00bd\3\u00be\3\u00be\5\u00be\u086f\n\u00be"
			+ "\3\u00be\7\u00be\u0872\n\u00be\f\u00be\16\u00be\u0875\13\u00be\3\u00be"
			+ "\3\u00be\3\u00be\7\u00be\u087a\n\u00be\f\u00be\16\u00be\u087d\13\u00be"
			+ "\3\u00be\7\u00be\u0880\n\u00be\f\u00be\16\u00be\u0883\13\u00be\3\u00be"
			+ "\5\u00be\u0886\n\u00be\3\u00be\3\u00be\5\u00be\u088a\n\u00be\3\u00be\3"
			+ "\u00be\5\u00be\u088e\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0894"
			+ "\n\u00be\3\u00be\7\u00be\u0897\n\u00be\f\u00be\16\u00be\u089a\13\u00be"
			+ "\3\u00be\3\u00be\5\u00be\u089e\n\u00be\3\u00be\3\u00be\5\u00be\u08a2\n"
			+ "\u00be\3\u00be\3\u00be\5\u00be\u08a6\n\u00be\5\u00be\u08a8\n\u00be\3\u00bf"
			+ "\3\u00bf\3\u00bf\5\u00bf\u08ad\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0"
			+ "\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"
			+ "\5\u00c0\u08bc\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2"
			+ "\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u08ca\n\u00c2"
			+ "\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"
			+ "\3\u00c3\5\u00c3\u08d6\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"
			+ "\7\u00c3\u08dd\n\u00c3\f\u00c3\16\u00c3\u08e0\13\u00c3\3\u00c4\3\u00c4"
			+ "\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4"
			+ "\u08ec\n\u00c4\f\u00c4\16\u00c4\u08ef\13\u00c4\3\u00c5\3\u00c5\3\u00c5"
			+ "\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08fb"
			+ "\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u0902\n\u00c5"
			+ "\f\u00c5\16\u00c5\u0905\13\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u090a"
			+ "\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0911\n\u00c6"
			+ "\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0916\n\u00c6\3\u00c6\3\u00c6\3\u00c6"
			+ "\3\u00c6\3\u00c6\5\u00c6\u091d\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6"
			+ "\u0922\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0929\n"
			+ "\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u092e\n\u00c6\3\u00c6\3\u00c6\3"
			+ "\u00c6\3\u00c6\3\u00c6\5\u00c6\u0935\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5"
			+ "\u00c6\u093a\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5"
			+ "\u00c6\u0942\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0947\n\u00c6\3\u00c6"
			+ "\3\u00c6\5\u00c6\u094b\n\u00c6\3\u00c7\3\u00c7\5\u00c7\u094f\n\u00c7\3"
			+ "\u00c7\3\u00c7\3\u00c7\5\u00c7\u0954\n\u00c7\3\u00c7\3\u00c7\3\u00c8\3"
			+ "\u00c8\3\u00c8\5\u00c8\u095b\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3"
			+ "\u00c8\5\u00c8\u0962\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0967\n\u00c8"
			+ "\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u096e\n\u00c8\3\u00c8"
			+ "\3\u00c8\3\u00c8\5\u00c8\u0973\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"
			+ "\3\u00c8\5\u00c8\u097a\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u097f\n"
			+ "\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0987\n"
			+ "\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u098c\n\u00c8\3\u00c8\3\u00c8\5"
			+ "\u00c8\u0990\n\u00c8\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u0995\n\u00c9\f\u00c9"
			+ "\16\u00c9\u0998\13\u00c9\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u099d\n\u00ca"
			+ "\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09a4\n\u00ca\3\u00ca"
			+ "\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09ab\n\u00ca\3\u00ca\3\u00ca"
			+ "\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09b2\n\u00ca\3\u00ca\3\u00ca\3\u00ca"
			+ "\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09ba\n\u00ca\3\u00ca\3\u00ca\3\u00ca"
			+ "\3\u00ca\3\u00ca\5\u00ca\u09c1\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"
			+ "\3\u00ca\3\u00ca\5\u00ca\u09c9\n\u00ca\3\u00cb\3\u00cb\5\u00cb\u09cd\n"
			+ "\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09d4\n\u00cc\3"
			+ "\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09db\n\u00cc\3\u00cc\3"
			+ "\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09e2\n\u00cc\3\u00cc\3\u00cc\3"
			+ "\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09ea\n\u00cc\3\u00cc\3\u00cc\3"
			+ "\u00cc\3\u00cc\3\u00cc\5\u00cc\u09f1\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3"
			+ "\u00cc\3\u00cc\3\u00cc\5\u00cc\u09f9\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3"
			+ "\u00cd\5\u00cd\u09ff\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a05"
			+ "\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"
			+ "\3\u00cd\3\u00cd\5\u00cd\u0a11\n\u00cd\3\u00ce\3\u00ce\7\u00ce\u0a15\n"
			+ "\u00ce\f\u00ce\16\u00ce\u0a18\13\u00ce\3\u00cf\7\u00cf\u0a1b\n\u00cf\f"
			+ "\u00cf\16\u00cf\u0a1e\13\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00d0"
			+ "\3\u00d0\3\u00d1\3\u00d1\5\u00d1\u0a28\n\u00d1\3\u00d2\3\u00d2\3\u00d2"
			+ "\3\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a31\n\u00d3\3\u00d3\3\u00d3"
			+ "\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a38\n\u00d3\3\u00d4\3\u00d4\3\u00d4"
			+ "\7\u00d4\u0a3d\n\u00d4\f\u00d4\16\u00d4\u0a40\13\u00d4\3\u00d5\3\u00d5"
			+ "\5\u00d5\u0a44\n\u00d5\3\u00d6\3\u00d6\5\u00d6\u0a48\n\u00d6\3\u00d7\3"
			+ "\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a51\n\u00d8\3"
			+ "\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"
			+ "\5\u00da\u0a5c\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"
			+ "\7\u00db\u0a64\n\u00db\f\u00db\16\u00db\u0a67\13\u00db\3\u00dc\3\u00dc"
			+ "\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a6f\n\u00dc\f\u00dc\16\u00dc"
			+ "\u0a72\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd"
			+ "\u0a7a\n\u00dd\f\u00dd\16\u00dd\u0a7d\13\u00dd\3\u00de\3\u00de\3\u00de"
			+ "\3\u00de\3\u00de\3\u00de\7\u00de\u0a85\n\u00de\f\u00de\16\u00de\u0a88"
			+ "\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df\u0a90"
			+ "\n\u00df\f\u00df\16\u00df\u0a93\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0"
			+ "\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0a9e\n\u00e0\f\u00e0"
			+ "\16\u00e0\u0aa1\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"
			+ "\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"
			+ "\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0ab5\n\u00e1\f\u00e1\16\u00e1\u0ab8"
			+ "\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"
			+ "\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\7\u00e2"
			+ "\u0aca\n\u00e2\f\u00e2\16\u00e2\u0acd\13\u00e2\3\u00e3\3\u00e3\3\u00e3"
			+ "\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0ad8\n\u00e3"
			+ "\f\u00e3\16\u00e3\u0adb\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"
			+ "\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0ae9"
			+ "\n\u00e4\f\u00e4\16\u00e4\u0aec\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5"
			+ "\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0af5\n\u00e5\3\u00e6\3\u00e6\3\u00e6"
			+ "\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"
			+ "\5\u00e8\u0b03\n\u00e8\3\u00e9\3\u00e9\5\u00e9\u0b07\n\u00e9\3\u00e9\3"
			+ "\u00e9\7\u00e9\u0b0b\n\u00e9\f\u00e9\16\u00e9\u0b0e\13\u00e9\3\u00ea\3"
			+ "\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed"
			+ "\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee"
			+ "\u0b22\n\u00ee\f\u00ee\16\u00ee\u0b25\13\u00ee\3\u00ee\3\u00ee\3\u00ee"
			+ "\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b2d\n\u00ee\f\u00ee\16\u00ee\u0b30"
			+ "\13\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee\u0b35\n\u00ee\3\u00ef\3\u00ef"
			+ "\7\u00ef\u0b39\n\u00ef\f\u00ef\16\u00ef\u0b3c\13\u00ef\3\u00ef\3\u00ef"
			+ "\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0"
			+ "\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\5\u00f1\u0b4e\n\u00f1\3\u00f2"
			+ "\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3"
			+ "\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3"
			+ "\2\17\66:@\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"
			+ "\u00f4\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"
			+ ">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"
			+ "\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"
			+ "\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"
			+ "\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"
			+ "\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"
			+ "\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"
			+ "\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"
			+ "\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"
			+ "\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"
			+ "\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"
			+ "\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a"
			+ "\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192"
			+ "\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa"
			+ "\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2"
			+ "\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da"
			+ "\u01dc\u01de\u01e0\u01e2\u01e4\2\6\3\2\67<\7\2\t\t\f\f\37\37!!))\4\2\22"
			+ "\22\30\30\4\2FF_i\u0c51\2\u01e6\3\2\2\2\4\u01ea\3\2\2\2\6\u01fa\3\2\2"
			+ "\2\b\u01fe\3\2\2\2\n\u0200\3\2\2\2\f\u0202\3\2\2\2\16\u0207\3\2\2\2\20"
			+ "\u020b\3\2\2\2\22\u022a\3\2\2\2\24\u022c\3\2\2\2\26\u023a\3\2\2\2\30\u0241"
			+ "\3\2\2\2\32\u0243\3\2\2\2\34\u0245\3\2\2\2\36\u024a\3\2\2\2 \u0258\3\2"
			+ "\2\2\"\u025d\3\2\2\2$\u0272\3\2\2\2&\u0279\3\2\2\2(\u0285\3\2\2\2*\u0287"
			+ "\3\2\2\2,\u028a\3\2\2\2.\u028e\3\2\2\2\60\u0298\3\2\2\2\62\u029d\3\2\2"
			+ "\2\64\u02a8\3\2\2\2\66\u02aa\3\2\2\28\u02ba\3\2\2\2:\u02bc\3\2\2\2<\u02cc"
			+ "\3\2\2\2>\u02ce\3\2\2\2@\u02d0\3\2\2\2B\u02dc\3\2\2\2D\u02ef\3\2\2\2F"
			+ "\u02fd\3\2\2\2H\u0303\3\2\2\2J\u0305\3\2\2\2L\u0309\3\2\2\2N\u030f\3\2"
			+ "\2\2P\u0316\3\2\2\2R\u0320\3\2\2\2T\u0324\3\2\2\2V\u0329\3\2\2\2X\u0341"
			+ "\3\2\2\2Z\u0343\3\2\2\2\\\u0347\3\2\2\2^\u034f\3\2\2\2`\u0352\3\2\2\2"
			+ "b\u0355\3\2\2\2d\u035d\3\2\2\2f\u036a\3\2\2\2h\u0371\3\2\2\2j\u0376\3"
			+ "\2\2\2l\u0385\3\2\2\2n\u0387\3\2\2\2p\u038f\3\2\2\2r\u0394\3\2\2\2t\u039a"
			+ "\3\2\2\2v\u039e\3\2\2\2x\u03a2\3\2\2\2z\u03a7\3\2\2\2|\u03ab\3\2\2\2~"
			+ "\u03c4\3\2\2\2\u0080\u03c6\3\2\2\2\u0082\u03d1\3\2\2\2\u0084\u03d5\3\2"
			+ "\2\2\u0086\u03d7\3\2\2\2\u0088\u03d9\3\2\2\2\u008a\u03db\3\2\2\2\u008c"
			+ "\u03e6\3\2\2\2\u008e\u03eb\3\2\2\2\u0090\u03fb\3\2\2\2\u0092\u040e\3\2"
			+ "\2\2\u0094\u0412\3\2\2\2\u0096\u0414\3\2\2\2\u0098\u0422\3\2\2\2\u009a"
			+ "\u0434\3\2\2\2\u009c\u0439\3\2\2\2\u009e\u0441\3\2\2\2\u00a0\u0454\3\2"
			+ "\2\2\u00a2\u0459\3\2\2\2\u00a4\u0463\3\2\2\2\u00a6\u0466\3\2\2\2\u00a8"
			+ "\u0470\3\2\2\2\u00aa\u0474\3\2\2\2\u00ac\u0476\3\2\2\2\u00ae\u0478\3\2"
			+ "\2\2\u00b0\u047e\3\2\2\2\u00b2\u048b\3\2\2\2\u00b4\u048e\3\2\2\2\u00b6"
			+ "\u0497\3\2\2\2\u00b8\u0499\3\2\2\2\u00ba\u04d0\3\2\2\2\u00bc\u04d5\3\2"
			+ "\2\2\u00be\u04df\3\2\2\2\u00c0\u04eb\3\2\2\2\u00c2\u04f6\3\2\2\2\u00c4"
			+ "\u0504\3\2\2\2\u00c6\u0506\3\2\2\2\u00c8\u050f\3\2\2\2\u00ca\u0514\3\2"
			+ "\2\2\u00cc\u0528\3\2\2\2\u00ce\u052a\3\2\2\2\u00d0\u052d\3\2\2\2\u00d2"
			+ "\u053b\3\2\2\2\u00d4\u0540\3\2\2\2\u00d6\u054b\3\2\2\2\u00d8\u0550\3\2"
			+ "\2\2\u00da\u055c\3\2\2\2\u00dc\u0561\3\2\2\2\u00de\u0569\3\2\2\2\u00e0"
			+ "\u0577\3\2\2\2\u00e2\u057c\3\2\2\2\u00e4\u058e\3\2\2\2\u00e6\u0590\3\2"
			+ "\2\2\u00e8\u0596\3\2\2\2\u00ea\u0598\3\2\2\2\u00ec\u05a0\3\2\2\2\u00ee"
			+ "\u05a8\3\2\2\2\u00f0\u05af\3\2\2\2\u00f2\u05b1\3\2\2\2\u00f4\u05ba\3\2"
			+ "\2\2\u00f6\u05c2\3\2\2\2\u00f8\u05c5\3\2\2\2\u00fa\u05cb\3\2\2\2\u00fc"
			+ "\u05d4\3\2\2\2\u00fe\u05dc\3\2\2\2\u0100\u05e2\3\2\2\2\u0102\u05ed\3\2"
			+ "\2\2\u0104\u05ef\3\2\2\2\u0106\u05f5\3\2\2\2\u0108\u0601\3\2\2\2\u010a"
			+ "\u0608\3\2\2\2\u010c\u0616\3\2\2\2\u010e\u0618\3\2\2\2\u0110\u061a\3\2"
			+ "\2\2\u0112\u061e\3\2\2\2\u0114\u0622\3\2\2\2\u0116\u062c\3\2\2\2\u0118"
			+ "\u062e\3\2\2\2\u011a\u0634\3\2\2\2\u011c\u063c\3\2\2\2\u011e\u064e\3\2"
			+ "\2\2\u0120\u0650\3\2\2\2\u0122\u0656\3\2\2\2\u0124\u0665\3\2\2\2\u0126"
			+ "\u0668\3\2\2\2\u0128\u0679\3\2\2\2\u012a\u067b\3\2\2\2\u012c\u067d\3\2"
			+ "\2\2\u012e\u0683\3\2\2\2\u0130\u0689\3\2\2\2\u0132\u0693\3\2\2\2\u0134"
			+ "\u0697\3\2\2\2\u0136\u0699\3\2\2\2\u0138\u06a9\3\2\2\2\u013a\u06bb\3\2"
			+ "\2\2\u013c\u06bd\3\2\2\2\u013e\u06bf\3\2\2\2\u0140\u06c7\3\2\2\2\u0142"
			+ "\u06d6\3\2\2\2\u0144\u06e5\3\2\2\2\u0146\u06eb\3\2\2\2\u0148\u06f1\3\2"
			+ "\2\2\u014a\u06f7\3\2\2\2\u014c\u06fb\3\2\2\2\u014e\u070d\3\2\2\2\u0150"
			+ "\u070f\3\2\2\2\u0152\u0716\3\2\2\2\u0154\u071f\3\2\2\2\u0156\u0725\3\2"
			+ "\2\2\u0158\u072d\3\2\2\2\u015a\u0730\3\2\2\2\u015c\u0739\3\2\2\2\u015e"
			+ "\u0740\3\2\2\2\u0160\u074b\3\2\2\2\u0162\u0755\3\2\2\2\u0164\u077a\3\2"
			+ "\2\2\u0166\u077c\3\2\2\2\u0168\u079a\3\2\2\2\u016a\u07a1\3\2\2\2\u016c"
			+ "\u07a3\3\2\2\2\u016e\u07a9\3\2\2\2\u0170\u07d3\3\2\2\2\u0172\u07d5\3\2"
			+ "\2\2\u0174\u07fe\3\2\2\2\u0176\u0853\3\2\2\2\u0178\u0855\3\2\2\2\u017a"
			+ "\u08a7\3\2\2\2\u017c\u08ac\3\2\2\2\u017e\u08bb\3\2\2\2\u0180\u08bd\3\2"
			+ "\2\2\u0182\u08c9\3\2\2\2\u0184\u08d5\3\2\2\2\u0186\u08e1\3\2\2\2\u0188"
			+ "\u08fa\3\2\2\2\u018a\u094a\3\2\2\2\u018c\u094c\3\2\2\2\u018e\u098f\3\2"
			+ "\2\2\u0190\u0991\3\2\2\2\u0192\u09c8\3\2\2\2\u0194\u09ca\3\2\2\2\u0196"
			+ "\u09f8\3\2\2\2\u0198\u0a10\3\2\2\2\u019a\u0a12\3\2\2\2\u019c\u0a1c\3\2"
			+ "\2\2\u019e\u0a23\3\2\2\2\u01a0\u0a27\3\2\2\2\u01a2\u0a29\3\2\2\2\u01a4"
			+ "\u0a37\3\2\2\2\u01a6\u0a39\3\2\2\2\u01a8\u0a43\3\2\2\2\u01aa\u0a47\3\2"
			+ "\2\2\u01ac\u0a49\3\2\2\2\u01ae\u0a50\3\2\2\2\u01b0\u0a52\3\2\2\2\u01b2"
			+ "\u0a5b\3\2\2\2\u01b4\u0a5d\3\2\2\2\u01b6\u0a68\3\2\2\2\u01b8\u0a73\3\2"
			+ "\2\2\u01ba\u0a7e\3\2\2\2\u01bc\u0a89\3\2\2\2\u01be\u0a94\3\2\2\2\u01c0"
			+ "\u0aa2\3\2\2\2\u01c2\u0ab9\3\2\2\2\u01c4\u0ace\3\2\2\2\u01c6\u0adc\3\2"
			+ "\2\2\u01c8\u0af4\3\2\2\2\u01ca\u0af6\3\2\2\2\u01cc\u0af9\3\2\2\2\u01ce"
			+ "\u0b02\3\2\2\2\u01d0\u0b06\3\2\2\2\u01d2\u0b0f\3\2\2\2\u01d4\u0b12\3\2"
			+ "\2\2\u01d6\u0b14\3\2\2\2\u01d8\u0b17\3\2\2\2\u01da\u0b34\3\2\2\2\u01dc"
			+ "\u0b36\3\2\2\2\u01de\u0b3f\3\2\2\2\u01e0\u0b4d\3\2\2\2\u01e2\u0b4f\3\2"
			+ "\2\2\u01e4\u0b57\3\2\2\2\u01e6\u01e7\t\2\2\2\u01e7\3\3\2\2\2\u01e8\u01eb"
			+ "\5\6\4\2\u01e9\u01eb\5\16\b\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2"
			+ "\u01eb\5\3\2\2\2\u01ec\u01ee\5\u00e8u\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1"
			+ "\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1"
			+ "\u01ef\3\2\2\2\u01f2\u01fb\5\b\5\2\u01f3\u01f5\5\u00e8u\2\u01f4\u01f3"
			+ "\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"
			+ "\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fb\7\7\2\2\u01fa\u01ef\3\2"
			+ "\2\2\u01fa\u01f6\3\2\2\2\u01fb\7\3\2\2\2\u01fc\u01ff\5\n\6\2\u01fd\u01ff"
			+ "\5\f\7\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\t\3\2\2\2\u0200"
			+ "\u0201\t\3\2\2\u0201\13\3\2\2\2\u0202\u0203\t\4\2\2\u0203\r\3\2\2\2\u0204"
			+ "\u0208\5\20\t\2\u0205\u0208\5\36\20\2\u0206\u0208\5 \21\2\u0207\u0204"
			+ "\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\17\3\2\2\2\u0209"
			+ "\u020c\5\26\f\2\u020a\u020c\5\34\17\2\u020b\u0209\3\2\2\2\u020b\u020a"
			+ "\3\2\2\2\u020c\u0211\3\2\2\2\u020d\u0210\5\24\13\2\u020e\u0210\5\32\16"
			+ "\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f"
			+ "\3\2\2\2\u0211\u0212\3\2\2\2\u0212\21\3\2\2\2\u0213\u0211\3\2\2\2\u0214"
			+ "\u0216\5\u00e8u\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215"
			+ "\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a"
			+ "\u021c\7j\2\2\u021b\u021d\5,\27\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2"
			+ "\2\2\u021d\u022b\3\2\2\2\u021e\u021f\5\20\t\2\u021f\u0223\7E\2\2\u0220"
			+ "\u0222\5\u00e8u\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221"
			+ "\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226"
			+ "\u0228\7j\2\2\u0227\u0229\5,\27\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2"
			+ "\2\2\u0229\u022b\3\2\2\2\u022a\u0217\3\2\2\2\u022a\u021e\3\2\2\2\u022b"
			+ "\23\3\2\2\2\u022c\u0230\7E\2\2\u022d\u022f\5\u00e8u\2\u022e\u022d\3\2"
			+ "\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"
			+ "\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0235\7j\2\2\u0234\u0236\5,\27"
			+ "\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\25\3\2\2\2\u0237\u0239"
			+ "\5\u00e8u\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2"
			+ "\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023f"
			+ "\7j\2\2\u023e\u0240\5,\27\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240"
			+ "\27\3\2\2\2\u0241\u0242\5\22\n\2\u0242\31\3\2\2\2\u0243\u0244\5\24\13"
			+ "\2\u0244\33\3\2\2\2\u0245\u0246\5\26\f\2\u0246\35\3\2\2\2\u0247\u0249"
			+ "\5\u00e8u\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2"
			+ "\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024e"
			+ "\7j\2\2\u024e\37\3\2\2\2\u024f\u0250\5\6\4\2\u0250\u0251\5\"\22\2\u0251"
			+ "\u0259\3\2\2\2\u0252\u0253\5\20\t\2\u0253\u0254\5\"\22\2\u0254\u0259\3"
			+ "\2\2\2\u0255\u0256\5\36\20\2\u0256\u0257\5\"\22\2\u0257\u0259\3\2\2\2"
			+ "\u0258\u024f\3\2\2\2\u0258\u0252\3\2\2\2\u0258\u0255\3\2\2\2\u0259!\3"
			+ "\2\2\2\u025a\u025c\5\u00e8u\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2"
			+ "\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d"
			+ "\3\2\2\2\u0260\u0261\7A\2\2\u0261\u026c\7B\2\2\u0262\u0264\5\u00e8u\2"
			+ "\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266"
			+ "\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\7A\2\2\u0269"
			+ "\u026b\7B\2\2\u026a\u0265\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2"
			+ "\2\2\u026c\u026d\3\2\2\2\u026d#\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0271"
			+ "\5&\24\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272"
			+ "\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0277\7j"
			+ "\2\2\u0276\u0278\5(\25\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278"
			+ "%\3\2\2\2\u0279\u027a\5\u00e8u\2\u027a\'\3\2\2\2\u027b\u027c\7\25\2\2"
			+ "\u027c\u0286\5\36\20\2\u027d\u027e\7\25\2\2\u027e\u0282\5\20\t\2\u027f"
			+ "\u0281\5*\26\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2"
			+ "\2\2\u0282\u0283\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0285"
			+ "\u027b\3\2\2\2\u0285\u027d\3\2\2\2\u0286)\3\2\2\2\u0287\u0288\7Y\2\2\u0288"
			+ "\u0289\5\30\r\2\u0289+\3\2\2\2\u028a\u028b\7H\2\2\u028b\u028c\5.\30\2"
			+ "\u028c\u028d\7G\2\2\u028d-\3\2\2\2\u028e\u0293\5\60\31\2\u028f\u0290\7"
			+ "D\2\2\u0290\u0292\5\60\31\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2\2\2\u0293"
			+ "\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294/\3\2\2\2\u0295\u0293\3\2\2\2"
			+ "\u0296\u0299\5\16\b\2\u0297\u0299\5\62\32\2\u0298\u0296\3\2\2\2\u0298"
			+ "\u0297\3\2\2\2\u0299\61\3\2\2\2\u029a\u029c\5\u00e8u\2\u029b\u029a\3\2"
			+ "\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"
			+ "\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a2\7K\2\2\u02a1\u02a3\5\64"
			+ "\33\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\63\3\2\2\2\u02a4\u02a5"
			+ "\7\25\2\2\u02a5\u02a9\5\16\b\2\u02a6\u02a7\7,\2\2\u02a7\u02a9\5\16\b\2"
			+ "\u02a8\u02a4\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\65\3\2\2\2\u02aa\u02ab"
			+ "\b\34\1\2\u02ab\u02ac\7j\2\2\u02ac\u02b2\3\2\2\2\u02ad\u02ae\f\3\2\2\u02ae"
			+ "\u02af\7E\2\2\u02af\u02b1\7j\2\2\u02b0\u02ad\3\2\2\2\u02b1\u02b4\3\2\2"
			+ "\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\67\3\2\2\2\u02b4\u02b2"
			+ "\3\2\2\2\u02b5\u02bb\7j\2\2\u02b6\u02b7\5:\36\2\u02b7\u02b8\7E\2\2\u02b8"
			+ "\u02b9\7j\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b5\3\2\2\2\u02ba\u02b6\3\2"
			+ "\2\2\u02bb9\3\2\2\2\u02bc\u02bd\b\36\1\2\u02bd\u02be\7j\2\2\u02be\u02c4"
			+ "\3\2\2\2\u02bf\u02c0\f\3\2\2\u02c0\u02c1\7E\2\2\u02c1\u02c3\7j\2\2\u02c2"
			+ "\u02bf\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"
			+ "\2\2\u02c5;\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02cd\7j\2\2\u02c8\u02c9"
			+ "\5@!\2\u02c9\u02ca\7E\2\2\u02ca\u02cb\7j\2\2\u02cb\u02cd\3\2\2\2\u02cc"
			+ "\u02c7\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd=\3\2\2\2\u02ce\u02cf\7j\2\2\u02cf"
			+ "?\3\2\2\2\u02d0\u02d1\b!\1\2\u02d1\u02d2\7j\2\2\u02d2\u02d8\3\2\2\2\u02d3"
			+ "\u02d4\f\3\2\2\u02d4\u02d5\7E\2\2\u02d5\u02d7\7j\2\2\u02d6\u02d3\3\2\2"
			+ "\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9A"
			+ "\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dd\5D#\2\u02dc\u02db\3\2\2\2\u02dc"
			+ "\u02dd\3\2\2\2\u02dd\u02e1\3\2\2\2\u02de\u02e0\5H%\2\u02df\u02de\3\2\2"
			+ "\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e7"
			+ "\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e6\5R*\2\u02e5\u02e4\3\2\2\2\u02e6"
			+ "\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2"
			+ "\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02eb\7\2\2\3\u02ebC\3\2\2\2\u02ec\u02ee"
			+ "\5F$\2\u02ed\u02ec\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef"
			+ "\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7$"
			+ "\2\2\u02f3\u02f8\7j\2\2\u02f4\u02f5\7E\2\2\u02f5\u02f7\7j\2\2\u02f6\u02f4"
			+ "\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"
			+ "\u02fb\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\7C\2\2\u02fcE\3\2\2\2\u02fd"
			+ "\u02fe\5\u00e8u\2\u02feG\3\2\2\2\u02ff\u0304\5J&\2\u0300\u0304\5L\'\2"
			+ "\u0301\u0304\5N(\2\u0302\u0304\5P)\2\u0303\u02ff\3\2\2\2\u0303\u0300\3"
			+ "\2\2\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304I\3\2\2\2\u0305\u0306"
			+ "\7\35\2\2\u0306\u0307\58\35\2\u0307\u0308\7C\2\2\u0308K\3\2\2\2\u0309"
			+ "\u030a\7\35\2\2\u030a\u030b\5:\36\2\u030b\u030c\7E\2\2\u030c\u030d\7W"
			+ "\2\2\u030d\u030e\7C\2\2\u030eM\3\2\2\2\u030f\u0310\7\35\2\2\u0310\u0311"
			+ "\7*\2\2\u0311\u0312\58\35\2\u0312\u0313\7E\2\2\u0313\u0314\7j\2\2\u0314"
			+ "\u0315\7C\2\2\u0315O\3\2\2\2\u0316\u0317\7\35\2\2\u0317\u0318\7*\2\2\u0318"
			+ "\u0319\58\35\2\u0319\u031a\7E\2\2\u031a\u031b\7W\2\2\u031b\u031c\7C\2"
			+ "\2\u031cQ\3\2\2\2\u031d\u0321\5T+\2\u031e\u0321\5\u00c8e\2\u031f\u0321"
			+ "\7C\2\2\u0320\u031d\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u031f\3\2\2\2\u0321"
			+ "S\3\2\2\2\u0322\u0325\5V,\2\u0323\u0325\5\u00bc_\2\u0324\u0322\3\2\2\2"
			+ "\u0324\u0323\3\2\2\2\u0325U\3\2\2\2\u0326\u0328\5X-\2\u0327\u0326\3\2"
			+ "\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a"
			+ "\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032d\7\r\2\2\u032d\u032f\7j"
			+ "\2\2\u032e\u0330\5Z.\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332"
			+ "\3\2\2\2\u0331\u0333\5^\60\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333"
			+ "\u0335\3\2\2\2\u0334\u0336\5`\61\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2"
			+ "\2\2\u0336\u0337\3\2\2\2\u0337\u0338\5d\63\2\u0338W\3\2\2\2\u0339\u0342"
			+ "\5\u00e8u\2\u033a\u0342\7\'\2\2\u033b\u0342\7&\2\2\u033c\u0342\7%\2\2"
			+ "\u033d\u0342\7\5\2\2\u033e\u0342\7*\2\2\u033f\u0342\7\26\2\2\u0340\u0342"
			+ "\7+\2\2\u0341\u0339\3\2\2\2\u0341\u033a\3\2\2\2\u0341\u033b\3\2\2\2\u0341"
			+ "\u033c\3\2\2\2\u0341\u033d\3\2\2\2\u0341\u033e\3\2\2\2\u0341\u033f\3\2"
			+ "\2\2\u0341\u0340\3\2\2\2\u0342Y\3\2\2\2\u0343\u0344\7H\2\2\u0344\u0345"
			+ "\5\\/\2\u0345\u0346\7G\2\2\u0346[\3\2\2\2\u0347\u034c\5$\23\2\u0348\u0349"
			+ "\7D\2\2\u0349\u034b\5$\23\2\u034a\u0348\3\2\2\2\u034b\u034e\3\2\2\2\u034c"
			+ "\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d]\3\2\2\2\u034e\u034c\3\2\2\2"
			+ "\u034f\u0350\7\25\2\2\u0350\u0351\5\22\n\2\u0351_\3\2\2\2\u0352\u0353"
			+ "\7\34\2\2\u0353\u0354\5b\62\2\u0354a\3\2\2\2\u0355\u035a\5\30\r\2\u0356"
			+ "\u0357\7D\2\2\u0357\u0359\5\30\r\2\u0358\u0356\3\2\2\2\u0359\u035c\3\2"
			+ "\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035bc\3\2\2\2\u035c\u035a"
			+ "\3\2\2\2\u035d\u0361\7?\2\2\u035e\u0360\5f\64\2\u035f\u035e\3\2\2\2\u0360"
			+ "\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2"
			+ "\2\2\u0363\u0361\3\2\2\2\u0364\u0365\7@\2\2\u0365e\3\2\2\2\u0366\u036b"
			+ "\5h\65\2\u0367\u036b\5\u00acW\2\u0368\u036b\5\u00aeX\2\u0369\u036b\5\u00b0"
			+ "Y\2\u036a\u0366\3\2\2\2\u036a\u0367\3\2\2\2\u036a\u0368\3\2\2\2\u036a"
			+ "\u0369\3\2\2\2\u036bg\3\2\2\2\u036c\u0372\5j\66\2\u036d\u0372\5\u008e"
			+ "H\2\u036e\u0372\5T+\2\u036f\u0372\5\u00c8e\2\u0370\u0372\7C\2\2\u0371"
			+ "\u036c\3\2\2\2\u0371\u036d\3\2\2\2\u0371\u036e\3\2\2\2\u0371\u036f\3\2"
			+ "\2\2\u0371\u0370\3\2\2\2\u0372i\3\2\2\2\u0373\u0375\5l\67\2\u0374\u0373"
			+ "\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377"
			+ "\u0379\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u037a\5v<\2\u037a\u037b\5n8\2"
			+ "\u037b\u037c\7C\2\2\u037ck\3\2\2\2\u037d\u0386\5\u00e8u\2\u037e\u0386"
			+ "\7\'\2\2\u037f\u0386\7&\2\2\u0380\u0386\7%\2\2\u0381\u0386\7*\2\2\u0382"
			+ "\u0386\7\26\2\2\u0383\u0386\7\62\2\2\u0384\u0386\7\65\2\2\u0385\u037d"
			+ "\3\2\2\2\u0385\u037e\3\2\2\2\u0385\u037f\3\2\2\2\u0385\u0380\3\2\2\2\u0385"
			+ "\u0381\3\2\2\2\u0385\u0382\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0384\3\2"
			+ "\2\2\u0386m\3\2\2\2\u0387\u038c\5p9\2\u0388\u0389\7D\2\2\u0389\u038b\5"
			+ "p9\2\u038a\u0388\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038c"
			+ "\u038d\3\2\2\2\u038do\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u0392\5r:\2\u0390"
			+ "\u0391\7F\2\2\u0391\u0393\5t;\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2"
			+ "\2\u0393q\3\2\2\2\u0394\u0396\7j\2\2\u0395\u0397\5\"\22\2\u0396\u0395"
			+ "\3\2\2\2\u0396\u0397\3\2\2\2\u0397s\3\2\2\2\u0398\u039b\5\u01a0\u00d1"
			+ "\2\u0399\u039b\5\u00fa~\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b"
			+ "u\3\2\2\2\u039c\u039f\5x=\2\u039d\u039f\5z>\2\u039e\u039c\3\2\2\2\u039e"
			+ "\u039d\3\2\2\2\u039fw\3\2\2\2\u03a0\u03a3\5\b\5\2\u03a1\u03a3\7\7\2\2"
			+ "\u03a2\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3y\3\2\2\2\u03a4\u03a8\5"
			+ "|?\2\u03a5\u03a8\5\u008aF\2\u03a6\u03a8\5\u008cG\2\u03a7\u03a4\3\2\2\2"
			+ "\u03a7\u03a5\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8{\3\2\2\2\u03a9\u03ac\5"
			+ "\u0082B\2\u03aa\u03ac\5\u0088E\2\u03ab\u03a9\3\2\2\2\u03ab\u03aa\3\2\2"
			+ "\2\u03ac\u03b1\3\2\2\2\u03ad\u03b0\5\u0080A\2\u03ae\u03b0\5\u0086D\2\u03af"
			+ "\u03ad\3\2\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2"
			+ "\2\2\u03b1\u03b2\3\2\2\2\u03b2}\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03b6"
			+ "\7j\2\2\u03b5\u03b7\5,\27\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"
			+ "\u03c5\3\2\2\2\u03b8\u03b9\5|?\2\u03b9\u03bd\7E\2\2\u03ba\u03bc\5\u00e8"
			+ "u\2\u03bb\u03ba\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd"
			+ "\u03be\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c2\7j"
			+ "\2\2\u03c1\u03c3\5,\27\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"
			+ "\u03c5\3\2\2\2\u03c4\u03b4\3\2\2\2\u03c4\u03b8\3\2\2\2\u03c5\177\3\2\2"
			+ "\2\u03c6\u03ca\7E\2\2\u03c7\u03c9\5\u00e8u\2\u03c8\u03c7\3\2\2\2\u03c9"
			+ "\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2"
			+ "\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03cf\7j\2\2\u03ce\u03d0\5,\27\2\u03cf"
			+ "\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u0081\3\2\2\2\u03d1\u03d3\7j"
			+ "\2\2\u03d2\u03d4\5,\27\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"
			+ "\u0083\3\2\2\2\u03d5\u03d6\5~@\2\u03d6\u0085\3\2\2\2\u03d7\u03d8\5\u0080"
			+ "A\2\u03d8\u0087\3\2\2\2\u03d9\u03da\5\u0082B\2\u03da\u0089\3\2\2\2\u03db"
			+ "\u03dc\7j\2\2\u03dc\u008b\3\2\2\2\u03dd\u03de\5x=\2\u03de\u03df\5\"\22"
			+ "\2\u03df\u03e7\3\2\2\2\u03e0\u03e1\5|?\2\u03e1\u03e2\5\"\22\2\u03e2\u03e7"
			+ "\3\2\2\2\u03e3\u03e4\5\u008aF\2\u03e4\u03e5\5\"\22\2\u03e5\u03e7\3\2\2"
			+ "\2\u03e6\u03dd\3\2\2\2\u03e6\u03e0\3\2\2\2\u03e6\u03e3\3\2\2\2\u03e7\u008d"
			+ "\3\2\2\2\u03e8\u03ea\5\u0090I\2\u03e9\u03e8\3\2\2\2\u03ea\u03ed\3\2\2"
			+ "\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03eb"
			+ "\3\2\2\2\u03ee\u03ef\5\u0092J\2\u03ef\u03f0\5\u00aaV\2\u03f0\u008f\3\2"
			+ "\2\2\u03f1\u03fc\5\u00e8u\2\u03f2\u03fc\7\'\2\2\u03f3\u03fc\7&\2\2\u03f4"
			+ "\u03fc\7%\2\2\u03f5\u03fc\7\5\2\2\u03f6\u03fc\7*\2\2\u03f7\u03fc\7\26"
			+ "\2\2\u03f8\u03fc\7.\2\2\u03f9\u03fc\7\"\2\2\u03fa\u03fc\7+\2\2\u03fb\u03f1"
			+ "\3\2\2\2\u03fb\u03f2\3\2\2\2\u03fb\u03f3\3\2\2\2\u03fb\u03f4\3\2\2\2\u03fb"
			+ "\u03f5\3\2\2\2\u03fb\u03f6\3\2\2\2\u03fb\u03f7\3\2\2\2\u03fb\u03f8\3\2"
			+ "\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fa\3\2\2\2\u03fc\u0091\3\2\2\2\u03fd"
			+ "\u03fe\5\u0094K\2\u03fe\u0400\5\u0096L\2\u03ff\u0401\5\u00a4S\2\u0400"
			+ "\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u040f\3\2\2\2\u0402\u0406\5Z"
			+ ".\2\u0403\u0405\5\u00e8u\2\u0404\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406"
			+ "\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408\u0406\3\2"
			+ "\2\2\u0409\u040a\5\u0094K\2\u040a\u040c\5\u0096L\2\u040b\u040d\5\u00a4"
			+ "S\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\3\2\2\2\u040e"
			+ "\u03fd\3\2\2\2\u040e\u0402\3\2\2\2\u040f\u0093\3\2\2\2\u0410\u0413\5v"
			+ "<\2\u0411\u0413\7\64\2\2\u0412\u0410\3\2\2\2\u0412\u0411\3\2\2\2\u0413"
			+ "\u0095\3\2\2\2\u0414\u0415\7j\2\2\u0415\u0417\7=\2\2\u0416\u0418\5\u0098"
			+ "M\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419"
			+ "\u041b\7>\2\2\u041a\u041c\5\"\22\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2"
			+ "\2\2\u041c\u0097\3\2\2\2\u041d\u041e\5\u009aN\2\u041e\u041f\7D\2\2\u041f"
			+ "\u0420\5\u00a0Q\2\u0420\u0423\3\2\2\2\u0421\u0423\5\u00a0Q\2\u0422\u041d"
			+ "\3\2\2\2\u0422\u0421\3\2\2\2\u0423\u0099\3\2\2\2\u0424\u0429\5\u009cO"
			+ "\2\u0425\u0426\7D\2\2\u0426\u0428\5\u009cO\2\u0427\u0425\3\2\2\2\u0428"
			+ "\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0435\3\2"
			+ "\2\2\u042b\u0429\3\2\2\2\u042c\u0431\5\u00a2R\2\u042d\u042e\7D\2\2\u042e"
			+ "\u0430\5\u009cO\2\u042f\u042d\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u042f"
			+ "\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0434"
			+ "\u0424\3\2\2\2\u0434\u042c\3\2\2\2\u0435\u009b\3\2\2\2\u0436\u0438\5\u009e"
			+ "P\2\u0437\u0436\3\2\2\2\u0438\u043b\3\2\2\2\u0439\u0437\3\2\2\2\u0439"
			+ "\u043a\3\2\2\2\u043a\u043c\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u043d\5v"
			+ "<\2\u043d\u043e\5r:\2\u043e\u009d\3\2\2\2\u043f\u0442\5\u00e8u\2\u0440"
			+ "\u0442\7\26\2\2\u0441\u043f\3\2\2\2\u0441\u0440\3\2\2\2\u0442\u009f\3"
			+ "\2\2\2\u0443\u0445\5\u009eP\2\u0444\u0443\3\2\2\2\u0445\u0448\3\2\2\2"
			+ "\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u0446"
			+ "\3\2\2\2\u0449\u044d\5v<\2\u044a\u044c\5\u00e8u\2\u044b\u044a\3\2\2\2"
			+ "\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450"
			+ "\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0451\7l\2\2\u0451\u0452\5r:\2\u0452"
			+ "\u0455\3\2\2\2\u0453\u0455\5\u009cO\2\u0454\u0446\3\2\2\2\u0454\u0453"
			+ "\3\2\2\2\u0455\u00a1\3\2\2\2\u0456\u0458\5\u00e8u\2\u0457\u0456\3\2\2"
			+ "\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c"
			+ "\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045f\5v<\2\u045d\u045e\7j\2\2\u045e"
			+ "\u0460\7E\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2"
			+ "\2\2\u0461\u0462\7/\2\2\u0462\u00a3\3\2\2\2\u0463\u0464\7\61\2\2\u0464"
			+ "\u0465\5\u00a6T\2\u0465\u00a5\3\2\2\2\u0466\u046b\5\u00a8U\2\u0467\u0468"
			+ "\7D\2\2\u0468\u046a\5\u00a8U\2\u0469\u0467\3\2\2\2\u046a\u046d\3\2\2\2"
			+ "\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u00a7\3\2\2\2\u046d\u046b"
			+ "\3\2\2\2\u046e\u0471\5\22\n\2\u046f\u0471\5\36\20\2\u0470\u046e\3\2\2"
			+ "\2\u0470\u046f\3\2\2\2\u0471\u00a9\3\2\2\2\u0472\u0475\5\u00fe\u0080\2"
			+ "\u0473\u0475\7C\2\2\u0474\u0472\3\2\2\2\u0474\u0473\3\2\2\2\u0475\u00ab"
			+ "\3\2\2\2\u0476\u0477\5\u00fe\u0080\2\u0477\u00ad\3\2\2\2\u0478\u0479\7"
			+ "*\2\2\u0479\u047a\5\u00fe\u0080\2\u047a\u00af\3\2\2\2\u047b\u047d\5\u00b2"
			+ "Z\2\u047c\u047b\3\2\2\2\u047d\u0480\3\2\2\2\u047e\u047c\3\2\2\2\u047e"
			+ "\u047f\3\2\2\2\u047f\u0481\3\2\2\2\u0480\u047e\3\2\2\2\u0481\u0483\5\u00b4"
			+ "[\2\u0482\u0484\5\u00a4S\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484"
			+ "\u0485\3\2\2\2\u0485\u0486\5\u00b8]\2\u0486\u00b1\3\2\2\2\u0487\u048c"
			+ "\5\u00e8u\2\u0488\u048c\7\'\2\2\u0489\u048c\7&\2\2\u048a\u048c\7%\2\2"
			+ "\u048b\u0487\3\2\2\2\u048b\u0488\3\2\2\2\u048b\u0489\3\2\2\2\u048b\u048a"
			+ "\3\2\2\2\u048c\u00b3\3\2\2\2\u048d\u048f\5Z.\2\u048e\u048d\3\2\2\2\u048e"
			+ "\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\5\u00b6\\\2\u0491\u0493"
			+ "\7=\2\2\u0492\u0494\5\u0098M\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2"
			+ "\u0494\u0495\3\2\2\2\u0495\u0496\7>\2\2\u0496\u00b5\3\2\2\2\u0497\u0498"
			+ "\7j\2\2\u0498\u00b7\3\2\2\2\u0499\u049b\7?\2\2\u049a\u049c\5\u00ba^\2"
			+ "\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049e\3\2\2\2\u049d\u049f"
			+ "\5\u0100\u0081\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3"
			+ "\2\2\2\u04a0\u04a1\7@\2\2\u04a1\u00b9\3\2\2\2\u04a2\u04a4\5,\27\2\u04a3"
			+ "\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\7/"
			+ "\2\2\u04a6\u04a8\7=\2\2\u04a7\u04a9\5\u0190\u00c9\2\u04a8\u04a7\3\2\2"
			+ "\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\7>\2\2\u04ab\u04d1"
			+ "\7C\2\2\u04ac\u04ae\5,\27\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"
			+ "\u04af\3\2\2\2\u04af\u04b0\7,\2\2\u04b0\u04b2\7=\2\2\u04b1\u04b3\5\u0190"
			+ "\u00c9\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4"
			+ "\u04b5\7>\2\2\u04b5\u04d1\7C\2\2\u04b6\u04b7\5<\37\2\u04b7\u04b9\7E\2"
			+ "\2\u04b8\u04ba\5,\27\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb"
			+ "\3\2\2\2\u04bb\u04bc\7,\2\2\u04bc\u04be\7=\2\2\u04bd\u04bf\5\u0190\u00c9"
			+ "\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1"
			+ "\7>\2\2\u04c1\u04c2\7C\2\2\u04c2\u04d1\3\2\2\2\u04c3\u04c4\5\u0162\u00b2"
			+ "\2\u04c4\u04c6\7E\2\2\u04c5\u04c7\5,\27\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7"
			+ "\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\7,\2\2\u04c9\u04cb\7=\2\2\u04ca"
			+ "\u04cc\5\u0190\u00c9\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd"
			+ "\3\2\2\2\u04cd\u04ce\7>\2\2\u04ce\u04cf\7C\2\2\u04cf\u04d1\3\2\2\2\u04d0"
			+ "\u04a3\3\2\2\2\u04d0\u04ad\3\2\2\2\u04d0\u04b6\3\2\2\2\u04d0\u04c3\3\2"
			+ "\2\2\u04d1\u00bb\3\2\2\2\u04d2\u04d4\5X-\2\u04d3\u04d2\3\2\2\2\u04d4\u04d7"
			+ "\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7"
			+ "\u04d5\3\2\2\2\u04d8\u04d9\7\24\2\2\u04d9\u04db\7j\2\2\u04da\u04dc\5`"
			+ "\61\2\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"
			+ "\u04de\5\u00be`\2\u04de\u00bd\3\2\2\2\u04df\u04e1\7?\2\2\u04e0\u04e2\5"
			+ "\u00c0a\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2"
			+ "\u04e3\u04e5\7D\2\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e7"
			+ "\3\2\2\2\u04e6\u04e8\5\u00c6d\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2"
			+ "\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\7@\2\2\u04ea\u00bf\3\2\2\2\u04eb\u04f0"
			+ "\5\u00c2b\2\u04ec\u04ed\7D\2\2\u04ed\u04ef\5\u00c2b\2\u04ee\u04ec\3\2"
			+ "\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"
			+ "\u00c1\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f5\5\u00c4c\2\u04f4\u04f3"
			+ "\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"
			+ "\u04f9\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u04ff\7j\2\2\u04fa\u04fc\7=\2"
			+ "\2\u04fb\u04fd\5\u0190\u00c9\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3\2\2\2"
			+ "\u04fd\u04fe\3\2\2\2\u04fe\u0500\7>\2\2\u04ff\u04fa\3\2\2\2\u04ff\u0500"
			+ "\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u0503\5d\63\2\u0502\u0501\3\2\2\2\u0502"
			+ "\u0503\3\2\2\2\u0503\u00c3\3\2\2\2\u0504\u0505\5\u00e8u\2\u0505\u00c5"
			+ "\3\2\2\2\u0506\u050a\7C\2\2\u0507\u0509\5f\64\2\u0508\u0507\3\2\2\2\u0509"
			+ "\u050c\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u00c7\3\2"
			+ "\2\2\u050c\u050a\3\2\2\2\u050d\u0510\5\u00caf\2\u050e\u0510\5\u00dco\2"
			+ "\u050f\u050d\3\2\2\2\u050f\u050e\3\2\2\2\u0510\u00c9\3\2\2\2\u0511\u0513"
			+ "\5\u00ccg\2\u0512\u0511\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2"
			+ "\2\u0514\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u0518"
			+ "\7 \2\2\u0518\u051a\7j\2\2\u0519\u051b\5Z.\2\u051a\u0519\3\2\2\2\u051a"
			+ "\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u051e\5\u00ceh\2\u051d\u051c"
			+ "\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\5\u00d0i"
			+ "\2\u0520\u00cb\3\2\2\2\u0521\u0529\5\u00e8u\2\u0522\u0529\7\'\2\2\u0523"
			+ "\u0529\7&\2\2\u0524\u0529\7%\2\2\u0525\u0529\7\5\2\2\u0526\u0529\7*\2"
			+ "\2\u0527\u0529\7+\2\2\u0528\u0521\3\2\2\2\u0528\u0522\3\2\2\2\u0528\u0523"
			+ "\3\2\2\2\u0528\u0524\3\2\2\2\u0528\u0525\3\2\2\2\u0528\u0526\3\2\2\2\u0528"
			+ "\u0527\3\2\2\2\u0529\u00cd\3\2\2\2\u052a\u052b\7\25\2\2\u052b\u052c\5"
			+ "b\62\2\u052c\u00cf\3\2\2\2\u052d\u0531\7?\2\2\u052e\u0530\5\u00d2j\2\u052f"
			+ "\u052e\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2"
			+ "\2\2\u0532\u0534\3\2\2\2\u0533\u0531\3\2\2\2\u0534\u0535\7@\2\2\u0535"
			+ "\u00d1\3\2\2\2\u0536\u053c\5\u00d4k\2\u0537\u053c\5\u00d8m\2\u0538\u053c"
			+ "\5T+\2\u0539\u053c\5\u00c8e\2\u053a\u053c\7C\2\2\u053b\u0536\3\2\2\2\u053b"
			+ "\u0537\3\2\2\2\u053b\u0538\3\2\2\2\u053b\u0539\3\2\2\2\u053b\u053a\3\2"
			+ "\2\2\u053c\u00d3\3\2\2\2\u053d\u053f\5\u00d6l\2\u053e\u053d\3\2\2\2\u053f"
			+ "\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2"
			+ "\2\2\u0542\u0540\3\2\2\2\u0543\u0544\5v<\2\u0544\u0545\5n8\2\u0545\u0546"
			+ "\7C\2\2\u0546\u00d5\3\2\2\2\u0547\u054c\5\u00e8u\2\u0548\u054c\7\'\2\2"
			+ "\u0549\u054c\7*\2\2\u054a\u054c\7\26\2\2\u054b\u0547\3\2\2\2\u054b\u0548"
			+ "\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054a\3\2\2\2\u054c\u00d7\3\2\2\2\u054d"
			+ "\u054f\5\u00dan\2\u054e\u054d\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e"
			+ "\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553\3\2\2\2\u0552\u0550\3\2\2\2\u0553"
			+ "\u0554\5\u0092J\2\u0554\u0555\5\u00aaV\2\u0555\u00d9\3\2\2\2\u0556\u055d"
			+ "\5\u00e8u\2\u0557\u055d\7\'\2\2\u0558\u055d\7\5\2\2\u0559\u055d\7\20\2"
			+ "\2\u055a\u055d\7*\2\2\u055b\u055d\7+\2\2\u055c\u0556\3\2\2\2\u055c\u0557"
			+ "\3\2\2\2\u055c\u0558\3\2\2\2\u055c\u0559\3\2\2\2\u055c\u055a\3\2\2\2\u055c"
			+ "\u055b\3\2\2\2\u055d\u00db\3\2\2\2\u055e\u0560\5\u00ccg\2\u055f\u055e"
			+ "\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562"
			+ "\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0565\7k\2\2\u0565\u0566\7 \2"
			+ "\2\u0566\u0567\7j\2\2\u0567\u0568\5\u00dep\2\u0568\u00dd\3\2\2\2\u0569"
			+ "\u056d\7?\2\2\u056a\u056c\5\u00e0q\2\u056b\u056a\3\2\2\2\u056c\u056f\3"
			+ "\2\2\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570\3\2\2\2\u056f"
			+ "\u056d\3\2\2\2\u0570\u0571\7@\2\2\u0571\u00df\3\2\2\2\u0572\u0578\5\u00e2"
			+ "r\2\u0573\u0578\5\u00d4k\2\u0574\u0578\5T+\2\u0575\u0578\5\u00c8e\2\u0576"
			+ "\u0578\7C\2\2\u0577\u0572\3\2\2\2\u0577\u0573\3\2\2\2\u0577\u0574\3\2"
			+ "\2\2\u0577\u0575\3\2\2\2\u0577\u0576\3\2\2\2\u0578\u00e1\3\2\2\2\u0579"
			+ "\u057b\5\u00e4s\2\u057a\u0579\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057a"
			+ "\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u057c\3\2\2\2\u057f"
			+ "\u0580\5v<\2\u0580\u0581\7j\2\2\u0581\u0582\7=\2\2\u0582\u0584\7>\2\2"
			+ "\u0583\u0585\5\"\22\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587"
			+ "\3\2\2\2\u0586\u0588\5\u00e6t\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2"
			+ "\2\u0588\u0589\3\2\2\2\u0589\u058a\7C\2\2\u058a\u00e3\3\2\2\2\u058b\u058f"
			+ "\5\u00e8u\2\u058c\u058f\7\'\2\2\u058d\u058f\7\5\2\2\u058e\u058b\3\2\2"
			+ "\2\u058e\u058c\3\2\2\2\u058e\u058d\3\2\2\2\u058f\u00e5\3\2\2\2\u0590\u0591"
			+ "\7\20\2\2\u0591\u0592\5\u00f0y\2\u0592\u00e7\3\2\2\2\u0593\u0597\5\u00ea"
			+ "v\2\u0594\u0597\5\u00f6|\2\u0595\u0597\5\u00f8}\2\u0596\u0593\3\2\2\2"
			+ "\u0596\u0594\3\2\2\2\u0596\u0595\3\2\2\2\u0597\u00e9\3\2\2\2\u0598\u0599"
			+ "\7k\2\2\u0599\u059a\58\35\2\u059a\u059c\7=\2\2\u059b\u059d\5\u00ecw\2"
			+ "\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f"
			+ "\7>\2\2\u059f\u00eb\3\2\2\2\u05a0\u05a5\5\u00eex\2\u05a1\u05a2\7D\2\2"
			+ "\u05a2\u05a4\5\u00eex\2\u05a3\u05a1\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5"
			+ "\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u00ed\3\2\2\2\u05a7\u05a5\3\2"
			+ "\2\2\u05a8\u05a9\7j\2\2\u05a9\u05aa\7F\2\2\u05aa\u05ab\5\u00f0y\2\u05ab"
			+ "\u00ef\3\2\2\2\u05ac\u05b0\5\u01b2\u00da\2\u05ad\u05b0\5\u00f2z\2\u05ae"
			+ "\u05b0\5\u00e8u\2\u05af\u05ac\3\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05ae"
			+ "\3\2\2\2\u05b0\u00f1\3\2\2\2\u05b1\u05b3\7?\2\2\u05b2\u05b4\5\u00f4{\2"
			+ "\u05b3\u05b2\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05b7"
			+ "\7D\2\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8"
			+ "\u05b9\7@\2\2\u05b9\u00f3\3\2\2\2\u05ba\u05bf\5\u00f0y\2\u05bb\u05bc\7"
			+ "D\2\2\u05bc\u05be\5\u00f0y\2\u05bd\u05bb\3\2\2\2\u05be\u05c1\3\2\2\2\u05bf"
			+ "\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u00f5\3\2\2\2\u05c1\u05bf\3\2"
			+ "\2\2\u05c2\u05c3\7k\2\2\u05c3\u05c4\58\35\2\u05c4\u00f7\3\2\2\2\u05c5"
			+ "\u05c6\7k\2\2\u05c6\u05c7\58\35\2\u05c7\u05c8\7=\2\2\u05c8\u05c9\5\u00f0"
			+ "y\2\u05c9\u05ca\7>\2\2\u05ca\u00f9\3\2\2\2\u05cb\u05cd\7?\2\2\u05cc\u05ce"
			+ "\5\u00fc\177\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\3\2"
			+ "\2\2\u05cf\u05d1\7D\2\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"
			+ "\u05d2\3\2\2\2\u05d2\u05d3\7@\2\2\u05d3\u00fb\3\2\2\2\u05d4\u05d9\5t;"
			+ "\2\u05d5\u05d6\7D\2\2\u05d6\u05d8\5t;\2\u05d7\u05d5\3\2\2\2\u05d8\u05db"
			+ "\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u00fd\3\2\2\2\u05db"
			+ "\u05d9\3\2\2\2\u05dc\u05de\7?\2\2\u05dd\u05df\5\u0100\u0081\2\u05de\u05dd"
			+ "\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\7@\2\2\u05e1"
			+ "\u00ff\3\2\2\2\u05e2\u05e6\5\u0102\u0082\2\u05e3\u05e5\5\u0102\u0082\2"
			+ "\u05e4\u05e3\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7"
			+ "\3\2\2\2\u05e7\u0101\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e9\u05ee\5\u0104\u0083"
			+ "\2\u05ea\u05ee\5T+\2\u05eb\u05ee\5\u0108\u0085\2\u05ec\u05ee\5\u01dc\u00ef"
			+ "\2\u05ed\u05e9\3\2\2\2\u05ed\u05ea\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ec"
			+ "\3\2\2\2\u05ee\u0103\3\2\2\2\u05ef\u05f0\5\u0106\u0084\2\u05f0\u05f1\7"
			+ "C\2\2\u05f1\u0105\3\2\2\2\u05f2\u05f4\5\u009eP\2\u05f3\u05f2\3\2\2\2\u05f4"
			+ "\u05f7\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f8\3\2"
			+ "\2\2\u05f7\u05f5\3\2\2\2\u05f8\u05f9\5v<\2\u05f9\u05fa\5n8\2\u05fa\u0107"
			+ "\3\2\2\2\u05fb\u0602\5\u010c\u0087\2\u05fc\u0602\5\u0110\u0089\2\u05fd"
			+ "\u0602\5\u0118\u008d\2\u05fe\u0602\5\u011a\u008e\2\u05ff\u0602\5\u012c"
			+ "\u0097\2\u0600\u0602\5\u0132\u009a\2\u0601\u05fb\3\2\2\2\u0601\u05fc\3"
			+ "\2\2\2\u0601\u05fd\3\2\2\2\u0601\u05fe\3\2\2\2\u0601\u05ff\3\2\2\2\u0601"
			+ "\u0600\3\2\2\2\u0602\u0109\3\2\2\2\u0603\u0609\5\u010c\u0087\2\u0604\u0609"
			+ "\5\u0112\u008a\2\u0605\u0609\5\u011c\u008f\2\u0606\u0609\5\u012e\u0098"
			+ "\2\u0607\u0609\5\u0134\u009b\2\u0608\u0603\3\2\2\2\u0608\u0604\3\2\2\2"
			+ "\u0608\u0605\3\2\2\2\u0608\u0606\3\2\2\2\u0608\u0607\3\2\2\2\u0609\u010b"
			+ "\3\2\2\2\u060a\u0617\5\u00fe\u0080\2\u060b\u0617\5\u010e\u0088\2\u060c"
			+ "\u0617\5\u0114\u008b\2\u060d\u0617\5\u011e\u0090\2\u060e\u0617\5\u0120"
			+ "\u0091\2\u060f\u0617\5\u0130\u0099\2\u0610\u0617\5\u0144\u00a3\2\u0611"
			+ "\u0617\5\u0146\u00a4\2\u0612\u0617\5\u0148\u00a5\2\u0613\u0617\5\u014c"
			+ "\u00a7\2\u0614\u0617\5\u014a\u00a6\2\u0615\u0617\5\u014e\u00a8\2\u0616"
			+ "\u060a\3\2\2\2\u0616\u060b\3\2\2\2\u0616\u060c\3\2\2\2\u0616\u060d\3\2"
			+ "\2\2\u0616\u060e\3\2\2\2\u0616\u060f\3\2\2\2\u0616\u0610\3\2\2\2\u0616"
			+ "\u0611\3\2\2\2\u0616\u0612\3\2\2\2\u0616\u0613\3\2\2\2\u0616\u0614\3\2"
			+ "\2\2\u0616\u0615\3\2\2\2\u0617\u010d\3\2\2\2\u0618\u0619\7C\2\2\u0619"
			+ "\u010f\3\2\2\2\u061a\u061b\7j\2\2\u061b\u061c\7L\2\2\u061c\u061d\5\u0108"
			+ "\u0085\2\u061d\u0111\3\2\2\2\u061e\u061f\7j\2\2\u061f\u0620\7L\2\2\u0620"
			+ "\u0621\5\u010a\u0086\2\u0621\u0113\3\2\2\2\u0622\u0623\5\u0116\u008c\2"
			+ "\u0623\u0624\7C\2\2\u0624\u0115\3\2\2\2\u0625\u062d\5\u01ac\u00d7\2\u0626"
			+ "\u062d\5\u01ca\u00e6\2\u0627\u062d\5\u01cc\u00e7\2\u0628\u062d\5\u01d2"
			+ "\u00ea\2\u0629\u062d\5\u01d6\u00ec\2\u062a\u062d\5\u018a\u00c6\2\u062b"
			+ "\u062d\5\u0176\u00bc\2\u062c\u0625\3\2\2\2\u062c\u0626\3\2\2\2\u062c\u0627"
			+ "\3\2\2\2\u062c\u0628\3\2\2\2\u062c\u0629\3\2\2\2\u062c\u062a\3\2\2\2\u062c"
			+ "\u062b\3\2\2\2\u062d\u0117\3\2\2\2\u062e\u062f\7\32\2\2\u062f\u0630\7"
			+ "=\2\2\u0630\u0631\5\u01a0\u00d1\2\u0631\u0632\7>\2\2\u0632\u0633\5\u0108"
			+ "\u0085\2\u0633\u0119\3\2\2\2\u0634\u0635\7\32\2\2\u0635\u0636\7=\2\2\u0636"
			+ "\u0637\5\u01a0\u00d1\2\u0637\u0638\7>\2\2\u0638\u0639\5\u010a\u0086\2"
			+ "\u0639\u063a\7\23\2\2\u063a\u063b\5\u0108\u0085\2\u063b\u011b\3\2\2\2"
			+ "\u063c\u063d\7\32\2\2\u063d\u063e\7=\2\2\u063e\u063f\5\u01a0\u00d1\2\u063f"
			+ "\u0640\7>\2\2\u0640\u0641\5\u010a\u0086\2\u0641\u0642\7\23\2\2\u0642\u0643"
			+ "\5\u010a\u0086\2\u0643\u011d\3\2\2\2\u0644\u0645\7\6\2\2\u0645\u0646\5"
			+ "\u01a0\u00d1\2\u0646\u0647\7C\2\2\u0647\u064f\3\2\2\2\u0648\u0649\7\6"
			+ "\2\2\u0649\u064a\5\u01a0\u00d1\2\u064a\u064b\7L\2\2\u064b\u064c\5\u01a0"
			+ "\u00d1\2\u064c\u064d\7C\2\2\u064d\u064f\3\2\2\2\u064e\u0644\3\2\2\2\u064e"
			+ "\u0648\3\2\2\2\u064f\u011f\3\2\2\2\u0650\u0651\7-\2\2\u0651\u0652\7=\2"
			+ "\2\u0652\u0653\5\u01a0\u00d1\2\u0653\u0654\7>\2\2\u0654\u0655\5\u0122"
			+ "\u0092\2\u0655\u0121\3\2\2\2\u0656\u065a\7?\2\2\u0657\u0659\5\u0124\u0093"
			+ "\2\u0658\u0657\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b"
			+ "\3\2\2\2\u065b\u0660\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u065f\5\u0128\u0095"
			+ "\2\u065e\u065d\3\2\2\2\u065f\u0662\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661"
			+ "\3\2\2\2\u0661\u0663\3\2\2\2\u0662\u0660\3\2\2\2\u0663\u0664\7@\2\2\u0664"
			+ "\u0123\3\2\2\2\u0665\u0666\5\u0126\u0094\2\u0666\u0667\5\u0100\u0081\2"
			+ "\u0667\u0125\3\2\2\2\u0668\u066c\5\u0128\u0095\2\u0669\u066b\5\u0128\u0095"
			+ "\2\u066a\u0669\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a\3\2\2\2\u066c\u066d"
			+ "\3\2\2\2\u066d\u0127\3\2\2\2\u066e\u066c\3\2\2\2\u066f\u0670\7\n\2\2\u0670"
			+ "\u0671\5\u019e\u00d0\2\u0671\u0672\7L\2\2\u0672\u067a\3\2\2\2\u0673\u0674"
			+ "\7\n\2\2\u0674\u0675\5\u012a\u0096\2\u0675\u0676\7L\2\2\u0676\u067a\3"
			+ "\2\2\2\u0677\u0678\7\20\2\2\u0678\u067a\7L\2\2\u0679\u066f\3\2\2\2\u0679"
			+ "\u0673\3\2\2\2\u0679\u0677\3\2\2\2\u067a\u0129\3\2\2\2\u067b\u067c\7j"
			+ "\2\2\u067c\u012b\3\2\2\2\u067d\u067e\7\66\2\2\u067e\u067f\7=\2\2\u067f"
			+ "\u0680\5\u01a0\u00d1\2\u0680\u0681\7>\2\2\u0681\u0682\5\u0108\u0085\2"
			+ "\u0682\u012d\3\2\2\2\u0683\u0684\7\66\2\2\u0684\u0685\7=\2\2\u0685\u0686"
			+ "\5\u01a0\u00d1\2\u0686\u0687\7>\2\2\u0687\u0688\5\u010a\u0086\2\u0688"
			+ "\u012f\3\2\2\2\u0689\u068a\7\21\2\2\u068a\u068b\5\u0108\u0085\2\u068b"
			+ "\u068c\7\66\2\2\u068c\u068d\7=\2\2\u068d\u068e\5\u01a0\u00d1\2\u068e\u068f"
			+ "\7>\2\2\u068f\u0690\7C\2\2\u0690\u0131\3\2\2\2\u0691\u0694\5\u0136\u009c"
			+ "\2\u0692\u0694\5\u0140\u00a1\2\u0693\u0691\3\2\2\2\u0693\u0692\3\2\2\2"
			+ "\u0694\u0133\3\2\2\2\u0695\u0698\5\u0138\u009d\2\u0696\u0698\5\u0142\u00a2"
			+ "\2\u0697\u0695\3\2\2\2\u0697\u0696\3\2\2\2\u0698\u0135\3\2\2\2\u0699\u069a"
			+ "\7\31\2\2\u069a\u069c\7=\2\2\u069b\u069d\5\u013a\u009e\2\u069c\u069b\3"
			+ "\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a0\7C\2\2\u069f"
			+ "\u06a1\5\u01a0\u00d1\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2"
			+ "\3\2\2\2\u06a2\u06a4\7C\2\2\u06a3\u06a5\5\u013c\u009f\2\u06a4\u06a3\3"
			+ "\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\7>\2\2\u06a7"
			+ "\u06a8\5\u0108\u0085\2\u06a8\u0137\3\2\2\2\u06a9\u06aa\7\31\2\2\u06aa"
			+ "\u06ac\7=\2\2\u06ab\u06ad\5\u013a\u009e\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad"
			+ "\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b0\7C\2\2\u06af\u06b1\5\u01a0\u00d1"
			+ "\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b4"
			+ "\7C\2\2\u06b3\u06b5\5\u013c\u009f\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3"
			+ "\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\7>\2\2\u06b7\u06b8\5\u010a\u0086"
			+ "\2\u06b8\u0139\3\2\2\2\u06b9\u06bc\5\u013e\u00a0\2\u06ba\u06bc\5\u0106"
			+ "\u0084\2\u06bb\u06b9\3\2\2\2\u06bb\u06ba\3\2\2\2\u06bc\u013b\3\2\2\2\u06bd"
			+ "\u06be\5\u013e\u00a0\2\u06be\u013d\3\2\2\2\u06bf\u06c4\5\u0116\u008c\2"
			+ "\u06c0\u06c1\7D\2\2\u06c1\u06c3\5\u0116\u008c\2\u06c2\u06c0\3\2\2\2\u06c3"
			+ "\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u013f\3\2"
			+ "\2\2\u06c6\u06c4\3\2\2\2\u06c7\u06c8\7\31\2\2\u06c8\u06cc\7=\2\2\u06c9"
			+ "\u06cb\5\u009eP\2\u06ca\u06c9\3\2\2\2\u06cb\u06ce\3\2\2\2\u06cc\u06ca"
			+ "\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf\3\2\2\2\u06ce\u06cc\3\2\2\2\u06cf"
			+ "\u06d0\5v<\2\u06d0\u06d1\5r:\2\u06d1\u06d2\7L\2\2\u06d2\u06d3\5\u01a0"
			+ "\u00d1\2\u06d3\u06d4\7>\2\2\u06d4\u06d5\5\u0108\u0085\2\u06d5\u0141\3"
			+ "\2\2\2\u06d6\u06d7\7\31\2\2\u06d7\u06db\7=\2\2\u06d8\u06da\5\u009eP\2"
			+ "\u06d9\u06d8\3\2\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06db\u06dc"
			+ "\3\2\2\2\u06dc\u06de\3\2\2\2\u06dd\u06db\3\2\2\2\u06de\u06df\5v<\2\u06df"
			+ "\u06e0\5r:\2\u06e0\u06e1\7L\2\2\u06e1\u06e2\5\u01a0\u00d1\2\u06e2\u06e3"
			+ "\7>\2\2\u06e3\u06e4\5\u010a\u0086\2\u06e4\u0143\3\2\2\2\u06e5\u06e7\7"
			+ "\b\2\2\u06e6\u06e8\7j\2\2\u06e7\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8"
			+ "\u06e9\3\2\2\2\u06e9\u06ea\7C\2\2\u06ea\u0145\3\2\2\2\u06eb\u06ed\7\17"
			+ "\2\2\u06ec\u06ee\7j\2\2\u06ed\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee"
			+ "\u06ef\3\2\2\2\u06ef\u06f0\7C\2\2\u06f0\u0147\3\2\2\2\u06f1\u06f3\7(\2"
			+ "\2\u06f2\u06f4\5\u01a0\u00d1\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2"
			+ "\u06f4\u06f5\3\2\2\2\u06f5\u06f6\7C\2\2\u06f6\u0149\3\2\2\2\u06f7\u06f8"
			+ "\7\60\2\2\u06f8\u06f9\5\u01a0\u00d1\2\u06f9\u06fa\7C\2\2\u06fa\u014b\3"
			+ "\2\2\2\u06fb\u06fc\7.\2\2\u06fc\u06fd\7=\2\2\u06fd\u06fe\5\u01a0\u00d1"
			+ "\2\u06fe\u06ff\7>\2\2\u06ff\u0700\5\u00fe\u0080\2\u0700\u014d\3\2\2\2"
			+ "\u0701\u0702\7\63\2\2\u0702\u0703\5\u00fe\u0080\2\u0703\u0704\5\u0150"
			+ "\u00a9\2\u0704\u070e\3\2\2\2\u0705\u0706\7\63\2\2\u0706\u0708\5\u00fe"
			+ "\u0080\2\u0707\u0709\5\u0150\u00a9\2\u0708\u0707\3\2\2\2\u0708\u0709\3"
			+ "\2\2\2\u0709\u070a\3\2\2\2\u070a\u070b\5\u0158\u00ad\2\u070b\u070e\3\2"
			+ "\2\2\u070c\u070e\5\u015a\u00ae\2\u070d\u0701\3\2\2\2\u070d\u0705\3\2\2"
			+ "\2\u070d\u070c\3\2\2\2\u070e\u014f\3\2\2\2\u070f\u0713\5\u0152\u00aa\2"
			+ "\u0710\u0712\5\u0152\u00aa\2\u0711\u0710\3\2\2\2\u0712\u0715\3\2\2\2\u0713"
			+ "\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0151\3\2\2\2\u0715\u0713\3\2"
			+ "\2\2\u0716\u0717\7\13\2\2\u0717\u0718\7=\2\2\u0718\u0719\5\u0154\u00ab"
			+ "\2\u0719\u071a\7>\2\2\u071a\u071b\5\u00fe\u0080\2\u071b\u0153\3\2\2\2"
			+ "\u071c\u071e\5\u009eP\2\u071d\u071c\3\2\2\2\u071e\u0721\3\2\2\2\u071f"
			+ "\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0722\3\2\2\2\u0721\u071f\3\2"
			+ "\2\2\u0722\u0723\5\u0156\u00ac\2\u0723\u0724\5r:\2\u0724\u0155\3\2\2\2"
			+ "\u0725\u072a\5~@\2\u0726\u0727\7Z\2\2\u0727\u0729\5\22\n\2\u0728\u0726"
			+ "\3\2\2\2\u0729\u072c\3\2\2\2\u072a\u0728\3\2\2\2\u072a\u072b\3\2\2\2\u072b"
			+ "\u0157\3\2\2\2\u072c\u072a\3\2\2\2\u072d\u072e\7\27\2\2\u072e\u072f\5"
			+ "\u00fe\u0080\2\u072f\u0159\3\2\2\2\u0730\u0731\7\63\2\2\u0731\u0732\5"
			+ "\u015c\u00af\2\u0732\u0734\5\u00fe\u0080\2\u0733\u0735\5\u0150\u00a9\2"
			+ "\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0737\3\2\2\2\u0736\u0738"
			+ "\5\u0158\u00ad\2\u0737\u0736\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u015b\3"
			+ "\2\2\2\u0739\u073a\7=\2\2\u073a\u073c\5\u015e\u00b0\2\u073b\u073d\7C\2"
			+ "\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u073f"
			+ "\7>\2\2\u073f\u015d\3\2\2\2\u0740\u0745\5\u0160\u00b1\2\u0741\u0742\7"
			+ "C\2\2\u0742\u0744\5\u0160\u00b1\2\u0743\u0741\3\2\2\2\u0744\u0747\3\2"
			+ "\2\2\u0745\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u015f\3\2\2\2\u0747"
			+ "\u0745\3\2\2\2\u0748\u074a\5\u009eP\2\u0749\u0748\3\2\2\2\u074a\u074d"
			+ "\3\2\2\2\u074b\u0749\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074e\3\2\2\2\u074d"
			+ "\u074b\3\2\2\2\u074e\u074f\5v<\2\u074f\u0750\5r:\2\u0750\u0751\7F\2\2"
			+ "\u0751\u0752\5\u01a0\u00d1\2\u0752\u0161\3\2\2\2\u0753\u0756\5\u0170\u00b9"
			+ "\2\u0754\u0756\5\u0198\u00cd\2\u0755\u0753\3\2\2\2\u0755\u0754\3\2\2\2"
			+ "\u0756\u075a\3\2\2\2\u0757\u0759\5\u016a\u00b6\2\u0758\u0757\3\2\2\2\u0759"
			+ "\u075c\3\2\2\2\u075a\u0758\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u0163\3\2"
			+ "\2\2\u075c\u075a\3\2\2\2\u075d\u077b\5\2\2\2\u075e\u0763\58\35\2\u075f"
			+ "\u0760\7A\2\2\u0760\u0762\7B\2\2\u0761\u075f\3\2\2\2\u0762\u0765\3\2\2"
			+ "\2\u0763\u0761\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766\3\2\2\2\u0765\u0763"
			+ "\3\2\2\2\u0766\u0767\7E\2\2\u0767\u0768\7\r\2\2\u0768\u077b\3\2\2\2\u0769"
			+ "\u076a\7\64\2\2\u076a\u076b\7E\2\2\u076b\u077b\7\r\2\2\u076c\u077b\7/"
			+ "\2\2\u076d\u076e\58\35\2\u076e\u076f\7E\2\2\u076f\u0770\7/\2\2\u0770\u077b"
			+ "\3\2\2\2\u0771\u0772\7=\2\2\u0772\u0773\5\u01a0\u00d1\2\u0773\u0774\7"
			+ ">\2\2\u0774\u077b\3\2\2\2\u0775\u077b\5\u0176\u00bc\2\u0776\u077b\5\u017e"
			+ "\u00c0\2\u0777\u077b\5\u0184\u00c3\2\u0778\u077b\5\u018a\u00c6\2\u0779"
			+ "\u077b\5\u0192\u00ca\2\u077a\u075d\3\2\2\2\u077a\u075e\3\2\2\2\u077a\u0769"
			+ "\3\2\2\2\u077a\u076c\3\2\2\2\u077a\u076d\3\2\2\2\u077a\u0771\3\2\2\2\u077a"
			+ "\u0775\3\2\2\2\u077a\u0776\3\2\2\2\u077a\u0777\3\2\2\2\u077a\u0778\3\2"
			+ "\2\2\u077a\u0779\3\2\2\2\u077b\u0165\3\2\2\2\u077c\u077d\3\2\2\2\u077d"
			+ "\u0167\3\2\2\2\u077e\u079b\5\2\2\2\u077f\u0784\58\35\2\u0780\u0781\7A"
			+ "\2\2\u0781\u0783\7B\2\2\u0782\u0780\3\2\2\2\u0783\u0786\3\2\2\2\u0784"
			+ "\u0782\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787\3\2\2\2\u0786\u0784\3\2"
			+ "\2\2\u0787\u0788\7E\2\2\u0788\u0789\7\r\2\2\u0789\u079b\3\2\2\2\u078a"
			+ "\u078b\7\64\2\2\u078b\u078c\7E\2\2\u078c\u079b\7\r\2\2\u078d\u079b\7/"
			+ "\2\2\u078e\u078f\58\35\2\u078f\u0790\7E\2\2\u0790\u0791\7/\2\2\u0791\u079b"
			+ "\3\2\2\2\u0792\u0793\7=\2\2\u0793\u0794\5\u01a0\u00d1\2\u0794\u0795\7"
			+ ">\2\2\u0795\u079b\3\2\2\2\u0796\u079b\5\u0176\u00bc\2\u0797\u079b\5\u017e"
			+ "\u00c0\2\u0798\u079b\5\u018a\u00c6\2\u0799\u079b\5\u0192\u00ca\2\u079a"
			+ "\u077e\3\2\2\2\u079a\u077f\3\2\2\2\u079a\u078a\3\2\2\2\u079a\u078d\3\2"
			+ "\2\2\u079a\u078e\3\2\2\2\u079a\u0792\3\2\2\2\u079a\u0796\3\2\2\2\u079a"
			+ "\u0797\3\2\2\2\u079a\u0798\3\2\2\2\u079a\u0799\3\2\2\2\u079b\u0169\3\2"
			+ "\2\2\u079c\u07a2\5\u0178\u00bd\2\u079d\u07a2\5\u0180\u00c1\2\u079e\u07a2"
			+ "\5\u0186\u00c4\2\u079f\u07a2\5\u018c\u00c7\2\u07a0\u07a2\5\u0194\u00cb"
			+ "\2\u07a1\u079c\3\2\2\2\u07a1\u079d\3\2\2\2\u07a1\u079e\3\2\2\2\u07a1\u079f"
			+ "\3\2\2\2\u07a1\u07a0\3\2\2\2\u07a2\u016b\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4"
			+ "\u016d\3\2\2\2\u07a5\u07aa\5\u0178\u00bd\2\u07a6\u07aa\5\u0180\u00c1\2"
			+ "\u07a7\u07aa\5\u018c\u00c7\2\u07a8\u07aa\5\u0194\u00cb\2\u07a9\u07a5\3"
			+ "\2\2\2\u07a9\u07a6\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07a8\3\2\2\2\u07aa"
			+ "\u016f\3\2\2\2\u07ab\u07d4\5\2\2\2\u07ac\u07b1\58\35\2\u07ad\u07ae\7A"
			+ "\2\2\u07ae\u07b0\7B\2\2\u07af\u07ad\3\2\2\2\u07b0\u07b3\3\2\2\2\u07b1"
			+ "\u07af\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b4\3\2\2\2\u07b3\u07b1\3\2"
			+ "\2\2\u07b4\u07b5\7E\2\2\u07b5\u07b6\7\r\2\2\u07b6\u07d4\3\2\2\2\u07b7"
			+ "\u07bc\5x=\2\u07b8\u07b9\7A\2\2\u07b9\u07bb\7B\2\2\u07ba\u07b8\3\2\2\2"
			+ "\u07bb\u07be\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07bf"
			+ "\3\2\2\2\u07be\u07bc\3\2\2\2\u07bf\u07c0\7E\2\2\u07c0\u07c1\7\r\2\2\u07c1"
			+ "\u07d4\3\2\2\2\u07c2\u07c3\7\64\2\2\u07c3\u07c4\7E\2\2\u07c4\u07d4\7\r"
			+ "\2\2\u07c5\u07d4\7/\2\2\u07c6\u07c7\58\35\2\u07c7\u07c8\7E\2\2\u07c8\u07c9"
			+ "\7/\2\2\u07c9\u07d4\3\2\2\2\u07ca\u07cb\7=\2\2\u07cb\u07cc\5\u01a0\u00d1"
			+ "\2\u07cc\u07cd\7>\2\2\u07cd\u07d4\3\2\2\2\u07ce\u07d4\5\u017a\u00be\2"
			+ "\u07cf\u07d4\5\u0182\u00c2\2\u07d0\u07d4\5\u0188\u00c5\2\u07d1\u07d4\5"
			+ "\u018e\u00c8\2\u07d2\u07d4\5\u0196\u00cc\2\u07d3\u07ab\3\2\2\2\u07d3\u07ac"
			+ "\3\2\2\2\u07d3\u07b7\3\2\2\2\u07d3\u07c2\3\2\2\2\u07d3\u07c5\3\2\2\2\u07d3"
			+ "\u07c6\3\2\2\2\u07d3\u07ca\3\2\2\2\u07d3\u07ce\3\2\2\2\u07d3\u07cf\3\2"
			+ "\2\2\u07d3\u07d0\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d3\u07d2\3\2\2\2\u07d4"
			+ "\u0171\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u0173\3\2\2\2\u07d7\u07ff\5\2"
			+ "\2\2\u07d8\u07dd\58\35\2\u07d9\u07da\7A\2\2\u07da\u07dc\7B\2\2\u07db\u07d9"
			+ "\3\2\2\2\u07dc\u07df\3\2\2\2\u07dd\u07db\3\2\2\2\u07dd\u07de\3\2\2\2\u07de"
			+ "\u07e0\3\2\2\2\u07df\u07dd\3\2\2\2\u07e0\u07e1\7E\2\2\u07e1\u07e2\7\r"
			+ "\2\2\u07e2\u07ff\3\2\2\2\u07e3\u07e8\5x=\2\u07e4\u07e5\7A\2\2\u07e5\u07e7"
			+ "\7B\2\2\u07e6\u07e4\3\2\2\2\u07e7\u07ea\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e8"
			+ "\u07e9\3\2\2\2\u07e9\u07eb\3\2\2\2\u07ea\u07e8\3\2\2\2\u07eb\u07ec\7E"
			+ "\2\2\u07ec\u07ed\7\r\2\2\u07ed\u07ff\3\2\2\2\u07ee\u07ef\7\64\2\2\u07ef"
			+ "\u07f0\7E\2\2\u07f0\u07ff\7\r\2\2\u07f1\u07ff\7/\2\2\u07f2\u07f3\58\35"
			+ "\2\u07f3\u07f4\7E\2\2\u07f4\u07f5\7/\2\2\u07f5\u07ff\3\2\2\2\u07f6\u07f7"
			+ "\7=\2\2\u07f7\u07f8\5\u01a0\u00d1\2\u07f8\u07f9\7>\2\2\u07f9\u07ff\3\2"
			+ "\2\2\u07fa\u07ff\5\u017a\u00be\2\u07fb\u07ff\5\u0182\u00c2\2\u07fc\u07ff"
			+ "\5\u018e\u00c8\2\u07fd\u07ff\5\u0196\u00cc\2\u07fe\u07d7\3\2\2\2\u07fe"
			+ "\u07d8\3\2\2\2\u07fe\u07e3\3\2\2\2\u07fe\u07ee\3\2\2\2\u07fe\u07f1\3\2"
			+ "\2\2\u07fe\u07f2\3\2\2\2\u07fe\u07f6\3\2\2\2\u07fe\u07fa\3\2\2\2\u07fe"
			+ "\u07fb\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe\u07fd\3\2\2\2\u07ff\u0175\3\2"
			+ "\2\2\u0800\u0802\7#\2\2\u0801\u0803\5,\27\2\u0802\u0801\3\2\2\2\u0802"
			+ "\u0803\3\2\2\2\u0803\u0807\3\2\2\2\u0804\u0806\5\u00e8u\2\u0805\u0804"
			+ "\3\2\2\2\u0806\u0809\3\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808"
			+ "\u080a\3\2\2\2\u0809\u0807\3\2\2\2\u080a\u0815\7j\2\2\u080b\u080f\7E\2"
			+ "\2\u080c\u080e\5\u00e8u\2\u080d\u080c\3\2\2\2\u080e\u0811\3\2\2\2\u080f"
			+ "\u080d\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0812\3\2\2\2\u0811\u080f\3\2"
			+ "\2\2\u0812\u0814\7j\2\2\u0813\u080b\3\2\2\2\u0814\u0817\3\2\2\2\u0815"
			+ "\u0813\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0819\3\2\2\2\u0817\u0815\3\2"
			+ "\2\2\u0818\u081a\5\u017c\u00bf\2\u0819\u0818\3\2\2\2\u0819\u081a\3\2\2"
			+ "\2\u081a\u081b\3\2\2\2\u081b\u081d\7=\2\2\u081c\u081e\5\u0190\u00c9\2"
			+ "\u081d\u081c\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0821"
			+ "\7>\2\2\u0820\u0822\5d\63\2\u0821\u0820\3\2\2\2\u0821\u0822\3\2\2\2\u0822"
			+ "\u0854\3\2\2\2\u0823\u0824\5<\37\2\u0824\u0825\7E\2\2\u0825\u0827\7#\2"
			+ "\2\u0826\u0828\5,\27\2\u0827\u0826\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u082c"
			+ "\3\2\2\2\u0829\u082b\5\u00e8u\2\u082a\u0829\3\2\2\2\u082b\u082e\3\2\2"
			+ "\2\u082c\u082a\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u082f\3\2\2\2\u082e\u082c"
			+ "\3\2\2\2\u082f\u0831\7j\2\2\u0830\u0832\5\u017c\u00bf\2\u0831\u0830\3"
			+ "\2\2\2\u0831\u0832\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0835\7=\2\2\u0834"
			+ "\u0836\5\u0190\u00c9\2\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837"
			+ "\3\2\2\2\u0837\u0839\7>\2\2\u0838\u083a\5d\63\2\u0839\u0838\3\2\2\2\u0839"
			+ "\u083a\3\2\2\2\u083a\u0854\3\2\2\2\u083b\u083c\5\u0162\u00b2\2\u083c\u083d"
			+ "\7E\2\2\u083d\u083f\7#\2\2\u083e\u0840\5,\27\2\u083f\u083e\3\2\2\2\u083f"
			+ "\u0840\3\2\2\2\u0840\u0844\3\2\2\2\u0841\u0843\5\u00e8u\2\u0842\u0841"
			+ "\3\2\2\2\u0843\u0846\3\2\2\2\u0844\u0842\3\2\2\2\u0844\u0845\3\2\2\2\u0845"
			+ "\u0847\3\2\2\2\u0846\u0844\3\2\2\2\u0847\u0849\7j\2\2\u0848\u084a\5\u017c"
			+ "\u00bf\2\u0849\u0848\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084b\3\2\2\2\u084b"
			+ "\u084d\7=\2\2\u084c\u084e\5\u0190\u00c9\2\u084d\u084c\3\2\2\2\u084d\u084e"
			+ "\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0851\7>\2\2\u0850\u0852\5d\63\2\u0851"
			+ "\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0854\3\2\2\2\u0853\u0800\3\2"
			+ "\2\2\u0853\u0823\3\2\2\2\u0853\u083b\3\2\2\2\u0854\u0177\3\2\2\2\u0855"
			+ "\u0856\7E\2\2\u0856\u0858\7#\2\2\u0857\u0859\5,\27\2\u0858\u0857\3\2\2"
			+ "\2\u0858\u0859\3\2\2\2\u0859\u085d\3\2\2\2\u085a\u085c\5\u00e8u\2\u085b"
			+ "\u085a\3\2\2\2\u085c\u085f\3\2\2\2\u085d\u085b\3\2\2\2\u085d\u085e\3\2"
			+ "\2\2\u085e\u0860\3\2\2\2\u085f\u085d\3\2\2\2\u0860\u0862\7j\2\2\u0861"
			+ "\u0863\5\u017c\u00bf\2\u0862\u0861\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0864"
			+ "\3\2\2\2\u0864\u0866\7=\2\2\u0865\u0867\5\u0190\u00c9\2\u0866\u0865\3"
			+ "\2\2\2\u0866\u0867\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u086a\7>\2\2\u0869"
			+ "\u086b\5d\63\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u0179\3\2"
			+ "\2\2\u086c\u086e\7#\2\2\u086d\u086f\5,\27\2\u086e\u086d\3\2\2\2\u086e"
			+ "\u086f\3\2\2\2\u086f\u0873\3\2\2\2\u0870\u0872\5\u00e8u\2\u0871\u0870"
			+ "\3\2\2\2\u0872\u0875\3\2\2\2\u0873\u0871\3\2\2\2\u0873\u0874\3\2\2\2\u0874"
			+ "\u0876\3\2\2\2\u0875\u0873\3\2\2\2\u0876\u0881\7j\2\2\u0877\u087b\7E\2"
			+ "\2\u0878\u087a\5\u00e8u\2\u0879\u0878\3\2\2\2\u087a\u087d\3\2\2\2\u087b"
			+ "\u0879\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087e\3\2\2\2\u087d\u087b\3\2"
			+ "\2\2\u087e\u0880\7j\2\2\u087f\u0877\3\2\2\2\u0880\u0883\3\2\2\2\u0881"
			+ "\u087f\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0885\3\2\2\2\u0883\u0881\3\2"
			+ "\2\2\u0884\u0886\5\u017c\u00bf\2\u0885\u0884\3\2\2\2\u0885\u0886\3\2\2"
			+ "\2\u0886\u0887\3\2\2\2\u0887\u0889\7=\2\2\u0888\u088a\5\u0190\u00c9\2"
			+ "\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088b\3\2\2\2\u088b\u088d"
			+ "\7>\2\2\u088c\u088e\5d\63\2\u088d\u088c\3\2\2\2\u088d\u088e\3\2\2\2\u088e"
			+ "\u08a8\3\2\2\2\u088f\u0890\5<\37\2\u0890\u0891\7E\2\2\u0891\u0893\7#\2"
			+ "\2\u0892\u0894\5,\27\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0898"
			+ "\3\2\2\2\u0895\u0897\5\u00e8u\2\u0896\u0895\3\2\2\2\u0897\u089a\3\2\2"
			+ "\2\u0898\u0896\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089b\3\2\2\2\u089a\u0898"
			+ "\3\2\2\2\u089b\u089d\7j\2\2\u089c\u089e\5\u017c\u00bf\2\u089d\u089c\3"
			+ "\2\2\2\u089d\u089e\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a1\7=\2\2\u08a0"
			+ "\u08a2\5\u0190\u00c9\2\u08a1\u08a0\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u08a3"
			+ "\3\2\2\2\u08a3\u08a5\7>\2\2\u08a4\u08a6\5d\63\2\u08a5\u08a4\3\2\2\2\u08a5"
			+ "\u08a6\3\2\2\2\u08a6\u08a8\3\2\2\2\u08a7\u086c\3\2\2\2\u08a7\u088f\3\2"
			+ "\2\2\u08a8\u017b\3\2\2\2\u08a9\u08ad\5,\27\2\u08aa\u08ab\7H\2\2\u08ab"
			+ "\u08ad\7G\2\2\u08ac\u08a9\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ad\u017d\3\2"
			+ "\2\2\u08ae\u08af\5\u0162\u00b2\2\u08af\u08b0\7E\2\2\u08b0\u08b1\7j\2\2"
			+ "\u08b1\u08bc\3\2\2\2\u08b2\u08b3\7,\2\2\u08b3\u08b4\7E\2\2\u08b4\u08bc"
			+ "\7j\2\2\u08b5\u08b6\58\35\2\u08b6\u08b7\7E\2\2\u08b7\u08b8\7,\2\2\u08b8"
			+ "\u08b9\7E\2\2\u08b9\u08ba\7j\2\2\u08ba\u08bc\3\2\2\2\u08bb\u08ae\3\2\2"
			+ "\2\u08bb\u08b2\3\2\2\2\u08bb\u08b5\3\2\2\2\u08bc\u017f\3\2\2\2\u08bd\u08be"
			+ "\7E\2\2\u08be\u08bf\7j\2\2\u08bf\u0181\3\2\2\2\u08c0\u08c1\7,\2\2\u08c1"
			+ "\u08c2\7E\2\2\u08c2\u08ca\7j\2\2\u08c3\u08c4\58\35\2\u08c4\u08c5\7E\2"
			+ "\2\u08c5\u08c6\7,\2\2\u08c6\u08c7\7E\2\2\u08c7\u08c8\7j\2\2\u08c8\u08ca"
			+ "\3\2\2\2\u08c9\u08c0\3\2\2\2\u08c9\u08c3\3\2\2\2\u08ca\u0183\3\2\2\2\u08cb"
			+ "\u08cc\5<\37\2\u08cc\u08cd\7A\2\2\u08cd\u08ce\5\u01a0\u00d1\2\u08ce\u08cf"
			+ "\7B\2\2\u08cf\u08d6\3\2\2\2\u08d0\u08d1\5\u0168\u00b5\2\u08d1\u08d2\7"
			+ "A\2\2\u08d2\u08d3\5\u01a0\u00d1\2\u08d3\u08d4\7B\2\2\u08d4\u08d6\3\2\2"
			+ "\2\u08d5\u08cb\3\2\2\2\u08d5\u08d0\3\2\2\2\u08d6\u08de\3\2\2\2\u08d7\u08d8"
			+ "\5\u0166\u00b4\2\u08d8\u08d9\7A\2\2\u08d9\u08da\5\u01a0\u00d1\2\u08da"
			+ "\u08db\7B\2\2\u08db\u08dd\3\2\2\2\u08dc\u08d7\3\2\2\2\u08dd\u08e0\3\2"
			+ "\2\2\u08de\u08dc\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u0185\3\2\2\2\u08e0"
			+ "\u08de\3\2\2\2\u08e1\u08e2\5\u016e\u00b8\2\u08e2\u08e3\7A\2\2\u08e3\u08e4"
			+ "\5\u01a0\u00d1\2\u08e4\u08e5\7B\2\2\u08e5\u08ed\3\2\2\2\u08e6\u08e7\5"
			+ "\u016c\u00b7\2\u08e7\u08e8\7A\2\2\u08e8\u08e9\5\u01a0\u00d1\2\u08e9\u08ea"
			+ "\7B\2\2\u08ea\u08ec\3\2\2\2\u08eb\u08e6\3\2\2\2\u08ec\u08ef\3\2\2\2\u08ed"
			+ "\u08eb\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u0187\3\2\2\2\u08ef\u08ed\3\2"
			+ "\2\2\u08f0\u08f1\5<\37\2\u08f1\u08f2\7A\2\2\u08f2\u08f3\5\u01a0\u00d1"
			+ "\2\u08f3\u08f4\7B\2\2\u08f4\u08fb\3\2\2\2\u08f5\u08f6\5\u0174\u00bb\2"
			+ "\u08f6\u08f7\7A\2\2\u08f7\u08f8\5\u01a0\u00d1\2\u08f8\u08f9\7B\2\2\u08f9"
			+ "\u08fb\3\2\2\2\u08fa\u08f0\3\2\2\2\u08fa\u08f5\3\2\2\2\u08fb\u0903\3\2"
			+ "\2\2\u08fc\u08fd\5\u0172\u00ba\2\u08fd\u08fe\7A\2\2\u08fe\u08ff\5\u01a0"
			+ "\u00d1\2\u08ff\u0900\7B\2\2\u0900\u0902\3\2\2\2\u0901\u08fc\3\2\2\2\u0902"
			+ "\u0905\3\2\2\2\u0903\u0901\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0189\3\2"
			+ "\2\2\u0905\u0903\3\2\2\2\u0906\u0907\5> \2\u0907\u0909\7=\2\2\u0908\u090a"
			+ "\5\u0190\u00c9\2\u0909\u0908\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090b\3"
			+ "\2\2\2\u090b\u090c\7>\2\2\u090c\u094b\3\2\2\2\u090d\u090e\58\35\2\u090e"
			+ "\u0910\7E\2\2\u090f\u0911\5,\27\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2"
			+ "\2\2\u0911\u0912\3\2\2\2\u0912\u0913\7j\2\2\u0913\u0915\7=\2\2\u0914\u0916"
			+ "\5\u0190\u00c9\2\u0915\u0914\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0917\3"
			+ "\2\2\2\u0917\u0918\7>\2\2\u0918\u094b\3\2\2\2\u0919\u091a\5<\37\2\u091a"
			+ "\u091c\7E\2\2\u091b\u091d\5,\27\2\u091c\u091b\3\2\2\2\u091c\u091d\3\2"
			+ "\2\2\u091d\u091e\3\2\2\2\u091e\u091f\7j\2\2\u091f\u0921\7=\2\2\u0920\u0922"
			+ "\5\u0190\u00c9\2\u0921\u0920\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\3"
			+ "\2\2\2\u0923\u0924\7>\2\2\u0924\u094b\3\2\2\2\u0925\u0926\5\u0162\u00b2"
			+ "\2\u0926\u0928\7E\2\2\u0927\u0929\5,\27\2\u0928\u0927\3\2\2\2\u0928\u0929"
			+ "\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092b\7j\2\2\u092b\u092d\7=\2\2\u092c"
			+ "\u092e\5\u0190\u00c9\2\u092d\u092c\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f"
			+ "\3\2\2\2\u092f\u0930\7>\2\2\u0930\u094b\3\2\2\2\u0931\u0932\7,\2\2\u0932"
			+ "\u0934\7E\2\2\u0933\u0935\5,\27\2\u0934\u0933\3\2\2\2\u0934\u0935\3\2"
			+ "\2\2\u0935\u0936\3\2\2\2\u0936\u0937\7j\2\2\u0937\u0939\7=\2\2\u0938\u093a"
			+ "\5\u0190\u00c9\2\u0939\u0938\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u093b\3"
			+ "\2\2\2\u093b\u094b\7>\2\2\u093c\u093d\58\35\2\u093d\u093e\7E\2\2\u093e"
			+ "\u093f\7,\2\2\u093f\u0941\7E\2\2\u0940\u0942\5,\27\2\u0941\u0940\3\2\2"
			+ "\2\u0941\u0942\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0944\7j\2\2\u0944\u0946"
			+ "\7=\2\2\u0945\u0947\5\u0190\u00c9\2\u0946\u0945\3\2\2\2\u0946\u0947\3"
			+ "\2\2\2\u0947\u0948\3\2\2\2\u0948\u0949\7>\2\2\u0949\u094b\3\2\2\2\u094a"
			+ "\u0906\3\2\2\2\u094a\u090d\3\2\2\2\u094a\u0919\3\2\2\2\u094a\u0925\3\2"
			+ "\2\2\u094a\u0931\3\2\2\2\u094a\u093c\3\2\2\2\u094b\u018b\3\2\2\2\u094c"
			+ "\u094e\7E\2\2\u094d\u094f\5,\27\2\u094e\u094d\3\2\2\2\u094e\u094f\3\2"
			+ "\2\2\u094f\u0950\3\2\2\2\u0950\u0951\7j\2\2\u0951\u0953\7=\2\2\u0952\u0954"
			+ "\5\u0190\u00c9\2\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0955\3"
			+ "\2\2\2\u0955\u0956\7>\2\2\u0956\u018d\3\2\2\2\u0957\u0958\5> \2\u0958"
			+ "\u095a\7=\2\2\u0959\u095b\5\u0190\u00c9\2\u095a\u0959\3\2\2\2\u095a\u095b"
			+ "\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095d\7>\2\2\u095d\u0990\3\2\2\2\u095e"
			+ "\u095f\58\35\2\u095f\u0961\7E\2\2\u0960\u0962";
	private static final String _serializedATNSegment1 = "\5,\27\2\u0961\u0960\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0963\3\2\2\2\u0963"
			+ "\u0964\7j\2\2\u0964\u0966\7=\2\2\u0965\u0967\5\u0190\u00c9\2\u0966\u0965"
			+ "\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\7>\2\2\u0969"
			+ "\u0990\3\2\2\2\u096a\u096b\5<\37\2\u096b\u096d\7E\2\2\u096c\u096e\5,\27"
			+ "\2\u096d\u096c\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0970"
			+ "\7j\2\2\u0970\u0972\7=\2\2\u0971\u0973\5\u0190\u00c9\2\u0972\u0971\3\2"
			+ "\2\2\u0972\u0973\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975\7>\2\2\u0975"
			+ "\u0990\3\2\2\2\u0976\u0977\7,\2\2\u0977\u0979\7E\2\2\u0978\u097a\5,\27"
			+ "\2\u0979\u0978\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097b\3\2\2\2\u097b\u097c"
			+ "\7j\2\2\u097c\u097e\7=\2\2\u097d\u097f\5\u0190\u00c9\2\u097e\u097d\3\2"
			+ "\2\2\u097e\u097f\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0990\7>\2\2\u0981"
			+ "\u0982\58\35\2\u0982\u0983\7E\2\2\u0983\u0984\7,\2\2\u0984\u0986\7E\2"
			+ "\2\u0985\u0987\5,\27\2\u0986\u0985\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0988"
			+ "\3\2\2\2\u0988\u0989\7j\2\2\u0989\u098b\7=\2\2\u098a\u098c\5\u0190\u00c9"
			+ "\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e"
			+ "\7>\2\2\u098e\u0990\3\2\2\2\u098f\u0957\3\2\2\2\u098f\u095e\3\2\2\2\u098f"
			+ "\u096a\3\2\2\2\u098f\u0976\3\2\2\2\u098f\u0981\3\2\2\2\u0990\u018f\3\2"
			+ "\2\2\u0991\u0996\5\u01a0\u00d1\2\u0992\u0993\7D\2\2\u0993\u0995\5\u01a0"
			+ "\u00d1\2\u0994\u0992\3\2\2\2\u0995\u0998\3\2\2\2\u0996\u0994\3\2\2\2\u0996"
			+ "\u0997\3\2\2\2\u0997\u0191\3\2\2\2\u0998\u0996\3\2\2\2\u0999\u099a\5<"
			+ "\37\2\u099a\u099c\7^\2\2\u099b\u099d\5,\27\2\u099c\u099b\3\2\2\2\u099c"
			+ "\u099d\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u099f\7j\2\2\u099f\u09c9\3\2"
			+ "\2\2\u09a0\u09a1\5\16\b\2\u09a1\u09a3\7^\2\2\u09a2\u09a4\5,\27\2\u09a3"
			+ "\u09a2\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a6\7j"
			+ "\2\2\u09a6\u09c9\3\2\2\2\u09a7\u09a8\5\u0162\u00b2\2\u09a8\u09aa\7^\2"
			+ "\2\u09a9\u09ab\5,\27\2\u09aa\u09a9\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac"
			+ "\3\2\2\2\u09ac\u09ad\7j\2\2\u09ad\u09c9\3\2\2\2\u09ae\u09af\7,\2\2\u09af"
			+ "\u09b1\7^\2\2\u09b0\u09b2\5,\27\2\u09b1\u09b0\3\2\2\2\u09b1\u09b2\3\2"
			+ "\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09c9\7j\2\2\u09b4\u09b5\58\35\2\u09b5"
			+ "\u09b6\7E\2\2\u09b6\u09b7\7,\2\2\u09b7\u09b9\7^\2\2\u09b8\u09ba\5,\27"
			+ "\2\u09b9\u09b8\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bc"
			+ "\7j\2\2\u09bc\u09c9\3\2\2\2\u09bd\u09be\5\22\n\2\u09be\u09c0\7^\2\2\u09bf"
			+ "\u09c1\5,\27\2\u09c0\u09bf\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c2\3\2"
			+ "\2\2\u09c2\u09c3\7#\2\2\u09c3\u09c9\3\2\2\2\u09c4\u09c5\5 \21\2\u09c5"
			+ "\u09c6\7^\2\2\u09c6\u09c7\7#\2\2\u09c7\u09c9\3\2\2\2\u09c8\u0999\3\2\2"
			+ "\2\u09c8\u09a0\3\2\2\2\u09c8\u09a7\3\2\2\2\u09c8\u09ae\3\2\2\2\u09c8\u09b4"
			+ "\3\2\2\2\u09c8\u09bd\3\2\2\2\u09c8\u09c4\3\2\2\2\u09c9\u0193\3\2\2\2\u09ca"
			+ "\u09cc\7^\2\2\u09cb\u09cd\5,\27\2\u09cc\u09cb\3\2\2\2\u09cc\u09cd\3\2"
			+ "\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09cf\7j\2\2\u09cf\u0195\3\2\2\2\u09d0"
			+ "\u09d1\5<\37\2\u09d1\u09d3\7^\2\2\u09d2\u09d4\5,\27\2\u09d3\u09d2\3\2"
			+ "\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\7j\2\2\u09d6"
			+ "\u09f9\3\2\2\2\u09d7\u09d8\5\16\b\2\u09d8\u09da\7^\2\2\u09d9\u09db\5,"
			+ "\27\2\u09da\u09d9\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc"
			+ "\u09dd\7j\2\2\u09dd\u09f9\3\2\2\2\u09de\u09df\7,\2\2\u09df\u09e1\7^\2"
			+ "\2\u09e0\u09e2\5,\27\2\u09e1\u09e0\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e3"
			+ "\3\2\2\2\u09e3\u09f9\7j\2\2\u09e4\u09e5\58\35\2\u09e5\u09e6\7E\2\2\u09e6"
			+ "\u09e7\7,\2\2\u09e7\u09e9\7^\2\2\u09e8\u09ea\5,\27\2\u09e9\u09e8\3\2\2"
			+ "\2\u09e9\u09ea\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ec\7j\2\2\u09ec\u09f9"
			+ "\3\2\2\2\u09ed\u09ee\5\22\n\2\u09ee\u09f0\7^\2\2\u09ef\u09f1\5,\27\2\u09f0"
			+ "\u09ef\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f3\7#"
			+ "\2\2\u09f3\u09f9\3\2\2\2\u09f4\u09f5\5 \21\2\u09f5\u09f6\7^\2\2\u09f6"
			+ "\u09f7\7#\2\2\u09f7\u09f9\3\2\2\2\u09f8\u09d0\3\2\2\2\u09f8\u09d7\3\2"
			+ "\2\2\u09f8\u09de\3\2\2\2\u09f8\u09e4\3\2\2\2\u09f8\u09ed\3\2\2\2\u09f8"
			+ "\u09f4\3\2\2\2\u09f9\u0197\3\2\2\2\u09fa\u09fb\7#\2\2\u09fb\u09fc\5\6"
			+ "\4\2\u09fc\u09fe\5\u019a\u00ce\2\u09fd\u09ff\5\"\22\2\u09fe\u09fd\3\2"
			+ "\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a11\3\2\2\2\u0a00\u0a01\7#\2\2\u0a01"
			+ "\u0a02\5\20\t\2\u0a02\u0a04\5\u019a\u00ce\2\u0a03\u0a05\5\"\22\2\u0a04"
			+ "\u0a03\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a11\3\2\2\2\u0a06\u0a07\7#"
			+ "\2\2\u0a07\u0a08\5\6\4\2\u0a08\u0a09\5\"\22\2\u0a09\u0a0a\5\u00fa~\2\u0a0a"
			+ "\u0a11\3\2\2\2\u0a0b\u0a0c\7#\2\2\u0a0c\u0a0d\5\20\t\2\u0a0d\u0a0e\5\""
			+ "\22\2\u0a0e\u0a0f\5\u00fa~\2\u0a0f\u0a11\3\2\2\2\u0a10\u09fa\3\2\2\2\u0a10"
			+ "\u0a00\3\2\2\2\u0a10\u0a06\3\2\2\2\u0a10\u0a0b\3\2\2\2\u0a11\u0199\3\2"
			+ "\2\2\u0a12\u0a16\5\u019c\u00cf\2\u0a13\u0a15\5\u019c\u00cf\2\u0a14\u0a13"
			+ "\3\2\2\2\u0a15\u0a18\3\2\2\2\u0a16\u0a14\3\2\2\2\u0a16\u0a17\3\2\2\2\u0a17"
			+ "\u019b\3\2\2\2\u0a18\u0a16\3\2\2\2\u0a19\u0a1b\5\u00e8u\2\u0a1a\u0a19"
			+ "\3\2\2\2\u0a1b\u0a1e\3\2\2\2\u0a1c\u0a1a\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d"
			+ "\u0a1f\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1f\u0a20\7A\2\2\u0a20\u0a21\5\u01a0"
			+ "\u00d1\2\u0a21\u0a22\7B\2\2\u0a22\u019d\3\2\2\2\u0a23\u0a24\5\u01a0\u00d1"
			+ "\2\u0a24\u019f\3\2\2\2\u0a25\u0a28\5\u01a2\u00d2\2\u0a26\u0a28\5\u01aa"
			+ "\u00d6\2\u0a27\u0a25\3\2\2\2\u0a27\u0a26\3\2\2\2\u0a28\u01a1\3\2\2\2\u0a29"
			+ "\u0a2a\5\u01a4\u00d3\2\u0a2a\u0a2b\7]\2\2\u0a2b\u0a2c\5\u01a8\u00d5\2"
			+ "\u0a2c\u01a3\3\2\2\2\u0a2d\u0a38\7j\2\2\u0a2e\u0a30\7=\2\2\u0a2f\u0a31"
			+ "\5\u0098M\2\u0a30\u0a2f\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a32\3\2\2"
			+ "\2\u0a32\u0a38\7>\2\2\u0a33\u0a34\7=\2\2\u0a34\u0a35\5\u01a6\u00d4\2\u0a35"
			+ "\u0a36\7>\2\2\u0a36\u0a38\3\2\2\2\u0a37\u0a2d\3\2\2\2\u0a37\u0a2e\3\2"
			+ "\2\2\u0a37\u0a33\3\2\2\2\u0a38\u01a5\3\2\2\2\u0a39\u0a3e\7j\2\2\u0a3a"
			+ "\u0a3b\7D\2\2\u0a3b\u0a3d\7j\2\2\u0a3c\u0a3a\3\2\2\2\u0a3d\u0a40\3\2\2"
			+ "\2\u0a3e\u0a3c\3\2\2\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u01a7\3\2\2\2\u0a40\u0a3e"
			+ "\3\2\2\2\u0a41\u0a44\5\u01a0\u00d1\2\u0a42\u0a44\5\u00fe\u0080\2\u0a43"
			+ "\u0a41\3\2\2\2\u0a43\u0a42\3\2\2\2\u0a44\u01a9\3\2\2\2\u0a45\u0a48\5\u01b2"
			+ "\u00da\2\u0a46\u0a48\5\u01ac\u00d7\2\u0a47\u0a45\3\2\2\2\u0a47\u0a46\3"
			+ "\2\2\2\u0a48\u01ab\3\2\2\2\u0a49\u0a4a\5\u01ae\u00d8\2\u0a4a\u0a4b\5\u01b0"
			+ "\u00d9\2\u0a4b\u0a4c\5\u01a0\u00d1\2\u0a4c\u01ad\3\2\2\2\u0a4d\u0a51\5"
			+ "<\37\2\u0a4e\u0a51\5\u017e\u00c0\2\u0a4f\u0a51\5\u0184\u00c3\2\u0a50\u0a4d"
			+ "\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a4f\3\2\2\2\u0a51\u01af\3\2\2\2\u0a52"
			+ "\u0a53\t\5\2\2\u0a53\u01b1\3\2\2\2\u0a54\u0a5c\5\u01b4\u00db\2\u0a55\u0a56"
			+ "\5\u01b4\u00db\2\u0a56\u0a57\7K\2\2\u0a57\u0a58\5\u01a0\u00d1\2\u0a58"
			+ "\u0a59\7L\2\2\u0a59\u0a5a\5\u01b2\u00da\2\u0a5a\u0a5c\3\2\2\2\u0a5b\u0a54"
			+ "\3\2\2\2\u0a5b\u0a55\3\2\2\2\u0a5c\u01b3\3\2\2\2\u0a5d\u0a5e\b\u00db\1"
			+ "\2\u0a5e\u0a5f\5\u01b6\u00dc\2\u0a5f\u0a65\3\2\2\2\u0a60\u0a61\f\3\2\2"
			+ "\u0a61\u0a62\7R\2\2\u0a62\u0a64\5\u01b6\u00dc\2\u0a63\u0a60\3\2\2\2\u0a64"
			+ "\u0a67\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u01b5\3\2"
			+ "\2\2\u0a67\u0a65\3\2\2\2\u0a68\u0a69\b\u00dc\1\2\u0a69\u0a6a\5\u01b8\u00dd"
			+ "\2\u0a6a\u0a70\3\2\2\2\u0a6b\u0a6c\f\3\2\2\u0a6c\u0a6d\7Q\2\2\u0a6d\u0a6f"
			+ "\5\u01b8\u00dd\2\u0a6e\u0a6b\3\2\2\2\u0a6f\u0a72\3\2\2\2\u0a70\u0a6e\3"
			+ "\2\2\2\u0a70\u0a71\3\2\2\2\u0a71\u01b7\3\2\2\2\u0a72\u0a70\3\2\2\2\u0a73"
			+ "\u0a74\b\u00dd\1\2\u0a74\u0a75\5\u01ba\u00de\2\u0a75\u0a7b\3\2\2\2\u0a76"
			+ "\u0a77\f\3\2\2\u0a77\u0a78\7Z\2\2\u0a78\u0a7a\5\u01ba\u00de\2\u0a79\u0a76"
			+ "\3\2\2\2\u0a7a\u0a7d\3\2\2\2\u0a7b\u0a79\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c"
			+ "\u01b9\3\2\2\2\u0a7d\u0a7b\3\2\2\2\u0a7e\u0a7f\b\u00de\1\2\u0a7f\u0a80"
			+ "\5\u01bc\u00df\2\u0a80\u0a86\3\2\2\2\u0a81\u0a82\f\3\2\2\u0a82\u0a83\7"
			+ "[\2\2\u0a83\u0a85\5\u01bc\u00df\2\u0a84\u0a81\3\2\2\2\u0a85\u0a88\3\2"
			+ "\2\2\u0a86\u0a84\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87\u01bb\3\2\2\2\u0a88"
			+ "\u0a86\3\2\2\2\u0a89\u0a8a\b\u00df\1\2\u0a8a\u0a8b\5\u01be\u00e0\2\u0a8b"
			+ "\u0a91\3\2\2\2\u0a8c\u0a8d\f\3\2\2\u0a8d\u0a8e\7Y\2\2\u0a8e\u0a90\5\u01be"
			+ "\u00e0\2\u0a8f\u0a8c\3\2\2\2\u0a90\u0a93\3\2\2\2\u0a91\u0a8f\3\2\2\2\u0a91"
			+ "\u0a92\3\2\2\2\u0a92\u01bd\3\2\2\2\u0a93\u0a91\3\2\2\2\u0a94\u0a95\b\u00e0"
			+ "\1\2\u0a95\u0a96\5\u01c0\u00e1\2\u0a96\u0a9f\3\2\2\2\u0a97\u0a98\f\4\2"
			+ "\2\u0a98\u0a99\7M\2\2\u0a99\u0a9e\5\u01c0\u00e1\2\u0a9a\u0a9b\f\3\2\2"
			+ "\u0a9b\u0a9c\7P\2\2\u0a9c\u0a9e\5\u01c0\u00e1\2\u0a9d\u0a97\3\2\2\2\u0a9d"
			+ "\u0a9a\3\2\2\2\u0a9e\u0aa1\3\2\2\2\u0a9f\u0a9d\3\2\2\2\u0a9f\u0aa0\3\2"
			+ "\2\2\u0aa0\u01bf\3\2\2\2\u0aa1\u0a9f\3\2\2\2\u0aa2\u0aa3\b\u00e1\1\2\u0aa3"
			+ "\u0aa4\5\u01c2\u00e2\2\u0aa4\u0ab6\3\2\2\2\u0aa5\u0aa6\f\7\2\2\u0aa6\u0aa7"
			+ "\7H\2\2\u0aa7\u0ab5\5\u01c2\u00e2\2\u0aa8\u0aa9\f\6\2\2\u0aa9\u0aaa\7"
			+ "G\2\2\u0aaa\u0ab5\5\u01c2\u00e2\2\u0aab\u0aac\f\5\2\2\u0aac\u0aad\7N\2"
			+ "\2\u0aad\u0ab5\5\u01c2\u00e2\2\u0aae\u0aaf\f\4\2\2\u0aaf\u0ab0\7O\2\2"
			+ "\u0ab0\u0ab5\5\u01c2\u00e2\2\u0ab1\u0ab2\f\3\2\2\u0ab2\u0ab3\7\36\2\2"
			+ "\u0ab3\u0ab5\5\16\b\2\u0ab4\u0aa5\3\2\2\2\u0ab4\u0aa8\3\2\2\2\u0ab4\u0aab"
			+ "\3\2\2\2\u0ab4\u0aae\3\2\2\2\u0ab4\u0ab1\3\2\2\2\u0ab5\u0ab8\3\2\2\2\u0ab6"
			+ "\u0ab4\3\2\2\2\u0ab6\u0ab7\3\2\2\2\u0ab7\u01c1\3\2\2\2\u0ab8\u0ab6\3\2"
			+ "\2\2\u0ab9\u0aba\b\u00e2\1\2\u0aba\u0abb\5\u01c4\u00e3\2\u0abb\u0acb\3"
			+ "\2\2\2\u0abc\u0abd\f\5\2\2\u0abd\u0abe\7H\2\2\u0abe\u0abf\7H\2\2\u0abf"
			+ "\u0aca\5\u01c4\u00e3\2\u0ac0\u0ac1\f\4\2\2\u0ac1\u0ac2\7G\2\2\u0ac2\u0ac3"
			+ "\7G\2\2\u0ac3\u0aca\5\u01c4\u00e3\2\u0ac4\u0ac5\f\3\2\2\u0ac5\u0ac6\7"
			+ "G\2\2\u0ac6\u0ac7\7G\2\2\u0ac7\u0ac8\7G\2\2\u0ac8\u0aca\5\u01c4\u00e3"
			+ "\2\u0ac9\u0abc\3\2\2\2\u0ac9\u0ac0\3\2\2\2\u0ac9\u0ac4\3\2\2\2\u0aca\u0acd"
			+ "\3\2\2\2\u0acb\u0ac9\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u01c3\3\2\2\2\u0acd"
			+ "\u0acb\3\2\2\2\u0ace\u0acf\b\u00e3\1\2\u0acf\u0ad0\5\u01c6\u00e4\2\u0ad0"
			+ "\u0ad9\3\2\2\2\u0ad1\u0ad2\f\4\2\2\u0ad2\u0ad3\7U\2\2\u0ad3\u0ad8\5\u01c6"
			+ "\u00e4\2\u0ad4\u0ad5\f\3\2\2\u0ad5\u0ad6\7V\2\2\u0ad6\u0ad8\5\u01c6\u00e4"
			+ "\2\u0ad7\u0ad1\3\2\2\2\u0ad7\u0ad4\3\2\2\2\u0ad8\u0adb\3\2\2\2\u0ad9\u0ad7"
			+ "\3\2\2\2\u0ad9\u0ada\3\2\2\2\u0ada\u01c5\3\2\2\2\u0adb\u0ad9\3\2\2\2\u0adc"
			+ "\u0add\b\u00e4\1\2\u0add\u0ade\5\u01c8\u00e5\2\u0ade\u0aea\3\2\2\2\u0adf"
			+ "\u0ae0\f\5\2\2\u0ae0\u0ae1\7W\2\2\u0ae1\u0ae9\5\u01c8\u00e5\2\u0ae2\u0ae3"
			+ "\f\4\2\2\u0ae3\u0ae4\7X\2\2\u0ae4\u0ae9\5\u01c8\u00e5\2\u0ae5\u0ae6\f"
			+ "\3\2\2\u0ae6\u0ae7\7\\\2\2\u0ae7\u0ae9\5\u01c8\u00e5\2\u0ae8\u0adf\3\2"
			+ "\2\2\u0ae8\u0ae2\3\2\2\2\u0ae8\u0ae5\3\2\2\2\u0ae9\u0aec\3\2\2\2\u0aea"
			+ "\u0ae8\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u01c7\3\2\2\2\u0aec\u0aea\3\2"
			+ "\2\2\u0aed\u0af5\5\u01ca\u00e6\2\u0aee\u0af5\5\u01cc\u00e7\2\u0aef\u0af0"
			+ "\7U\2\2\u0af0\u0af5\5\u01c8\u00e5\2\u0af1\u0af2\7V\2\2\u0af2\u0af5\5\u01c8"
			+ "\u00e5\2\u0af3\u0af5\5\u01ce\u00e8\2\u0af4\u0aed\3\2\2\2\u0af4\u0aee\3"
			+ "\2\2\2\u0af4\u0aef\3\2\2\2\u0af4\u0af1\3\2\2\2\u0af4\u0af3\3\2\2\2\u0af5"
			+ "\u01c9\3\2\2\2\u0af6\u0af7\7S\2\2\u0af7\u0af8\5\u01c8\u00e5\2\u0af8\u01cb"
			+ "\3\2\2\2\u0af9\u0afa\7T\2\2\u0afa\u0afb\5\u01c8\u00e5\2\u0afb\u01cd\3"
			+ "\2\2\2\u0afc\u0b03\5\u01d0\u00e9\2\u0afd\u0afe\7J\2\2\u0afe\u0b03\5\u01c8"
			+ "\u00e5\2\u0aff\u0b00\7I\2\2\u0b00\u0b03\5\u01c8\u00e5\2\u0b01\u0b03\5"
			+ "\u01da\u00ee\2\u0b02\u0afc\3\2\2\2\u0b02\u0afd\3\2\2\2\u0b02\u0aff\3\2"
			+ "\2\2\u0b02\u0b01\3\2\2\2\u0b03\u01cf\3\2\2\2\u0b04\u0b07\5\u0162\u00b2"
			+ "\2\u0b05\u0b07\5<\37\2\u0b06\u0b04\3\2\2\2\u0b06\u0b05\3\2\2\2\u0b07\u0b0c"
			+ "\3\2\2\2\u0b08\u0b0b\5\u01d4\u00eb\2\u0b09\u0b0b\5\u01d8\u00ed\2\u0b0a"
			+ "\u0b08\3\2\2\2\u0b0a\u0b09\3\2\2\2\u0b0b\u0b0e\3\2\2\2\u0b0c\u0b0a\3\2"
			+ "\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u01d1\3\2\2\2\u0b0e\u0b0c\3\2\2\2\u0b0f"
			+ "\u0b10\5\u01d0\u00e9\2\u0b10\u0b11\7S\2\2\u0b11\u01d3\3\2\2\2\u0b12\u0b13"
			+ "\7S\2\2\u0b13\u01d5\3\2\2\2\u0b14\u0b15\5\u01d0\u00e9\2\u0b15\u0b16\7"
			+ "T\2\2\u0b16\u01d7\3\2\2\2\u0b17\u0b18\7T\2\2\u0b18\u01d9\3\2\2\2\u0b19"
			+ "\u0b1a\7=\2\2\u0b1a\u0b1b\5\6\4\2\u0b1b\u0b1c\7>\2\2\u0b1c\u0b1d\5\u01c8"
			+ "\u00e5\2\u0b1d\u0b35\3\2\2\2\u0b1e\u0b1f\7=\2\2\u0b1f\u0b23\5\16\b\2\u0b20"
			+ "\u0b22\5*\26\2\u0b21\u0b20\3\2\2\2\u0b22\u0b25\3\2\2\2\u0b23\u0b21\3\2"
			+ "\2\2\u0b23\u0b24\3\2\2\2\u0b24\u0b26\3\2\2\2\u0b25\u0b23\3\2\2\2\u0b26"
			+ "\u0b27\7>\2\2\u0b27\u0b28\5\u01ce\u00e8\2\u0b28\u0b35\3\2\2\2\u0b29\u0b2a"
			+ "\7=\2\2\u0b2a\u0b2e\5\16\b\2\u0b2b\u0b2d\5*\26\2\u0b2c\u0b2b\3\2\2\2\u0b2d"
			+ "\u0b30\3\2\2\2\u0b2e\u0b2c\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b31\3\2"
			+ "\2\2\u0b30\u0b2e\3\2\2\2\u0b31\u0b32\7>\2\2\u0b32\u0b33\5\u01a2\u00d2"
			+ "\2\u0b33\u0b35\3\2\2\2\u0b34\u0b19\3\2\2\2\u0b34\u0b1e\3\2\2\2\u0b34\u0b29"
			+ "\3\2\2\2\u0b35\u01db\3\2\2\2\u0b36\u0b3a\7p\2\2\u0b37\u0b39\5\u01de\u00f0"
			+ "\2\u0b38\u0b37\3\2\2\2\u0b39\u0b3c\3\2\2\2\u0b3a\u0b38\3\2\2\2\u0b3a\u0b3b"
			+ "\3\2\2\2\u0b3b\u0b3d\3\2\2\2\u0b3c\u0b3a\3\2\2\2\u0b3d\u0b3e\7q\2\2\u0b3e"
			+ "\u01dd\3\2\2\2\u0b3f\u0b40\7t\2\2\u0b40\u0b41\7y\2\2\u0b41\u0b42\7x\2"
			+ "\2\u0b42\u0b43\7z\2\2\u0b43\u0b44\7u\2\2\u0b44\u0b45\7t\2\2\u0b45\u0b46"
			+ "\5\u01e0\u00f1\2\u0b46\u0b47\7t\2\2\u0b47\u0b48\7u\2\2\u0b48\u0b49\7{"
			+ "\2\2\u0b49\u0b4a\7w\2\2\u0b4a\u01df\3\2\2\2\u0b4b\u0b4e\5\u01e2\u00f2"
			+ "\2\u0b4c\u0b4e\5\u01e4\u00f3\2\u0b4d\u0b4b\3\2\2\2\u0b4d\u0b4c\3\2\2\2"
			+ "\u0b4e\u01e1\3\2\2\2\u0b4f\u0b50\7|\2\2\u0b50\u0b51\7t\2\2\u0b51\u0b52"
			+ "\7y\2\2\u0b52\u0b53\7v\2\2\u0b53\u0b54\7t\2\2\u0b54\u0b55\7v\2\2\u0b55"
			+ "\u0b56\7}\2\2\u0b56\u01e3\3\2\2\2\u0b57\u0b58\7|\2\2\u0b58\u0b59\7t\2"
			+ "\2\u0b59\u0b5a\7z\2\2\u0b5a\u0b5b\7{\2\2\u0b5b\u0b5c\7y\2\2\u0b5c\u0b5d"
			+ "\7v\2\2\u0b5d\u0b5e\7t\2\2\u0b5e\u0b5f\7v\2\2\u0b5f\u0b60\7}\2\2\u0b60"
			+ "\u01e5\3\2\2\2\u0148\u01ea\u01ef\u01f6\u01fa\u01fe\u0207\u020b\u020f\u0211"
			+ "\u0217\u021c\u0223\u0228\u022a\u0230\u0235\u023a\u023f\u024a\u0258\u025d"
			+ "\u0265\u026c\u0272\u0277\u0282\u0285\u0293\u0298\u029d\u02a2\u02a8\u02b2"
			+ "\u02ba\u02c4\u02cc\u02d8\u02dc\u02e1\u02e7\u02ef\u02f8\u0303\u0320\u0324"
			+ "\u0329\u032f\u0332\u0335\u0341\u034c\u035a\u0361\u036a\u0371\u0376\u0385"
			+ "\u038c\u0392\u0396\u039a\u039e\u03a2\u03a7\u03ab\u03af\u03b1\u03b6\u03bd"
			+ "\u03c2\u03c4\u03ca\u03cf\u03d3\u03e6\u03eb\u03fb\u0400\u0406\u040c\u040e"
			+ "\u0412\u0417\u041b\u0422\u0429\u0431\u0434\u0439\u0441\u0446\u044d\u0454"
			+ "\u0459\u045f\u046b\u0470\u0474\u047e\u0483\u048b\u048e\u0493\u049b\u049e"
			+ "\u04a3\u04a8\u04ad\u04b2\u04b9\u04be\u04c6\u04cb\u04d0\u04d5\u04db\u04e1"
			+ "\u04e4\u04e7\u04f0\u04f6\u04fc\u04ff\u0502\u050a\u050f\u0514\u051a\u051d"
			+ "\u0528\u0531\u053b\u0540\u054b\u0550\u055c\u0561\u056d\u0577\u057c\u0584"
			+ "\u0587\u058e\u0596\u059c\u05a5\u05af\u05b3\u05b6\u05bf\u05cd\u05d0\u05d9"
			+ "\u05de\u05e6\u05ed\u05f5\u0601\u0608\u0616\u062c\u064e\u065a\u0660\u066c"
			+ "\u0679\u0693\u0697\u069c\u06a0\u06a4\u06ac\u06b0\u06b4\u06bb\u06c4\u06cc"
			+ "\u06db\u06e7\u06ed\u06f3\u0708\u070d\u0713\u071f\u072a\u0734\u0737\u073c"
			+ "\u0745\u074b\u0755\u075a\u0763\u077a\u0784\u079a\u07a1\u07a9\u07b1\u07bc"
			+ "\u07d3\u07dd\u07e8\u07fe\u0802\u0807\u080f\u0815\u0819\u081d\u0821\u0827"
			+ "\u082c\u0831\u0835\u0839\u083f\u0844\u0849\u084d\u0851\u0853\u0858\u085d"
			+ "\u0862\u0866\u086a\u086e\u0873\u087b\u0881\u0885\u0889\u088d\u0893\u0898"
			+ "\u089d\u08a1\u08a5\u08a7\u08ac\u08bb\u08c9\u08d5\u08de\u08ed\u08fa\u0903"
			+ "\u0909\u0910\u0915\u091c\u0921\u0928\u092d\u0934\u0939\u0941\u0946\u094a"
			+ "\u094e\u0953\u095a\u0961\u0966\u096d\u0972\u0979\u097e\u0986\u098b\u098f"
			+ "\u0996\u099c\u09a3\u09aa\u09b1\u09b9\u09c0\u09c8\u09cc\u09d3\u09da\u09e1"
			+ "\u09e9\u09f0\u09f8\u09fe\u0a04\u0a10\u0a16\u0a1c\u0a27\u0a30\u0a37\u0a3e"
			+ "\u0a43\u0a47\u0a50\u0a5b\u0a65\u0a70\u0a7b\u0a86\u0a91\u0a9d\u0a9f\u0ab4"
			+ "\u0ab6\u0ac9\u0acb\u0ad7\u0ad9\u0ae8\u0aea\u0af4\u0b02\u0b06\u0b0a\u0b0c"
			+ "\u0b23\u0b2e\u0b34\u0b3a\u0b4d";
	public static final String _serializedATN = Utils.join(new String[] {
			_serializedATNSegment0, _serializedATNSegment1 }, "");
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}