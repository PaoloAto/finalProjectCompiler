// Generated from C:/Users/Paolo/Documents/Compilr/finalCompiler/CMPILER-MP/AiRingo/src/Main\AiRingoParser.g4 by ANTLR 4.7.2
package Main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AiRingoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, 
		LINE_COMMENT=107;
	public static final int
		RULE_run = 0, RULE_literal = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30, 
		RULE_ambiguousName = 31, RULE_packageDeclaration = 32, RULE_packageModifier = 33, 
		RULE_importDeclaration = 34, RULE_singleTypeImportDeclaration = 35, RULE_typeImportOnDemandDeclaration = 36, 
		RULE_singleStaticImportDeclaration = 37, RULE_staticImportOnDemandDeclaration = 38, 
		RULE_typeDeclaration = 39, RULE_classDeclaration = 40, RULE_normalClassDeclaration = 41, 
		RULE_classModifier = 42, RULE_typeParameters = 43, RULE_typeParameterList = 44, 
		RULE_superclass = 45, RULE_superinterfaces = 46, RULE_interfaceTypeList = 47, 
		RULE_classBody = 48, RULE_classBodyDeclaration = 49, RULE_classMemberDeclaration = 50, 
		RULE_fieldDeclaration = 51, RULE_fieldModifier = 52, RULE_variableDeclaratorList = 53, 
		RULE_variableDeclarator = 54, RULE_variableDeclaratorId = 55, RULE_variableInitializer = 56, 
		RULE_unannType = 57, RULE_unannPrimitiveType = 58, RULE_unannReferenceType = 59, 
		RULE_unannClassOrInterfaceType = 60, RULE_unannClassType = 61, RULE_unannClassType_lf_unannClassOrInterfaceType = 62, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 63, RULE_unannInterfaceType = 64, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 65, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 66, 
		RULE_unannTypeVariable = 67, RULE_unannArrayType = 68, RULE_methodDeclaration = 69, 
		RULE_methodModifier = 70, RULE_methodHeader = 71, RULE_result = 72, RULE_methodDeclarator = 73, 
		RULE_formalParameterList = 74, RULE_formalParameters = 75, RULE_formalParameter = 76, 
		RULE_variableModifier = 77, RULE_lastFormalParameter = 78, RULE_receiverParameter = 79, 
		RULE_throws_ = 80, RULE_exceptionTypeList = 81, RULE_exceptionType = 82, 
		RULE_methodBody = 83, RULE_instanceInitializer = 84, RULE_staticInitializer = 85, 
		RULE_constructorDeclaration = 86, RULE_constructorModifier = 87, RULE_constructorDeclarator = 88, 
		RULE_simpleTypeName = 89, RULE_constructorBody = 90, RULE_explicitConstructorInvocation = 91, 
		RULE_enumDeclaration = 92, RULE_enumBody = 93, RULE_enumConstantList = 94, 
		RULE_enumConstant = 95, RULE_enumConstantModifier = 96, RULE_enumBodyDeclarations = 97, 
		RULE_interfaceDeclaration = 98, RULE_normalInterfaceDeclaration = 99, 
		RULE_interfaceModifier = 100, RULE_extendsInterfaces = 101, RULE_interfaceBody = 102, 
		RULE_interfaceMemberDeclaration = 103, RULE_constantDeclaration = 104, 
		RULE_constantModifier = 105, RULE_interfaceMethodDeclaration = 106, RULE_interfaceMethodModifier = 107, 
		RULE_annotationTypeDeclaration = 108, RULE_annotationTypeBody = 109, RULE_annotationTypeMemberDeclaration = 110, 
		RULE_annotationTypeElementDeclaration = 111, RULE_annotationTypeElementModifier = 112, 
		RULE_defaultValue = 113, RULE_annotation = 114, RULE_normalAnnotation = 115, 
		RULE_elementValuePairList = 116, RULE_elementValuePair = 117, RULE_elementValue = 118, 
		RULE_elementValueArrayInitializer = 119, RULE_elementValueList = 120, 
		RULE_markerAnnotation = 121, RULE_singleElementAnnotation = 122, RULE_arrayInitializer = 123, 
		RULE_variableInitializerList = 124, RULE_block = 125, RULE_blockStatements = 126, 
		RULE_blockStatement = 127, RULE_localVariableDeclarationStatement = 128, 
		RULE_localVariableDeclaration = 129, RULE_statement = 130, RULE_statementNoShortIf = 131, 
		RULE_statementWithoutTrailingSubstatement = 132, RULE_emptyStatement = 133, 
		RULE_labeledStatement = 134, RULE_labeledStatementNoShortIf = 135, RULE_expressionStatement = 136, 
		RULE_statementExpression = 137, RULE_ifThenStatement = 138, RULE_ifThenElseStatement = 139, 
		RULE_ifThenElseStatementNoShortIf = 140, RULE_assertStatement = 141, RULE_switchStatement = 142, 
		RULE_switchBlock = 143, RULE_switchBlockStatementGroup = 144, RULE_switchLabels = 145, 
		RULE_switchLabel = 146, RULE_enumConstantName = 147, RULE_whileStatement = 148, 
		RULE_whileStatementNoShortIf = 149, RULE_doStatement = 150, RULE_forStatement = 151, 
		RULE_forStatementNoShortIf = 152, RULE_basicForStatement = 153, RULE_basicForStatementNoShortIf = 154, 
		RULE_forInit = 155, RULE_forUpdate = 156, RULE_statementExpressionList = 157, 
		RULE_enhancedForStatement = 158, RULE_enhancedForStatementNoShortIf = 159, 
		RULE_breakStatement = 160, RULE_continueStatement = 161, RULE_returnStatement = 162, 
		RULE_throwStatement = 163, RULE_synchronizedStatement = 164, RULE_tryStatement = 165, 
		RULE_catches = 166, RULE_catchClause = 167, RULE_catchFormalParameter = 168, 
		RULE_catchType = 169, RULE_finally_ = 170, RULE_tryWithResourcesStatement = 171, 
		RULE_resourceSpecification = 172, RULE_resourceList = 173, RULE_resource = 174, 
		RULE_primary = 175, RULE_primaryNoNewArray = 176, RULE_primaryNoNewArray_lf_arrayAccess = 177, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 178, RULE_primaryNoNewArray_lf_primary = 179, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 180, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 181, 
		RULE_primaryNoNewArray_lfno_primary = 182, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 183, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 184, 
		RULE_classInstanceCreationExpression = 185, RULE_classInstanceCreationExpression_lf_primary = 186, 
		RULE_classInstanceCreationExpression_lfno_primary = 187, RULE_typeArgumentsOrDiamond = 188, 
		RULE_fieldAccess = 189, RULE_fieldAccess_lf_primary = 190, RULE_fieldAccess_lfno_primary = 191, 
		RULE_arrayAccess = 192, RULE_arrayAccess_lf_primary = 193, RULE_arrayAccess_lfno_primary = 194, 
		RULE_methodInvocation = 195, RULE_methodInvocation_lf_primary = 196, RULE_methodInvocation_lfno_primary = 197, 
		RULE_argumentList = 198, RULE_methodReference = 199, RULE_methodReference_lf_primary = 200, 
		RULE_methodReference_lfno_primary = 201, RULE_arrayCreationExpression = 202, 
		RULE_dimExprs = 203, RULE_dimExpr = 204, RULE_constantExpression = 205, 
		RULE_expression = 206, RULE_lambdaExpression = 207, RULE_lambdaParameters = 208, 
		RULE_inferredFormalParameterList = 209, RULE_lambdaBody = 210, RULE_assignmentExpression = 211, 
		RULE_assignment = 212, RULE_leftHandSide = 213, RULE_assignmentOperator = 214, 
		RULE_conditionalExpression = 215, RULE_conditionalOrExpression = 216, 
		RULE_conditionalAndExpression = 217, RULE_inclusiveOrExpression = 218, 
		RULE_exclusiveOrExpression = 219, RULE_andExpression = 220, RULE_equalityExpression = 221, 
		RULE_relationalExpression = 222, RULE_shiftExpression = 223, RULE_additiveExpression = 224, 
		RULE_multiplicativeExpression = 225, RULE_unaryExpression = 226, RULE_preIncrementExpression = 227, 
		RULE_preDecrementExpression = 228, RULE_unaryExpressionNotPlusMinus = 229, 
		RULE_postfixExpression = 230, RULE_postIncrementExpression = 231, RULE_postIncrementExpression_lf_postfixExpression = 232, 
		RULE_postDecrementExpression = 233, RULE_postDecrementExpression_lf_postfixExpression = 234, 
		RULE_castExpression = 235;
	private static String[] makeRuleNames() {
		return new String[] {
			"run", "literal", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
			"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
			"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
			"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
			"ambiguousName", "packageDeclaration", "packageModifier", "importDeclaration", 
			"singleTypeImportDeclaration", "typeImportOnDemandDeclaration", "singleStaticImportDeclaration", 
			"staticImportOnDemandDeclaration", "typeDeclaration", "classDeclaration", 
			"normalClassDeclaration", "classModifier", "typeParameters", "typeParameterList", 
			"superclass", "superinterfaces", "interfaceTypeList", "classBody", "classBodyDeclaration", 
			"classMemberDeclaration", "fieldDeclaration", "fieldModifier", "variableDeclaratorList", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"unannType", "unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", 
			"unannClassType", "unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", 
			"unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
			"unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", 
			"unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", 
			"result", "methodDeclarator", "formalParameterList", "formalParameters", 
			"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
			"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
			"staticInitializer", "constructorDeclaration", "constructorModifier", 
			"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
			"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
			"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
			"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
			"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
			"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
			"variableInitializerList", "block", "blockStatements", "blockStatement", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
			"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
			"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
			"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
			"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
			"switchLabels", "switchLabel", "enumConstantName", "whileStatement", 
			"whileStatementNoShortIf", "doStatement", "forStatement", "forStatementNoShortIf", 
			"basicForStatement", "basicForStatementNoShortIf", "forInit", "forUpdate", 
			"statementExpressionList", "enhancedForStatement", "enhancedForStatementNoShortIf", 
			"breakStatement", "continueStatement", "returnStatement", "throwStatement", 
			"synchronizedStatement", "tryStatement", "catches", "catchClause", "catchFormalParameter", 
			"catchType", "finally_", "tryWithResourcesStatement", "resourceSpecification", 
			"resourceList", "resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
			"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
			"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
			"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
			"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
			"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", 
			"argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
			"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
			"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
			"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "castExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstrakto'", "'asserto'", "'boorean'", "'bureko'", "'byto'", 
			"'kesu'", "'katchu'", "'karu'", "'kurasu'", "'konst'", "'kontinu'", "'deporuto'", 
			"'do'", "'doburu'", "'erusu'", "'enumu'", "'extendo'", "'finar'", "'finarri'", 
			"'furoto'", "'foru'", "'ifu'", "'iku'", "'impremento'", "'importo'", 
			"'insutaof'", "'into'", "'intefeseru'", "'rongu'", "'netivu'", "'newu'", 
			"'pakeju'", "'privatto'", "'protekto'", "'pubriko'", "'returno'", "'shorto'", 
			"'statiku'", "'strictofp'", "'supa'", "'switchu'", "'sinkuronaizu'", 
			"'disu'", "'throwu'", "'throwsu'", "'transento'", "'tryu'", "'boido'", 
			"'voratiru'", "'wairu'", null, null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AiRingoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AiRingoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RunContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AiRingoParser.EOF, 0); }
		public List<BlockStatementsContext> blockStatements() {
			return getRuleContexts(BlockStatementsContext.class);
		}
		public BlockStatementsContext blockStatements(int i) {
			return getRuleContext(BlockStatementsContext.class,i);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_run);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(472);
				blockStatements();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(AiRingoParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(AiRingoParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AiRingoParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(AiRingoParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AiRingoParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(AiRingoParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(AiRingoParser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(482);
					annotation();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(489);
					annotation();
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(AiRingoParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(AiRingoParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(AiRingoParser.INT, 0); }
		public TerminalNode LONG() { return getToken(AiRingoParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(AiRingoParser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(AiRingoParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(AiRingoParser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(511);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(512);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(517);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(515);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(516);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(522);
					annotation();
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
				match(Identifier);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(529);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				classOrInterfaceType();
				setState(533);
				match(DOT);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(534);
					annotation();
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				match(Identifier);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(541);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(DOT);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(547);
				annotation();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
			match(Identifier);
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(554);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(557);
				annotation();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			match(Identifier);
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(564);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(573);
				annotation();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				primitiveType();
				setState(582);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				classOrInterfaceType();
				setState(585);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				typeVariable();
				setState(588);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
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
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(592);
				annotation();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(LBRACK);
			setState(599);
			match(RBRACK);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
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
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(613);
				typeParameterModifier();
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			match(Identifier);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(620);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AiRingoParser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(EXTENDS);
				setState(626);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(EXTENDS);
				setState(628);
				classOrInterfaceType();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(629);
					additionalBound();
					}
					}
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(AiRingoParser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(BITAND);
			setState(638);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AiRingoParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(AiRingoParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(LT);
			setState(641);
			typeArgumentList();
			setState(642);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			typeArgument();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(645);
				match(COMMA);
				setState(646);
				typeArgument();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(AiRingoParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(656);
				annotation();
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
			match(QUESTION);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(663);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AiRingoParser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				match(EXTENDS);
				setState(667);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(SUPER);
				setState(669);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(673);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(675);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(676);
					match(DOT);
					setState(677);
					match(Identifier);
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				packageOrTypeName(0);
				setState(685);
				match(DOT);
				setState(686);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(691);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(693);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(694);
					match(DOT);
					setState(695);
					match(Identifier);
					}
					} 
				}
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				ambiguousName(0);
				setState(703);
				match(DOT);
				setState(704);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(711);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(713);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(714);
					match(DOT);
					setState(715);
					match(Identifier);
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(AiRingoParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(721);
				packageModifier();
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(727);
			match(PACKAGE);
			setState(728);
			packageName(0);
			setState(729);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPackageModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importDeclaration);
		try {
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AiRingoParser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSingleTypeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(IMPORT);
			setState(740);
			typeName();
			setState(741);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AiRingoParser.IMPORT, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(AiRingoParser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(IMPORT);
			setState(744);
			packageOrTypeName(0);
			setState(745);
			match(DOT);
			setState(746);
			match(MUL);
			setState(747);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AiRingoParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSingleStaticImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(IMPORT);
			setState(750);
			match(STATIC);
			setState(751);
			typeName();
			setState(752);
			match(DOT);
			setState(753);
			match(Identifier);
			setState(754);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AiRingoParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(AiRingoParser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(IMPORT);
			setState(757);
			match(STATIC);
			setState(758);
			typeName();
			setState(759);
			match(DOT);
			setState(760);
			match(MUL);
			setState(761);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeDeclaration);
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classDeclaration);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(772);
				classModifier();
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(778);
			match(CLASS);
			setState(779);
			match(Identifier);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(780);
				typeParameters();
				}
			}

			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(783);
				superclass();
				}
			}

			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(786);
				superinterfaces();
				}
			}

			setState(789);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AiRingoParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(AiRingoParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(AiRingoParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(AiRingoParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(AiRingoParser.STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classModifier);
		try {
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(795);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(796);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(797);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(798);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AiRingoParser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(AiRingoParser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(LT);
			setState(802);
			typeParameterList();
			setState(803);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			typeParameter();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(806);
				match(COMMA);
				setState(807);
				typeParameter();
				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AiRingoParser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(EXTENDS);
			setState(814);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(AiRingoParser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(IMPLEMENTS);
			setState(817);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			interfaceType();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(820);
				match(COMMA);
				setState(821);
				interfaceType();
				}
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(LBRACE);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(828);
				classBodyDeclaration();
				}
				}
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(834);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBodyDeclaration);
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(838);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(839);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classMemberDeclaration);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(846);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(849);
				fieldModifier();
				}
				}
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(855);
			unannType();
			setState(856);
			variableDeclaratorList();
			setState(857);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AiRingoParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(AiRingoParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(AiRingoParser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(AiRingoParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(AiRingoParser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldModifier);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(862);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(863);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(864);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(865);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(866);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			variableDeclarator();
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(870);
				match(COMMA);
				setState(871);
				variableDeclarator();
				}
				}
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AiRingoParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			variableDeclaratorId();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(878);
				match(ASSIGN);
				setState(879);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(Identifier);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(883);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableInitializer);
		try {
			setState(888);
			_errHandler.sync(this);
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
				setState(886);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unannType);
		try {
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(AiRingoParser.BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannPrimitiveType);
		try {
			setState(896);
			_errHandler.sync(this);
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
				setState(894);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannReferenceType);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(903);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(904);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(909);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(907);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(908);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassType);
		int _la;
		try {
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				match(Identifier);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(915);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				unannClassOrInterfaceType();
				setState(919);
				match(DOT);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(920);
					annotation();
					}
					}
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(926);
				match(Identifier);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(927);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(DOT);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(933);
				annotation();
				}
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(939);
			match(Identifier);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(940);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(Identifier);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(944);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannArrayType);
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				unannPrimitiveType();
				setState(956);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				unannClassOrInterfaceType();
				setState(959);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(961);
				unannTypeVariable();
				setState(962);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(966);
				methodModifier();
				}
				}
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(972);
			methodHeader();
			setState(973);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AiRingoParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(AiRingoParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(AiRingoParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(AiRingoParser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(AiRingoParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(AiRingoParser.NATIVE, 0); }
		public TerminalNode STRICTFP() { return getToken(AiRingoParser.STRICTFP, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodModifier);
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(977);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(978);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(979);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(980);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(981);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(982);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(983);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(984);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodHeader);
		int _la;
		try {
			setState(1004);
			_errHandler.sync(this);
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
				setState(987);
				result();
				setState(988);
				methodDeclarator();
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(989);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				typeParameters();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(993);
					annotation();
					}
					}
					setState(998);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(999);
				result();
				setState(1000);
				methodDeclarator();
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1001);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_result);
		try {
			setState(1008);
			_errHandler.sync(this);
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
				setState(1006);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1007);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(Identifier);
			setState(1011);
			match(LPAREN);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1012);
				formalParameterList();
				}
			}

			setState(1015);
			match(RPAREN);
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1016);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AiRingoParser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_formalParameterList);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				formalParameters();
				setState(1021);
				match(COMMA);
				setState(1022);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameters);
		try {
			int _alt;
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				formalParameter();
				setState(1032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1028);
						match(COMMA);
						setState(1029);
						formalParameter();
						}
						} 
					}
					setState(1034);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				receiverParameter();
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1036);
						match(COMMA);
						setState(1037);
						formalParameter();
						}
						} 
					}
					setState(1042);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1045);
				variableModifier();
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1051);
			unannType();
			setState(1052);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(AiRingoParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_variableModifier);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(AiRingoParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1058);
					variableModifier();
					}
					}
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1064);
				unannType();
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1065);
					annotation();
					}
					}
					setState(1070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1071);
				match(ELLIPSIS);
				setState(1072);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1077);
				annotation();
				}
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1083);
			unannType();
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1084);
				match(Identifier);
				setState(1085);
				match(DOT);
				}
			}

			setState(1088);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(AiRingoParser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(THROWS);
			setState(1091);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			exceptionType();
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1094);
				match(COMMA);
				setState(1095);
				exceptionType();
				}
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionType);
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_methodBody);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInstanceInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(STATIC);
			setState(1112);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1114);
				constructorModifier();
				}
				}
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1120);
			constructorDeclarator();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1121);
				throws_();
				}
			}

			setState(1124);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AiRingoParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(AiRingoParser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorModifier);
		try {
			setState(1130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1132);
				typeParameters();
				}
			}

			setState(1135);
			simpleTypeName();
			setState(1136);
			match(LPAREN);
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1137);
				formalParameterList();
				}
			}

			setState(1140);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(LBRACE);
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1145);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1148);
				blockStatements();
				}
			}

			setState(1151);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1153);
					typeArguments();
					}
				}

				setState(1156);
				match(THIS);
				setState(1157);
				match(LPAREN);
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1158);
					argumentList();
					}
				}

				setState(1161);
				match(RPAREN);
				setState(1162);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1163);
					typeArguments();
					}
				}

				setState(1166);
				match(SUPER);
				setState(1167);
				match(LPAREN);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1168);
					argumentList();
					}
				}

				setState(1171);
				match(RPAREN);
				setState(1172);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1173);
				expressionName();
				setState(1174);
				match(DOT);
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1175);
					typeArguments();
					}
				}

				setState(1178);
				match(SUPER);
				setState(1179);
				match(LPAREN);
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1180);
					argumentList();
					}
				}

				setState(1183);
				match(RPAREN);
				setState(1184);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1186);
				primary();
				setState(1187);
				match(DOT);
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1188);
					typeArguments();
					}
				}

				setState(1191);
				match(SUPER);
				setState(1192);
				match(LPAREN);
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1193);
					argumentList();
					}
				}

				setState(1196);
				match(RPAREN);
				setState(1197);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(AiRingoParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1201);
				classModifier();
				}
				}
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1207);
			match(ENUM);
			setState(1208);
			match(Identifier);
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1209);
				superinterfaces();
				}
			}

			setState(1212);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AiRingoParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(LBRACE);
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1215);
				enumConstantList();
				}
			}

			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1218);
				match(COMMA);
				}
			}

			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1221);
				enumBodyDeclarations();
				}
			}

			setState(1224);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			enumConstant();
			setState(1231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1227);
					match(COMMA);
					setState(1228);
					enumConstant();
					}
					} 
				}
				setState(1233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1234);
				enumConstantModifier();
				}
				}
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1240);
			match(Identifier);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1241);
				match(LPAREN);
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1242);
					argumentList();
					}
				}

				setState(1245);
				match(RPAREN);
				}
			}

			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1248);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(SEMI);
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1254);
				classBodyDeclaration();
				}
				}
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_interfaceDeclaration);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AiRingoParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1264);
				interfaceModifier();
				}
				}
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1270);
			match(INTERFACE);
			setState(1271);
			match(Identifier);
			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1272);
				typeParameters();
				}
			}

			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1275);
				extendsInterfaces();
				}
			}

			setState(1278);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AiRingoParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(AiRingoParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(AiRingoParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(AiRingoParser.STRICTFP, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_interfaceModifier);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1281);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1282);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1283);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1284);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1285);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1286);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AiRingoParser.EXTENDS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(EXTENDS);
			setState(1290);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(LBRACE);
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1293);
				interfaceMemberDeclaration();
				}
				}
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1299);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interfaceMemberDeclaration);
		try {
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1304);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1305);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1308);
				constantModifier();
				}
				}
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1314);
			unannType();
			setState(1315);
			variableDeclaratorList();
			setState(1316);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(AiRingoParser.FINAL, 0); }
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantModifier);
		try {
			setState(1322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1320);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1321);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1324);
				interfaceMethodModifier();
				}
				}
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1330);
			methodHeader();
			setState(1331);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(AiRingoParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(AiRingoParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(AiRingoParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(AiRingoParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodModifier);
		try {
			setState(1339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1335);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1336);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1337);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1338);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AiRingoParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(AiRingoParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1341);
					interfaceModifier();
					}
					} 
				}
				setState(1346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(1347);
			match(AT);
			setState(1348);
			match(INTERFACE);
			setState(1349);
			match(Identifier);
			setState(1350);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(LBRACE);
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1353);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1359);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1361);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1362);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1363);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1364);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1365);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1368);
				annotationTypeElementModifier();
				}
				}
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1374);
			unannType();
			setState(1375);
			match(Identifier);
			setState(1376);
			match(LPAREN);
			setState(1377);
			match(RPAREN);
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1378);
				dims();
				}
			}

			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1381);
				defaultValue();
				}
			}

			setState(1384);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(AiRingoParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(AiRingoParser.ABSTRACT, 0); }
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAnnotationTypeElementModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementModifier);
		try {
			setState(1389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1387);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1388);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(AiRingoParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(DEFAULT);
			setState(1392);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotation);
		try {
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1395);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1396);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AiRingoParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitNormalAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(AT);
			setState(1400);
			typeName();
			setState(1401);
			match(LPAREN);
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1402);
				elementValuePairList();
				}
			}

			setState(1405);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitElementValuePairList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			elementValuePair();
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1408);
				match(COMMA);
				setState(1409);
				elementValuePair();
				}
				}
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(AiRingoParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			match(Identifier);
			setState(1416);
			match(ASSIGN);
			setState(1417);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValue);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1419);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				elementValueArrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1421);
				annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AiRingoParser.COMMA, 0); }
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(LBRACE);
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1425);
				elementValueList();
				}
			}

			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1428);
				match(COMMA);
				}
			}

			setState(1431);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitElementValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			elementValue();
			setState(1438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1434);
					match(COMMA);
					setState(1435);
					elementValue();
					}
					} 
				}
				setState(1440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AiRingoParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMarkerAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(AT);
			setState(1442);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AiRingoParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSingleElementAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(AT);
			setState(1445);
			typeName();
			setState(1446);
			match(LPAREN);
			setState(1447);
			elementValue();
			setState(1448);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AiRingoParser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(LBRACE);
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1451);
				variableInitializerList();
				}
			}

			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1454);
				match(COMMA);
				}
			}

			setState(1457);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			variableInitializer();
			setState(1464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1460);
					match(COMMA);
					setState(1461);
					variableInitializer();
					}
					} 
				}
				setState(1466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			match(LBRACE);
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1468);
				blockStatements();
				}
			}

			setState(1471);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_blockStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1474); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1473);
					blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1476); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_blockStatement);
		try {
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1480);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			localVariableDeclaration();
			setState(1484);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1486);
				variableModifier();
				}
				}
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1492);
			unannType();
			setState(1493);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_statement);
		try {
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1497);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1498);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1499);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1500);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statementNoShortIf);
		try {
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1505);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1506);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1507);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
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
				setState(1512);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1513);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1514);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1515);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1516);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1517);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1518);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1519);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1520);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1521);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			match(Identifier);
			setState(1527);
			match(COLON);
			setState(1528);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			match(Identifier);
			setState(1531);
			match(COLON);
			setState(1532);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			statementExpression();
			setState(1535);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_statementExpression);
		try {
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1539);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1540);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1541);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1542);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1543);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AiRingoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(IF);
			setState(1547);
			match(LPAREN);
			setState(1548);
			expression();
			setState(1549);
			match(RPAREN);
			setState(1550);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AiRingoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(AiRingoParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(IF);
			setState(1553);
			match(LPAREN);
			setState(1554);
			expression();
			setState(1555);
			match(RPAREN);
			setState(1556);
			statementNoShortIf();
			setState(1557);
			match(ELSE);
			setState(1558);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AiRingoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AiRingoParser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			match(IF);
			setState(1561);
			match(LPAREN);
			setState(1562);
			expression();
			setState(1563);
			match(RPAREN);
			setState(1564);
			statementNoShortIf();
			setState(1565);
			match(ELSE);
			setState(1566);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(AiRingoParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_assertStatement);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1568);
				match(ASSERT);
				setState(1569);
				expression();
				setState(1570);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				match(ASSERT);
				setState(1573);
				expression();
				setState(1574);
				match(COLON);
				setState(1575);
				expression();
				setState(1576);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AiRingoParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(SWITCH);
			setState(1581);
			match(LPAREN);
			setState(1582);
			expression();
			setState(1583);
			match(RPAREN);
			setState(1584);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AiRingoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AiRingoParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(LBRACE);
			setState(1590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1587);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			}
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1593);
				switchLabel();
				}
				}
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1599);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601);
			switchLabels();
			setState(1602);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			switchLabel();
			setState(1608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1605);
				switchLabel();
				}
				}
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AiRingoParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(AiRingoParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchLabel);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1611);
				match(CASE);
				setState(1612);
				constantExpression();
				setState(1613);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615);
				match(CASE);
				setState(1616);
				enumConstantName();
				setState(1617);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1619);
				match(DEFAULT);
				setState(1620);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AiRingoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			match(WHILE);
			setState(1626);
			match(LPAREN);
			setState(1627);
			expression();
			setState(1628);
			match(RPAREN);
			setState(1629);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AiRingoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(WHILE);
			setState(1632);
			match(LPAREN);
			setState(1633);
			expression();
			setState(1634);
			match(RPAREN);
			setState(1635);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(AiRingoParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AiRingoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(DO);
			setState(1638);
			statement();
			setState(1639);
			match(WHILE);
			setState(1640);
			match(LPAREN);
			setState(1641);
			expression();
			setState(1642);
			match(RPAREN);
			setState(1643);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_forStatement);
		try {
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1645);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1646);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_forStatementNoShortIf);
		try {
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1649);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1650);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AiRingoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AiRingoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AiRingoParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBasicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			match(FOR);
			setState(1654);
			match(LPAREN);
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1655);
				forInit();
				}
			}

			setState(1658);
			match(SEMI);
			setState(1660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1659);
				expression();
				}
			}

			setState(1662);
			match(SEMI);
			setState(1664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1663);
				forUpdate();
				}
			}

			setState(1666);
			match(RPAREN);
			setState(1667);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AiRingoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AiRingoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AiRingoParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBasicForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			match(FOR);
			setState(1670);
			match(LPAREN);
			setState(1672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1671);
				forInit();
				}
			}

			setState(1674);
			match(SEMI);
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1675);
				expression();
				}
			}

			setState(1678);
			match(SEMI);
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1679);
				forUpdate();
				}
			}

			setState(1682);
			match(RPAREN);
			setState(1683);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_forInit);
		try {
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1685);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1686);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			statementExpression();
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1692);
				match(COMMA);
				setState(1693);
				statementExpression();
				}
				}
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AiRingoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			match(FOR);
			setState(1700);
			match(LPAREN);
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1701);
				variableModifier();
				}
				}
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1707);
			unannType();
			setState(1708);
			variableDeclaratorId();
			setState(1709);
			match(COLON);
			setState(1710);
			expression();
			setState(1711);
			match(RPAREN);
			setState(1712);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AiRingoParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			match(FOR);
			setState(1715);
			match(LPAREN);
			setState(1719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1716);
				variableModifier();
				}
				}
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1722);
			unannType();
			setState(1723);
			variableDeclaratorId();
			setState(1724);
			match(COLON);
			setState(1725);
			expression();
			setState(1726);
			match(RPAREN);
			setState(1727);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AiRingoParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			match(BREAK);
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1730);
				match(Identifier);
				}
			}

			setState(1733);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AiRingoParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			match(CONTINUE);
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1736);
				match(Identifier);
				}
			}

			setState(1739);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AiRingoParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			match(RETURN);
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1742);
				expression();
				}
			}

			setState(1745);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(AiRingoParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			match(THROW);
			setState(1748);
			expression();
			setState(1749);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(AiRingoParser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(SYNCHRONIZED);
			setState(1752);
			match(LPAREN);
			setState(1753);
			expression();
			setState(1754);
			match(RPAREN);
			setState(1755);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(AiRingoParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_tryStatement);
		int _la;
		try {
			setState(1769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1757);
				match(TRY);
				setState(1758);
				block();
				setState(1759);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1761);
				match(TRY);
				setState(1762);
				block();
				setState(1764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1763);
					catches();
					}
				}

				setState(1766);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1768);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			catchClause();
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1772);
				catchClause();
				}
				}
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(AiRingoParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			match(CATCH);
			setState(1779);
			match(LPAREN);
			setState(1780);
			catchFormalParameter();
			setState(1781);
			match(RPAREN);
			setState(1782);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1784);
				variableModifier();
				}
				}
				setState(1789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1790);
			catchType();
			setState(1791);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(AiRingoParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(AiRingoParser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			unannClassType();
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1794);
				match(BITOR);
				setState(1795);
				classType();
				}
				}
				setState(1800);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(AiRingoParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFinally_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 340, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			match(FINALLY);
			setState(1802);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(AiRingoParser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTryWithResourcesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(TRY);
			setState(1805);
			resourceSpecification();
			setState(1806);
			block();
			setState(1808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1807);
				catches();
				}
			}

			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1810);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AiRingoParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			match(LPAREN);
			setState(1814);
			resourceList();
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1815);
				match(SEMI);
				}
			}

			setState(1818);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AiRingoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AiRingoParser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			resource();
			setState(1825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1821);
					match(SEMI);
					setState(1822);
					resource();
					}
					} 
				}
				setState(1827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AiRingoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1828);
				variableModifier();
				}
				}
				setState(1833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1834);
			unannType();
			setState(1835);
			variableDeclaratorId();
			setState(1836);
			match(ASSIGN);
			setState(1837);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1839);
				primaryNoNewArray_lfno_primary();
				}
				break;
			case 2:
				{
				setState(1840);
				arrayCreationExpression();
				}
				break;
			}
			setState(1846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1843);
					primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1850);
				typeName();
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1851);
					match(LBRACK);
					setState(1852);
					match(RBRACK);
					}
					}
					setState(1857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1858);
				match(DOT);
				setState(1859);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1861);
				match(VOID);
				setState(1862);
				match(DOT);
				setState(1863);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1864);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1865);
				typeName();
				setState(1866);
				match(DOT);
				setState(1867);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1869);
				match(LPAREN);
				setState(1870);
				expression();
				setState(1871);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1873);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1874);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1875);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1876);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1877);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1882);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1883);
				typeName();
				setState(1888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1884);
					match(LBRACK);
					setState(1885);
					match(RBRACK);
					}
					}
					setState(1890);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1891);
				match(DOT);
				setState(1892);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1894);
				match(VOID);
				setState(1895);
				match(DOT);
				setState(1896);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1897);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1898);
				typeName();
				setState(1899);
				match(DOT);
				setState(1900);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1902);
				match(LPAREN);
				setState(1903);
				expression();
				setState(1904);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1906);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1907);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1908);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1909);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1912);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1913);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1914);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1915);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1916);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1921);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1922);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1923);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1924);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1927);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1928);
				typeName();
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1929);
					match(LBRACK);
					setState(1930);
					match(RBRACK);
					}
					}
					setState(1935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1936);
				match(DOT);
				setState(1937);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1939);
				unannPrimitiveType();
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1940);
					match(LBRACK);
					setState(1941);
					match(RBRACK);
					}
					}
					setState(1946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1947);
				match(DOT);
				setState(1948);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1950);
				match(VOID);
				setState(1951);
				match(DOT);
				setState(1952);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1953);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1954);
				typeName();
				setState(1955);
				match(DOT);
				setState(1956);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1958);
				match(LPAREN);
				setState(1959);
				expression();
				setState(1960);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1962);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1963);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1964);
				arrayAccess_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1965);
				methodInvocation_lfno_primary();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1966);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(AiRingoParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AiRingoParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(AiRingoParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1971);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1972);
				typeName();
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1973);
					match(LBRACK);
					setState(1974);
					match(RBRACK);
					}
					}
					setState(1979);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1980);
				match(DOT);
				setState(1981);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1983);
				unannPrimitiveType();
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1984);
					match(LBRACK);
					setState(1985);
					match(RBRACK);
					}
					}
					setState(1990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1991);
				match(DOT);
				setState(1992);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1994);
				match(VOID);
				setState(1995);
				match(DOT);
				setState(1996);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1997);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1998);
				typeName();
				setState(1999);
				match(DOT);
				setState(2000);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2002);
				match(LPAREN);
				setState(2003);
				expression();
				setState(2004);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2006);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2007);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2008);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2009);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AiRingoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AiRingoParser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2012);
				match(NEW);
				setState(2014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2013);
					typeArguments();
					}
				}

				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2016);
					annotation();
					}
					}
					setState(2021);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2022);
				match(Identifier);
				setState(2033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2023);
					match(DOT);
					setState(2027);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2024);
						annotation();
						}
						}
						setState(2029);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2030);
					match(Identifier);
					}
					}
					setState(2035);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2036);
					typeArgumentsOrDiamond();
					}
				}

				setState(2039);
				match(LPAREN);
				setState(2041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2040);
					argumentList();
					}
				}

				setState(2043);
				match(RPAREN);
				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2044);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2047);
				expressionName();
				setState(2048);
				match(DOT);
				setState(2049);
				match(NEW);
				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2050);
					typeArguments();
					}
				}

				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2053);
					annotation();
					}
					}
					setState(2058);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2059);
				match(Identifier);
				setState(2061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2060);
					typeArgumentsOrDiamond();
					}
				}

				setState(2063);
				match(LPAREN);
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2064);
					argumentList();
					}
				}

				setState(2067);
				match(RPAREN);
				setState(2069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2068);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2071);
				primary();
				setState(2072);
				match(DOT);
				setState(2073);
				match(NEW);
				setState(2075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2074);
					typeArguments();
					}
				}

				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2077);
					annotation();
					}
					}
					setState(2082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2083);
				match(Identifier);
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2084);
					typeArgumentsOrDiamond();
					}
				}

				setState(2087);
				match(LPAREN);
				setState(2089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2088);
					argumentList();
					}
				}

				setState(2091);
				match(RPAREN);
				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2092);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(DOT);
			setState(2098);
			match(NEW);
			setState(2100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2099);
				typeArguments();
				}
			}

			setState(2105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2102);
				annotation();
				}
				}
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2108);
			match(Identifier);
			setState(2110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2109);
				typeArgumentsOrDiamond();
				}
			}

			setState(2112);
			match(LPAREN);
			setState(2114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2113);
				argumentList();
				}
			}

			setState(2116);
			match(RPAREN);
			setState(2118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(2117);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AiRingoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AiRingoParser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2120);
				match(NEW);
				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2121);
					typeArguments();
					}
				}

				setState(2127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2124);
					annotation();
					}
					}
					setState(2129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2130);
				match(Identifier);
				setState(2141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2131);
					match(DOT);
					setState(2135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2132);
						annotation();
						}
						}
						setState(2137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2138);
					match(Identifier);
					}
					}
					setState(2143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2144);
					typeArgumentsOrDiamond();
					}
				}

				setState(2147);
				match(LPAREN);
				setState(2149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2148);
					argumentList();
					}
				}

				setState(2151);
				match(RPAREN);
				setState(2153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(2152);
					classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2155);
				expressionName();
				setState(2156);
				match(DOT);
				setState(2157);
				match(NEW);
				setState(2159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2158);
					typeArguments();
					}
				}

				setState(2164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2161);
					annotation();
					}
					}
					setState(2166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2167);
				match(Identifier);
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2168);
					typeArgumentsOrDiamond();
					}
				}

				setState(2171);
				match(LPAREN);
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2172);
					argumentList();
					}
				}

				setState(2175);
				match(RPAREN);
				setState(2177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(2176);
					classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(AiRingoParser.LT, 0); }
		public TerminalNode GT() { return getToken(AiRingoParser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_typeArgumentsOrDiamond);
		try {
			setState(2184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2181);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2182);
				match(LT);
				setState(2183);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_fieldAccess);
		try {
			setState(2199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2186);
				primary();
				setState(2187);
				match(DOT);
				setState(2188);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2190);
				match(SUPER);
				setState(2191);
				match(DOT);
				setState(2192);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2193);
				typeName();
				setState(2194);
				match(DOT);
				setState(2195);
				match(SUPER);
				setState(2196);
				match(DOT);
				setState(2197);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(DOT);
			setState(2202);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess_lfno_primary);
		try {
			setState(2213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2204);
				match(SUPER);
				setState(2205);
				match(DOT);
				setState(2206);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2207);
				typeName();
				setState(2208);
				match(DOT);
				setState(2209);
				match(SUPER);
				setState(2210);
				match(DOT);
				setState(2211);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(2215);
				expressionName();
				setState(2216);
				match(LBRACK);
				setState(2217);
				expression();
				setState(2218);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2220);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2221);
				match(LBRACK);
				setState(2222);
				expression();
				setState(2223);
				match(RBRACK);
				}
				break;
			}
			setState(2234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2227);
				primaryNoNewArray_lf_arrayAccess();
				setState(2228);
				match(LBRACK);
				setState(2229);
				expression();
				setState(2230);
				match(RBRACK);
				}
				}
				setState(2236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2237);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2238);
			match(LBRACK);
			setState(2239);
			expression();
			setState(2240);
			match(RBRACK);
			}
			setState(2249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2242);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2243);
					match(LBRACK);
					setState(2244);
					expression();
					setState(2245);
					match(RBRACK);
					}
					} 
				}
				setState(2251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(AiRingoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AiRingoParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AiRingoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AiRingoParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2252);
				expressionName();
				setState(2253);
				match(LBRACK);
				setState(2254);
				expression();
				setState(2255);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2257);
				primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2258);
				match(LBRACK);
				setState(2259);
				expression();
				setState(2260);
				match(RBRACK);
				}
				break;
			}
			setState(2271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2264);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2265);
					match(LBRACK);
					setState(2266);
					expression();
					setState(2267);
					match(RBRACK);
					}
					} 
				}
				setState(2273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_methodInvocation);
		int _la;
		try {
			setState(2342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				methodName();
				setState(2275);
				match(LPAREN);
				setState(2277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2276);
					argumentList();
					}
				}

				setState(2279);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2281);
				typeName();
				setState(2282);
				match(DOT);
				setState(2284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2283);
					typeArguments();
					}
				}

				setState(2286);
				match(Identifier);
				setState(2287);
				match(LPAREN);
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2288);
					argumentList();
					}
				}

				setState(2291);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2293);
				expressionName();
				setState(2294);
				match(DOT);
				setState(2296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2295);
					typeArguments();
					}
				}

				setState(2298);
				match(Identifier);
				setState(2299);
				match(LPAREN);
				setState(2301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2300);
					argumentList();
					}
				}

				setState(2303);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2305);
				primary();
				setState(2306);
				match(DOT);
				setState(2308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2307);
					typeArguments();
					}
				}

				setState(2310);
				match(Identifier);
				setState(2311);
				match(LPAREN);
				setState(2313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2312);
					argumentList();
					}
				}

				setState(2315);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2317);
				match(SUPER);
				setState(2318);
				match(DOT);
				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2319);
					typeArguments();
					}
				}

				setState(2322);
				match(Identifier);
				setState(2323);
				match(LPAREN);
				setState(2325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2324);
					argumentList();
					}
				}

				setState(2327);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2328);
				typeName();
				setState(2329);
				match(DOT);
				setState(2330);
				match(SUPER);
				setState(2331);
				match(DOT);
				setState(2333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2332);
					typeArguments();
					}
				}

				setState(2335);
				match(Identifier);
				setState(2336);
				match(LPAREN);
				setState(2338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2337);
					argumentList();
					}
				}

				setState(2340);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344);
			match(DOT);
			setState(2346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2345);
				typeArguments();
				}
			}

			setState(2348);
			match(Identifier);
			setState(2349);
			match(LPAREN);
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2350);
				argumentList();
				}
			}

			setState(2353);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AiRingoParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AiRingoParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2355);
				methodName();
				setState(2356);
				match(LPAREN);
				setState(2358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2357);
					argumentList();
					}
				}

				setState(2360);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2362);
				typeName();
				setState(2363);
				match(DOT);
				setState(2365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2364);
					typeArguments();
					}
				}

				setState(2367);
				match(Identifier);
				setState(2368);
				match(LPAREN);
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2369);
					argumentList();
					}
				}

				setState(2372);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2374);
				expressionName();
				setState(2375);
				match(DOT);
				setState(2377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2376);
					typeArguments();
					}
				}

				setState(2379);
				match(Identifier);
				setState(2380);
				match(LPAREN);
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2381);
					argumentList();
					}
				}

				setState(2384);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2386);
				match(SUPER);
				setState(2387);
				match(DOT);
				setState(2389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2388);
					typeArguments();
					}
				}

				setState(2391);
				match(Identifier);
				setState(2392);
				match(LPAREN);
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2393);
					argumentList();
					}
				}

				setState(2396);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2397);
				typeName();
				setState(2398);
				match(DOT);
				setState(2399);
				match(SUPER);
				setState(2400);
				match(DOT);
				setState(2402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2401);
					typeArguments();
					}
				}

				setState(2404);
				match(Identifier);
				setState(2405);
				match(LPAREN);
				setState(2407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2406);
					argumentList();
					}
				}

				setState(2409);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			expression();
			setState(2418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2414);
				match(COMMA);
				setState(2415);
				expression();
				}
				}
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(AiRingoParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_methodReference);
		int _la;
		try {
			setState(2468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2421);
				expressionName();
				setState(2422);
				match(COLONCOLON);
				setState(2424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2423);
					typeArguments();
					}
				}

				setState(2426);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2428);
				referenceType();
				setState(2429);
				match(COLONCOLON);
				setState(2431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2430);
					typeArguments();
					}
				}

				setState(2433);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2435);
				primary();
				setState(2436);
				match(COLONCOLON);
				setState(2438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2437);
					typeArguments();
					}
				}

				setState(2440);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2442);
				match(SUPER);
				setState(2443);
				match(COLONCOLON);
				setState(2445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2444);
					typeArguments();
					}
				}

				setState(2447);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2448);
				typeName();
				setState(2449);
				match(DOT);
				setState(2450);
				match(SUPER);
				setState(2451);
				match(COLONCOLON);
				setState(2453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2452);
					typeArguments();
					}
				}

				setState(2455);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2457);
				classType();
				setState(2458);
				match(COLONCOLON);
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2459);
					typeArguments();
					}
				}

				setState(2462);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2464);
				arrayType();
				setState(2465);
				match(COLONCOLON);
				setState(2466);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(AiRingoParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			match(COLONCOLON);
			setState(2472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2471);
				typeArguments();
				}
			}

			setState(2474);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(AiRingoParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(AiRingoParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AiRingoParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2476);
				expressionName();
				setState(2477);
				match(COLONCOLON);
				setState(2479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2478);
					typeArguments();
					}
				}

				setState(2481);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2483);
				referenceType();
				setState(2484);
				match(COLONCOLON);
				setState(2486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2485);
					typeArguments();
					}
				}

				setState(2488);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2490);
				match(SUPER);
				setState(2491);
				match(COLONCOLON);
				setState(2493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2492);
					typeArguments();
					}
				}

				setState(2495);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2496);
				typeName();
				setState(2497);
				match(DOT);
				setState(2498);
				match(SUPER);
				setState(2499);
				match(COLONCOLON);
				setState(2501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2500);
					typeArguments();
					}
				}

				setState(2503);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2505);
				classType();
				setState(2506);
				match(COLONCOLON);
				setState(2508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2507);
					typeArguments();
					}
				}

				setState(2510);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2512);
				arrayType();
				setState(2513);
				match(COLONCOLON);
				setState(2514);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AiRingoParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_arrayCreationExpression);
		try {
			setState(2540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2518);
				match(NEW);
				setState(2519);
				primitiveType();
				setState(2520);
				dimExprs();
				setState(2522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2521);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2524);
				match(NEW);
				setState(2525);
				classOrInterfaceType();
				setState(2526);
				dimExprs();
				setState(2528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2527);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2530);
				match(NEW);
				setState(2531);
				primitiveType();
				setState(2532);
				dims();
				setState(2533);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2535);
				match(NEW);
				setState(2536);
				classOrInterfaceType();
				setState(2537);
				dims();
				setState(2538);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			dimExpr();
			setState(2546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2543);
					dimExpr();
					}
					} 
				}
				setState(2548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AiRingoParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(AiRingoParser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2549);
				annotation();
				}
				}
				setState(2554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2555);
			match(LBRACK);
			setState(2556);
			expression();
			setState(2557);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2559);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_expression);
		try {
			setState(2563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2561);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2562);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AiRingoParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
			lambdaParameters();
			setState(2566);
			match(ARROW);
			setState(2567);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AiRingoParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_lambdaParameters);
		int _la;
		try {
			setState(2579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2569);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2570);
				match(LPAREN);
				setState(2572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2571);
					formalParameterList();
					}
				}

				setState(2574);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2575);
				match(LPAREN);
				setState(2576);
				inferredFormalParameterList();
				setState(2577);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AiRingoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AiRingoParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AiRingoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AiRingoParser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInferredFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2581);
			match(Identifier);
			setState(2586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2582);
				match(COMMA);
				setState(2583);
				match(Identifier);
				}
				}
				setState(2588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_lambdaBody);
		try {
			setState(2591);
			_errHandler.sync(this);
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
				setState(2589);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2590);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_assignmentExpression);
		try {
			setState(2595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2593);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2594);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
			leftHandSide();
			setState(2598);
			assignmentOperator();
			setState(2599);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_leftHandSide);
		try {
			setState(2604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2601);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2602);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2603);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(AiRingoParser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(AiRingoParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(AiRingoParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(AiRingoParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(AiRingoParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(AiRingoParser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(AiRingoParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(AiRingoParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(AiRingoParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(AiRingoParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(AiRingoParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(AiRingoParser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2606);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AiRingoParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AiRingoParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_conditionalExpression);
		try {
			setState(2615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2608);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2609);
				conditionalOrExpression(0);
				setState(2610);
				match(QUESTION);
				setState(2611);
				expression();
				setState(2612);
				match(COLON);
				setState(2613);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(AiRingoParser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 432;
		enterRecursionRule(_localctx, 432, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2618);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2620);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2621);
					match(OR);
					setState(2622);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(AiRingoParser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2629);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2631);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2632);
					match(AND);
					setState(2633);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode BITOR() { return getToken(AiRingoParser.BITOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2640);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2642);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2643);
					match(BITOR);
					setState(2644);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(AiRingoParser.CARET, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2651);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2653);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2654);
					match(CARET);
					setState(2655);
					andExpression(0);
					}
					} 
				}
				setState(2660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode BITAND() { return getToken(AiRingoParser.BITAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2662);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2664);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2665);
					match(BITAND);
					setState(2666);
					equalityExpression(0);
					}
					} 
				}
				setState(2671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AiRingoParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(AiRingoParser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2673);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2681);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2675);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2676);
						match(EQUAL);
						setState(2677);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2678);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2679);
						match(NOTEQUAL);
						setState(2680);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(AiRingoParser.LT, 0); }
		public TerminalNode GT() { return getToken(AiRingoParser.GT, 0); }
		public TerminalNode LE() { return getToken(AiRingoParser.LE, 0); }
		public TerminalNode GE() { return getToken(AiRingoParser.GE, 0); }
		public TerminalNode INSTANCEOF() { return getToken(AiRingoParser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2687);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2704);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2689);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2690);
						match(LT);
						setState(2691);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2692);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2693);
						match(GT);
						setState(2694);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2695);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2696);
						match(LE);
						setState(2697);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2698);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2699);
						match(GE);
						setState(2700);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2701);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2702);
						match(INSTANCEOF);
						setState(2703);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public List<TerminalNode> LT() { return getTokens(AiRingoParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(AiRingoParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(AiRingoParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(AiRingoParser.GT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2710);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2725);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2712);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2713);
						match(LT);
						setState(2714);
						match(LT);
						setState(2715);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2716);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2717);
						match(GT);
						setState(2718);
						match(GT);
						setState(2719);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2720);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2721);
						match(GT);
						setState(2722);
						match(GT);
						setState(2723);
						match(GT);
						setState(2724);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(AiRingoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AiRingoParser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2731);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2739);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2733);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2734);
						match(ADD);
						setState(2735);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2736);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2737);
						match(SUB);
						setState(2738);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(AiRingoParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AiRingoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AiRingoParser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2745);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2756);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2747);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2748);
						match(MUL);
						setState(2749);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2750);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2751);
						match(DIV);
						setState(2752);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2753);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2754);
						match(MOD);
						setState(2755);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(AiRingoParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(AiRingoParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_unaryExpression);
		try {
			setState(2768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2761);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2762);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2763);
				match(ADD);
				setState(2764);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2765);
				match(SUB);
				setState(2766);
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
				setState(2767);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(AiRingoParser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2770);
			match(INC);
			setState(2771);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(AiRingoParser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2773);
			match(DEC);
			setState(2774);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(AiRingoParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(AiRingoParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2776);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2777);
				match(TILDE);
				setState(2778);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2779);
				match(BANG);
				setState(2780);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2781);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2784);
				primary();
				}
				break;
			case 2:
				{
				setState(2785);
				expressionName();
				}
				break;
			}
			setState(2792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2790);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2788);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2789);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(AiRingoParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
			postfixExpression();
			setState(2796);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(AiRingoParser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(AiRingoParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2800);
			postfixExpression();
			setState(2801);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(AiRingoParser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2803);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(AiRingoParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AiRingoParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AiRingoParserListener ) ((AiRingoParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AiRingoParserVisitor ) return ((AiRingoParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_castExpression);
		int _la;
		try {
			setState(2832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2805);
				match(LPAREN);
				setState(2806);
				primitiveType();
				setState(2807);
				match(RPAREN);
				setState(2808);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2810);
				match(LPAREN);
				setState(2811);
				referenceType();
				setState(2815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2812);
					additionalBound();
					}
					}
					setState(2817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2818);
				match(RPAREN);
				setState(2819);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2821);
				match(LPAREN);
				setState(2822);
				referenceType();
				setState(2826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2823);
					additionalBound();
					}
					}
					setState(2828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2829);
				match(RPAREN);
				setState(2830);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 28:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 216:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 217:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 218:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 219:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 220:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 221:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 222:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 223:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 224:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 225:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
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
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
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

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3m\u0b15\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\3\2\7\2\u01dc\n\2\f\2\16\2\u01df\13\2\3\2\3\2\3\3\3\3"+
		"\3\4\7\4\u01e6\n\4\f\4\16\4\u01e9\13\4\3\4\3\4\7\4\u01ed\n\4\f\4\16\4"+
		"\u01f0\13\4\3\4\5\4\u01f3\n\4\3\5\3\5\5\5\u01f7\n\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\5\b\u0200\n\b\3\t\3\t\5\t\u0204\n\t\3\t\3\t\7\t\u0208\n\t\f"+
		"\t\16\t\u020b\13\t\3\n\7\n\u020e\n\n\f\n\16\n\u0211\13\n\3\n\3\n\5\n\u0215"+
		"\n\n\3\n\3\n\3\n\7\n\u021a\n\n\f\n\16\n\u021d\13\n\3\n\3\n\5\n\u0221\n"+
		"\n\5\n\u0223\n\n\3\13\3\13\7\13\u0227\n\13\f\13\16\13\u022a\13\13\3\13"+
		"\3\13\5\13\u022e\n\13\3\f\7\f\u0231\n\f\f\f\16\f\u0234\13\f\3\f\3\f\5"+
		"\f\u0238\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u0241\n\20\f\20\16"+
		"\20\u0244\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0251\n\21\3\22\7\22\u0254\n\22\f\22\16\22\u0257\13\22\3\22\3\22"+
		"\3\22\7\22\u025c\n\22\f\22\16\22\u025f\13\22\3\22\3\22\7\22\u0263\n\22"+
		"\f\22\16\22\u0266\13\22\3\23\7\23\u0269\n\23\f\23\16\23\u026c\13\23\3"+
		"\23\3\23\5\23\u0270\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0279"+
		"\n\25\f\25\16\25\u027c\13\25\5\25\u027e\n\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u028a\n\30\f\30\16\30\u028d\13\30\3\31"+
		"\3\31\5\31\u0291\n\31\3\32\7\32\u0294\n\32\f\32\16\32\u0297\13\32\3\32"+
		"\3\32\5\32\u029b\n\32\3\33\3\33\3\33\3\33\5\33\u02a1\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u02a9\n\34\f\34\16\34\u02ac\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u02b3\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02bb"+
		"\n\36\f\36\16\36\u02be\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u02c5\n\37"+
		"\3 \3 \3!\3!\3!\3!\3!\3!\7!\u02cf\n!\f!\16!\u02d2\13!\3\"\7\"\u02d5\n"+
		"\"\f\"\16\"\u02d8\13\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u02e4\n$\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\5)\u0301\n)\3*\3*\5*\u0305\n*\3+\7+\u0308\n+\f+\16+\u030b"+
		"\13+\3+\3+\3+\5+\u0310\n+\3+\5+\u0313\n+\3+\5+\u0316\n+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\5,\u0322\n,\3-\3-\3-\3-\3.\3.\3.\7.\u032b\n.\f.\16.\u032e"+
		"\13.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\7\61\u0339\n\61\f\61\16\61"+
		"\u033c\13\61\3\62\3\62\7\62\u0340\n\62\f\62\16\62\u0343\13\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\5\63\u034b\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u0352"+
		"\n\64\3\65\7\65\u0355\n\65\f\65\16\65\u0358\13\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0366\n\66\3\67\3\67\3\67"+
		"\7\67\u036b\n\67\f\67\16\67\u036e\13\67\38\38\38\58\u0373\n8\39\39\59"+
		"\u0377\n9\3:\3:\5:\u037b\n:\3;\3;\5;\u037f\n;\3<\3<\5<\u0383\n<\3=\3="+
		"\3=\5=\u0388\n=\3>\3>\5>\u038c\n>\3>\3>\7>\u0390\n>\f>\16>\u0393\13>\3"+
		"?\3?\5?\u0397\n?\3?\3?\3?\7?\u039c\n?\f?\16?\u039f\13?\3?\3?\5?\u03a3"+
		"\n?\5?\u03a5\n?\3@\3@\7@\u03a9\n@\f@\16@\u03ac\13@\3@\3@\5@\u03b0\n@\3"+
		"A\3A\5A\u03b4\nA\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\5"+
		"F\u03c7\nF\3G\7G\u03ca\nG\fG\16G\u03cd\13G\3G\3G\3G\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\5H\u03dc\nH\3I\3I\3I\5I\u03e1\nI\3I\3I\7I\u03e5\nI\fI\16"+
		"I\u03e8\13I\3I\3I\3I\5I\u03ed\nI\5I\u03ef\nI\3J\3J\5J\u03f3\nJ\3K\3K\3"+
		"K\5K\u03f8\nK\3K\3K\5K\u03fc\nK\3L\3L\3L\3L\3L\3L\5L\u0404\nL\3M\3M\3"+
		"M\7M\u0409\nM\fM\16M\u040c\13M\3M\3M\3M\7M\u0411\nM\fM\16M\u0414\13M\5"+
		"M\u0416\nM\3N\7N\u0419\nN\fN\16N\u041c\13N\3N\3N\3N\3O\3O\5O\u0423\nO"+
		"\3P\7P\u0426\nP\fP\16P\u0429\13P\3P\3P\7P\u042d\nP\fP\16P\u0430\13P\3"+
		"P\3P\3P\3P\5P\u0436\nP\3Q\7Q\u0439\nQ\fQ\16Q\u043c\13Q\3Q\3Q\3Q\5Q\u0441"+
		"\nQ\3Q\3Q\3R\3R\3R\3S\3S\3S\7S\u044b\nS\fS\16S\u044e\13S\3T\3T\5T\u0452"+
		"\nT\3U\3U\5U\u0456\nU\3V\3V\3W\3W\3W\3X\7X\u045e\nX\fX\16X\u0461\13X\3"+
		"X\3X\5X\u0465\nX\3X\3X\3Y\3Y\3Y\3Y\5Y\u046d\nY\3Z\5Z\u0470\nZ\3Z\3Z\3"+
		"Z\5Z\u0475\nZ\3Z\3Z\3[\3[\3\\\3\\\5\\\u047d\n\\\3\\\5\\\u0480\n\\\3\\"+
		"\3\\\3]\5]\u0485\n]\3]\3]\3]\5]\u048a\n]\3]\3]\3]\5]\u048f\n]\3]\3]\3"+
		"]\5]\u0494\n]\3]\3]\3]\3]\3]\5]\u049b\n]\3]\3]\3]\5]\u04a0\n]\3]\3]\3"+
		"]\3]\3]\3]\5]\u04a8\n]\3]\3]\3]\5]\u04ad\n]\3]\3]\3]\5]\u04b2\n]\3^\7"+
		"^\u04b5\n^\f^\16^\u04b8\13^\3^\3^\3^\5^\u04bd\n^\3^\3^\3_\3_\5_\u04c3"+
		"\n_\3_\5_\u04c6\n_\3_\5_\u04c9\n_\3_\3_\3`\3`\3`\7`\u04d0\n`\f`\16`\u04d3"+
		"\13`\3a\7a\u04d6\na\fa\16a\u04d9\13a\3a\3a\3a\5a\u04de\na\3a\5a\u04e1"+
		"\na\3a\5a\u04e4\na\3b\3b\3c\3c\7c\u04ea\nc\fc\16c\u04ed\13c\3d\3d\5d\u04f1"+
		"\nd\3e\7e\u04f4\ne\fe\16e\u04f7\13e\3e\3e\3e\5e\u04fc\ne\3e\5e\u04ff\n"+
		"e\3e\3e\3f\3f\3f\3f\3f\3f\3f\5f\u050a\nf\3g\3g\3g\3h\3h\7h\u0511\nh\f"+
		"h\16h\u0514\13h\3h\3h\3i\3i\3i\3i\3i\5i\u051d\ni\3j\7j\u0520\nj\fj\16"+
		"j\u0523\13j\3j\3j\3j\3j\3k\3k\3k\3k\5k\u052d\nk\3l\7l\u0530\nl\fl\16l"+
		"\u0533\13l\3l\3l\3l\3m\3m\3m\3m\3m\3m\5m\u053e\nm\3n\7n\u0541\nn\fn\16"+
		"n\u0544\13n\3n\3n\3n\3n\3n\3o\3o\7o\u054d\no\fo\16o\u0550\13o\3o\3o\3"+
		"p\3p\3p\3p\3p\5p\u0559\np\3q\7q\u055c\nq\fq\16q\u055f\13q\3q\3q\3q\3q"+
		"\3q\5q\u0566\nq\3q\5q\u0569\nq\3q\3q\3r\3r\3r\5r\u0570\nr\3s\3s\3s\3t"+
		"\3t\3t\5t\u0578\nt\3u\3u\3u\3u\5u\u057e\nu\3u\3u\3v\3v\3v\7v\u0585\nv"+
		"\fv\16v\u0588\13v\3w\3w\3w\3w\3x\3x\3x\5x\u0591\nx\3y\3y\5y\u0595\ny\3"+
		"y\5y\u0598\ny\3y\3y\3z\3z\3z\7z\u059f\nz\fz\16z\u05a2\13z\3{\3{\3{\3|"+
		"\3|\3|\3|\3|\3|\3}\3}\5}\u05af\n}\3}\5}\u05b2\n}\3}\3}\3~\3~\3~\7~\u05b9"+
		"\n~\f~\16~\u05bc\13~\3\177\3\177\5\177\u05c0\n\177\3\177\3\177\3\u0080"+
		"\6\u0080\u05c5\n\u0080\r\u0080\16\u0080\u05c6\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u05cc\n\u0081\3\u0082\3\u0082\3\u0082\3\u0083\7\u0083\u05d2\n"+
		"\u0083\f\u0083\16\u0083\u05d5\13\u0083\3\u0083\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u05e0\n\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u05e7\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u05f5\n\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u060b\n\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u062d\n\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\7\u0091\u0637"+
		"\n\u0091\f\u0091\16\u0091\u063a\13\u0091\3\u0091\7\u0091\u063d\n\u0091"+
		"\f\u0091\16\u0091\u0640\13\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\7\u0093\u0649\n\u0093\f\u0093\16\u0093\u064c\13\u0093"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u0658\n\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\5\u0099\u0672\n\u0099\3\u009a\3\u009a\5\u009a\u0676\n\u009a\3"+
		"\u009b\3\u009b\3\u009b\5\u009b\u067b\n\u009b\3\u009b\3\u009b\5\u009b\u067f"+
		"\n\u009b\3\u009b\3\u009b\5\u009b\u0683\n\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009c\3\u009c\3\u009c\5\u009c\u068b\n\u009c\3\u009c\3\u009c\5\u009c"+
		"\u068f\n\u009c\3\u009c\3\u009c\5\u009c\u0693\n\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009d\3\u009d\5\u009d\u069a\n\u009d\3\u009e\3\u009e\3\u009f\3"+
		"\u009f\3\u009f\7\u009f\u06a1\n\u009f\f\u009f\16\u009f\u06a4\13\u009f\3"+
		"\u00a0\3\u00a0\3\u00a0\7\u00a0\u06a9\n\u00a0\f\u00a0\16\u00a0\u06ac\13"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a1\7\u00a1\u06b8\n\u00a1\f\u00a1\16\u00a1\u06bb\13\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\5\u00a2\u06c6\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u06cc\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u06d2\n\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\5\u00a7\u06e7\n\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u06ec\n\u00a7\3"+
		"\u00a8\3\u00a8\7\u00a8\u06f0\n\u00a8\f\u00a8\16\u00a8\u06f3\13\u00a8\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa\7\u00aa\u06fc\n"+
		"\u00aa\f\u00aa\16\u00aa\u06ff\13\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ab\7\u00ab\u0707\n\u00ab\f\u00ab\16\u00ab\u070a\13\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0713"+
		"\n\u00ad\3\u00ad\5\u00ad\u0716\n\u00ad\3\u00ae\3\u00ae\3\u00ae\5\u00ae"+
		"\u071b\n\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\7\u00af\u0722\n"+
		"\u00af\f\u00af\16\u00af\u0725\13\u00af\3\u00b0\7\u00b0\u0728\n\u00b0\f"+
		"\u00b0\16\u00b0\u072b\13\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b1\3\u00b1\5\u00b1\u0734\n\u00b1\3\u00b1\7\u00b1\u0737\n\u00b1\f"+
		"\u00b1\16\u00b1\u073a\13\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2"+
		"\u0740\n\u00b2\f\u00b2\16\u00b2\u0743\13\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u0759\n\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4"+
		"\u0761\n\u00b4\f\u00b4\16\u00b4\u0764\13\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0779"+
		"\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0780\n\u00b5"+
		"\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0788\n\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u078e\n\u00b8\f\u00b8\16\u00b8"+
		"\u0791\13\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8"+
		"\u0799\n\u00b8\f\u00b8\16\u00b8\u079c\13\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8"+
		"\u07b2\n\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba"+
		"\u07ba\n\u00ba\f\u00ba\16\u00ba\u07bd\13\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u07c5\n\u00ba\f\u00ba\16\u00ba\u07c8"+
		"\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u07dd\n\u00ba\3\u00bb\3\u00bb\5\u00bb\u07e1\n"+
		"\u00bb\3\u00bb\7\u00bb\u07e4\n\u00bb\f\u00bb\16\u00bb\u07e7\13\u00bb\3"+
		"\u00bb\3\u00bb\3\u00bb\7\u00bb\u07ec\n\u00bb\f\u00bb\16\u00bb\u07ef\13"+
		"\u00bb\3\u00bb\7\u00bb\u07f2\n\u00bb\f\u00bb\16\u00bb\u07f5\13\u00bb\3"+
		"\u00bb\5\u00bb\u07f8\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u07fc\n\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0800\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb"+
		"\u0806\n\u00bb\3\u00bb\7\u00bb\u0809\n\u00bb\f\u00bb\16\u00bb\u080c\13"+
		"\u00bb\3\u00bb\3\u00bb\5\u00bb\u0810\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0814"+
		"\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0818\n\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u081e\n\u00bb\3\u00bb\7\u00bb\u0821\n\u00bb\f\u00bb\16"+
		"\u00bb\u0824\13\u00bb\3\u00bb\3\u00bb\5\u00bb\u0828\n\u00bb\3\u00bb\3"+
		"\u00bb\5\u00bb\u082c\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0830\n\u00bb\5\u00bb"+
		"\u0832\n\u00bb\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0837\n\u00bc\3\u00bc\7"+
		"\u00bc\u083a\n\u00bc\f\u00bc\16\u00bc\u083d\13\u00bc\3\u00bc\3\u00bc\5"+
		"\u00bc\u0841\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0845\n\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u0849\n\u00bc\3\u00bd\3\u00bd\5\u00bd\u084d\n\u00bd\3\u00bd\7"+
		"\u00bd\u0850\n\u00bd\f\u00bd\16\u00bd\u0853\13\u00bd\3\u00bd\3\u00bd\3"+
		"\u00bd\7\u00bd\u0858\n\u00bd\f\u00bd\16\u00bd\u085b\13\u00bd\3\u00bd\7"+
		"\u00bd\u085e\n\u00bd\f\u00bd\16\u00bd\u0861\13\u00bd\3\u00bd\5\u00bd\u0864"+
		"\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0868\n\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u086c\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0872\n\u00bd\3"+
		"\u00bd\7\u00bd\u0875\n\u00bd\f\u00bd\16\u00bd\u0878\13\u00bd\3\u00bd\3"+
		"\u00bd\5\u00bd\u087c\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0880\n\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u0884\n\u00bd\5\u00bd\u0886\n\u00bd\3\u00be\3\u00be\3"+
		"\u00be\5\u00be\u088b\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u089a\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u08a8\n\u00c1\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u08b4\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\7\u00c2"+
		"\u08bb\n\u00c2\f\u00c2\16\u00c2\u08be\13\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u08ca"+
		"\n\u00c3\f\u00c3\16\u00c3\u08cd\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u08d9\n\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u08e0\n\u00c4\f\u00c4"+
		"\16\u00c4\u08e3\13\u00c4\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08e8\n\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08ef\n\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\5\u00c5\u08f4\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u08fb\n\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0900\n"+
		"\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0907\n\u00c5\3"+
		"\u00c5\3\u00c5\3\u00c5\5\u00c5\u090c\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c5\5\u00c5\u0913\n\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0918"+
		"\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0920"+
		"\n\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0925\n\u00c5\3\u00c5\3\u00c5"+
		"\5\u00c5\u0929\n\u00c5\3\u00c6\3\u00c6\5\u00c6\u092d\n\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u0932\n\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3"+
		"\u00c7\5\u00c7\u0939\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5"+
		"\u00c7\u0940\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0945\n\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u094c\n\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u0951\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\5\u00c7\u0958\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u095d\n\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0965\n\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\5\u00c7\u096a\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u096e"+
		"\n\u00c7\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u0973\n\u00c8\f\u00c8\16\u00c8"+
		"\u0976\13\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u097b\n\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0982\n\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0989\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0990\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0998\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u099f\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u09a7\n\u00c9\3\u00ca\3\u00ca\5\u00ca\u09ab\n\u00ca\3"+
		"\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09b2\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09b9\n\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\5\u00cb\u09c0\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\5\u00cb\u09c8\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\5\u00cb\u09cf\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\5\u00cb\u09d7\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5"+
		"\u00cc\u09dd\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u09e3\n\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\5\u00cc\u09ef\n\u00cc\3\u00cd\3\u00cd\7\u00cd\u09f3\n\u00cd\f"+
		"\u00cd\16\u00cd\u09f6\13\u00cd\3\u00ce\7\u00ce\u09f9\n\u00ce\f\u00ce\16"+
		"\u00ce\u09fc\13\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf"+
		"\3\u00d0\3\u00d0\5\u00d0\u0a06\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0a0f\n\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\5\u00d2\u0a16\n\u00d2\3\u00d3\3\u00d3\3\u00d3\7\u00d3"+
		"\u0a1b\n\u00d3\f\u00d3\16\u00d3\u0a1e\13\u00d3\3\u00d4\3\u00d4\5\u00d4"+
		"\u0a22\n\u00d4\3\u00d5\3\u00d5\5\u00d5\u0a26\n\u00d5\3\u00d6\3\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d7\5\u00d7\u0a2f\n\u00d7\3\u00d8\3"+
		"\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9"+
		"\u0a3a\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\7\u00da"+
		"\u0a42\n\u00da\f\u00da\16\u00da\u0a45\13\u00da\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\7\u00db\u0a4d\n\u00db\f\u00db\16\u00db\u0a50"+
		"\13\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0a58"+
		"\n\u00dc\f\u00dc\16\u00dc\u0a5b\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\7\u00dd\u0a63\n\u00dd\f\u00dd\16\u00dd\u0a66\13\u00dd"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0a6e\n\u00de"+
		"\f\u00de\16\u00de\u0a71\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df\u0a7c\n\u00df\f\u00df\16\u00df"+
		"\u0a7f\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\7\u00e0\u0a93\n\u00e0\f\u00e0\16\u00e0\u0a96\13\u00e0"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0aa8"+
		"\n\u00e1\f\u00e1\16\u00e1\u0aab\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0ab6\n\u00e2\f\u00e2"+
		"\16\u00e2\u0ab9\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0ac7\n\u00e3"+
		"\f\u00e3\16\u00e3\u0aca\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\5\u00e4\u0ad3\n\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7"+
		"\u0ae1\n\u00e7\3\u00e8\3\u00e8\5\u00e8\u0ae5\n\u00e8\3\u00e8\3\u00e8\7"+
		"\u00e8\u0ae9\n\u00e8\f\u00e8\16\u00e8\u0aec\13\u00e8\3\u00e9\3\u00e9\3"+
		"\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0b00"+
		"\n\u00ed\f\u00ed\16\u00ed\u0b03\13\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\7\u00ed\u0b0b\n\u00ed\f\u00ed\16\u00ed\u0b0e\13\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\5\u00ed\u0b13\n\u00ed\3\u00ed\2\17\66:@\u01b2"+
		"\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u00ee\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\2\6\3\2\65:\7\2\7\7\n"+
		"\n\35\35\37\37\'\'\4\2\20\20\26\26\4\2DD]g\2\u0c04\2\u01dd\3\2\2\2\4\u01e2"+
		"\3\2\2\2\6\u01f2\3\2\2\2\b\u01f6\3\2\2\2\n\u01f8\3\2\2\2\f\u01fa\3\2\2"+
		"\2\16\u01ff\3\2\2\2\20\u0203\3\2\2\2\22\u0222\3\2\2\2\24\u0224\3\2\2\2"+
		"\26\u0232\3\2\2\2\30\u0239\3\2\2\2\32\u023b\3\2\2\2\34\u023d\3\2\2\2\36"+
		"\u0242\3\2\2\2 \u0250\3\2\2\2\"\u0255\3\2\2\2$\u026a\3\2\2\2&\u0271\3"+
		"\2\2\2(\u027d\3\2\2\2*\u027f\3\2\2\2,\u0282\3\2\2\2.\u0286\3\2\2\2\60"+
		"\u0290\3\2\2\2\62\u0295\3\2\2\2\64\u02a0\3\2\2\2\66\u02a2\3\2\2\28\u02b2"+
		"\3\2\2\2:\u02b4\3\2\2\2<\u02c4\3\2\2\2>\u02c6\3\2\2\2@\u02c8\3\2\2\2B"+
		"\u02d6\3\2\2\2D\u02dd\3\2\2\2F\u02e3\3\2\2\2H\u02e5\3\2\2\2J\u02e9\3\2"+
		"\2\2L\u02ef\3\2\2\2N\u02f6\3\2\2\2P\u0300\3\2\2\2R\u0304\3\2\2\2T\u0309"+
		"\3\2\2\2V\u0321\3\2\2\2X\u0323\3\2\2\2Z\u0327\3\2\2\2\\\u032f\3\2\2\2"+
		"^\u0332\3\2\2\2`\u0335\3\2\2\2b\u033d\3\2\2\2d\u034a\3\2\2\2f\u0351\3"+
		"\2\2\2h\u0356\3\2\2\2j\u0365\3\2\2\2l\u0367\3\2\2\2n\u036f\3\2\2\2p\u0374"+
		"\3\2\2\2r\u037a\3\2\2\2t\u037e\3\2\2\2v\u0382\3\2\2\2x\u0387\3\2\2\2z"+
		"\u038b\3\2\2\2|\u03a4\3\2\2\2~\u03a6\3\2\2\2\u0080\u03b1\3\2\2\2\u0082"+
		"\u03b5\3\2\2\2\u0084\u03b7\3\2\2\2\u0086\u03b9\3\2\2\2\u0088\u03bb\3\2"+
		"\2\2\u008a\u03c6\3\2\2\2\u008c\u03cb\3\2\2\2\u008e\u03db\3\2\2\2\u0090"+
		"\u03ee\3\2\2\2\u0092\u03f2\3\2\2\2\u0094\u03f4\3\2\2\2\u0096\u0403\3\2"+
		"\2\2\u0098\u0415\3\2\2\2\u009a\u041a\3\2\2\2\u009c\u0422\3\2\2\2\u009e"+
		"\u0435\3\2\2\2\u00a0\u043a\3\2\2\2\u00a2\u0444\3\2\2\2\u00a4\u0447\3\2"+
		"\2\2\u00a6\u0451\3\2\2\2\u00a8\u0455\3\2\2\2\u00aa\u0457\3\2\2\2\u00ac"+
		"\u0459\3\2\2\2\u00ae\u045f\3\2\2\2\u00b0\u046c\3\2\2\2\u00b2\u046f\3\2"+
		"\2\2\u00b4\u0478\3\2\2\2\u00b6\u047a\3\2\2\2\u00b8\u04b1\3\2\2\2\u00ba"+
		"\u04b6\3\2\2\2\u00bc\u04c0\3\2\2\2\u00be\u04cc\3\2\2\2\u00c0\u04d7\3\2"+
		"\2\2\u00c2\u04e5\3\2\2\2\u00c4\u04e7\3\2\2\2\u00c6\u04f0\3\2\2\2\u00c8"+
		"\u04f5\3\2\2\2\u00ca\u0509\3\2\2\2\u00cc\u050b\3\2\2\2\u00ce\u050e\3\2"+
		"\2\2\u00d0\u051c\3\2\2\2\u00d2\u0521\3\2\2\2\u00d4\u052c\3\2\2\2\u00d6"+
		"\u0531\3\2\2\2\u00d8\u053d\3\2\2\2\u00da\u0542\3\2\2\2\u00dc\u054a\3\2"+
		"\2\2\u00de\u0558\3\2\2\2\u00e0\u055d\3\2\2\2\u00e2\u056f\3\2\2\2\u00e4"+
		"\u0571\3\2\2\2\u00e6\u0577\3\2\2\2\u00e8\u0579\3\2\2\2\u00ea\u0581\3\2"+
		"\2\2\u00ec\u0589\3\2\2\2\u00ee\u0590\3\2\2\2\u00f0\u0592\3\2\2\2\u00f2"+
		"\u059b\3\2\2\2\u00f4\u05a3\3\2\2\2\u00f6\u05a6\3\2\2\2\u00f8\u05ac\3\2"+
		"\2\2\u00fa\u05b5\3\2\2\2\u00fc\u05bd\3\2\2\2\u00fe\u05c4\3\2\2\2\u0100"+
		"\u05cb\3\2\2\2\u0102\u05cd\3\2\2\2\u0104\u05d3\3\2\2\2\u0106\u05df\3\2"+
		"\2\2\u0108\u05e6\3\2\2\2\u010a\u05f4\3\2\2\2\u010c\u05f6\3\2\2\2\u010e"+
		"\u05f8\3\2\2\2\u0110\u05fc\3\2\2\2\u0112\u0600\3\2\2\2\u0114\u060a\3\2"+
		"\2\2\u0116\u060c\3\2\2\2\u0118\u0612\3\2\2\2\u011a\u061a\3\2\2\2\u011c"+
		"\u062c\3\2\2\2\u011e\u062e\3\2\2\2\u0120\u0634\3\2\2\2\u0122\u0643\3\2"+
		"\2\2\u0124\u0646\3\2\2\2\u0126\u0657\3\2\2\2\u0128\u0659\3\2\2\2\u012a"+
		"\u065b\3\2\2\2\u012c\u0661\3\2\2\2\u012e\u0667\3\2\2\2\u0130\u0671\3\2"+
		"\2\2\u0132\u0675\3\2\2\2\u0134\u0677\3\2\2\2\u0136\u0687\3\2\2\2\u0138"+
		"\u0699\3\2\2\2\u013a\u069b\3\2\2\2\u013c\u069d\3\2\2\2\u013e\u06a5\3\2"+
		"\2\2\u0140\u06b4\3\2\2\2\u0142\u06c3\3\2\2\2\u0144\u06c9\3\2\2\2\u0146"+
		"\u06cf\3\2\2\2\u0148\u06d5\3\2\2\2\u014a\u06d9\3\2\2\2\u014c\u06eb\3\2"+
		"\2\2\u014e\u06ed\3\2\2\2\u0150\u06f4\3\2\2\2\u0152\u06fd\3\2\2\2\u0154"+
		"\u0703\3\2\2\2\u0156\u070b\3\2\2\2\u0158\u070e\3\2\2\2\u015a\u0717\3\2"+
		"\2\2\u015c\u071e\3\2\2\2\u015e\u0729\3\2\2\2\u0160\u0733\3\2\2\2\u0162"+
		"\u0758\3\2\2\2\u0164\u075a\3\2\2\2\u0166\u0778\3\2\2\2\u0168\u077f\3\2"+
		"\2\2\u016a\u0781\3\2\2\2\u016c\u0787\3\2\2\2\u016e\u07b1\3\2\2\2\u0170"+
		"\u07b3\3\2\2\2\u0172\u07dc\3\2\2\2\u0174\u0831\3\2\2\2\u0176\u0833\3\2"+
		"\2\2\u0178\u0885\3\2\2\2\u017a\u088a\3\2\2\2\u017c\u0899\3\2\2\2\u017e"+
		"\u089b\3\2\2\2\u0180\u08a7\3\2\2\2\u0182\u08b3\3\2\2\2\u0184\u08bf\3\2"+
		"\2\2\u0186\u08d8\3\2\2\2\u0188\u0928\3\2\2\2\u018a\u092a\3\2\2\2\u018c"+
		"\u096d\3\2\2\2\u018e\u096f\3\2\2\2\u0190\u09a6\3\2\2\2\u0192\u09a8\3\2"+
		"\2\2\u0194\u09d6\3\2\2\2\u0196\u09ee\3\2\2\2\u0198\u09f0\3\2\2\2\u019a"+
		"\u09fa\3\2\2\2\u019c\u0a01\3\2\2\2\u019e\u0a05\3\2\2\2\u01a0\u0a07\3\2"+
		"\2\2\u01a2\u0a15\3\2\2\2\u01a4\u0a17\3\2\2\2\u01a6\u0a21\3\2\2\2\u01a8"+
		"\u0a25\3\2\2\2\u01aa\u0a27\3\2\2\2\u01ac\u0a2e\3\2\2\2\u01ae\u0a30\3\2"+
		"\2\2\u01b0\u0a39\3\2\2\2\u01b2\u0a3b\3\2\2\2\u01b4\u0a46\3\2\2\2\u01b6"+
		"\u0a51\3\2\2\2\u01b8\u0a5c\3\2\2\2\u01ba\u0a67\3\2\2\2\u01bc\u0a72\3\2"+
		"\2\2\u01be\u0a80\3\2\2\2\u01c0\u0a97\3\2\2\2\u01c2\u0aac\3\2\2\2\u01c4"+
		"\u0aba\3\2\2\2\u01c6\u0ad2\3\2\2\2\u01c8\u0ad4\3\2\2\2\u01ca\u0ad7\3\2"+
		"\2\2\u01cc\u0ae0\3\2\2\2\u01ce\u0ae4\3\2\2\2\u01d0\u0aed\3\2\2\2\u01d2"+
		"\u0af0\3\2\2\2\u01d4\u0af2\3\2\2\2\u01d6\u0af5\3\2\2\2\u01d8\u0b12\3\2"+
		"\2\2\u01da\u01dc\5\u00fe\u0080\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2"+
		"\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01e0\u01e1\7\2\2\3\u01e1\3\3\2\2\2\u01e2\u01e3\t\2\2\2\u01e3"+
		"\5\3\2\2\2\u01e4\u01e6\5\u00e6t\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01f3\5\b\5\2\u01eb\u01ed\5\u00e6t\2\u01ec\u01eb"+
		"\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\7\5\2\2\u01f2\u01e7\3\2"+
		"\2\2\u01f2\u01ee\3\2\2\2\u01f3\7\3\2\2\2\u01f4\u01f7\5\n\6\2\u01f5\u01f7"+
		"\5\f\7\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\t\3\2\2\2\u01f8"+
		"\u01f9\t\3\2\2\u01f9\13\3\2\2\2\u01fa\u01fb\t\4\2\2\u01fb\r\3\2\2\2\u01fc"+
		"\u0200\5\20\t\2\u01fd\u0200\5\36\20\2\u01fe\u0200\5 \21\2\u01ff\u01fc"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\17\3\2\2\2\u0201"+
		"\u0204\5\26\f\2\u0202\u0204\5\34\17\2\u0203\u0201\3\2\2\2\u0203\u0202"+
		"\3\2\2\2\u0204\u0209\3\2\2\2\u0205\u0208\5\24\13\2\u0206\u0208\5\32\16"+
		"\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\21\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020e\5\u00e6t\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212"+
		"\u0214\7h\2\2\u0213\u0215\5,\27\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u0223\3\2\2\2\u0216\u0217\5\20\t\2\u0217\u021b\7C\2\2\u0218"+
		"\u021a\5\u00e6t\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e"+
		"\u0220\7h\2\2\u021f\u0221\5,\27\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0223\3\2\2\2\u0222\u020f\3\2\2\2\u0222\u0216\3\2\2\2\u0223"+
		"\23\3\2\2\2\u0224\u0228\7C\2\2\u0225\u0227\5\u00e6t\2\u0226\u0225\3\2"+
		"\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\7h\2\2\u022c\u022e\5,\27"+
		"\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\25\3\2\2\2\u022f\u0231"+
		"\5\u00e6t\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2"+
		"\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0237"+
		"\7h\2\2\u0236\u0238\5,\27\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\27\3\2\2\2\u0239\u023a\5\22\n\2\u023a\31\3\2\2\2\u023b\u023c\5\24\13"+
		"\2\u023c\33\3\2\2\2\u023d\u023e\5\26\f\2\u023e\35\3\2\2\2\u023f\u0241"+
		"\5\u00e6t\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2"+
		"\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246"+
		"\7h\2\2\u0246\37\3\2\2\2\u0247\u0248\5\6\4\2\u0248\u0249\5\"\22\2\u0249"+
		"\u0251\3\2\2\2\u024a\u024b\5\20\t\2\u024b\u024c\5\"\22\2\u024c\u0251\3"+
		"\2\2\2\u024d\u024e\5\36\20\2\u024e\u024f\5\"\22\2\u024f\u0251\3\2\2\2"+
		"\u0250\u0247\3\2\2\2\u0250\u024a\3\2\2\2\u0250\u024d\3\2\2\2\u0251!\3"+
		"\2\2\2\u0252\u0254\5\u00e6t\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2"+
		"\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0255"+
		"\3\2\2\2\u0258\u0259\7?\2\2\u0259\u0264\7@\2\2\u025a\u025c\5\u00e6t\2"+
		"\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7?\2\2\u0261"+
		"\u0263\7@\2\2\u0262\u025d\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265#\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0269"+
		"\5&\24\2\u0268\u0267\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026f\7h"+
		"\2\2\u026e\u0270\5(\25\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"%\3\2\2\2\u0271\u0272\5\u00e6t\2\u0272\'\3\2\2\2\u0273\u0274\7\23\2\2"+
		"\u0274\u027e\5\36\20\2\u0275\u0276\7\23\2\2\u0276\u027a\5\20\t\2\u0277"+
		"\u0279\5*\26\2\u0278\u0277\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027d"+
		"\u0273\3\2\2\2\u027d\u0275\3\2\2\2\u027e)\3\2\2\2\u027f\u0280\7W\2\2\u0280"+
		"\u0281\5\30\r\2\u0281+\3\2\2\2\u0282\u0283\7F\2\2\u0283\u0284\5.\30\2"+
		"\u0284\u0285\7E\2\2\u0285-\3\2\2\2\u0286\u028b\5\60\31\2\u0287\u0288\7"+
		"B\2\2\u0288\u028a\5\60\31\2\u0289\u0287\3\2\2\2\u028a\u028d\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c/\3\2\2\2\u028d\u028b\3\2\2\2"+
		"\u028e\u0291\5\16\b\2\u028f\u0291\5\62\32\2\u0290\u028e\3\2\2\2\u0290"+
		"\u028f\3\2\2\2\u0291\61\3\2\2\2\u0292\u0294\5\u00e6t\2\u0293\u0292\3\2"+
		"\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029a\7I\2\2\u0299\u029b\5\64"+
		"\33\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\63\3\2\2\2\u029c\u029d"+
		"\7\23\2\2\u029d\u02a1\5\16\b\2\u029e\u029f\7*\2\2\u029f\u02a1\5\16\b\2"+
		"\u02a0\u029c\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\65\3\2\2\2\u02a2\u02a3"+
		"\b\34\1\2\u02a3\u02a4\7h\2\2\u02a4\u02aa\3\2\2\2\u02a5\u02a6\f\3\2\2\u02a6"+
		"\u02a7\7C\2\2\u02a7\u02a9\7h\2\2\u02a8\u02a5\3\2\2\2\u02a9\u02ac\3\2\2"+
		"\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\67\3\2\2\2\u02ac\u02aa"+
		"\3\2\2\2\u02ad\u02b3\7h\2\2\u02ae\u02af\5:\36\2\u02af\u02b0\7C\2\2\u02b0"+
		"\u02b1\7h\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b2\u02ae\3\2"+
		"\2\2\u02b39\3\2\2\2\u02b4\u02b5\b\36\1\2\u02b5\u02b6\7h\2\2\u02b6\u02bc"+
		"\3\2\2\2\u02b7\u02b8\f\3\2\2\u02b8\u02b9\7C\2\2\u02b9\u02bb\7h\2\2\u02ba"+
		"\u02b7\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd;\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c5\7h\2\2\u02c0\u02c1"+
		"\5@!\2\u02c1\u02c2\7C\2\2\u02c2\u02c3\7h\2\2\u02c3\u02c5\3\2\2\2\u02c4"+
		"\u02bf\3\2\2\2\u02c4\u02c0\3\2\2\2\u02c5=\3\2\2\2\u02c6\u02c7\7h\2\2\u02c7"+
		"?\3\2\2\2\u02c8\u02c9\b!\1\2\u02c9\u02ca\7h\2\2\u02ca\u02d0\3\2\2\2\u02cb"+
		"\u02cc\f\3\2\2\u02cc\u02cd\7C\2\2\u02cd\u02cf\7h\2\2\u02ce\u02cb\3\2\2"+
		"\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1A"+
		"\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d5\5D#\2\u02d4\u02d3\3\2\2\2\u02d5"+
		"\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2"+
		"\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02da\7\"\2\2\u02da\u02db\5\66\34\2\u02db"+
		"\u02dc\7A\2\2\u02dcC\3\2\2\2\u02dd\u02de\5\u00e6t\2\u02deE\3\2\2\2\u02df"+
		"\u02e4\5H%\2\u02e0\u02e4\5J&\2\u02e1\u02e4\5L\'\2\u02e2\u02e4\5N(\2\u02e3"+
		"\u02df\3\2\2\2\u02e3\u02e0\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2"+
		"\2\2\u02e4G\3\2\2\2\u02e5\u02e6\7\33\2\2\u02e6\u02e7\58\35\2\u02e7\u02e8"+
		"\7A\2\2\u02e8I\3\2\2\2\u02e9\u02ea\7\33\2\2\u02ea\u02eb\5:\36\2\u02eb"+
		"\u02ec\7C\2\2\u02ec\u02ed\7U\2\2\u02ed\u02ee\7A\2\2\u02eeK\3\2\2\2\u02ef"+
		"\u02f0\7\33\2\2\u02f0\u02f1\7(\2\2\u02f1\u02f2\58\35\2\u02f2\u02f3\7C"+
		"\2\2\u02f3\u02f4\7h\2\2\u02f4\u02f5\7A\2\2\u02f5M\3\2\2\2\u02f6\u02f7"+
		"\7\33\2\2\u02f7\u02f8\7(\2\2\u02f8\u02f9\58\35\2\u02f9\u02fa\7C\2\2\u02fa"+
		"\u02fb\7U\2\2\u02fb\u02fc\7A\2\2\u02fcO\3\2\2\2\u02fd\u0301\5R*\2\u02fe"+
		"\u0301\5\u00c6d\2\u02ff\u0301\7A\2\2\u0300\u02fd\3\2\2\2\u0300\u02fe\3"+
		"\2\2\2\u0300\u02ff\3\2\2\2\u0301Q\3\2\2\2\u0302\u0305\5T+\2\u0303\u0305"+
		"\5\u00ba^\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305S\3\2\2\2\u0306"+
		"\u0308\5V,\2\u0307\u0306\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d"+
		"\7\13\2\2\u030d\u030f\7h\2\2\u030e\u0310\5X-\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u0313\5\\/\2\u0312\u0311\3\2"+
		"\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0316\5^\60\2\u0315"+
		"\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\5b"+
		"\62\2\u0318U\3\2\2\2\u0319\u0322\5\u00e6t\2\u031a\u0322\7%\2\2\u031b\u0322"+
		"\7$\2\2\u031c\u0322\7#\2\2\u031d\u0322\7\3\2\2\u031e\u0322\7(\2\2\u031f"+
		"\u0322\7\24\2\2\u0320\u0322\7)\2\2\u0321\u0319\3\2\2\2\u0321\u031a\3\2"+
		"\2\2\u0321\u031b\3\2\2\2\u0321\u031c\3\2\2\2\u0321\u031d\3\2\2\2\u0321"+
		"\u031e\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0320\3\2\2\2\u0322W\3\2\2\2"+
		"\u0323\u0324\7F\2\2\u0324\u0325\5Z.\2\u0325\u0326\7E\2\2\u0326Y\3\2\2"+
		"\2\u0327\u032c\5$\23\2\u0328\u0329\7B\2\2\u0329\u032b\5$\23\2\u032a\u0328"+
		"\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"[\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0330\7\23\2\2\u0330\u0331\5\22\n"+
		"\2\u0331]\3\2\2\2\u0332\u0333\7\32\2\2\u0333\u0334\5`\61\2\u0334_\3\2"+
		"\2\2\u0335\u033a\5\30\r\2\u0336\u0337\7B\2\2\u0337\u0339\5\30\r\2\u0338"+
		"\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033ba\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u0341\7=\2\2\u033e\u0340"+
		"\5d\63\2\u033f\u033e\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0345\7>"+
		"\2\2\u0345c\3\2\2\2\u0346\u034b\5f\64\2\u0347\u034b\5\u00aaV\2\u0348\u034b"+
		"\5\u00acW\2\u0349\u034b\5\u00aeX\2\u034a\u0346\3\2\2\2\u034a\u0347\3\2"+
		"\2\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034be\3\2\2\2\u034c\u0352"+
		"\5h\65\2\u034d\u0352\5\u008cG\2\u034e\u0352\5R*\2\u034f\u0352\5\u00c6"+
		"d\2\u0350\u0352\7A\2\2\u0351\u034c\3\2\2\2\u0351\u034d\3\2\2\2\u0351\u034e"+
		"\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0350\3\2\2\2\u0352g\3\2\2\2\u0353"+
		"\u0355\5j\66\2\u0354\u0353\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2"+
		"\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u0356\3\2\2\2\u0359"+
		"\u035a\5t;\2\u035a\u035b\5l\67\2\u035b\u035c\7A\2\2\u035ci\3\2\2\2\u035d"+
		"\u0366\5\u00e6t\2\u035e\u0366\7%\2\2\u035f\u0366\7$\2\2\u0360\u0366\7"+
		"#\2\2\u0361\u0366\7(\2\2\u0362\u0366\7\24\2\2\u0363\u0366\7\60\2\2\u0364"+
		"\u0366\7\63\2\2\u0365\u035d\3\2\2\2\u0365\u035e\3\2\2\2\u0365\u035f\3"+
		"\2\2\2\u0365\u0360\3\2\2\2\u0365\u0361\3\2\2\2\u0365\u0362\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366k\3\2\2\2\u0367\u036c\5n8\2\u0368"+
		"\u0369\7B\2\2\u0369\u036b\5n8\2\u036a\u0368\3\2\2\2\u036b\u036e\3\2\2"+
		"\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036dm\3\2\2\2\u036e\u036c"+
		"\3\2\2\2\u036f\u0372\5p9\2\u0370\u0371\7D\2\2\u0371\u0373\5r:\2\u0372"+
		"\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373o\3\2\2\2\u0374\u0376\7h\2\2\u0375"+
		"\u0377\5\"\22\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377q\3\2\2\2"+
		"\u0378\u037b\5\u019e\u00d0\2\u0379\u037b\5\u00f8}\2\u037a\u0378\3\2\2"+
		"\2\u037a\u0379\3\2\2\2\u037bs\3\2\2\2\u037c\u037f\5v<\2\u037d\u037f\5"+
		"x=\2\u037e\u037c\3\2\2\2\u037e\u037d\3\2\2\2\u037fu\3\2\2\2\u0380\u0383"+
		"\5\b\5\2\u0381\u0383\7\5\2\2\u0382\u0380\3\2\2\2\u0382\u0381\3\2\2\2\u0383"+
		"w\3\2\2\2\u0384\u0388\5z>\2\u0385\u0388\5\u0088E\2\u0386\u0388\5\u008a"+
		"F\2\u0387\u0384\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0386\3\2\2\2\u0388"+
		"y\3\2\2\2\u0389\u038c\5\u0080A\2\u038a\u038c\5\u0086D\2\u038b\u0389\3"+
		"\2\2\2\u038b\u038a\3\2\2\2\u038c\u0391\3\2\2\2\u038d\u0390\5~@\2\u038e"+
		"\u0390\5\u0084C\2\u038f\u038d\3\2\2\2\u038f\u038e\3\2\2\2\u0390\u0393"+
		"\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392{\3\2\2\2\u0393"+
		"\u0391\3\2\2\2\u0394\u0396\7h\2\2\u0395\u0397\5,\27\2\u0396\u0395\3\2"+
		"\2\2\u0396\u0397\3\2\2\2\u0397\u03a5\3\2\2\2\u0398\u0399\5z>\2\u0399\u039d"+
		"\7C\2\2\u039a\u039c\5\u00e6t\2\u039b\u039a\3\2\2\2\u039c\u039f\3\2\2\2"+
		"\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u039d"+
		"\3\2\2\2\u03a0\u03a2\7h\2\2\u03a1\u03a3\5,\27\2\u03a2\u03a1\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u0394\3\2\2\2\u03a4\u0398\3\2"+
		"\2\2\u03a5}\3\2\2\2\u03a6\u03aa\7C\2\2\u03a7\u03a9\5\u00e6t\2\u03a8\u03a7"+
		"\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ad\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03af\7h\2\2\u03ae\u03b0\5,\27"+
		"\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\177\3\2\2\2\u03b1\u03b3"+
		"\7h\2\2\u03b2\u03b4\5,\27\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u0081\3\2\2\2\u03b5\u03b6\5|?\2\u03b6\u0083\3\2\2\2\u03b7\u03b8\5~@\2"+
		"\u03b8\u0085\3\2\2\2\u03b9\u03ba\5\u0080A\2\u03ba\u0087\3\2\2\2\u03bb"+
		"\u03bc\7h\2\2\u03bc\u0089\3\2\2\2\u03bd\u03be\5v<\2\u03be\u03bf\5\"\22"+
		"\2\u03bf\u03c7\3\2\2\2\u03c0\u03c1\5z>\2\u03c1\u03c2\5\"\22\2\u03c2\u03c7"+
		"\3\2\2\2\u03c3\u03c4\5\u0088E\2\u03c4\u03c5\5\"\22\2\u03c5\u03c7\3\2\2"+
		"\2\u03c6\u03bd\3\2\2\2\u03c6\u03c0\3\2\2\2\u03c6\u03c3\3\2\2\2\u03c7\u008b"+
		"\3\2\2\2\u03c8\u03ca\5\u008eH\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd\3\2\2"+
		"\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cb"+
		"\3\2\2\2\u03ce\u03cf\5\u0090I\2\u03cf\u03d0\5\u00a8U\2\u03d0\u008d\3\2"+
		"\2\2\u03d1\u03dc\5\u00e6t\2\u03d2\u03dc\7%\2\2\u03d3\u03dc\7$\2\2\u03d4"+
		"\u03dc\7#\2\2\u03d5\u03dc\7\3\2\2\u03d6\u03dc\7(\2\2\u03d7\u03dc\7\24"+
		"\2\2\u03d8\u03dc\7,\2\2\u03d9\u03dc\7 \2\2\u03da\u03dc\7)\2\2\u03db\u03d1"+
		"\3\2\2\2\u03db\u03d2\3\2\2\2\u03db\u03d3\3\2\2\2\u03db\u03d4\3\2\2\2\u03db"+
		"\u03d5\3\2\2\2\u03db\u03d6\3\2\2\2\u03db\u03d7\3\2\2\2\u03db\u03d8\3\2"+
		"\2\2\u03db\u03d9\3\2\2\2\u03db\u03da\3\2\2\2\u03dc\u008f\3\2\2\2\u03dd"+
		"\u03de\5\u0092J\2\u03de\u03e0\5\u0094K\2\u03df\u03e1\5\u00a2R\2\u03e0"+
		"\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03ef\3\2\2\2\u03e2\u03e6\5X"+
		"-\2\u03e3\u03e5\5\u00e6t\2\u03e4\u03e3\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6"+
		"\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03e6\3\2"+
		"\2\2\u03e9\u03ea\5\u0092J\2\u03ea\u03ec\5\u0094K\2\u03eb\u03ed\5\u00a2"+
		"R\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee"+
		"\u03dd\3\2\2\2\u03ee\u03e2\3\2\2\2\u03ef\u0091\3\2\2\2\u03f0\u03f3\5t"+
		";\2\u03f1\u03f3\7\62\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f3"+
		"\u0093\3\2\2\2\u03f4\u03f5\7h\2\2\u03f5\u03f7\7;\2\2\u03f6\u03f8\5\u0096"+
		"L\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03fb\7<\2\2\u03fa\u03fc\5\"\22\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2"+
		"\2\2\u03fc\u0095\3\2\2\2\u03fd\u0404\5\u00a0Q\2\u03fe\u03ff\5\u0098M\2"+
		"\u03ff\u0400\7B\2\2\u0400\u0401\5\u009eP\2\u0401\u0404\3\2\2\2\u0402\u0404"+
		"\5\u009eP\2\u0403\u03fd\3\2\2\2\u0403\u03fe\3\2\2\2\u0403\u0402\3\2\2"+
		"\2\u0404\u0097\3\2\2\2\u0405\u040a\5\u009aN\2\u0406\u0407\7B\2\2\u0407"+
		"\u0409\5\u009aN\2\u0408\u0406\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408"+
		"\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u0416\3\2\2\2\u040c\u040a\3\2\2\2\u040d"+
		"\u0412\5\u00a0Q\2\u040e\u040f\7B\2\2\u040f\u0411\5\u009aN\2\u0410\u040e"+
		"\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413"+
		"\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0405\3\2\2\2\u0415\u040d\3\2"+
		"\2\2\u0416\u0099\3\2\2\2\u0417\u0419\5\u009cO\2\u0418\u0417\3\2\2\2\u0419"+
		"\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2"+
		"\2\2\u041c\u041a\3\2\2\2\u041d\u041e\5t;\2\u041e\u041f\5p9\2\u041f\u009b"+
		"\3\2\2\2\u0420\u0423\5\u00e6t\2\u0421\u0423\7\24\2\2\u0422\u0420\3\2\2"+
		"\2\u0422\u0421\3\2\2\2\u0423\u009d\3\2\2\2\u0424\u0426\5\u009cO\2\u0425"+
		"\u0424\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2"+
		"\2\2\u0428\u042a\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u042e\5t;\2\u042b\u042d"+
		"\5\u00e6t\2\u042c\u042b\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2"+
		"\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0432"+
		"\7j\2\2\u0432\u0433\5p9\2\u0433\u0436\3\2\2\2\u0434\u0436\5\u009aN\2\u0435"+
		"\u0427\3\2\2\2\u0435\u0434\3\2\2\2\u0436\u009f\3\2\2\2\u0437\u0439\5\u00e6"+
		"t\2\u0438\u0437\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u0440\5t"+
		";\2\u043e\u043f\7h\2\2\u043f\u0441\7C\2\2\u0440\u043e\3\2\2\2\u0440\u0441"+
		"\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\7-\2\2\u0443\u00a1\3\2\2\2\u0444"+
		"\u0445\7/\2\2\u0445\u0446\5\u00a4S\2\u0446\u00a3\3\2\2\2\u0447\u044c\5"+
		"\u00a6T\2\u0448\u0449\7B\2\2\u0449\u044b\5\u00a6T\2\u044a\u0448\3\2\2"+
		"\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u00a5"+
		"\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0452\5\22\n\2\u0450\u0452\5\36\20"+
		"\2\u0451\u044f\3\2\2\2\u0451\u0450\3\2\2\2\u0452\u00a7\3\2\2\2\u0453\u0456"+
		"\5\u00fc\177\2\u0454\u0456\7A\2\2\u0455\u0453\3\2\2\2\u0455\u0454\3\2"+
		"\2\2\u0456\u00a9\3\2\2\2\u0457\u0458\5\u00fc\177\2\u0458\u00ab\3\2\2\2"+
		"\u0459\u045a\7(\2\2\u045a\u045b\5\u00fc\177\2\u045b\u00ad\3\2\2\2\u045c"+
		"\u045e\5\u00b0Y\2\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d"+
		"\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462"+
		"\u0464\5\u00b2Z\2\u0463\u0465\5\u00a2R\2\u0464\u0463\3\2\2\2\u0464\u0465"+
		"\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\5\u00b6\\\2\u0467\u00af\3\2\2"+
		"\2\u0468\u046d\5\u00e6t\2\u0469\u046d\7%\2\2\u046a\u046d\7$\2\2\u046b"+
		"\u046d\7#\2\2\u046c\u0468\3\2\2\2\u046c\u0469\3\2\2\2\u046c\u046a\3\2"+
		"\2\2\u046c\u046b\3\2\2\2\u046d\u00b1\3\2\2\2\u046e\u0470\5X-\2\u046f\u046e"+
		"\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\5\u00b4["+
		"\2\u0472\u0474\7;\2\2\u0473\u0475\5\u0096L\2\u0474\u0473\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\7<\2\2\u0477\u00b3\3\2"+
		"\2\2\u0478\u0479\7h\2\2\u0479\u00b5\3\2\2\2\u047a\u047c\7=\2\2\u047b\u047d"+
		"\5\u00b8]\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f\3\2\2"+
		"\2\u047e\u0480\5\u00fe\u0080\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2"+
		"\u0480\u0481\3\2\2\2\u0481\u0482\7>\2\2\u0482\u00b7\3\2\2\2\u0483\u0485"+
		"\5,\27\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u0487\7-\2\2\u0487\u0489\7;\2\2\u0488\u048a\5\u018e\u00c8\2\u0489\u0488"+
		"\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\7<\2\2\u048c"+
		"\u04b2\7A\2\2\u048d\u048f\5,\27\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2"+
		"\2\2\u048f\u0490\3\2\2\2\u0490\u0491\7*\2\2\u0491\u0493\7;\2\2\u0492\u0494"+
		"\5\u018e\u00c8\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3"+
		"\2\2\2\u0495\u0496\7<\2\2\u0496\u04b2\7A\2\2\u0497\u0498\5<\37\2\u0498"+
		"\u049a\7C\2\2\u0499\u049b\5,\27\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2"+
		"\2\2\u049b\u049c\3\2\2\2\u049c\u049d\7*\2\2\u049d\u049f\7;\2\2\u049e\u04a0"+
		"\5\u018e\u00c8\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3"+
		"\2\2\2\u04a1\u04a2\7<\2\2\u04a2\u04a3\7A\2\2\u04a3\u04b2\3\2\2\2\u04a4"+
		"\u04a5\5\u0160\u00b1\2\u04a5\u04a7\7C\2\2\u04a6\u04a8\5,\27\2\u04a7\u04a6"+
		"\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\7*\2\2\u04aa"+
		"\u04ac\7;\2\2\u04ab\u04ad\5\u018e\u00c8\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad"+
		"\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\7<\2\2\u04af\u04b0\7A\2\2\u04b0"+
		"\u04b2\3\2\2\2\u04b1\u0484\3\2\2\2\u04b1\u048e\3\2\2\2\u04b1\u0497\3\2"+
		"\2\2\u04b1\u04a4\3\2\2\2\u04b2\u00b9\3\2\2\2\u04b3\u04b5\5V,\2\u04b4\u04b3"+
		"\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04b9\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9\u04ba\7\22\2\2\u04ba\u04bc\7"+
		"h\2\2\u04bb\u04bd\5^\60\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04bf\5\u00bc_\2\u04bf\u00bb\3\2\2\2\u04c0\u04c2"+
		"\7=\2\2\u04c1\u04c3\5\u00be`\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2"+
		"\u04c3\u04c5\3\2\2\2\u04c4\u04c6\7B\2\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c9\5\u00c4c\2\u04c8\u04c7\3\2\2"+
		"\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\7>\2\2\u04cb\u00bd"+
		"\3\2\2\2\u04cc\u04d1\5\u00c0a\2\u04cd\u04ce\7B\2\2\u04ce\u04d0\5\u00c0"+
		"a\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1"+
		"\u04d2\3\2\2\2\u04d2\u00bf\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d6\5\u00c2"+
		"b\2\u04d5\u04d4\3\2\2\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7"+
		"\u04d8\3\2\2\2\u04d8\u04da\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da\u04e0\7h"+
		"\2\2\u04db\u04dd\7;\2\2\u04dc\u04de\5\u018e\u00c8\2\u04dd\u04dc\3\2\2"+
		"\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e1\7<\2\2\u04e0\u04db"+
		"\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04e4\5b\62\2\u04e3"+
		"\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u00c1\3\2\2\2\u04e5\u04e6\5\u00e6"+
		"t\2\u04e6\u00c3\3\2\2\2\u04e7\u04eb\7A\2\2\u04e8\u04ea\5d\63\2\u04e9\u04e8"+
		"\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u00c5\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee\u04f1\5\u00c8e\2\u04ef\u04f1"+
		"\5\u00dan\2\u04f0\u04ee\3\2\2\2\u04f0\u04ef\3\2\2\2\u04f1\u00c7\3\2\2"+
		"\2\u04f2\u04f4\5\u00caf\2\u04f3\u04f2\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5"+
		"\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04f5\3\2"+
		"\2\2\u04f8\u04f9\7\36\2\2\u04f9\u04fb\7h\2\2\u04fa\u04fc\5X-\2\u04fb\u04fa"+
		"\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04ff\5\u00ccg"+
		"\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501"+
		"\5\u00ceh\2\u0501\u00c9\3\2\2\2\u0502\u050a\5\u00e6t\2\u0503\u050a\7%"+
		"\2\2\u0504\u050a\7$\2\2\u0505\u050a\7#\2\2\u0506\u050a\7\3\2\2\u0507\u050a"+
		"\7(\2\2\u0508\u050a\7)\2\2\u0509\u0502\3\2\2\2\u0509\u0503\3\2\2\2\u0509"+
		"\u0504\3\2\2\2\u0509\u0505\3\2\2\2\u0509\u0506\3\2\2\2\u0509\u0507\3\2"+
		"\2\2\u0509\u0508\3\2\2\2\u050a\u00cb\3\2\2\2\u050b\u050c\7\23\2\2\u050c"+
		"\u050d\5`\61\2\u050d\u00cd\3\2\2\2\u050e\u0512\7=\2\2\u050f\u0511\5\u00d0"+
		"i\2\u0510\u050f\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514\u0512\3\2\2\2\u0515\u0516\7>"+
		"\2\2\u0516\u00cf\3\2\2\2\u0517\u051d\5\u00d2j\2\u0518\u051d\5\u00d6l\2"+
		"\u0519\u051d\5R*\2\u051a\u051d\5\u00c6d\2\u051b\u051d\7A\2\2\u051c\u0517"+
		"\3\2\2\2\u051c\u0518\3\2\2\2\u051c\u0519\3\2\2\2\u051c\u051a\3\2\2\2\u051c"+
		"\u051b\3\2\2\2\u051d\u00d1\3\2\2\2\u051e\u0520\5\u00d4k\2\u051f\u051e"+
		"\3\2\2\2\u0520\u0523\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u0524\3\2\2\2\u0523\u0521\3\2\2\2\u0524\u0525\5t;\2\u0525\u0526\5l\67"+
		"\2\u0526\u0527\7A\2\2\u0527\u00d3\3\2\2\2\u0528\u052d\5\u00e6t\2\u0529"+
		"\u052d\7%\2\2\u052a\u052d\7(\2\2\u052b\u052d\7\24\2\2\u052c\u0528\3\2"+
		"\2\2\u052c\u0529\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052b\3\2\2\2\u052d"+
		"\u00d5\3\2\2\2\u052e\u0530\5\u00d8m\2\u052f\u052e\3\2\2\2\u0530\u0533"+
		"\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2\2\2\u0533"+
		"\u0531\3\2\2\2\u0534\u0535\5\u0090I\2\u0535\u0536\5\u00a8U\2\u0536\u00d7"+
		"\3\2\2\2\u0537\u053e\5\u00e6t\2\u0538\u053e\7%\2\2\u0539\u053e\7\3\2\2"+
		"\u053a\u053e\7\16\2\2\u053b\u053e\7(\2\2\u053c\u053e\7)\2\2\u053d\u0537"+
		"\3\2\2\2\u053d\u0538\3\2\2\2\u053d\u0539\3\2\2\2\u053d\u053a\3\2\2\2\u053d"+
		"\u053b\3\2\2\2\u053d\u053c\3\2\2\2\u053e\u00d9\3\2\2\2\u053f\u0541\5\u00ca"+
		"f\2\u0540\u053f\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542"+
		"\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0546\7i"+
		"\2\2\u0546\u0547\7\36\2\2\u0547\u0548\7h\2\2\u0548\u0549\5\u00dco\2\u0549"+
		"\u00db\3\2\2\2\u054a\u054e\7=\2\2\u054b\u054d\5\u00dep\2\u054c\u054b\3"+
		"\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0551\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u0552\7>\2\2\u0552\u00dd\3\2"+
		"\2\2\u0553\u0559\5\u00e0q\2\u0554\u0559\5\u00d2j\2\u0555\u0559\5R*\2\u0556"+
		"\u0559\5\u00c6d\2\u0557\u0559\7A\2\2\u0558\u0553\3\2\2\2\u0558\u0554\3"+
		"\2\2\2\u0558\u0555\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0557\3\2\2\2\u0559"+
		"\u00df\3\2\2\2\u055a\u055c\5\u00e2r\2\u055b\u055a\3\2\2\2\u055c\u055f"+
		"\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2\2\2\u055f"+
		"\u055d\3\2\2\2\u0560\u0561\5t;\2\u0561\u0562\7h\2\2\u0562\u0563\7;\2\2"+
		"\u0563\u0565\7<\2\2\u0564\u0566\5\"\22\2\u0565\u0564\3\2\2\2\u0565\u0566"+
		"\3\2\2\2\u0566\u0568\3\2\2\2\u0567\u0569\5\u00e4s\2\u0568\u0567\3\2\2"+
		"\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\7A\2\2\u056b\u00e1"+
		"\3\2\2\2\u056c\u0570\5\u00e6t\2\u056d\u0570\7%\2\2\u056e\u0570\7\3\2\2"+
		"\u056f\u056c\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u056e\3\2\2\2\u0570\u00e3"+
		"\3\2\2\2\u0571\u0572\7\16\2\2\u0572\u0573\5\u00eex\2\u0573\u00e5\3\2\2"+
		"\2\u0574\u0578\5\u00e8u\2\u0575\u0578\5\u00f4{\2\u0576\u0578\5\u00f6|"+
		"\2\u0577\u0574\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0576\3\2\2\2\u0578\u00e7"+
		"\3\2\2\2\u0579\u057a\7i\2\2\u057a\u057b\58\35\2\u057b\u057d\7;\2\2\u057c"+
		"\u057e\5\u00eav\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f"+
		"\3\2\2\2\u057f\u0580\7<\2\2\u0580\u00e9\3\2\2\2\u0581\u0586\5\u00ecw\2"+
		"\u0582\u0583\7B\2\2\u0583\u0585\5\u00ecw\2\u0584\u0582\3\2\2\2\u0585\u0588"+
		"\3\2\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u00eb\3\2\2\2\u0588"+
		"\u0586\3\2\2\2\u0589\u058a\7h\2\2\u058a\u058b\7D\2\2\u058b\u058c\5\u00ee"+
		"x\2\u058c\u00ed\3\2\2\2\u058d\u0591\5\u01b0\u00d9\2\u058e\u0591\5\u00f0"+
		"y\2\u058f\u0591\5\u00e6t\2\u0590\u058d\3\2\2\2\u0590\u058e\3\2\2\2\u0590"+
		"\u058f\3\2\2\2\u0591\u00ef\3\2\2\2\u0592\u0594\7=\2\2\u0593\u0595\5\u00f2"+
		"z\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596"+
		"\u0598\7B\2\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2"+
		"\2\2\u0599\u059a\7>\2\2\u059a\u00f1\3\2\2\2\u059b\u05a0\5\u00eex\2\u059c"+
		"\u059d\7B\2\2\u059d\u059f\5\u00eex\2\u059e\u059c\3\2\2\2\u059f\u05a2\3"+
		"\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u00f3\3\2\2\2\u05a2"+
		"\u05a0\3\2\2\2\u05a3\u05a4\7i\2\2\u05a4\u05a5\58\35\2\u05a5\u00f5\3\2"+
		"\2\2\u05a6\u05a7\7i\2\2\u05a7\u05a8\58\35\2\u05a8\u05a9\7;\2\2\u05a9\u05aa"+
		"\5\u00eex\2\u05aa\u05ab\7<\2\2\u05ab\u00f7\3\2\2\2\u05ac\u05ae\7=\2\2"+
		"\u05ad\u05af\5\u00fa~\2\u05ae\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"\u05b1\3\2\2\2\u05b0\u05b2\7B\2\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2"+
		"\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\7>\2\2\u05b4\u00f9\3\2\2\2\u05b5"+
		"\u05ba\5r:\2\u05b6\u05b7\7B\2\2\u05b7\u05b9\5r:\2\u05b8\u05b6\3\2\2\2"+
		"\u05b9\u05bc\3\2\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u00fb"+
		"\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bd\u05bf\7=\2\2\u05be\u05c0\5\u00fe\u0080"+
		"\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2"+
		"\7>\2\2\u05c2\u00fd\3\2\2\2\u05c3\u05c5\5\u0100\u0081\2\u05c4\u05c3\3"+
		"\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7"+
		"\u00ff\3\2\2\2\u05c8\u05cc\5\u0102\u0082\2\u05c9\u05cc\5R*\2\u05ca\u05cc"+
		"\5\u0106\u0084\2\u05cb\u05c8\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb\u05ca\3"+
		"\2\2\2\u05cc\u0101\3\2\2\2\u05cd\u05ce\5\u0104\u0083\2\u05ce\u05cf\7A"+
		"\2\2\u05cf\u0103\3\2\2\2\u05d0\u05d2\5\u009cO\2\u05d1\u05d0\3\2\2\2\u05d2"+
		"\u05d5\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2"+
		"\2\2\u05d5\u05d3\3\2\2\2\u05d6\u05d7\5t;\2\u05d7\u05d8\5l\67\2\u05d8\u0105"+
		"\3\2\2\2\u05d9\u05e0\5\u010a\u0086\2\u05da\u05e0\5\u010e\u0088\2\u05db"+
		"\u05e0\5\u0116\u008c\2\u05dc\u05e0\5\u0118\u008d\2\u05dd\u05e0\5\u012a"+
		"\u0096\2\u05de\u05e0\5\u0130\u0099\2\u05df\u05d9\3\2\2\2\u05df\u05da\3"+
		"\2\2\2\u05df\u05db\3\2\2\2\u05df\u05dc\3\2\2\2\u05df\u05dd\3\2\2\2\u05df"+
		"\u05de\3\2\2\2\u05e0\u0107\3\2\2\2\u05e1\u05e7\5\u010a\u0086\2\u05e2\u05e7"+
		"\5\u0110\u0089\2\u05e3\u05e7\5\u011a\u008e\2\u05e4\u05e7\5\u012c\u0097"+
		"\2\u05e5\u05e7\5\u0132\u009a\2\u05e6\u05e1\3\2\2\2\u05e6\u05e2\3\2\2\2"+
		"\u05e6\u05e3\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e5\3\2\2\2\u05e7\u0109"+
		"\3\2\2\2\u05e8\u05f5\5\u00fc\177\2\u05e9\u05f5\5\u010c\u0087\2\u05ea\u05f5"+
		"\5\u0112\u008a\2\u05eb\u05f5\5\u011c\u008f\2\u05ec\u05f5\5\u011e\u0090"+
		"\2\u05ed\u05f5\5\u012e\u0098\2\u05ee\u05f5\5\u0142\u00a2\2\u05ef\u05f5"+
		"\5\u0144\u00a3\2\u05f0\u05f5\5\u0146\u00a4\2\u05f1\u05f5\5\u014a\u00a6"+
		"\2\u05f2\u05f5\5\u0148\u00a5\2\u05f3\u05f5\5\u014c\u00a7\2\u05f4\u05e8"+
		"\3\2\2\2\u05f4\u05e9\3\2\2\2\u05f4\u05ea\3\2\2\2\u05f4\u05eb\3\2\2\2\u05f4"+
		"\u05ec\3\2\2\2\u05f4\u05ed\3\2\2\2\u05f4\u05ee\3\2\2\2\u05f4\u05ef\3\2"+
		"\2\2\u05f4\u05f0\3\2\2\2\u05f4\u05f1\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4"+
		"\u05f3\3\2\2\2\u05f5\u010b\3\2\2\2\u05f6\u05f7\7A\2\2\u05f7\u010d\3\2"+
		"\2\2\u05f8\u05f9\7h\2\2\u05f9\u05fa\7J\2\2\u05fa\u05fb\5\u0106\u0084\2"+
		"\u05fb\u010f\3\2\2\2\u05fc\u05fd\7h\2\2\u05fd\u05fe\7J\2\2\u05fe\u05ff"+
		"\5\u0108\u0085\2\u05ff\u0111\3\2\2\2\u0600\u0601\5\u0114\u008b\2\u0601"+
		"\u0602\7A\2\2\u0602\u0113\3\2\2\2\u0603\u060b\5\u01aa\u00d6\2\u0604\u060b"+
		"\5\u01c8\u00e5\2\u0605\u060b\5\u01ca\u00e6\2\u0606\u060b\5\u01d0\u00e9"+
		"\2\u0607\u060b\5\u01d4\u00eb\2\u0608\u060b\5\u0188\u00c5\2\u0609\u060b"+
		"\5\u0174\u00bb\2\u060a\u0603\3\2\2\2\u060a\u0604\3\2\2\2\u060a\u0605\3"+
		"\2\2\2\u060a\u0606\3\2\2\2\u060a\u0607\3\2\2\2\u060a\u0608\3\2\2\2\u060a"+
		"\u0609\3\2\2\2\u060b\u0115\3\2\2\2\u060c\u060d\7\30\2\2\u060d\u060e\7"+
		";\2\2\u060e\u060f\5\u019e\u00d0\2\u060f\u0610\7<\2\2\u0610\u0611\5\u0106"+
		"\u0084\2\u0611\u0117\3\2\2\2\u0612\u0613\7\30\2\2\u0613\u0614\7;\2\2\u0614"+
		"\u0615\5\u019e\u00d0\2\u0615\u0616\7<\2\2\u0616\u0617\5\u0108\u0085\2"+
		"\u0617\u0618\7\21\2\2\u0618\u0619\5\u0106\u0084\2\u0619\u0119\3\2\2\2"+
		"\u061a\u061b\7\30\2\2\u061b\u061c\7;\2\2\u061c\u061d\5\u019e\u00d0\2\u061d"+
		"\u061e\7<\2\2\u061e\u061f\5\u0108\u0085\2\u061f\u0620\7\21\2\2\u0620\u0621"+
		"\5\u0108\u0085\2\u0621\u011b\3\2\2\2\u0622\u0623\7\4\2\2\u0623\u0624\5"+
		"\u019e\u00d0\2\u0624\u0625\7A\2\2\u0625\u062d\3\2\2\2\u0626\u0627\7\4"+
		"\2\2\u0627\u0628\5\u019e\u00d0\2\u0628\u0629\7J\2\2\u0629\u062a\5\u019e"+
		"\u00d0\2\u062a\u062b\7A\2\2\u062b\u062d\3\2\2\2\u062c\u0622\3\2\2\2\u062c"+
		"\u0626\3\2\2\2\u062d\u011d\3\2\2\2\u062e\u062f\7+\2\2\u062f\u0630\7;\2"+
		"\2\u0630\u0631\5\u019e\u00d0\2\u0631\u0632\7<\2\2\u0632\u0633\5\u0120"+
		"\u0091\2\u0633\u011f\3\2\2\2\u0634\u0638\7=\2\2\u0635\u0637\5\u0122\u0092"+
		"\2\u0636\u0635\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639"+
		"\3\2\2\2\u0639\u063e\3\2\2\2\u063a\u0638\3\2\2\2\u063b\u063d\5\u0126\u0094"+
		"\2\u063c\u063b\3\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f"+
		"\3\2\2\2\u063f\u0641\3\2\2\2\u0640\u063e\3\2\2\2\u0641\u0642\7>\2\2\u0642"+
		"\u0121\3\2\2\2\u0643\u0644\5\u0124\u0093\2\u0644\u0645\5\u00fe\u0080\2"+
		"\u0645\u0123\3\2\2\2\u0646\u064a\5\u0126\u0094\2\u0647\u0649\5\u0126\u0094"+
		"\2\u0648\u0647\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u0648\3\2\2\2\u064a\u064b"+
		"\3\2\2\2\u064b\u0125\3\2\2\2\u064c\u064a\3\2\2\2\u064d\u064e\7\b\2\2\u064e"+
		"\u064f\5\u019c\u00cf\2\u064f\u0650\7J\2\2\u0650\u0658\3\2\2\2\u0651\u0652"+
		"\7\b\2\2\u0652\u0653\5\u0128\u0095\2\u0653\u0654\7J\2\2\u0654\u0658\3"+
		"\2\2\2\u0655\u0656\7\16\2\2\u0656\u0658\7J\2\2\u0657\u064d\3\2\2\2\u0657"+
		"\u0651\3\2\2\2\u0657\u0655\3\2\2\2\u0658\u0127\3\2\2\2\u0659\u065a\7h"+
		"\2\2\u065a\u0129\3\2\2\2\u065b\u065c\7\64\2\2\u065c\u065d\7;\2\2\u065d"+
		"\u065e\5\u019e\u00d0\2\u065e\u065f\7<\2\2\u065f\u0660\5\u0106\u0084\2"+
		"\u0660\u012b\3\2\2\2\u0661\u0662\7\64\2\2\u0662\u0663\7;\2\2\u0663\u0664"+
		"\5\u019e\u00d0\2\u0664\u0665\7<\2\2\u0665\u0666\5\u0108\u0085\2\u0666"+
		"\u012d\3\2\2\2\u0667\u0668\7\17\2\2\u0668\u0669\5\u0106\u0084\2\u0669"+
		"\u066a\7\64\2\2\u066a\u066b\7;\2\2\u066b\u066c\5\u019e\u00d0\2\u066c\u066d"+
		"\7<\2\2\u066d\u066e\7A\2\2\u066e\u012f\3\2\2\2\u066f\u0672\5\u0134\u009b"+
		"\2\u0670\u0672\5\u013e\u00a0\2\u0671\u066f\3\2\2\2\u0671\u0670\3\2\2\2"+
		"\u0672\u0131\3\2\2\2\u0673\u0676\5\u0136\u009c\2\u0674\u0676\5\u0140\u00a1"+
		"\2\u0675\u0673\3\2\2\2\u0675\u0674\3\2\2\2\u0676\u0133\3\2\2\2\u0677\u0678"+
		"\7\27\2\2\u0678\u067a\7;\2\2\u0679\u067b\5\u0138\u009d\2\u067a\u0679\3"+
		"\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067e\7A\2\2\u067d"+
		"\u067f\5\u019e\u00d0\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680"+
		"\3\2\2\2\u0680\u0682\7A\2\2\u0681\u0683\5\u013a\u009e\2\u0682\u0681\3"+
		"\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685\7<\2\2\u0685"+
		"\u0686\5\u0106\u0084\2\u0686\u0135\3\2\2\2\u0687\u0688\7\27\2\2\u0688"+
		"\u068a\7;\2\2\u0689\u068b\5\u0138\u009d\2\u068a\u0689\3\2\2\2\u068a\u068b"+
		"\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\7A\2\2\u068d\u068f\5\u019e\u00d0"+
		"\2\u068e\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0692"+
		"\7A\2\2\u0691\u0693\5\u013a\u009e\2\u0692\u0691\3\2\2\2\u0692\u0693\3"+
		"\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\7<\2\2\u0695\u0696\5\u0108\u0085"+
		"\2\u0696\u0137\3\2\2\2\u0697\u069a\5\u013c\u009f\2\u0698\u069a\5\u0104"+
		"\u0083\2\u0699\u0697\3\2\2\2\u0699\u0698\3\2\2\2\u069a\u0139\3\2\2\2\u069b"+
		"\u069c\5\u013c\u009f\2\u069c\u013b\3\2\2\2\u069d\u06a2\5\u0114\u008b\2"+
		"\u069e\u069f\7B\2\2\u069f\u06a1\5\u0114\u008b\2\u06a0\u069e\3\2\2\2\u06a1"+
		"\u06a4\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u013d\3\2"+
		"\2\2\u06a4\u06a2\3\2\2\2\u06a5\u06a6\7\27\2\2\u06a6\u06aa\7;\2\2\u06a7"+
		"\u06a9\5\u009cO\2\u06a8\u06a7\3\2\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06a8"+
		"\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ad\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ad"+
		"\u06ae\5t;\2\u06ae\u06af\5p9\2\u06af\u06b0\7J\2\2\u06b0\u06b1\5\u019e"+
		"\u00d0\2\u06b1\u06b2\7<\2\2\u06b2\u06b3\5\u0106\u0084\2\u06b3\u013f\3"+
		"\2\2\2\u06b4\u06b5\7\27\2\2\u06b5\u06b9\7;\2\2\u06b6\u06b8\5\u009cO\2"+
		"\u06b7\u06b6\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9\u06ba"+
		"\3\2\2\2\u06ba\u06bc\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bc\u06bd\5t;\2\u06bd"+
		"\u06be\5p9\2\u06be\u06bf\7J\2\2\u06bf\u06c0\5\u019e\u00d0\2\u06c0\u06c1"+
		"\7<\2\2\u06c1\u06c2\5\u0108\u0085\2\u06c2\u0141\3\2\2\2\u06c3\u06c5\7"+
		"\6\2\2\u06c4\u06c6\7h\2\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6"+
		"\u06c7\3\2\2\2\u06c7\u06c8\7A\2\2\u06c8\u0143\3\2\2\2\u06c9\u06cb\7\r"+
		"\2\2\u06ca\u06cc\7h\2\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc"+
		"\u06cd\3\2\2\2\u06cd\u06ce\7A\2\2\u06ce\u0145\3\2\2\2\u06cf\u06d1\7&\2"+
		"\2\u06d0\u06d2\5\u019e\u00d0\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2"+
		"\u06d2\u06d3\3\2\2\2\u06d3\u06d4\7A\2\2\u06d4\u0147\3\2\2\2\u06d5\u06d6"+
		"\7.\2\2\u06d6\u06d7\5\u019e\u00d0\2\u06d7\u06d8\7A\2\2\u06d8\u0149\3\2"+
		"\2\2\u06d9\u06da\7,\2\2\u06da\u06db\7;\2\2\u06db\u06dc\5\u019e\u00d0\2"+
		"\u06dc\u06dd\7<\2\2\u06dd\u06de\5\u00fc\177\2\u06de\u014b\3\2\2\2\u06df"+
		"\u06e0\7\61\2\2\u06e0\u06e1\5\u00fc\177\2\u06e1\u06e2\5\u014e\u00a8\2"+
		"\u06e2\u06ec\3\2\2\2\u06e3\u06e4\7\61\2\2\u06e4\u06e6\5\u00fc\177\2\u06e5"+
		"\u06e7\5\u014e\u00a8\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8"+
		"\3\2\2\2\u06e8\u06e9\5\u0156\u00ac\2\u06e9\u06ec\3\2\2\2\u06ea\u06ec\5"+
		"\u0158\u00ad\2\u06eb\u06df\3\2\2\2\u06eb\u06e3\3\2\2\2\u06eb\u06ea\3\2"+
		"\2\2\u06ec\u014d\3\2\2\2\u06ed\u06f1\5\u0150\u00a9\2\u06ee\u06f0\5\u0150"+
		"\u00a9\2\u06ef\u06ee\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1"+
		"\u06f2\3\2\2\2\u06f2\u014f\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06f5\7\t"+
		"\2\2\u06f5\u06f6\7;\2\2\u06f6\u06f7\5\u0152\u00aa\2\u06f7\u06f8\7<\2\2"+
		"\u06f8\u06f9\5\u00fc\177\2\u06f9\u0151\3\2\2\2\u06fa\u06fc\5\u009cO\2"+
		"\u06fb\u06fa\3\2\2\2\u06fc\u06ff\3\2\2\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe"+
		"\3\2\2\2\u06fe\u0700\3\2\2\2\u06ff\u06fd\3\2\2\2\u0700\u0701\5\u0154\u00ab"+
		"\2\u0701\u0702\5p9\2\u0702\u0153\3\2\2\2\u0703\u0708\5|?\2\u0704\u0705"+
		"\7X\2\2\u0705\u0707\5\22\n\2\u0706\u0704\3\2\2\2\u0707\u070a\3\2\2\2\u0708"+
		"\u0706\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u0155\3\2\2\2\u070a\u0708\3\2"+
		"\2\2\u070b\u070c\7\25\2\2\u070c\u070d\5\u00fc\177\2\u070d\u0157\3\2\2"+
		"\2\u070e\u070f\7\61\2\2\u070f\u0710\5\u015a\u00ae\2\u0710\u0712\5\u00fc"+
		"\177\2\u0711\u0713\5\u014e\u00a8\2\u0712\u0711\3\2\2\2\u0712\u0713\3\2"+
		"\2\2\u0713\u0715\3\2\2\2\u0714\u0716\5\u0156\u00ac\2\u0715\u0714\3\2\2"+
		"\2\u0715\u0716\3\2\2\2\u0716\u0159\3\2\2\2\u0717\u0718\7;\2\2\u0718\u071a"+
		"\5\u015c\u00af\2\u0719\u071b\7A\2\2\u071a\u0719\3\2\2\2\u071a\u071b\3"+
		"\2\2\2\u071b\u071c\3\2\2\2\u071c\u071d\7<\2\2\u071d\u015b\3\2\2\2\u071e"+
		"\u0723\5\u015e\u00b0\2\u071f\u0720\7A\2\2\u0720\u0722\5\u015e\u00b0\2"+
		"\u0721\u071f\3\2\2\2\u0722\u0725\3\2\2\2\u0723\u0721\3\2\2\2\u0723\u0724"+
		"\3\2\2\2\u0724\u015d\3\2\2\2\u0725\u0723\3\2\2\2\u0726\u0728\5\u009cO"+
		"\2\u0727\u0726\3\2\2\2\u0728\u072b\3\2\2\2\u0729\u0727\3\2\2\2\u0729\u072a"+
		"\3\2\2\2\u072a\u072c\3\2\2\2\u072b\u0729\3\2\2\2\u072c\u072d\5t;\2\u072d"+
		"\u072e\5p9\2\u072e\u072f\7D\2\2\u072f\u0730\5\u019e\u00d0\2\u0730\u015f"+
		"\3\2\2\2\u0731\u0734\5\u016e\u00b8\2\u0732\u0734\5\u0196\u00cc\2\u0733"+
		"\u0731\3\2\2\2\u0733\u0732\3\2\2\2\u0734\u0738\3\2\2\2\u0735\u0737\5\u0168"+
		"\u00b5\2\u0736\u0735\3\2\2\2\u0737\u073a\3\2\2\2\u0738\u0736\3\2\2\2\u0738"+
		"\u0739\3\2\2\2\u0739\u0161\3\2\2\2\u073a\u0738\3\2\2\2\u073b\u0759\5\4"+
		"\3\2\u073c\u0741\58\35\2\u073d\u073e\7?\2\2\u073e\u0740\7@\2\2\u073f\u073d"+
		"\3\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742\3\2\2\2\u0742"+
		"\u0744\3\2\2\2\u0743\u0741\3\2\2\2\u0744\u0745\7C\2\2\u0745\u0746\7\13"+
		"\2\2\u0746\u0759\3\2\2\2\u0747\u0748\7\62\2\2\u0748\u0749\7C\2\2\u0749"+
		"\u0759\7\13\2\2\u074a\u0759\7-\2\2\u074b\u074c\58\35\2\u074c\u074d\7C"+
		"\2\2\u074d\u074e\7-\2\2\u074e\u0759\3\2\2\2\u074f\u0750\7;\2\2\u0750\u0751"+
		"\5\u019e\u00d0\2\u0751\u0752\7<\2\2\u0752\u0759\3\2\2\2\u0753\u0759\5"+
		"\u0174\u00bb\2\u0754\u0759\5\u017c\u00bf\2\u0755\u0759\5\u0182\u00c2\2"+
		"\u0756\u0759\5\u0188\u00c5\2\u0757\u0759\5\u0190\u00c9\2\u0758\u073b\3"+
		"\2\2\2\u0758\u073c\3\2\2\2\u0758\u0747\3\2\2\2\u0758\u074a\3\2\2\2\u0758"+
		"\u074b\3\2\2\2\u0758\u074f\3\2\2\2\u0758\u0753\3\2\2\2\u0758\u0754\3\2"+
		"\2\2\u0758\u0755\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0757\3\2\2\2\u0759"+
		"\u0163\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u0165\3\2\2\2\u075c\u0779\5\4"+
		"\3\2\u075d\u0762\58\35\2\u075e\u075f\7?\2\2\u075f\u0761\7@\2\2\u0760\u075e"+
		"\3\2\2\2\u0761\u0764\3\2\2\2\u0762\u0760\3\2\2\2\u0762\u0763\3\2\2\2\u0763"+
		"\u0765\3\2\2\2\u0764\u0762\3\2\2\2\u0765\u0766\7C\2\2\u0766\u0767\7\13"+
		"\2\2\u0767\u0779\3\2\2\2\u0768\u0769\7\62\2\2\u0769\u076a\7C\2\2\u076a"+
		"\u0779\7\13\2\2\u076b\u0779\7-\2\2\u076c\u076d\58\35\2\u076d\u076e\7C"+
		"\2\2\u076e\u076f\7-\2\2\u076f\u0779\3\2\2\2\u0770\u0771\7;\2\2\u0771\u0772"+
		"\5\u019e\u00d0\2\u0772\u0773\7<\2\2\u0773\u0779\3\2\2\2\u0774\u0779\5"+
		"\u0174\u00bb\2\u0775\u0779\5\u017c\u00bf\2\u0776\u0779\5\u0188\u00c5\2"+
		"\u0777\u0779\5\u0190\u00c9\2\u0778\u075c\3\2\2\2\u0778\u075d\3\2\2\2\u0778"+
		"\u0768\3\2\2\2\u0778\u076b\3\2\2\2\u0778\u076c\3\2\2\2\u0778\u0770\3\2"+
		"\2\2\u0778\u0774\3\2\2\2\u0778\u0775\3\2\2\2\u0778\u0776\3\2\2\2\u0778"+
		"\u0777\3\2\2\2\u0779\u0167\3\2\2\2\u077a\u0780\5\u0176\u00bc\2\u077b\u0780"+
		"\5\u017e\u00c0\2\u077c\u0780\5\u0184\u00c3\2\u077d\u0780\5\u018a\u00c6"+
		"\2\u077e\u0780\5\u0192\u00ca\2\u077f\u077a\3\2\2\2\u077f\u077b\3\2\2\2"+
		"\u077f\u077c\3\2\2\2\u077f\u077d\3\2\2\2\u077f\u077e\3\2\2\2\u0780\u0169"+
		"\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u016b\3\2\2\2\u0783\u0788\5\u0176\u00bc"+
		"\2\u0784\u0788\5\u017e\u00c0\2\u0785\u0788\5\u018a\u00c6\2\u0786\u0788"+
		"\5\u0192\u00ca\2\u0787\u0783\3\2\2\2\u0787\u0784\3\2\2\2\u0787\u0785\3"+
		"\2\2\2\u0787\u0786\3\2\2\2\u0788\u016d\3\2\2\2\u0789\u07b2\5\4\3\2\u078a"+
		"\u078f\58\35\2\u078b\u078c\7?\2\2\u078c\u078e\7@\2\2\u078d\u078b\3\2\2"+
		"\2\u078e\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792"+
		"\3\2\2\2\u0791\u078f\3\2\2\2\u0792\u0793\7C\2\2\u0793\u0794\7\13\2\2\u0794"+
		"\u07b2\3\2\2\2\u0795\u079a\5v<\2\u0796\u0797\7?\2\2\u0797\u0799\7@\2\2"+
		"\u0798\u0796\3\2\2\2\u0799\u079c\3\2\2\2\u079a\u0798\3\2\2\2\u079a\u079b"+
		"\3\2\2\2\u079b\u079d\3\2\2\2\u079c\u079a\3\2\2\2\u079d\u079e\7C\2\2\u079e"+
		"\u079f\7\13\2\2\u079f\u07b2\3\2\2\2\u07a0\u07a1\7\62\2\2\u07a1\u07a2\7"+
		"C\2\2\u07a2\u07b2\7\13\2\2\u07a3\u07b2\7-\2\2\u07a4\u07a5\58\35\2\u07a5"+
		"\u07a6\7C\2\2\u07a6\u07a7\7-\2\2\u07a7\u07b2\3\2\2\2\u07a8\u07a9\7;\2"+
		"\2\u07a9\u07aa\5\u019e\u00d0\2\u07aa\u07ab\7<\2\2\u07ab\u07b2\3\2\2\2"+
		"\u07ac\u07b2\5\u0178\u00bd\2\u07ad\u07b2\5\u0180\u00c1\2\u07ae\u07b2\5"+
		"\u0186\u00c4\2\u07af\u07b2\5\u018c\u00c7\2\u07b0\u07b2\5\u0194\u00cb\2"+
		"\u07b1\u0789\3\2\2\2\u07b1\u078a\3\2\2\2\u07b1\u0795\3\2\2\2\u07b1\u07a0"+
		"\3\2\2\2\u07b1\u07a3\3\2\2\2\u07b1\u07a4\3\2\2\2\u07b1\u07a8\3\2\2\2\u07b1"+
		"\u07ac\3\2\2\2\u07b1\u07ad\3\2\2\2\u07b1\u07ae\3\2\2\2\u07b1\u07af\3\2"+
		"\2\2\u07b1\u07b0\3\2\2\2\u07b2\u016f\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4"+
		"\u0171\3\2\2\2\u07b5\u07dd\5\4\3\2\u07b6\u07bb\58\35\2\u07b7\u07b8\7?"+
		"\2\2\u07b8\u07ba\7@\2\2\u07b9\u07b7\3\2\2\2\u07ba\u07bd\3\2\2\2\u07bb"+
		"\u07b9\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07be\3\2\2\2\u07bd\u07bb\3\2"+
		"\2\2\u07be\u07bf\7C\2\2\u07bf\u07c0\7\13\2\2\u07c0\u07dd\3\2\2\2\u07c1"+
		"\u07c6\5v<\2\u07c2\u07c3\7?\2\2\u07c3\u07c5\7@\2\2\u07c4\u07c2\3\2\2\2"+
		"\u07c5\u07c8\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7\u07c9"+
		"\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c9\u07ca\7C\2\2\u07ca\u07cb\7\13\2\2\u07cb"+
		"\u07dd\3\2\2\2\u07cc\u07cd\7\62\2\2\u07cd\u07ce\7C\2\2\u07ce\u07dd\7\13"+
		"\2\2\u07cf\u07dd\7-\2\2\u07d0\u07d1\58\35\2\u07d1\u07d2\7C\2\2\u07d2\u07d3"+
		"\7-\2\2\u07d3\u07dd\3\2\2\2\u07d4\u07d5\7;\2\2\u07d5\u07d6\5\u019e\u00d0"+
		"\2\u07d6\u07d7\7<\2\2\u07d7\u07dd\3\2\2\2\u07d8\u07dd\5\u0178\u00bd\2"+
		"\u07d9\u07dd\5\u0180\u00c1\2\u07da\u07dd\5\u018c\u00c7\2\u07db\u07dd\5"+
		"\u0194\u00cb\2\u07dc\u07b5\3\2\2\2\u07dc\u07b6\3\2\2\2\u07dc\u07c1\3\2"+
		"\2\2\u07dc\u07cc\3\2\2\2\u07dc\u07cf\3\2\2\2\u07dc\u07d0\3\2\2\2\u07dc"+
		"\u07d4\3\2\2\2\u07dc\u07d8\3\2\2\2\u07dc\u07d9\3\2\2\2\u07dc\u07da\3\2"+
		"\2\2\u07dc\u07db\3\2\2\2\u07dd\u0173\3\2\2\2\u07de\u07e0\7!\2\2\u07df"+
		"\u07e1\5,\27\2\u07e0\u07df\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e5\3\2"+
		"\2\2\u07e2\u07e4\5\u00e6t\2\u07e3\u07e2\3\2\2\2\u07e4\u07e7\3\2\2\2\u07e5"+
		"\u07e3\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e8\3\2\2\2\u07e7\u07e5\3\2"+
		"\2\2\u07e8\u07f3\7h\2\2\u07e9\u07ed\7C\2\2\u07ea\u07ec\5\u00e6t\2\u07eb"+
		"\u07ea\3\2\2\2\u07ec\u07ef\3\2\2\2\u07ed\u07eb\3\2\2\2\u07ed\u07ee\3\2"+
		"\2\2\u07ee\u07f0\3\2\2\2\u07ef\u07ed\3\2\2\2\u07f0\u07f2\7h\2\2\u07f1"+
		"\u07e9\3\2\2\2\u07f2\u07f5\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f3\u07f4\3\2"+
		"\2\2\u07f4\u07f7\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f6\u07f8\5\u017a\u00be"+
		"\2\u07f7\u07f6\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fb"+
		"\7;\2\2\u07fa\u07fc\5\u018e\u00c8\2\u07fb\u07fa\3\2\2\2\u07fb\u07fc\3"+
		"\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u07ff\7<\2\2\u07fe\u0800\5b\62\2\u07ff"+
		"\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0832\3\2\2\2\u0801\u0802\5<"+
		"\37\2\u0802\u0803\7C\2\2\u0803\u0805\7!\2\2\u0804\u0806\5,\27\2\u0805"+
		"\u0804\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u080a\3\2\2\2\u0807\u0809\5\u00e6"+
		"t\2\u0808\u0807\3\2\2\2\u0809\u080c\3\2\2\2\u080a\u0808\3\2\2\2\u080a"+
		"\u080b\3\2\2\2\u080b\u080d\3\2\2\2\u080c\u080a\3\2\2\2\u080d\u080f\7h"+
		"\2\2\u080e\u0810\5\u017a\u00be\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2"+
		"\2\u0810\u0811\3\2\2\2\u0811\u0813\7;\2\2\u0812\u0814\5\u018e\u00c8\2"+
		"\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0817"+
		"\7<\2\2\u0816\u0818\5b\62\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u0832\3\2\2\2\u0819\u081a\5\u0160\u00b1\2\u081a\u081b\7C\2\2\u081b\u081d"+
		"\7!\2\2\u081c\u081e\5,\27\2\u081d\u081c\3\2\2\2\u081d\u081e\3\2\2\2\u081e"+
		"\u0822\3\2\2\2\u081f\u0821\5\u00e6t\2\u0820\u081f\3\2\2\2\u0821\u0824"+
		"\3\2\2\2\u0822\u0820\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0825\3\2\2\2\u0824"+
		"\u0822\3\2\2\2\u0825\u0827\7h\2\2\u0826\u0828\5\u017a\u00be\2\u0827\u0826"+
		"\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082b\7;\2\2\u082a"+
		"\u082c\5\u018e\u00c8\2\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082d"+
		"\3\2\2\2\u082d\u082f\7<\2\2\u082e\u0830\5b\62\2\u082f\u082e\3\2\2\2\u082f"+
		"\u0830\3\2\2\2\u0830\u0832\3\2\2\2\u0831\u07de\3\2\2\2\u0831\u0801\3\2"+
		"\2\2\u0831\u0819\3\2\2\2\u0832\u0175\3\2\2\2\u0833\u0834\7C\2\2\u0834"+
		"\u0836\7!\2\2\u0835\u0837\5,\27\2\u0836\u0835\3\2\2\2\u0836\u0837\3\2"+
		"\2\2\u0837\u083b\3\2\2\2\u0838\u083a\5\u00e6t\2\u0839\u0838\3\2\2\2\u083a"+
		"\u083d\3\2\2\2\u083b\u0839\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083e\3\2"+
		"\2\2\u083d\u083b\3\2\2\2\u083e\u0840\7h\2\2\u083f\u0841\5\u017a\u00be"+
		"\2\u0840\u083f\3\2\2\2\u0840\u0841\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0844"+
		"\7;\2\2\u0843\u0845\5\u018e\u00c8\2\u0844\u0843\3\2\2\2\u0844\u0845\3"+
		"\2\2\2\u0845\u0846\3\2\2\2\u0846\u0848\7<\2\2\u0847\u0849\5b\62\2\u0848"+
		"\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u0177\3\2\2\2\u084a\u084c\7!"+
		"\2\2\u084b\u084d\5,\27\2\u084c\u084b\3\2\2\2\u084c\u084d\3\2\2\2\u084d"+
		"\u0851\3\2\2\2\u084e\u0850\5\u00e6t\2\u084f\u084e\3\2\2\2\u0850\u0853"+
		"\3\2\2\2\u0851\u084f\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0854\3\2\2\2\u0853"+
		"\u0851\3\2\2\2\u0854\u085f\7h\2\2\u0855\u0859\7C\2\2\u0856\u0858\5\u00e6"+
		"t\2\u0857\u0856\3\2\2\2\u0858\u085b\3\2\2\2\u0859\u0857\3\2\2\2\u0859"+
		"\u085a\3\2\2\2\u085a\u085c\3\2\2\2\u085b\u0859\3\2\2\2\u085c\u085e\7h"+
		"\2\2\u085d\u0855\3\2\2\2\u085e\u0861\3\2\2\2\u085f\u085d\3\2\2\2\u085f"+
		"\u0860\3\2\2\2\u0860\u0863\3\2\2\2\u0861\u085f\3\2\2\2\u0862\u0864\5\u017a"+
		"\u00be\2\u0863\u0862\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0865\3\2\2\2\u0865"+
		"\u0867\7;\2\2\u0866\u0868\5\u018e\u00c8\2\u0867\u0866\3\2\2\2\u0867\u0868"+
		"\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086b\7<\2\2\u086a\u086c\5b\62\2\u086b"+
		"\u086a\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u0886\3\2\2\2\u086d\u086e\5<"+
		"\37\2\u086e\u086f\7C\2\2\u086f\u0871\7!\2\2\u0870\u0872\5,\27\2\u0871"+
		"\u0870\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0876\3\2\2\2\u0873\u0875\5\u00e6"+
		"t\2\u0874\u0873\3\2\2\2\u0875\u0878\3\2\2\2\u0876\u0874\3\2\2\2\u0876"+
		"\u0877\3\2\2\2\u0877\u0879\3\2\2\2\u0878\u0876\3\2\2\2\u0879\u087b\7h"+
		"\2\2\u087a\u087c\5\u017a\u00be\2\u087b\u087a\3\2\2\2\u087b\u087c\3\2\2"+
		"\2\u087c\u087d\3\2\2\2\u087d\u087f\7;\2\2\u087e\u0880\5\u018e\u00c8\2"+
		"\u087f\u087e\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0883"+
		"\7<\2\2\u0882\u0884\5b\62\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2\2\u0884"+
		"\u0886\3\2\2\2\u0885\u084a\3\2\2\2\u0885\u086d\3\2\2\2\u0886\u0179\3\2"+
		"\2\2\u0887\u088b\5,\27\2\u0888\u0889\7F\2\2\u0889\u088b\7E\2\2\u088a\u0887"+
		"\3\2\2\2\u088a\u0888\3\2\2\2\u088b\u017b\3\2\2\2\u088c\u088d\5\u0160\u00b1"+
		"\2\u088d\u088e\7C\2\2\u088e\u088f\7h\2\2\u088f\u089a\3\2\2\2\u0890\u0891"+
		"\7*\2\2\u0891\u0892\7C\2\2\u0892\u089a\7h\2\2\u0893\u0894\58\35\2\u0894"+
		"\u0895\7C\2\2\u0895\u0896\7*\2\2\u0896\u0897\7C\2\2\u0897\u0898\7h\2\2"+
		"\u0898\u089a\3\2\2\2\u0899\u088c\3\2\2\2\u0899\u0890\3\2\2\2\u0899\u0893"+
		"\3\2\2\2\u089a\u017d\3\2\2\2\u089b\u089c\7C\2\2\u089c\u089d\7h\2\2\u089d"+
		"\u017f\3\2\2\2\u089e\u089f\7*\2\2\u089f\u08a0\7C\2\2\u08a0\u08a8\7h\2"+
		"\2\u08a1\u08a2\58\35\2\u08a2\u08a3\7C\2\2\u08a3\u08a4\7*\2\2\u08a4\u08a5"+
		"\7C\2\2\u08a5\u08a6\7h\2\2\u08a6\u08a8\3\2\2\2\u08a7\u089e\3\2\2\2\u08a7"+
		"\u08a1\3\2\2\2\u08a8\u0181\3\2\2\2\u08a9\u08aa\5<\37\2\u08aa\u08ab\7?"+
		"\2\2\u08ab\u08ac\5\u019e\u00d0\2\u08ac\u08ad\7@\2\2\u08ad\u08b4\3\2\2"+
		"\2\u08ae\u08af\5\u0166\u00b4\2\u08af\u08b0\7?\2\2\u08b0\u08b1\5\u019e"+
		"\u00d0\2\u08b1\u08b2\7@\2\2\u08b2\u08b4\3\2\2\2\u08b3\u08a9\3\2\2\2\u08b3"+
		"\u08ae\3\2\2\2\u08b4\u08bc\3\2\2\2\u08b5\u08b6\5\u0164\u00b3\2\u08b6\u08b7"+
		"\7?\2\2\u08b7\u08b8\5\u019e\u00d0\2\u08b8\u08b9\7@\2\2\u08b9\u08bb\3\2"+
		"\2\2\u08ba\u08b5\3\2\2\2\u08bb\u08be\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bc"+
		"\u08bd\3\2\2\2\u08bd\u0183\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf\u08c0\5\u016c"+
		"\u00b7\2\u08c0\u08c1\7?\2\2\u08c1\u08c2\5\u019e\u00d0\2\u08c2\u08c3\7"+
		"@\2\2\u08c3\u08cb\3\2\2\2\u08c4\u08c5\5\u016a\u00b6\2\u08c5\u08c6\7?\2"+
		"\2\u08c6\u08c7\5\u019e\u00d0\2\u08c7\u08c8\7@\2\2\u08c8\u08ca\3\2\2\2"+
		"\u08c9\u08c4\3\2\2\2\u08ca\u08cd\3\2\2\2\u08cb\u08c9\3\2\2\2\u08cb\u08cc"+
		"\3\2\2\2\u08cc\u0185\3\2\2\2\u08cd\u08cb\3\2\2\2\u08ce\u08cf\5<\37\2\u08cf"+
		"\u08d0\7?\2\2\u08d0\u08d1\5\u019e\u00d0\2\u08d1\u08d2\7@\2\2\u08d2\u08d9"+
		"\3\2\2\2\u08d3\u08d4\5\u0172\u00ba\2\u08d4\u08d5\7?\2\2\u08d5\u08d6\5"+
		"\u019e\u00d0\2\u08d6\u08d7\7@\2\2\u08d7\u08d9\3\2\2\2\u08d8\u08ce\3\2"+
		"\2\2\u08d8\u08d3\3\2\2\2\u08d9\u08e1\3\2\2\2\u08da\u08db\5\u0170\u00b9"+
		"\2\u08db\u08dc\7?\2\2\u08dc\u08dd\5\u019e\u00d0\2\u08dd\u08de\7@\2\2\u08de"+
		"\u08e0\3\2\2\2\u08df\u08da\3\2\2\2\u08e0\u08e3\3\2\2\2\u08e1\u08df\3\2"+
		"\2\2\u08e1\u08e2\3\2\2\2\u08e2\u0187\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e4"+
		"\u08e5\5> \2\u08e5\u08e7\7;\2\2\u08e6\u08e8\5\u018e\u00c8\2\u08e7\u08e6"+
		"\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9\u08ea\7<\2\2\u08ea"+
		"\u0929\3\2\2\2\u08eb\u08ec\58\35\2\u08ec\u08ee\7C\2\2\u08ed\u08ef\5,\27"+
		"\2\u08ee\u08ed\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u08f1"+
		"\7h\2\2\u08f1\u08f3\7;\2\2\u08f2\u08f4\5\u018e\u00c8\2\u08f3\u08f2\3\2"+
		"\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\7<\2\2\u08f6"+
		"\u0929\3\2\2\2\u08f7\u08f8\5<\37\2\u08f8\u08fa\7C\2\2\u08f9\u08fb\5,\27"+
		"\2\u08fa\u08f9\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fd"+
		"\7h\2\2\u08fd\u08ff\7;\2\2\u08fe\u0900\5\u018e\u00c8\2\u08ff\u08fe\3\2"+
		"\2\2\u08ff\u0900\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902\7<\2\2\u0902"+
		"\u0929\3\2\2\2\u0903\u0904\5\u0160\u00b1\2\u0904\u0906\7C\2\2\u0905\u0907"+
		"\5,\27\2\u0906\u0905\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0908\3\2\2\2\u0908"+
		"\u0909\7h\2\2\u0909\u090b\7;\2\2\u090a\u090c\5\u018e\u00c8\2\u090b\u090a"+
		"\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\7<\2\2\u090e"+
		"\u0929\3\2\2\2\u090f\u0910\7*\2\2\u0910\u0912\7C\2\2\u0911\u0913\5,\27"+
		"\2\u0912\u0911\3\2\2\2\u0912\u0913\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915"+
		"\7h\2\2\u0915\u0917\7;\2\2\u0916\u0918\5\u018e\u00c8\2\u0917\u0916\3\2"+
		"\2\2\u0917\u0918\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u0929\7<\2\2\u091a"+
		"\u091b\58\35\2\u091b\u091c\7C\2\2\u091c\u091d\7*\2\2\u091d\u091f\7C\2"+
		"\2\u091e\u0920\5,\27\2\u091f\u091e\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0921"+
		"\3\2\2\2\u0921\u0922\7h\2\2\u0922\u0924\7;\2\2\u0923\u0925\5\u018e\u00c8"+
		"\2\u0924\u0923\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0927"+
		"\7<\2\2\u0927\u0929\3\2\2\2\u0928\u08e4\3\2\2\2\u0928\u08eb\3\2\2\2\u0928"+
		"\u08f7\3\2\2\2\u0928\u0903\3\2\2\2\u0928\u090f\3\2\2\2\u0928\u091a\3\2"+
		"\2\2\u0929\u0189\3\2\2\2\u092a\u092c\7C\2\2\u092b\u092d\5,\27\2\u092c"+
		"\u092b\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f\7h"+
		"\2\2\u092f\u0931\7;\2\2\u0930\u0932\5\u018e\u00c8\2\u0931\u0930\3\2\2"+
		"\2\u0931\u0932\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934\7<\2\2\u0934\u018b"+
		"\3\2\2\2\u0935\u0936\5> \2\u0936\u0938\7;\2\2\u0937\u0939\5\u018e\u00c8"+
		"\2\u0938\u0937\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u093b"+
		"\7<\2\2\u093b\u096e\3\2\2\2\u093c\u093d\58\35\2\u093d\u093f\7C\2\2\u093e"+
		"\u0940\5,\27\2\u093f\u093e\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0941\3\2"+
		"\2\2\u0941\u0942\7h\2\2\u0942\u0944\7;\2\2\u0943\u0945\5\u018e\u00c8\2"+
		"\u0944\u0943\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0947"+
		"\7<\2\2\u0947\u096e\3\2\2\2\u0948\u0949\5<\37\2\u0949\u094b\7C\2\2\u094a"+
		"\u094c\5,\27\2\u094b\u094a\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d\3\2"+
		"\2\2\u094d\u094e\7h\2\2\u094e\u0950\7;\2\2\u094f\u0951\5\u018e\u00c8\2"+
		"\u0950\u094f\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953"+
		"\7<\2\2\u0953\u096e\3\2\2\2\u0954\u0955\7*\2\2\u0955\u0957\7C\2\2\u0956"+
		"\u0958\5,\27\2\u0957\u0956\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\3\2"+
		"\2\2\u0959\u095a\7h\2\2\u095a\u095c\7;\2\2\u095b\u095d\5\u018e\u00c8\2"+
		"\u095c\u095b\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u096e"+
		"\7<\2\2\u095f\u0960\58\35\2\u0960\u0961\7C\2\2\u0961\u0962\7*\2\2\u0962"+
		"\u0964\7C\2\2\u0963\u0965\5,\27\2\u0964\u0963\3\2\2\2\u0964\u0965\3\2"+
		"\2\2\u0965\u0966\3\2\2\2\u0966\u0967\7h\2\2\u0967\u0969\7;\2\2\u0968\u096a"+
		"\5\u018e\u00c8\2\u0969\u0968\3\2\2\2\u0969\u096a\3\2\2\2\u096a\u096b\3"+
		"\2\2\2\u096b\u096c\7<\2\2\u096c\u096e\3\2\2\2\u096d\u0935\3\2\2\2\u096d"+
		"\u093c\3\2\2\2\u096d\u0948\3\2\2\2\u096d\u0954\3\2\2\2\u096d\u095f\3\2"+
		"\2\2\u096e\u018d";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u096f\u0974\5\u019e\u00d0\2\u0970\u0971\7B\2\2\u0971\u0973\5"+
		"\u019e\u00d0\2\u0972\u0970\3\2\2\2\u0973\u0976\3\2\2\2\u0974\u0972\3\2"+
		"\2\2\u0974\u0975\3\2\2\2\u0975\u018f\3\2\2\2\u0976\u0974\3\2\2\2\u0977"+
		"\u0978\5<\37\2\u0978\u097a\7\\\2\2\u0979\u097b\5,\27\2\u097a\u0979\3\2"+
		"\2\2\u097a\u097b\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u097d\7h\2\2\u097d"+
		"\u09a7\3\2\2\2\u097e\u097f\5\16\b\2\u097f\u0981\7\\\2\2\u0980\u0982\5"+
		",\27\2\u0981\u0980\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0983\3\2\2\2\u0983"+
		"\u0984\7h\2\2\u0984\u09a7\3\2\2\2\u0985\u0986\5\u0160\u00b1\2\u0986\u0988"+
		"\7\\\2\2\u0987\u0989\5,\27\2\u0988\u0987\3\2\2\2\u0988\u0989\3\2\2\2\u0989"+
		"\u098a\3\2\2\2\u098a\u098b\7h\2\2\u098b\u09a7\3\2\2\2\u098c\u098d\7*\2"+
		"\2\u098d\u098f\7\\\2\2\u098e\u0990\5,\27\2\u098f\u098e\3\2\2\2\u098f\u0990"+
		"\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u09a7\7h\2\2\u0992\u0993\58\35\2\u0993"+
		"\u0994\7C\2\2\u0994\u0995\7*\2\2\u0995\u0997\7\\\2\2\u0996\u0998\5,\27"+
		"\2\u0997\u0996\3\2\2\2\u0997\u0998\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099a"+
		"\7h\2\2\u099a\u09a7\3\2\2\2\u099b\u099c\5\22\n\2\u099c\u099e\7\\\2\2\u099d"+
		"\u099f\5,\27\2\u099e\u099d\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a0\3\2"+
		"\2\2\u09a0\u09a1\7!\2\2\u09a1\u09a7\3\2\2\2\u09a2\u09a3\5 \21\2\u09a3"+
		"\u09a4\7\\\2\2\u09a4\u09a5\7!\2\2\u09a5\u09a7\3\2\2\2\u09a6\u0977\3\2"+
		"\2\2\u09a6\u097e\3\2\2\2\u09a6\u0985\3\2\2\2\u09a6\u098c\3\2\2\2\u09a6"+
		"\u0992\3\2\2\2\u09a6\u099b\3\2\2\2\u09a6\u09a2\3\2\2\2\u09a7\u0191\3\2"+
		"\2\2\u09a8\u09aa\7\\\2\2\u09a9\u09ab\5,\27\2\u09aa\u09a9\3\2\2\2\u09aa"+
		"\u09ab\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\7h\2\2\u09ad\u0193\3\2"+
		"\2\2\u09ae\u09af\5<\37\2\u09af\u09b1\7\\\2\2\u09b0\u09b2\5,\27\2\u09b1"+
		"\u09b0\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09b4\7h"+
		"\2\2\u09b4\u09d7\3\2\2\2\u09b5\u09b6\5\16\b\2\u09b6\u09b8\7\\\2\2\u09b7"+
		"\u09b9\5,\27\2\u09b8\u09b7\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\3\2"+
		"\2\2\u09ba\u09bb\7h\2\2\u09bb\u09d7\3\2\2\2\u09bc\u09bd\7*\2\2\u09bd\u09bf"+
		"\7\\\2\2\u09be\u09c0\5,\27\2\u09bf\u09be\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0"+
		"\u09c1\3\2\2\2\u09c1\u09d7\7h\2\2\u09c2\u09c3\58\35\2\u09c3\u09c4\7C\2"+
		"\2\u09c4\u09c5\7*\2\2\u09c5\u09c7\7\\\2\2\u09c6\u09c8\5,\27\2\u09c7\u09c6"+
		"\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09ca\7h\2\2\u09ca"+
		"\u09d7\3\2\2\2\u09cb\u09cc\5\22\n\2\u09cc\u09ce\7\\\2\2\u09cd\u09cf\5"+
		",\27\2\u09ce\u09cd\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0"+
		"\u09d1\7!\2\2\u09d1\u09d7\3\2\2\2\u09d2\u09d3\5 \21\2\u09d3\u09d4\7\\"+
		"\2\2\u09d4\u09d5\7!\2\2\u09d5\u09d7\3\2\2\2\u09d6\u09ae\3\2\2\2\u09d6"+
		"\u09b5\3\2\2\2\u09d6\u09bc\3\2\2\2\u09d6\u09c2\3\2\2\2\u09d6\u09cb\3\2"+
		"\2\2\u09d6\u09d2\3\2\2\2\u09d7\u0195\3\2\2\2\u09d8\u09d9\7!\2\2\u09d9"+
		"\u09da\5\6\4\2\u09da\u09dc\5\u0198\u00cd\2\u09db\u09dd\5\"\22\2\u09dc"+
		"\u09db\3\2\2\2\u09dc\u09dd\3\2\2\2\u09dd\u09ef\3\2\2\2\u09de\u09df\7!"+
		"\2\2\u09df\u09e0\5\20\t\2\u09e0\u09e2\5\u0198\u00cd\2\u09e1\u09e3\5\""+
		"\22\2\u09e2\u09e1\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09ef\3\2\2\2\u09e4"+
		"\u09e5\7!\2\2\u09e5\u09e6\5\6\4\2\u09e6\u09e7\5\"\22\2\u09e7\u09e8\5\u00f8"+
		"}\2\u09e8\u09ef\3\2\2\2\u09e9\u09ea\7!\2\2\u09ea\u09eb\5\20\t\2\u09eb"+
		"\u09ec\5\"\22\2\u09ec\u09ed\5\u00f8}\2\u09ed\u09ef\3\2\2\2\u09ee\u09d8"+
		"\3\2\2\2\u09ee\u09de\3\2\2\2\u09ee\u09e4\3\2\2\2\u09ee\u09e9\3\2\2\2\u09ef"+
		"\u0197\3\2\2\2\u09f0\u09f4\5\u019a\u00ce\2\u09f1\u09f3\5\u019a\u00ce\2"+
		"\u09f2\u09f1\3\2\2\2\u09f3\u09f6\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f4\u09f5"+
		"\3\2\2\2\u09f5\u0199\3\2\2\2\u09f6\u09f4\3\2\2\2\u09f7\u09f9\5\u00e6t"+
		"\2\u09f8\u09f7\3\2\2\2\u09f9\u09fc\3\2\2\2\u09fa\u09f8\3\2\2\2\u09fa\u09fb"+
		"\3\2\2\2\u09fb\u09fd\3\2\2\2\u09fc\u09fa\3\2\2\2\u09fd\u09fe\7?\2\2\u09fe"+
		"\u09ff\5\u019e\u00d0\2\u09ff\u0a00\7@\2\2\u0a00\u019b\3\2\2\2\u0a01\u0a02"+
		"\5\u019e\u00d0\2\u0a02\u019d\3\2\2\2\u0a03\u0a06\5\u01a0\u00d1\2\u0a04"+
		"\u0a06\5\u01a8\u00d5\2\u0a05\u0a03\3\2\2\2\u0a05\u0a04\3\2\2\2\u0a06\u019f"+
		"\3\2\2\2\u0a07\u0a08\5\u01a2\u00d2\2\u0a08\u0a09\7[\2\2\u0a09\u0a0a\5"+
		"\u01a6\u00d4\2\u0a0a\u01a1\3\2\2\2\u0a0b\u0a16\7h\2\2\u0a0c\u0a0e\7;\2"+
		"\2\u0a0d\u0a0f\5\u0096L\2\u0a0e\u0a0d\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f"+
		"\u0a10\3\2\2\2\u0a10\u0a16\7<\2\2\u0a11\u0a12\7;\2\2\u0a12\u0a13\5\u01a4"+
		"\u00d3\2\u0a13\u0a14\7<\2\2\u0a14\u0a16\3\2\2\2\u0a15\u0a0b\3\2\2\2\u0a15"+
		"\u0a0c\3\2\2\2\u0a15\u0a11\3\2\2\2\u0a16\u01a3\3\2\2\2\u0a17\u0a1c\7h"+
		"\2\2\u0a18\u0a19\7B\2\2\u0a19\u0a1b\7h\2\2\u0a1a\u0a18\3\2\2\2\u0a1b\u0a1e"+
		"\3\2\2\2\u0a1c\u0a1a\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u01a5\3\2\2\2\u0a1e"+
		"\u0a1c\3\2\2\2\u0a1f\u0a22\5\u019e\u00d0\2\u0a20\u0a22\5\u00fc\177\2\u0a21"+
		"\u0a1f\3\2\2\2\u0a21\u0a20\3\2\2\2\u0a22\u01a7\3\2\2\2\u0a23\u0a26\5\u01b0"+
		"\u00d9\2\u0a24\u0a26\5\u01aa\u00d6\2\u0a25\u0a23\3\2\2\2\u0a25\u0a24\3"+
		"\2\2\2\u0a26\u01a9\3\2\2\2\u0a27\u0a28\5\u01ac\u00d7\2\u0a28\u0a29\5\u01ae"+
		"\u00d8\2\u0a29\u0a2a\5\u019e\u00d0\2\u0a2a\u01ab\3\2\2\2\u0a2b\u0a2f\5"+
		"<\37\2\u0a2c\u0a2f\5\u017c\u00bf\2\u0a2d\u0a2f\5\u0182\u00c2\2\u0a2e\u0a2b"+
		"\3\2\2\2\u0a2e\u0a2c\3\2\2\2\u0a2e\u0a2d\3\2\2\2\u0a2f\u01ad\3\2\2\2\u0a30"+
		"\u0a31\t\5\2\2\u0a31\u01af\3\2\2\2\u0a32\u0a3a\5\u01b2\u00da\2\u0a33\u0a34"+
		"\5\u01b2\u00da\2\u0a34\u0a35\7I\2\2\u0a35\u0a36\5\u019e\u00d0\2\u0a36"+
		"\u0a37\7J\2\2\u0a37\u0a38\5\u01b0\u00d9\2\u0a38\u0a3a\3\2\2\2\u0a39\u0a32"+
		"\3\2\2\2\u0a39\u0a33\3\2\2\2\u0a3a\u01b1\3\2\2\2\u0a3b\u0a3c\b\u00da\1"+
		"\2\u0a3c\u0a3d\5\u01b4\u00db\2\u0a3d\u0a43\3\2\2\2\u0a3e\u0a3f\f\3\2\2"+
		"\u0a3f\u0a40\7P\2\2\u0a40\u0a42\5\u01b4\u00db\2\u0a41\u0a3e\3\2\2\2\u0a42"+
		"\u0a45\3\2\2\2\u0a43\u0a41\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u01b3\3\2"+
		"\2\2\u0a45\u0a43\3\2\2\2\u0a46\u0a47\b\u00db\1\2\u0a47\u0a48\5\u01b6\u00dc"+
		"\2\u0a48\u0a4e\3\2\2\2\u0a49\u0a4a\f\3\2\2\u0a4a\u0a4b\7O\2\2\u0a4b\u0a4d"+
		"\5\u01b6\u00dc\2\u0a4c\u0a49\3\2\2\2\u0a4d\u0a50\3\2\2\2\u0a4e\u0a4c\3"+
		"\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f\u01b5\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a51"+
		"\u0a52\b\u00dc\1\2\u0a52\u0a53\5\u01b8\u00dd\2\u0a53\u0a59\3\2\2\2\u0a54"+
		"\u0a55\f\3\2\2\u0a55\u0a56\7X\2\2\u0a56\u0a58\5\u01b8\u00dd\2\u0a57\u0a54"+
		"\3\2\2\2\u0a58\u0a5b\3\2\2\2\u0a59\u0a57\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a"+
		"\u01b7\3\2\2\2\u0a5b\u0a59\3\2\2\2\u0a5c\u0a5d\b\u00dd\1\2\u0a5d\u0a5e"+
		"\5\u01ba\u00de\2\u0a5e\u0a64\3\2\2\2\u0a5f\u0a60\f\3\2\2\u0a60\u0a61\7"+
		"Y\2\2\u0a61\u0a63\5\u01ba\u00de\2\u0a62\u0a5f\3\2\2\2\u0a63\u0a66\3\2"+
		"\2\2\u0a64\u0a62\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u01b9\3\2\2\2\u0a66"+
		"\u0a64\3\2\2\2\u0a67\u0a68\b\u00de\1\2\u0a68\u0a69\5\u01bc\u00df\2\u0a69"+
		"\u0a6f\3\2\2\2\u0a6a\u0a6b\f\3\2\2\u0a6b\u0a6c\7W\2\2\u0a6c\u0a6e\5\u01bc"+
		"\u00df\2\u0a6d\u0a6a\3\2\2\2\u0a6e\u0a71\3\2\2\2\u0a6f\u0a6d\3\2\2\2\u0a6f"+
		"\u0a70\3\2\2\2\u0a70\u01bb\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a72\u0a73\b\u00df"+
		"\1\2\u0a73\u0a74\5\u01be\u00e0\2\u0a74\u0a7d\3\2\2\2\u0a75\u0a76\f\4\2"+
		"\2\u0a76\u0a77\7K\2\2\u0a77\u0a7c\5\u01be\u00e0\2\u0a78\u0a79\f\3\2\2"+
		"\u0a79\u0a7a\7N\2\2\u0a7a\u0a7c\5\u01be\u00e0\2\u0a7b\u0a75\3\2\2\2\u0a7b"+
		"\u0a78\3\2\2\2\u0a7c\u0a7f\3\2\2\2\u0a7d\u0a7b\3\2\2\2\u0a7d\u0a7e\3\2"+
		"\2\2\u0a7e\u01bd\3\2\2\2\u0a7f\u0a7d\3\2\2\2\u0a80\u0a81\b\u00e0\1\2\u0a81"+
		"\u0a82\5\u01c0\u00e1\2\u0a82\u0a94\3\2\2\2\u0a83\u0a84\f\7\2\2\u0a84\u0a85"+
		"\7F\2\2\u0a85\u0a93\5\u01c0\u00e1\2\u0a86\u0a87\f\6\2\2\u0a87\u0a88\7"+
		"E\2\2\u0a88\u0a93\5\u01c0\u00e1\2\u0a89\u0a8a\f\5\2\2\u0a8a\u0a8b\7L\2"+
		"\2\u0a8b\u0a93\5\u01c0\u00e1\2\u0a8c\u0a8d\f\4\2\2\u0a8d\u0a8e\7M\2\2"+
		"\u0a8e\u0a93\5\u01c0\u00e1\2\u0a8f\u0a90\f\3\2\2\u0a90\u0a91\7\34\2\2"+
		"\u0a91\u0a93\5\16\b\2\u0a92\u0a83\3\2\2\2\u0a92\u0a86\3\2\2\2\u0a92\u0a89"+
		"\3\2\2\2\u0a92\u0a8c\3\2\2\2\u0a92\u0a8f\3\2\2\2\u0a93\u0a96\3\2\2\2\u0a94"+
		"\u0a92\3\2\2\2\u0a94\u0a95\3\2\2\2\u0a95\u01bf\3\2\2\2\u0a96\u0a94\3\2"+
		"\2\2\u0a97\u0a98\b\u00e1\1\2\u0a98\u0a99\5\u01c2\u00e2\2\u0a99\u0aa9\3"+
		"\2\2\2\u0a9a\u0a9b\f\5\2\2\u0a9b\u0a9c\7F\2\2\u0a9c\u0a9d\7F\2\2\u0a9d"+
		"\u0aa8\5\u01c2\u00e2\2\u0a9e\u0a9f\f\4\2\2\u0a9f\u0aa0\7E\2\2\u0aa0\u0aa1"+
		"\7E\2\2\u0aa1\u0aa8\5\u01c2\u00e2\2\u0aa2\u0aa3\f\3\2\2\u0aa3\u0aa4\7"+
		"E\2\2\u0aa4\u0aa5\7E\2\2\u0aa5\u0aa6\7E\2\2\u0aa6\u0aa8\5\u01c2\u00e2"+
		"\2\u0aa7\u0a9a\3\2\2\2\u0aa7\u0a9e\3\2\2\2\u0aa7\u0aa2\3\2\2\2\u0aa8\u0aab"+
		"\3\2\2\2\u0aa9\u0aa7\3\2\2\2\u0aa9\u0aaa\3\2\2\2\u0aaa\u01c1\3\2\2\2\u0aab"+
		"\u0aa9\3\2\2\2\u0aac\u0aad\b\u00e2\1\2\u0aad\u0aae\5\u01c4\u00e3\2\u0aae"+
		"\u0ab7\3\2\2\2\u0aaf\u0ab0\f\4\2\2\u0ab0\u0ab1\7S\2\2\u0ab1\u0ab6\5\u01c4"+
		"\u00e3\2\u0ab2\u0ab3\f\3\2\2\u0ab3\u0ab4\7T\2\2\u0ab4\u0ab6\5\u01c4\u00e3"+
		"\2\u0ab5\u0aaf\3\2\2\2\u0ab5\u0ab2\3\2\2\2\u0ab6\u0ab9\3\2\2\2\u0ab7\u0ab5"+
		"\3\2\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8\u01c3\3\2\2\2\u0ab9\u0ab7\3\2\2\2\u0aba"+
		"\u0abb\b\u00e3\1\2\u0abb\u0abc\5\u01c6\u00e4\2\u0abc\u0ac8\3\2\2\2\u0abd"+
		"\u0abe\f\5\2\2\u0abe\u0abf\7U\2\2\u0abf\u0ac7\5\u01c6\u00e4\2\u0ac0\u0ac1"+
		"\f\4\2\2\u0ac1\u0ac2\7V\2\2\u0ac2\u0ac7\5\u01c6\u00e4\2\u0ac3\u0ac4\f"+
		"\3\2\2\u0ac4\u0ac5\7Z\2\2\u0ac5\u0ac7\5\u01c6\u00e4\2\u0ac6\u0abd\3\2"+
		"\2\2\u0ac6\u0ac0\3\2\2\2\u0ac6\u0ac3\3\2\2\2\u0ac7\u0aca\3\2\2\2\u0ac8"+
		"\u0ac6\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u01c5\3\2\2\2\u0aca\u0ac8\3\2"+
		"\2\2\u0acb\u0ad3\5\u01c8\u00e5\2\u0acc\u0ad3\5\u01ca\u00e6\2\u0acd\u0ace"+
		"\7S\2\2\u0ace\u0ad3\5\u01c6\u00e4\2\u0acf\u0ad0\7T\2\2\u0ad0\u0ad3\5\u01c6"+
		"\u00e4\2\u0ad1\u0ad3\5\u01cc\u00e7\2\u0ad2\u0acb\3\2\2\2\u0ad2\u0acc\3"+
		"\2\2\2\u0ad2\u0acd\3\2\2\2\u0ad2\u0acf\3\2\2\2\u0ad2\u0ad1\3\2\2\2\u0ad3"+
		"\u01c7\3\2\2\2\u0ad4\u0ad5\7Q\2\2\u0ad5\u0ad6\5\u01c6\u00e4\2\u0ad6\u01c9"+
		"\3\2\2\2\u0ad7\u0ad8\7R\2\2\u0ad8\u0ad9\5\u01c6\u00e4\2\u0ad9\u01cb\3"+
		"\2\2\2\u0ada\u0ae1\5\u01ce\u00e8\2\u0adb\u0adc\7H\2\2\u0adc\u0ae1\5\u01c6"+
		"\u00e4\2\u0add\u0ade\7G\2\2\u0ade\u0ae1\5\u01c6\u00e4\2\u0adf\u0ae1\5"+
		"\u01d8\u00ed\2\u0ae0\u0ada\3\2\2\2\u0ae0\u0adb\3\2\2\2\u0ae0\u0add\3\2"+
		"\2\2\u0ae0\u0adf\3\2\2\2\u0ae1\u01cd\3\2\2\2\u0ae2\u0ae5\5\u0160\u00b1"+
		"\2\u0ae3\u0ae5\5<\37\2\u0ae4\u0ae2\3\2\2\2\u0ae4\u0ae3\3\2\2\2\u0ae5\u0aea"+
		"\3\2\2\2\u0ae6\u0ae9\5\u01d2\u00ea\2\u0ae7\u0ae9\5\u01d6\u00ec\2\u0ae8"+
		"\u0ae6\3\2\2\2\u0ae8\u0ae7\3\2\2\2\u0ae9\u0aec\3\2\2\2\u0aea\u0ae8\3\2"+
		"\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u01cf\3\2\2\2\u0aec\u0aea\3\2\2\2\u0aed"+
		"\u0aee\5\u01ce\u00e8\2\u0aee\u0aef\7Q\2\2\u0aef\u01d1\3\2\2\2\u0af0\u0af1"+
		"\7Q\2\2\u0af1\u01d3\3\2\2\2\u0af2\u0af3\5\u01ce\u00e8\2\u0af3\u0af4\7"+
		"R\2\2\u0af4\u01d5\3\2\2\2\u0af5\u0af6\7R\2\2\u0af6\u01d7\3\2\2\2\u0af7"+
		"\u0af8\7;\2\2\u0af8\u0af9\5\6\4\2\u0af9\u0afa\7<\2\2\u0afa\u0afb\5\u01c6"+
		"\u00e4\2\u0afb\u0b13\3\2\2\2\u0afc\u0afd\7;\2\2\u0afd\u0b01\5\16\b\2\u0afe"+
		"\u0b00\5*\26\2\u0aff\u0afe\3\2\2\2\u0b00\u0b03\3\2\2\2\u0b01\u0aff\3\2"+
		"\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b04\3\2\2\2\u0b03\u0b01\3\2\2\2\u0b04"+
		"\u0b05\7<\2\2\u0b05\u0b06\5\u01cc\u00e7\2\u0b06\u0b13\3\2\2\2\u0b07\u0b08"+
		"\7;\2\2\u0b08\u0b0c\5\16\b\2\u0b09\u0b0b\5*\26\2\u0b0a\u0b09\3\2\2\2\u0b0b"+
		"\u0b0e\3\2\2\2\u0b0c\u0b0a\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u0b0f\3\2"+
		"\2\2\u0b0e\u0b0c\3\2\2\2\u0b0f\u0b10\7<\2\2\u0b10\u0b11\5\u01a0\u00d1"+
		"\2\u0b11\u0b13\3\2\2\2\u0b12\u0af7\3\2\2\2\u0b12\u0afc\3\2\2\2\u0b12\u0b07"+
		"\3\2\2\2\u0b13\u01d9\3\2\2\2\u0142\u01dd\u01e7\u01ee\u01f2\u01f6\u01ff"+
		"\u0203\u0207\u0209\u020f\u0214\u021b\u0220\u0222\u0228\u022d\u0232\u0237"+
		"\u0242\u0250\u0255\u025d\u0264\u026a\u026f\u027a\u027d\u028b\u0290\u0295"+
		"\u029a\u02a0\u02aa\u02b2\u02bc\u02c4\u02d0\u02d6\u02e3\u0300\u0304\u0309"+
		"\u030f\u0312\u0315\u0321\u032c\u033a\u0341\u034a\u0351\u0356\u0365\u036c"+
		"\u0372\u0376\u037a\u037e\u0382\u0387\u038b\u038f\u0391\u0396\u039d\u03a2"+
		"\u03a4\u03aa\u03af\u03b3\u03c6\u03cb\u03db\u03e0\u03e6\u03ec\u03ee\u03f2"+
		"\u03f7\u03fb\u0403\u040a\u0412\u0415\u041a\u0422\u0427\u042e\u0435\u043a"+
		"\u0440\u044c\u0451\u0455\u045f\u0464\u046c\u046f\u0474\u047c\u047f\u0484"+
		"\u0489\u048e\u0493\u049a\u049f\u04a7\u04ac\u04b1\u04b6\u04bc\u04c2\u04c5"+
		"\u04c8\u04d1\u04d7\u04dd\u04e0\u04e3\u04eb\u04f0\u04f5\u04fb\u04fe\u0509"+
		"\u0512\u051c\u0521\u052c\u0531\u053d\u0542\u054e\u0558\u055d\u0565\u0568"+
		"\u056f\u0577\u057d\u0586\u0590\u0594\u0597\u05a0\u05ae\u05b1\u05ba\u05bf"+
		"\u05c6\u05cb\u05d3\u05df\u05e6\u05f4\u060a\u062c\u0638\u063e\u064a\u0657"+
		"\u0671\u0675\u067a\u067e\u0682\u068a\u068e\u0692\u0699\u06a2\u06aa\u06b9"+
		"\u06c5\u06cb\u06d1\u06e6\u06eb\u06f1\u06fd\u0708\u0712\u0715\u071a\u0723"+
		"\u0729\u0733\u0738\u0741\u0758\u0762\u0778\u077f\u0787\u078f\u079a\u07b1"+
		"\u07bb\u07c6\u07dc\u07e0\u07e5\u07ed\u07f3\u07f7\u07fb\u07ff\u0805\u080a"+
		"\u080f\u0813\u0817\u081d\u0822\u0827\u082b\u082f\u0831\u0836\u083b\u0840"+
		"\u0844\u0848\u084c\u0851\u0859\u085f\u0863\u0867\u086b\u0871\u0876\u087b"+
		"\u087f\u0883\u0885\u088a\u0899\u08a7\u08b3\u08bc\u08cb\u08d8\u08e1\u08e7"+
		"\u08ee\u08f3\u08fa\u08ff\u0906\u090b\u0912\u0917\u091f\u0924\u0928\u092c"+
		"\u0931\u0938\u093f\u0944\u094b\u0950\u0957\u095c\u0964\u0969\u096d\u0974"+
		"\u097a\u0981\u0988\u098f\u0997\u099e\u09a6\u09aa\u09b1\u09b8\u09bf\u09c7"+
		"\u09ce\u09d6\u09dc\u09e2\u09ee\u09f4\u09fa\u0a05\u0a0e\u0a15\u0a1c\u0a21"+
		"\u0a25\u0a2e\u0a39\u0a43\u0a4e\u0a59\u0a64\u0a6f\u0a7b\u0a7d\u0a92\u0a94"+
		"\u0aa7\u0aa9\u0ab5\u0ab7\u0ac6\u0ac8\u0ad2\u0ae0\u0ae4\u0ae8\u0aea\u0b01"+
		"\u0b0c\u0b12";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}