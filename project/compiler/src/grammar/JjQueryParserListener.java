package grammar;

// Generated from JjQueryParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JjQueryParser}.
 */
public interface JjQueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#classMemberDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassMemberDeclaration(
			@NotNull JjQueryParser.ClassMemberDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#classMemberDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassMemberDeclaration(
			@NotNull JjQueryParser.ClassMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#statementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStatementNoShortIf(
			@NotNull JjQueryParser.StatementNoShortIfContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#statementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStatementNoShortIf(
			@NotNull JjQueryParser.StatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#annotationTypeElementDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(
			@NotNull JjQueryParser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#annotationTypeElementDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(
			@NotNull JjQueryParser.AnnotationTypeElementDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#methodInvocation_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodInvocation_lf_primary(
			@NotNull JjQueryParser.MethodInvocation_lf_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#methodInvocation_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodInvocation_lf_primary(
			@NotNull JjQueryParser.MethodInvocation_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#annotationTypeBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAnnotationTypeBody(
			@NotNull JjQueryParser.AnnotationTypeBodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#annotationTypeBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAnnotationTypeBody(
			@NotNull JjQueryParser.AnnotationTypeBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#constantModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstantModifier(
			@NotNull JjQueryParser.ConstantModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#constantModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstantModifier(@NotNull JjQueryParser.ConstantModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#lambdaBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLambdaBody(@NotNull JjQueryParser.LambdaBodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#lambdaBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLambdaBody(@NotNull JjQueryParser.LambdaBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#argumentList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArgumentList(@NotNull JjQueryParser.ArgumentListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#argumentList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArgumentList(@NotNull JjQueryParser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#classBodyDeclaration}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassBodyDeclaration(
			@NotNull JjQueryParser.ClassBodyDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#classBodyDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassBodyDeclaration(
			@NotNull JjQueryParser.ClassBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#classInstanceCreationExpression_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(
			@NotNull JjQueryParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#classInstanceCreationExpression_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(
			@NotNull JjQueryParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodSelector}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodSelector(@NotNull JjQueryParser.MethodSelectorContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodSelector}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodSelector(@NotNull JjQueryParser.MethodSelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#unaryExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnaryExpression(@NotNull JjQueryParser.UnaryExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#unaryExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnaryExpression(@NotNull JjQueryParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#classType_lfno_classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(
			@NotNull JjQueryParser.ClassType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#classType_lfno_classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(
			@NotNull JjQueryParser.ClassType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#arrayType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArrayType(@NotNull JjQueryParser.ArrayTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#arrayType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArrayType(@NotNull JjQueryParser.ArrayTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#simpleTypeName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSimpleTypeName(@NotNull JjQueryParser.SimpleTypeNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#simpleTypeName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSimpleTypeName(@NotNull JjQueryParser.SimpleTypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#expressionName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExpressionName(@NotNull JjQueryParser.ExpressionNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#expressionName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExpressionName(@NotNull JjQueryParser.ExpressionNameContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#statementWithoutTrailingSubstatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(
			@NotNull JjQueryParser.StatementWithoutTrailingSubstatementContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#statementWithoutTrailingSubstatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(
			@NotNull JjQueryParser.StatementWithoutTrailingSubstatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#constructorDeclarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstructorDeclarator(
			@NotNull JjQueryParser.ConstructorDeclaratorContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#constructorDeclarator}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstructorDeclarator(
			@NotNull JjQueryParser.ConstructorDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#assertStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAssertStatement(@NotNull JjQueryParser.AssertStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#assertStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAssertStatement(@NotNull JjQueryParser.AssertStatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#arrayCreationExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArrayCreationExpression(
			@NotNull JjQueryParser.ArrayCreationExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#arrayCreationExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArrayCreationExpression(
			@NotNull JjQueryParser.ArrayCreationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#unannArrayType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannArrayType(@NotNull JjQueryParser.UnannArrayTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#unannArrayType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannArrayType(@NotNull JjQueryParser.UnannArrayTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#variableDeclaratorId}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVariableDeclaratorId(
			@NotNull JjQueryParser.VariableDeclaratorIdContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#variableDeclaratorId}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVariableDeclaratorId(
			@NotNull JjQueryParser.VariableDeclaratorIdContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#tryWithResourcesStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTryWithResourcesStatement(
			@NotNull JjQueryParser.TryWithResourcesStatementContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#tryWithResourcesStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTryWithResourcesStatement(
			@NotNull JjQueryParser.TryWithResourcesStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeArguments}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeArguments(@NotNull JjQueryParser.TypeArgumentsContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeArguments}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeArguments(@NotNull JjQueryParser.TypeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#exceptionType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExceptionType(@NotNull JjQueryParser.ExceptionTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#exceptionType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExceptionType(@NotNull JjQueryParser.ExceptionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#exceptionTypeList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExceptionTypeList(
			@NotNull JjQueryParser.ExceptionTypeListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#exceptionTypeList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExceptionTypeList(
			@NotNull JjQueryParser.ExceptionTypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#additiveExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAdditiveExpression(
			@NotNull JjQueryParser.AdditiveExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#additiveExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAdditiveExpression(
			@NotNull JjQueryParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#relationalExpression}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterRelationalExpression(
			@NotNull JjQueryParser.RelationalExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#relationalExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitRelationalExpression(
			@NotNull JjQueryParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#referenceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterReferenceType(@NotNull JjQueryParser.ReferenceTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#referenceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitReferenceType(@NotNull JjQueryParser.ReferenceTypeContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#arrayAccess_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArrayAccess_lf_primary(
			@NotNull JjQueryParser.ArrayAccess_lf_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#arrayAccess_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArrayAccess_lf_primary(
			@NotNull JjQueryParser.ArrayAccess_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#inferredFormalParameterList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInferredFormalParameterList(
			@NotNull JjQueryParser.InferredFormalParameterListContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#inferredFormalParameterList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInferredFormalParameterList(
			@NotNull JjQueryParser.InferredFormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#returnStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterReturnStatement(@NotNull JjQueryParser.ReturnStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#returnStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitReturnStatement(@NotNull JjQueryParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#typeImportOnDemandDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(
			@NotNull JjQueryParser.TypeImportOnDemandDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#typeImportOnDemandDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(
			@NotNull JjQueryParser.TypeImportOnDemandDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeParameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeParameters(@NotNull JjQueryParser.TypeParametersContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeParameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeParameters(@NotNull JjQueryParser.TypeParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#lastFormalParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLastFormalParameter(
			@NotNull JjQueryParser.LastFormalParameterContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#lastFormalParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLastFormalParameter(
			@NotNull JjQueryParser.LastFormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#literal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLiteral(@NotNull JjQueryParser.LiteralContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#literal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLiteral(@NotNull JjQueryParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#result}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterResult(@NotNull JjQueryParser.ResultContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#result}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitResult(@NotNull JjQueryParser.ResultContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#fieldAccess_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFieldAccess_lfno_primary(
			@NotNull JjQueryParser.FieldAccess_lfno_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#fieldAccess_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFieldAccess_lfno_primary(
			@NotNull JjQueryParser.FieldAccess_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#variableDeclarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVariableDeclarator(
			@NotNull JjQueryParser.VariableDeclaratorContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#variableDeclarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVariableDeclarator(
			@NotNull JjQueryParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#finally_}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFinally_(@NotNull JjQueryParser.Finally_Context ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#finally_}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFinally_(@NotNull JjQueryParser.Finally_Context ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#classBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassBody(@NotNull JjQueryParser.ClassBodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#classBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassBody(@NotNull JjQueryParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#enumDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnumDeclaration(@NotNull JjQueryParser.EnumDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#enumDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnumDeclaration(@NotNull JjQueryParser.EnumDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#constantDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstantDeclaration(
			@NotNull JjQueryParser.ConstantDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#constantDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstantDeclaration(
			@NotNull JjQueryParser.ConstantDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#postfixExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPostfixExpression(
			@NotNull JjQueryParser.PostfixExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#postfixExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPostfixExpression(
			@NotNull JjQueryParser.PostfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#annotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAnnotation(@NotNull JjQueryParser.AnnotationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#annotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAnnotation(@NotNull JjQueryParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#variableInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVariableInitializer(
			@NotNull JjQueryParser.VariableInitializerContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#variableInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVariableInitializer(
			@NotNull JjQueryParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#staticImportOnDemandDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(
			@NotNull JjQueryParser.StaticImportOnDemandDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#staticImportOnDemandDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(
			@NotNull JjQueryParser.StaticImportOnDemandDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExpression(@NotNull JjQueryParser.ExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExpression(@NotNull JjQueryParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#throwStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterThrowStatement(@NotNull JjQueryParser.ThrowStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#throwStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitThrowStatement(@NotNull JjQueryParser.ThrowStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodInvocation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodInvocation(
			@NotNull JjQueryParser.MethodInvocationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodInvocation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodInvocation(@NotNull JjQueryParser.MethodInvocationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#singleStaticImportDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSingleStaticImportDeclaration(
			@NotNull JjQueryParser.SingleStaticImportDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#singleStaticImportDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSingleStaticImportDeclaration(
			@NotNull JjQueryParser.SingleStaticImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#lambdaParameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLambdaParameters(
			@NotNull JjQueryParser.LambdaParametersContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#lambdaParameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLambdaParameters(@NotNull JjQueryParser.LambdaParametersContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#conditionalAndExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConditionalAndExpression(
			@NotNull JjQueryParser.ConditionalAndExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#conditionalAndExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConditionalAndExpression(
			@NotNull JjQueryParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#multiplicativeExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMultiplicativeExpression(
			@NotNull JjQueryParser.MultiplicativeExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#multiplicativeExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMultiplicativeExpression(
			@NotNull JjQueryParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#packageModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPackageModifier(@NotNull JjQueryParser.PackageModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#packageModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPackageModifier(@NotNull JjQueryParser.PackageModifierContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#constructorDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstructorDeclaration(
			@NotNull JjQueryParser.ConstructorDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#constructorDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstructorDeclaration(
			@NotNull JjQueryParser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lfno_arrayAccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(
			@NotNull JjQueryParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lfno_arrayAccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(
			@NotNull JjQueryParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#unannTypeVariable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannTypeVariable(
			@NotNull JjQueryParser.UnannTypeVariableContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#unannTypeVariable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannTypeVariable(
			@NotNull JjQueryParser.UnannTypeVariableContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#normalInterfaceDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNormalInterfaceDeclaration(
			@NotNull JjQueryParser.NormalInterfaceDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#normalInterfaceDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNormalInterfaceDeclaration(
			@NotNull JjQueryParser.NormalInterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#interfaceType_lfno_classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(
			@NotNull JjQueryParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#interfaceType_lfno_classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(
			@NotNull JjQueryParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#constructorModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstructorModifier(
			@NotNull JjQueryParser.ConstructorModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#constructorModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstructorModifier(
			@NotNull JjQueryParser.ConstructorModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#enumConstantName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnumConstantName(
			@NotNull JjQueryParser.EnumConstantNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#enumConstantName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnumConstantName(@NotNull JjQueryParser.EnumConstantNameContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#classInstanceCreationExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassInstanceCreationExpression(
			@NotNull JjQueryParser.ClassInstanceCreationExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#classInstanceCreationExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassInstanceCreationExpression(
			@NotNull JjQueryParser.ClassInstanceCreationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodDeclarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodDeclarator(
			@NotNull JjQueryParser.MethodDeclaratorContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodDeclarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodDeclarator(@NotNull JjQueryParser.MethodDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#attributeSelector}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAttributeSelector(
			@NotNull JjQueryParser.AttributeSelectorContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#attributeSelector}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAttributeSelector(
			@NotNull JjQueryParser.AttributeSelectorContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#annotationTypeMemberDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(
			@NotNull JjQueryParser.AnnotationTypeMemberDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#annotationTypeMemberDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(
			@NotNull JjQueryParser.AnnotationTypeMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#preDecrementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPreDecrementExpression(
			@NotNull JjQueryParser.PreDecrementExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#preDecrementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPreDecrementExpression(
			@NotNull JjQueryParser.PreDecrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#variableInitializerList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVariableInitializerList(
			@NotNull JjQueryParser.VariableInitializerListContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#variableInitializerList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVariableInitializerList(
			@NotNull JjQueryParser.VariableInitializerListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#extendsInterfaces}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExtendsInterfaces(
			@NotNull JjQueryParser.ExtendsInterfacesContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#extendsInterfaces}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExtendsInterfaces(
			@NotNull JjQueryParser.ExtendsInterfacesContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#elementValue}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterElementValue(@NotNull JjQueryParser.ElementValueContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#elementValue}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitElementValue(@NotNull JjQueryParser.ElementValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#arrayInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArrayInitializer(
			@NotNull JjQueryParser.ArrayInitializerContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#arrayInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArrayInitializer(@NotNull JjQueryParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#arrayAccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArrayAccess(@NotNull JjQueryParser.ArrayAccessContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#arrayAccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArrayAccess(@NotNull JjQueryParser.ArrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodModifier(@NotNull JjQueryParser.MethodModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodModifier(@NotNull JjQueryParser.MethodModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#unannClassType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannClassType(@NotNull JjQueryParser.UnannClassTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#unannClassType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannClassType(@NotNull JjQueryParser.UnannClassTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#lambdaExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLambdaExpression(
			@NotNull JjQueryParser.LambdaExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#lambdaExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLambdaExpression(@NotNull JjQueryParser.LambdaExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#assignmentExpression}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAssignmentExpression(
			@NotNull JjQueryParser.AssignmentExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#assignmentExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAssignmentExpression(
			@NotNull JjQueryParser.AssignmentExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeParameterList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeParameterList(
			@NotNull JjQueryParser.TypeParameterListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeParameterList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeParameterList(
			@NotNull JjQueryParser.TypeParameterListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#normalClassDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNormalClassDeclaration(
			@NotNull JjQueryParser.NormalClassDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#normalClassDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNormalClassDeclaration(
			@NotNull JjQueryParser.NormalClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#formalParameterList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFormalParameterList(
			@NotNull JjQueryParser.FormalParameterListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#formalParameterList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFormalParameterList(
			@NotNull JjQueryParser.FormalParameterListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#enhancedForStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(
			@NotNull JjQueryParser.EnhancedForStatementNoShortIfContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#enhancedForStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(
			@NotNull JjQueryParser.EnhancedForStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#annotationTypeDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAnnotationTypeDeclaration(
			@NotNull JjQueryParser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#annotationTypeDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAnnotationTypeDeclaration(
			@NotNull JjQueryParser.AnnotationTypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#compilationUnit}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCompilationUnit(@NotNull JjQueryParser.CompilationUnitContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#compilationUnit}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCompilationUnit(@NotNull JjQueryParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#wildcardBounds}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterWildcardBounds(@NotNull JjQueryParser.WildcardBoundsContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#wildcardBounds}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitWildcardBounds(@NotNull JjQueryParser.WildcardBoundsContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lf_arrayAccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(
			@NotNull JjQueryParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lf_arrayAccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(
			@NotNull JjQueryParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#enhancedForStatement}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnhancedForStatement(
			@NotNull JjQueryParser.EnhancedForStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#enhancedForStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnhancedForStatement(
			@NotNull JjQueryParser.EnhancedForStatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#switchBlockStatementGroup}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSwitchBlockStatementGroup(
			@NotNull JjQueryParser.SwitchBlockStatementGroupContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#switchBlockStatementGroup}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSwitchBlockStatementGroup(
			@NotNull JjQueryParser.SwitchBlockStatementGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeVariable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeVariable(@NotNull JjQueryParser.TypeVariableContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeVariable}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeVariable(@NotNull JjQueryParser.TypeVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeParameter(@NotNull JjQueryParser.TypeParameterContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeParameter(@NotNull JjQueryParser.TypeParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodDeclaration(
			@NotNull JjQueryParser.MethodDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodDeclaration(
			@NotNull JjQueryParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#interfaceBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceBody(@NotNull JjQueryParser.InterfaceBodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#interfaceBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceBody(@NotNull JjQueryParser.InterfaceBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodBody(@NotNull JjQueryParser.MethodBodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodBody(@NotNull JjQueryParser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#dims}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterDims(@NotNull JjQueryParser.DimsContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#dims}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitDims(@NotNull JjQueryParser.DimsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeArgument}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeArgument(@NotNull JjQueryParser.TypeArgumentContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeArgument}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeArgument(@NotNull JjQueryParser.TypeArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#unannPrimitiveType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannPrimitiveType(
			@NotNull JjQueryParser.UnannPrimitiveTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#unannPrimitiveType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannPrimitiveType(
			@NotNull JjQueryParser.UnannPrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#explicitConstructorInvocation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExplicitConstructorInvocation(
			@NotNull JjQueryParser.ExplicitConstructorInvocationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#explicitConstructorInvocation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExplicitConstructorInvocation(
			@NotNull JjQueryParser.ExplicitConstructorInvocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#enumBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnumBody(@NotNull JjQueryParser.EnumBodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#enumBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnumBody(@NotNull JjQueryParser.EnumBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#additionalBound}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAdditionalBound(@NotNull JjQueryParser.AdditionalBoundContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#additionalBound}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAdditionalBound(@NotNull JjQueryParser.AdditionalBoundContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lfno_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannClassOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#ifThenStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterIfThenStatement(@NotNull JjQueryParser.IfThenStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#ifThenStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitIfThenStatement(@NotNull JjQueryParser.IfThenStatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#postDecrementExpression_lf_postfixExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(
			@NotNull JjQueryParser.PostDecrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#postDecrementExpression_lf_postfixExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(
			@NotNull JjQueryParser.PostDecrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#interfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceType(@NotNull JjQueryParser.InterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#interfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceType(@NotNull JjQueryParser.InterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#methodReference_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodReference_lf_primary(
			@NotNull JjQueryParser.MethodReference_lf_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#methodReference_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodReference_lf_primary(
			@NotNull JjQueryParser.MethodReference_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#andExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAndExpression(@NotNull JjQueryParser.AndExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#andExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAndExpression(@NotNull JjQueryParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#enumConstantModifier}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnumConstantModifier(
			@NotNull JjQueryParser.EnumConstantModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#enumConstantModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnumConstantModifier(
			@NotNull JjQueryParser.EnumConstantModifierContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStatement(@NotNull JjQueryParser.StatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStatement(@NotNull JjQueryParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#selector}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSelector(@NotNull JjQueryParser.SelectorContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#selector}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSelector(@NotNull JjQueryParser.SelectorContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#fieldModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFieldModifier(@NotNull JjQueryParser.FieldModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#fieldModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFieldModifier(@NotNull JjQueryParser.FieldModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#markerAnnotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMarkerAnnotation(
			@NotNull JjQueryParser.MarkerAnnotationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#markerAnnotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMarkerAnnotation(@NotNull JjQueryParser.MarkerAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#resourceList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterResourceList(@NotNull JjQueryParser.ResourceListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#resourceList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitResourceList(@NotNull JjQueryParser.ResourceListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#arrayAccess_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterArrayAccess_lfno_primary(
			@NotNull JjQueryParser.ArrayAccess_lfno_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#arrayAccess_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitArrayAccess_lfno_primary(
			@NotNull JjQueryParser.ArrayAccess_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#staticInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStaticInitializer(
			@NotNull JjQueryParser.StaticInitializerContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#staticInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStaticInitializer(
			@NotNull JjQueryParser.StaticInitializerContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#conditionalExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConditionalExpression(
			@NotNull JjQueryParser.ConditionalExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#conditionalExpression}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConditionalExpression(
			@NotNull JjQueryParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#fieldDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFieldDeclaration(
			@NotNull JjQueryParser.FieldDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#fieldDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFieldDeclaration(@NotNull JjQueryParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#leftHandSide}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLeftHandSide(@NotNull JjQueryParser.LeftHandSideContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#leftHandSide}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLeftHandSide(@NotNull JjQueryParser.LeftHandSideContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#basicForStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBasicForStatement(
			@NotNull JjQueryParser.BasicForStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#basicForStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBasicForStatement(
			@NotNull JjQueryParser.BasicForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#whileStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterWhileStatement(@NotNull JjQueryParser.WhileStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#whileStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitWhileStatement(@NotNull JjQueryParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#packageDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPackageDeclaration(
			@NotNull JjQueryParser.PackageDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#packageDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPackageDeclaration(
			@NotNull JjQueryParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#localVariableDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLocalVariableDeclaration(
			@NotNull JjQueryParser.LocalVariableDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#localVariableDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLocalVariableDeclaration(
			@NotNull JjQueryParser.LocalVariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#superinterfaces}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSuperinterfaces(@NotNull JjQueryParser.SuperinterfacesContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#superinterfaces}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSuperinterfaces(@NotNull JjQueryParser.SuperinterfacesContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#interfaceMemberDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceMemberDeclaration(
			@NotNull JjQueryParser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#interfaceMemberDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceMemberDeclaration(
			@NotNull JjQueryParser.InterfaceMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#classInstanceCreationExpression_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(
			@NotNull JjQueryParser.ClassInstanceCreationExpression_lf_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#classInstanceCreationExpression_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(
			@NotNull JjQueryParser.ClassInstanceCreationExpression_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#switchBlock}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSwitchBlock(@NotNull JjQueryParser.SwitchBlockContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#switchBlock}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSwitchBlock(@NotNull JjQueryParser.SwitchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#forInit}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterForInit(@NotNull JjQueryParser.ForInitContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#forInit}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitForInit(@NotNull JjQueryParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#blockStatements}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBlockStatements(@NotNull JjQueryParser.BlockStatementsContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#blockStatements}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBlockStatements(@NotNull JjQueryParser.BlockStatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#formalParameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFormalParameters(
			@NotNull JjQueryParser.FormalParametersContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#formalParameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFormalParameters(@NotNull JjQueryParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#typeArgumentsOrDiamond}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeArgumentsOrDiamond(
			@NotNull JjQueryParser.TypeArgumentsOrDiamondContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#typeArgumentsOrDiamond}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeArgumentsOrDiamond(
			@NotNull JjQueryParser.TypeArgumentsOrDiamondContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#assign}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAssign(@NotNull JjQueryParser.AssignContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#assign}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAssign(@NotNull JjQueryParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#defaultValue}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterDefaultValue(@NotNull JjQueryParser.DefaultValueContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#defaultValue}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitDefaultValue(@NotNull JjQueryParser.DefaultValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterType(@NotNull JjQueryParser.TypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitType(@NotNull JjQueryParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#elementValuePairList}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterElementValuePairList(
			@NotNull JjQueryParser.ElementValuePairListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#elementValuePairList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitElementValuePairList(
			@NotNull JjQueryParser.ElementValuePairListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#synchronizedStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSynchronizedStatement(
			@NotNull JjQueryParser.SynchronizedStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#synchronizedStatement}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSynchronizedStatement(
			@NotNull JjQueryParser.SynchronizedStatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#superclass}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSuperclass(@NotNull JjQueryParser.SuperclassContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#superclass}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSuperclass(@NotNull JjQueryParser.SuperclassContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#block}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBlock(@NotNull JjQueryParser.BlockContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#block}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBlock(@NotNull JjQueryParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#expressionStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExpressionStatement(
			@NotNull JjQueryParser.ExpressionStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#expressionStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExpressionStatement(
			@NotNull JjQueryParser.ExpressionStatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#preIncrementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPreIncrementExpression(
			@NotNull JjQueryParser.PreIncrementExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#preIncrementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPreIncrementExpression(
			@NotNull JjQueryParser.PreIncrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#enumBodyDeclarations}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnumBodyDeclarations(
			@NotNull JjQueryParser.EnumBodyDeclarationsContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#enumBodyDeclarations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnumBodyDeclarations(
			@NotNull JjQueryParser.EnumBodyDeclarationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#dimExprs}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterDimExprs(@NotNull JjQueryParser.DimExprsContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#dimExprs}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitDimExprs(@NotNull JjQueryParser.DimExprsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#forUpdate}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterForUpdate(@NotNull JjQueryParser.ForUpdateContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#forUpdate}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitForUpdate(@NotNull JjQueryParser.ForUpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#emptyStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEmptyStatement(@NotNull JjQueryParser.EmptyStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#emptyStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEmptyStatement(@NotNull JjQueryParser.EmptyStatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lf_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#annotationTypeElementModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAnnotationTypeElementModifier(
			@NotNull JjQueryParser.AnnotationTypeElementModifierContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#annotationTypeElementModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAnnotationTypeElementModifier(
			@NotNull JjQueryParser.AnnotationTypeElementModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#shiftExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterShiftExpression(@NotNull JjQueryParser.ShiftExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#shiftExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitShiftExpression(@NotNull JjQueryParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#fieldAccess_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFieldAccess_lf_primary(
			@NotNull JjQueryParser.FieldAccess_lf_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#fieldAccess_lf_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFieldAccess_lf_primary(
			@NotNull JjQueryParser.FieldAccess_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#instanceInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInstanceInitializer(
			@NotNull JjQueryParser.InstanceInitializerContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#instanceInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInstanceInitializer(
			@NotNull JjQueryParser.InstanceInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#unannType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannType(@NotNull JjQueryParser.UnannTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#unannType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannType(@NotNull JjQueryParser.UnannTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#integralType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterIntegralType(@NotNull JjQueryParser.IntegralTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#integralType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitIntegralType(@NotNull JjQueryParser.IntegralTypeContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#postIncrementExpression_lf_postfixExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(
			@NotNull JjQueryParser.PostIncrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#postIncrementExpression_lf_postfixExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(
			@NotNull JjQueryParser.PostIncrementExpression_lf_postfixExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#classOrInterfaceType}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassOrInterfaceType(
			@NotNull JjQueryParser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassOrInterfaceType(
			@NotNull JjQueryParser.ClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#equalityExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEqualityExpression(
			@NotNull JjQueryParser.EqualityExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#equalityExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEqualityExpression(
			@NotNull JjQueryParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#normalAnnotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNormalAnnotation(
			@NotNull JjQueryParser.NormalAnnotationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#normalAnnotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNormalAnnotation(@NotNull JjQueryParser.NormalAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeBound}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeBound(@NotNull JjQueryParser.TypeBoundContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeBound}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeBound(@NotNull JjQueryParser.TypeBoundContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimary(@NotNull JjQueryParser.PrimaryContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimary(@NotNull JjQueryParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#classModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassModifier(@NotNull JjQueryParser.ClassModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#classModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassModifier(@NotNull JjQueryParser.ClassModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#fieldAccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFieldAccess(@NotNull JjQueryParser.FieldAccessContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#fieldAccess}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFieldAccess(@NotNull JjQueryParser.FieldAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeName(@NotNull JjQueryParser.TypeNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeName(@NotNull JjQueryParser.TypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#constructorBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstructorBody(@NotNull JjQueryParser.ConstructorBodyContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#constructorBody}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstructorBody(@NotNull JjQueryParser.ConstructorBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#catchClause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCatchClause(@NotNull JjQueryParser.CatchClauseContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#catchClause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCatchClause(@NotNull JjQueryParser.CatchClauseContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(
			@NotNull JjQueryParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#labeledStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLabeledStatement(
			@NotNull JjQueryParser.LabeledStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#labeledStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLabeledStatement(@NotNull JjQueryParser.LabeledStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#switchLabels}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSwitchLabels(@NotNull JjQueryParser.SwitchLabelsContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#switchLabels}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSwitchLabels(@NotNull JjQueryParser.SwitchLabelsContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#formalParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFormalParameter(@NotNull JjQueryParser.FormalParameterContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#formalParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFormalParameter(@NotNull JjQueryParser.FormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#interfaceType_lf_classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(
			@NotNull JjQueryParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#interfaceType_lf_classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(
			@NotNull JjQueryParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#singleTypeImportDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSingleTypeImportDeclaration(
			@NotNull JjQueryParser.SingleTypeImportDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#singleTypeImportDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSingleTypeImportDeclaration(
			@NotNull JjQueryParser.SingleTypeImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#singleElementAnnotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSingleElementAnnotation(
			@NotNull JjQueryParser.SingleElementAnnotationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#singleElementAnnotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSingleElementAnnotation(
			@NotNull JjQueryParser.SingleElementAnnotationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#elementValueArrayInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterElementValueArrayInitializer(
			@NotNull JjQueryParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#elementValueArrayInitializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitElementValueArrayInitializer(
			@NotNull JjQueryParser.ElementValueArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#constantExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConstantExpression(
			@NotNull JjQueryParser.ConstantExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#constantExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConstantExpression(
			@NotNull JjQueryParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#forStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterForStatement(@NotNull JjQueryParser.ForStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#forStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitForStatement(@NotNull JjQueryParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeArgumentList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeArgumentList(
			@NotNull JjQueryParser.TypeArgumentListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeArgumentList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeArgumentList(@NotNull JjQueryParser.TypeArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#postDecrementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPostDecrementExpression(
			@NotNull JjQueryParser.PostDecrementExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#postDecrementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPostDecrementExpression(
			@NotNull JjQueryParser.PostDecrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#receiverParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterReceiverParameter(
			@NotNull JjQueryParser.ReceiverParameterContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#receiverParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitReceiverParameter(
			@NotNull JjQueryParser.ReceiverParameterContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#whileStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterWhileStatementNoShortIf(
			@NotNull JjQueryParser.WhileStatementNoShortIfContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#whileStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitWhileStatementNoShortIf(
			@NotNull JjQueryParser.WhileStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#enumConstantList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnumConstantList(
			@NotNull JjQueryParser.EnumConstantListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#enumConstantList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnumConstantList(@NotNull JjQueryParser.EnumConstantListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#doStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterDoStatement(@NotNull JjQueryParser.DoStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#doStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitDoStatement(@NotNull JjQueryParser.DoStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#catchType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCatchType(@NotNull JjQueryParser.CatchTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#catchType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCatchType(@NotNull JjQueryParser.CatchTypeContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#forStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterForStatementNoShortIf(
			@NotNull JjQueryParser.ForStatementNoShortIfContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#forStatementNoShortIf}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitForStatementNoShortIf(
			@NotNull JjQueryParser.ForStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#ifThenElseStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterIfThenElseStatement(
			@NotNull JjQueryParser.IfThenElseStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#ifThenElseStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitIfThenElseStatement(
			@NotNull JjQueryParser.IfThenElseStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#assignmentOperator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAssignmentOperator(
			@NotNull JjQueryParser.AssignmentOperatorContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#assignmentOperator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAssignmentOperator(
			@NotNull JjQueryParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#labeledStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLabeledStatementNoShortIf(
			@NotNull JjQueryParser.LabeledStatementNoShortIfContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#labeledStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLabeledStatementNoShortIf(
			@NotNull JjQueryParser.LabeledStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#catches}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCatches(@NotNull JjQueryParser.CatchesContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#catches}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCatches(@NotNull JjQueryParser.CatchesContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#methodReference_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodReference_lfno_primary(
			@NotNull JjQueryParser.MethodReference_lfno_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#methodReference_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodReference_lfno_primary(
			@NotNull JjQueryParser.MethodReference_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#variableDeclaratorList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVariableDeclaratorList(
			@NotNull JjQueryParser.VariableDeclaratorListContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#variableDeclaratorList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVariableDeclaratorList(
			@NotNull JjQueryParser.VariableDeclaratorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#variableModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterVariableModifier(
			@NotNull JjQueryParser.VariableModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#variableModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitVariableModifier(@NotNull JjQueryParser.VariableModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#castExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCastExpression(@NotNull JjQueryParser.CastExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#castExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCastExpression(@NotNull JjQueryParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#conditionalOrExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterConditionalOrExpression(
			@NotNull JjQueryParser.ConditionalOrExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#conditionalOrExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitConditionalOrExpression(
			@NotNull JjQueryParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#typeParameterModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeParameterModifier(
			@NotNull JjQueryParser.TypeParameterModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeParameterModifier}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeParameterModifier(
			@NotNull JjQueryParser.TypeParameterModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#elementValuePair}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterElementValuePair(
			@NotNull JjQueryParser.ElementValuePairContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#elementValuePair}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitElementValuePair(@NotNull JjQueryParser.ElementValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#floatingPointType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterFloatingPointType(
			@NotNull JjQueryParser.FloatingPointTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#floatingPointType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitFloatingPointType(
			@NotNull JjQueryParser.FloatingPointTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#dimExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterDimExpr(@NotNull JjQueryParser.DimExprContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#dimExpr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitDimExpr(@NotNull JjQueryParser.DimExprContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(
			@NotNull JjQueryParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#resource}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterResource(@NotNull JjQueryParser.ResourceContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#resource}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitResource(@NotNull JjQueryParser.ResourceContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#inclusiveOrExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInclusiveOrExpression(
			@NotNull JjQueryParser.InclusiveOrExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#inclusiveOrExpression}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInclusiveOrExpression(
			@NotNull JjQueryParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#interfaceMethodModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceMethodModifier(
			@NotNull JjQueryParser.InterfaceMethodModifierContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#interfaceMethodModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceMethodModifier(
			@NotNull JjQueryParser.InterfaceMethodModifierContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#resourceSpecification}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterResourceSpecification(
			@NotNull JjQueryParser.ResourceSpecificationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#resourceSpecification}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitResourceSpecification(
			@NotNull JjQueryParser.ResourceSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#interfaceTypeList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceTypeList(
			@NotNull JjQueryParser.InterfaceTypeListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#interfaceTypeList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceTypeList(
			@NotNull JjQueryParser.InterfaceTypeListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#ifThenElseStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(
			@NotNull JjQueryParser.IfThenElseStatementNoShortIfContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#ifThenElseStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(
			@NotNull JjQueryParser.IfThenElseStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#unannInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannInterfaceType(
			@NotNull JjQueryParser.UnannInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#unannInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannInterfaceType(
			@NotNull JjQueryParser.UnannInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#interfaceModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceModifier(
			@NotNull JjQueryParser.InterfaceModifierContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#interfaceModifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceModifier(
			@NotNull JjQueryParser.InterfaceModifierContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#exclusiveOrExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterExclusiveOrExpression(
			@NotNull JjQueryParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#exclusiveOrExpression}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitExclusiveOrExpression(
			@NotNull JjQueryParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#classType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassType(@NotNull JjQueryParser.ClassTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#classType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassType(@NotNull JjQueryParser.ClassTypeContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#postIncrementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPostIncrementExpression(
			@NotNull JjQueryParser.PostIncrementExpressionContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#postIncrementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPostIncrementExpression(
			@NotNull JjQueryParser.PostIncrementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#tryStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTryStatement(@NotNull JjQueryParser.TryStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#tryStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTryStatement(@NotNull JjQueryParser.TryStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#elementValueList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterElementValueList(
			@NotNull JjQueryParser.ElementValueListContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#elementValueList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitElementValueList(@NotNull JjQueryParser.ElementValueListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#basicForStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBasicForStatementNoShortIf(
			@NotNull JjQueryParser.BasicForStatementNoShortIfContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#basicForStatementNoShortIf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBasicForStatementNoShortIf(
			@NotNull JjQueryParser.BasicForStatementNoShortIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#typeDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterTypeDeclaration(@NotNull JjQueryParser.TypeDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#typeDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitTypeDeclaration(@NotNull JjQueryParser.TypeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#switchStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSwitchStatement(@NotNull JjQueryParser.SwitchStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#switchStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSwitchStatement(@NotNull JjQueryParser.SwitchStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#wildcard}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterWildcard(@NotNull JjQueryParser.WildcardContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#wildcard}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitWildcard(@NotNull JjQueryParser.WildcardContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#classDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassDeclaration(
			@NotNull JjQueryParser.ClassDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#classDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassDeclaration(@NotNull JjQueryParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#unaryExpressionNotPlusMinus}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(
			@NotNull JjQueryParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#unaryExpressionNotPlusMinus}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(
			@NotNull JjQueryParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#unannReferenceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterUnannReferenceType(
			@NotNull JjQueryParser.UnannReferenceTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#unannReferenceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitUnannReferenceType(
			@NotNull JjQueryParser.UnannReferenceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodHeader}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodHeader(@NotNull JjQueryParser.MethodHeaderContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodHeader}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodHeader(@NotNull JjQueryParser.MethodHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#catchFormalParameter}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterCatchFormalParameter(
			@NotNull JjQueryParser.CatchFormalParameterContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#catchFormalParameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitCatchFormalParameter(
			@NotNull JjQueryParser.CatchFormalParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#enumConstant}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterEnumConstant(@NotNull JjQueryParser.EnumConstantContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#enumConstant}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitEnumConstant(@NotNull JjQueryParser.EnumConstantContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#methodInvocation_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodInvocation_lfno_primary(
			@NotNull JjQueryParser.MethodInvocation_lfno_primaryContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#methodInvocation_lfno_primary}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodInvocation_lfno_primary(
			@NotNull JjQueryParser.MethodInvocation_lfno_primaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#packageName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPackageName(@NotNull JjQueryParser.PackageNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#packageName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPackageName(@NotNull JjQueryParser.PackageNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#importDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterImportDeclaration(
			@NotNull JjQueryParser.ImportDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#importDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitImportDeclaration(
			@NotNull JjQueryParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#primitiveType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimitiveType(@NotNull JjQueryParser.PrimitiveTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#primitiveType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimitiveType(@NotNull JjQueryParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#interfaceDeclaration}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceDeclaration(
			@NotNull JjQueryParser.InterfaceDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#interfaceDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceDeclaration(
			@NotNull JjQueryParser.InterfaceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#localVariableDeclarationStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterLocalVariableDeclarationStatement(
			@NotNull JjQueryParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#localVariableDeclarationStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitLocalVariableDeclarationStatement(
			@NotNull JjQueryParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#blockStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBlockStatement(@NotNull JjQueryParser.BlockStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#blockStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBlockStatement(@NotNull JjQueryParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#classType_lf_classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(
			@NotNull JjQueryParser.ClassType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#classType_lf_classOrInterfaceType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(
			@NotNull JjQueryParser.ClassType_lf_classOrInterfaceTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#packageOrTypeName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPackageOrTypeName(
			@NotNull JjQueryParser.PackageOrTypeNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#packageOrTypeName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPackageOrTypeName(
			@NotNull JjQueryParser.PackageOrTypeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#assignment}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAssignment(@NotNull JjQueryParser.AssignmentContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#assignment}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAssignment(@NotNull JjQueryParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodName(@NotNull JjQueryParser.MethodNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodName(@NotNull JjQueryParser.MethodNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#statementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStatementExpression(
			@NotNull JjQueryParser.StatementExpressionContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#statementExpression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStatementExpression(
			@NotNull JjQueryParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#breakStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterBreakStatement(@NotNull JjQueryParser.BreakStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#breakStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitBreakStatement(@NotNull JjQueryParser.BreakStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#ambiguousName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterAmbiguousName(@NotNull JjQueryParser.AmbiguousNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#ambiguousName}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitAmbiguousName(@NotNull JjQueryParser.AmbiguousNameContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#statementExpressionList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterStatementExpressionList(
			@NotNull JjQueryParser.StatementExpressionListContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#statementExpressionList}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitStatementExpressionList(
			@NotNull JjQueryParser.StatementExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by
	 * {@link JjQueryParser#interfaceMethodDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterInterfaceMethodDeclaration(
			@NotNull JjQueryParser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Exit a parse tree produced by
	 * {@link JjQueryParser#interfaceMethodDeclaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitInterfaceMethodDeclaration(
			@NotNull JjQueryParser.InterfaceMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#jQuery}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterJQuery(@NotNull JjQueryParser.JQueryContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#jQuery}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitJQuery(@NotNull JjQueryParser.JQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#throws_}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterThrows_(@NotNull JjQueryParser.Throws_Context ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#throws_}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitThrows_(@NotNull JjQueryParser.Throws_Context ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#switchLabel}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterSwitchLabel(@NotNull JjQueryParser.SwitchLabelContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#switchLabel}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitSwitchLabel(@NotNull JjQueryParser.SwitchLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#methodReference}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterMethodReference(@NotNull JjQueryParser.MethodReferenceContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#methodReference}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitMethodReference(@NotNull JjQueryParser.MethodReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#primaryNoNewArray}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterPrimaryNoNewArray(
			@NotNull JjQueryParser.PrimaryNoNewArrayContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#primaryNoNewArray}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitPrimaryNoNewArray(
			@NotNull JjQueryParser.PrimaryNoNewArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#numericType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterNumericType(@NotNull JjQueryParser.NumericTypeContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#numericType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitNumericType(@NotNull JjQueryParser.NumericTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link JjQueryParser#continueStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void enterContinueStatement(
			@NotNull JjQueryParser.ContinueStatementContext ctx);

	/**
	 * Exit a parse tree produced by {@link JjQueryParser#continueStatement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 */
	void exitContinueStatement(
			@NotNull JjQueryParser.ContinueStatementContext ctx);
}