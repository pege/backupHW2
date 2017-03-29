// Generated from Javali.g4 by ANTLR 4.6

	// Java header
	package cd.frontend.parser;
	

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaliParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaliVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaliParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(JavaliParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(JavaliParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#memberList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberList(JavaliParser.MemberListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(JavaliParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(JavaliParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#formalParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamList(JavaliParser.FormalParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(JavaliParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtMethod}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtMethod(JavaliParser.StmtMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(JavaliParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReturn(JavaliParser.StmtReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtWrite}
	 * labeled alternative in {@link JavaliParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWrite(JavaliParser.StmtWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#stmtBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(JavaliParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#methodCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStmt(JavaliParser.MethodCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(JavaliParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(JavaliParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(JavaliParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(JavaliParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JavaliParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewMethod}
	 * labeled alternative in {@link JavaliParser#newExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewMethod(JavaliParser.NewMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link JavaliParser#newExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(JavaliParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArrayPrim}
	 * labeled alternative in {@link JavaliParser#newExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayPrim(JavaliParser.NewArrayPrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#readExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpr(JavaliParser.ReadExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#actualParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParamList(JavaliParser.ActualParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentThis}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentThis(JavaliParser.IdentThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentMethod}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentMethod(JavaliParser.IdentMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentField}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentField(JavaliParser.IdentFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentMethodField}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentMethodField(JavaliParser.IdentMethodFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentArray}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentArray(JavaliParser.IdentArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentIdent}
	 * labeled alternative in {@link JavaliParser#identAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentIdent(JavaliParser.IdentIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CASTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCASTexpr(JavaliParser.CASTexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQexpr(JavaliParser.EQexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIVexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIVexpr(JavaliParser.DIVexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUEQexpr(JavaliParser.UEQexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARexpr(JavaliParser.PARexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GRTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGRTexpr(JavaliParser.GRTexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POSexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOSexpr(JavaliParser.POSexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MODexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMODexpr(JavaliParser.MODexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTexpr(JavaliParser.NOTexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTexpr(JavaliParser.MULTexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLEQexpr(JavaliParser.LEQexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANDexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANDexpr(JavaliParser.ANDexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GEQexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGEQexpr(JavaliParser.GEQexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LITexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLITexpr(JavaliParser.LITexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LESexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLESexpr(JavaliParser.LESexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUBexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUBexpr(JavaliParser.SUBexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEGexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEGexpr(JavaliParser.NEGexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDexpr(JavaliParser.ADDexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ORexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitORexpr(JavaliParser.ORexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IAHexpr}
	 * labeled alternative in {@link JavaliParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIAHexpr(JavaliParser.IAHexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULLlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULLlit(JavaliParser.NULLlitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOLlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOLlit(JavaliParser.BOOLlitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTlit}
	 * labeled alternative in {@link JavaliParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTlit(JavaliParser.INTlitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primType}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimType(JavaliParser.PrimTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refType}
	 * labeled alternative in {@link JavaliParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefType(JavaliParser.RefTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaliParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaliParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceTypeIdent}
	 * labeled alternative in {@link JavaliParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceTypeIdent(JavaliParser.ReferenceTypeIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceTypeArray}
	 * labeled alternative in {@link JavaliParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceTypeArray(JavaliParser.ReferenceTypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypeIdent}
	 * labeled alternative in {@link JavaliParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeIdent(JavaliParser.ArrayTypeIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypePrimitive}
	 * labeled alternative in {@link JavaliParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypePrimitive(JavaliParser.ArrayTypePrimitiveContext ctx);
}