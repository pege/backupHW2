// Generated from Javali.g4 by ANTLR 4.6

	// Java header
	package cd.frontend.parser;
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaliParser}.
 */
public interface JavaliListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaliParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(JavaliParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(JavaliParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(JavaliParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(JavaliParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#memberList}.
	 * @param ctx the parse tree
	 */
	void enterMemberList(JavaliParser.MemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#memberList}.
	 * @param ctx the parse tree
	 */
	void exitMemberList(JavaliParser.MemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(JavaliParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(JavaliParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(JavaliParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(JavaliParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamList(JavaliParser.FormalParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamList(JavaliParser.FormalParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(JavaliParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(JavaliParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtMethod}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtMethod(JavaliParser.StmtMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtMethod}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtMethod(JavaliParser.StmtMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(JavaliParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(JavaliParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturn(JavaliParser.StmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturn(JavaliParser.StmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWrite}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWrite(JavaliParser.StmtWriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWrite}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWrite(JavaliParser.StmtWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(JavaliParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(JavaliParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#methodCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStmt(JavaliParser.MethodCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#methodCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStmt(JavaliParser.MethodCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(JavaliParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(JavaliParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(JavaliParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(JavaliParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JavaliParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JavaliParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(JavaliParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(JavaliParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(JavaliParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(JavaliParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(JavaliParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(JavaliParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(JavaliParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(JavaliParser.ReadExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#actualParamList}.
	 * @param ctx the parse tree
	 */
	void enterActualParamList(JavaliParser.ActualParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#actualParamList}.
	 * @param ctx the parse tree
	 */
	void exitActualParamList(JavaliParser.ActualParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentThis}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void enterIdentThis(JavaliParser.IdentThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentThis}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void exitIdentThis(JavaliParser.IdentThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentMethod}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void enterIdentMethod(JavaliParser.IdentMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentMethod}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void exitIdentMethod(JavaliParser.IdentMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentField}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void enterIdentField(JavaliParser.IdentFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentField}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void exitIdentField(JavaliParser.IdentFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentMethodField}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void enterIdentMethodField(JavaliParser.IdentMethodFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentMethodField}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void exitIdentMethodField(JavaliParser.IdentMethodFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentArray}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void enterIdentArray(JavaliParser.IdentArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentArray}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void exitIdentArray(JavaliParser.IdentArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentIdent}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void enterIdentIdent(JavaliParser.IdentIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentIdent}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 */
	void exitIdentIdent(JavaliParser.IdentIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CASTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCASTexpr(JavaliParser.CASTexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CASTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCASTexpr(JavaliParser.CASTexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEQexpr(JavaliParser.EQexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEQexpr(JavaliParser.EQexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIVexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDIVexpr(JavaliParser.DIVexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIVexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDIVexpr(JavaliParser.DIVexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUEQexpr(JavaliParser.UEQexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUEQexpr(JavaliParser.UEQexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPARexpr(JavaliParser.PARexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPARexpr(JavaliParser.PARexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GRTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGRTexpr(JavaliParser.GRTexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GRTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGRTexpr(JavaliParser.GRTexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code POSexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPOSexpr(JavaliParser.POSexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code POSexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPOSexpr(JavaliParser.POSexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MODexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMODexpr(JavaliParser.MODexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MODexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMODexpr(JavaliParser.MODexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNOTexpr(JavaliParser.NOTexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNOTexpr(JavaliParser.NOTexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULTexpr(JavaliParser.MULTexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULTexpr(JavaliParser.MULTexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLEQexpr(JavaliParser.LEQexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLEQexpr(JavaliParser.LEQexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANDexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterANDexpr(JavaliParser.ANDexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANDexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitANDexpr(JavaliParser.ANDexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGEQexpr(JavaliParser.GEQexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGEQexpr(JavaliParser.GEQexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LITexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLITexpr(JavaliParser.LITexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LITexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLITexpr(JavaliParser.LITexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LESexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLESexpr(JavaliParser.LESexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LESexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLESexpr(JavaliParser.LESexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUBexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSUBexpr(JavaliParser.SUBexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUBexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSUBexpr(JavaliParser.SUBexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEGexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNEGexpr(JavaliParser.NEGexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEGexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNEGexpr(JavaliParser.NEGexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADDexpr(JavaliParser.ADDexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADDexpr(JavaliParser.ADDexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterORexpr(JavaliParser.ORexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitORexpr(JavaliParser.ORexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IAHexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIAHexpr(JavaliParser.IAHexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IAHexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIAHexpr(JavaliParser.IAHexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULLlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNULLlit(JavaliParser.NULLlitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULLlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNULLlit(JavaliParser.NULLlitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOLlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBOOLlit(JavaliParser.BOOLlitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOLlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBOOLlit(JavaliParser.BOOLlitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterINTlit(JavaliParser.INTlitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitINTlit(JavaliParser.INTlitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primType}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPrimType(JavaliParser.PrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primType}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPrimType(JavaliParser.PrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refType}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void enterRefType(JavaliParser.RefTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refType}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 */
	void exitRefType(JavaliParser.RefTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaliParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaliParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaliParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaliParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceTypeIdent}
	 * labeled alternative in {@link JavaliParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTypeIdent(JavaliParser.ReferenceTypeIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceTypeIdent}
	 * labeled alternative in {@link JavaliParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTypeIdent(JavaliParser.ReferenceTypeIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceTypeArray}
	 * labeled alternative in {@link JavaliParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTypeArray(JavaliParser.ReferenceTypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceTypeArray}
	 * labeled alternative in {@link JavaliParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTypeArray(JavaliParser.ReferenceTypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypeIdent}
	 * labeled alternative in {@link JavaliParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeIdent(JavaliParser.ArrayTypeIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypeIdent}
	 * labeled alternative in {@link JavaliParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeIdent(JavaliParser.ArrayTypeIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypePrimitive}
	 * labeled alternative in {@link JavaliParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypePrimitive(JavaliParser.ArrayTypePrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypePrimitive}
	 * labeled alternative in {@link JavaliParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypePrimitive(JavaliParser.ArrayTypePrimitiveContext ctx);
}