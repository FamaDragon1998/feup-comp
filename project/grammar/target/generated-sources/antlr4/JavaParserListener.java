// Generated from JavaParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParserParser}.
 */
public interface JavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull JavaParserParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull JavaParserParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull JavaParserParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull JavaParserParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull JavaParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull JavaParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull JavaParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull JavaParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull JavaParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull JavaParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(@NotNull JavaParserParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(@NotNull JavaParserParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull JavaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull JavaParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull JavaParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull JavaParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull JavaParserParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull JavaParserParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull JavaParserParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull JavaParserParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull JavaParserParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull JavaParserParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull JavaParserParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull JavaParserParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull JavaParserParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull JavaParserParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull JavaParserParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull JavaParserParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull JavaParserParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull JavaParserParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull JavaParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull JavaParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull JavaParserParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull JavaParserParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull JavaParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull JavaParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull JavaParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull JavaParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull JavaParserParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull JavaParserParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull JavaParserParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull JavaParserParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull JavaParserParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull JavaParserParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(@NotNull JavaParserParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(@NotNull JavaParserParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull JavaParserParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull JavaParserParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull JavaParserParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull JavaParserParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull JavaParserParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull JavaParserParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull JavaParserParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull JavaParserParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavaParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavaParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull JavaParserParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull JavaParserParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull JavaParserParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull JavaParserParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull JavaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull JavaParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull JavaParserParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull JavaParserParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull JavaParserParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull JavaParserParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull JavaParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull JavaParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull JavaParserParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull JavaParserParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull JavaParserParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull JavaParserParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull JavaParserParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull JavaParserParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull JavaParserParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull JavaParserParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull JavaParserParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull JavaParserParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull JavaParserParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull JavaParserParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull JavaParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull JavaParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull JavaParserParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull JavaParserParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull JavaParserParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull JavaParserParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JavaParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JavaParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull JavaParserParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull JavaParserParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull JavaParserParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull JavaParserParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull JavaParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull JavaParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull JavaParserParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull JavaParserParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull JavaParserParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull JavaParserParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull JavaParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull JavaParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull JavaParserParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull JavaParserParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull JavaParserParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull JavaParserParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull JavaParserParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull JavaParserParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull JavaParserParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull JavaParserParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull JavaParserParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull JavaParserParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(@NotNull JavaParserParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(@NotNull JavaParserParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull JavaParserParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull JavaParserParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull JavaParserParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull JavaParserParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull JavaParserParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull JavaParserParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull JavaParserParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull JavaParserParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull JavaParserParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull JavaParserParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull JavaParserParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull JavaParserParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull JavaParserParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull JavaParserParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull JavaParserParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull JavaParserParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull JavaParserParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull JavaParserParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull JavaParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull JavaParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull JavaParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull JavaParserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull JavaParserParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull JavaParserParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull JavaParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull JavaParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull JavaParserParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull JavaParserParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull JavaParserParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull JavaParserParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull JavaParserParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull JavaParserParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull JavaParserParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull JavaParserParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull JavaParserParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull JavaParserParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull JavaParserParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull JavaParserParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(@NotNull JavaParserParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(@NotNull JavaParserParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JavaParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JavaParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull JavaParserParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull JavaParserParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull JavaParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull JavaParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull JavaParserParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull JavaParserParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull JavaParserParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull JavaParserParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull JavaParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull JavaParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull JavaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull JavaParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull JavaParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull JavaParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull JavaParserParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull JavaParserParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull JavaParserParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull JavaParserParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull JavaParserParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull JavaParserParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull JavaParserParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull JavaParserParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull JavaParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull JavaParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull JavaParserParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull JavaParserParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull JavaParserParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull JavaParserParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull JavaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull JavaParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull JavaParserParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull JavaParserParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull JavaParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull JavaParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull JavaParserParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull JavaParserParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull JavaParserParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull JavaParserParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull JavaParserParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull JavaParserParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull JavaParserParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull JavaParserParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull JavaParserParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull JavaParserParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull JavaParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull JavaParserParser.TypeArgumentsOrDiamondContext ctx);
}