// Generated from V.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VParser}.
 */
public interface VListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#func_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_list(VParser.Func_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#func_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_list(VParser.Func_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(VParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(VParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#func_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param_list(VParser.Func_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#func_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param_list(VParser.Func_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(VParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(VParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(VParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(VParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(VParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(VParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#variable_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_list(VParser.Variable_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#variable_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_list(VParser.Variable_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#variable_param_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_param_list(VParser.Variable_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#variable_param_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_param_list(VParser.Variable_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#variable_param}.
	 * @param ctx the parse tree
	 */
	void enterVariable_param(VParser.Variable_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#variable_param}.
	 * @param ctx the parse tree
	 */
	void exitVariable_param(VParser.Variable_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl(VParser.Variable_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#variable_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl(VParser.Variable_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#variable_type_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type_decl(VParser.Variable_type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#variable_type_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type_decl(VParser.Variable_type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(VParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(VParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#vector_extension}.
	 * @param ctx the parse tree
	 */
	void enterVector_extension(VParser.Vector_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#vector_extension}.
	 * @param ctx the parse tree
	 */
	void exitVector_extension(VParser.Vector_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#vector_extension_decl}.
	 * @param ctx the parse tree
	 */
	void enterVector_extension_decl(VParser.Vector_extension_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#vector_extension_decl}.
	 * @param ctx the parse tree
	 */
	void exitVector_extension_decl(VParser.Vector_extension_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#vector_extension_var}.
	 * @param ctx the parse tree
	 */
	void enterVector_extension_var(VParser.Vector_extension_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#vector_extension_var}.
	 * @param ctx the parse tree
	 */
	void exitVector_extension_var(VParser.Vector_extension_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#vector_dimension}.
	 * @param ctx the parse tree
	 */
	void enterVector_dimension(VParser.Vector_dimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#vector_dimension}.
	 * @param ctx the parse tree
	 */
	void exitVector_dimension(VParser.Vector_dimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(VParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(VParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(VParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(VParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(VParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(VParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(VParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(VParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(VParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(VParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(VParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(VParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(VParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(VParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(VParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(VParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(VParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(VParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#print_argument}.
	 * @param ctx the parse tree
	 */
	void enterPrint_argument(VParser.Print_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#print_argument}.
	 * @param ctx the parse tree
	 */
	void exitPrint_argument(VParser.Print_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(VParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(VParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#read_argument}.
	 * @param ctx the parse tree
	 */
	void enterRead_argument(VParser.Read_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#read_argument}.
	 * @param ctx the parse tree
	 */
	void exitRead_argument(VParser.Read_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(VParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(VParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(VParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(VParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(VParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(VParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(VParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(VParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(VParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(VParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#inline_assembly_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInline_assembly_stmt(VParser.Inline_assembly_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#inline_assembly_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInline_assembly_stmt(VParser.Inline_assembly_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#assembly_directive}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_directive(VParser.Assembly_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#assembly_directive}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_directive(VParser.Assembly_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#assembly_instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_instruction(VParser.Assembly_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#assembly_instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_instruction(VParser.Assembly_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#assembly_instruction_param}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_instruction_param(VParser.Assembly_instruction_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#assembly_instruction_param}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_instruction_param(VParser.Assembly_instruction_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#assembly_redirect}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_redirect(VParser.Assembly_redirectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#assembly_redirect}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_redirect(VParser.Assembly_redirectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#riscv_register}.
	 * @param ctx the parse tree
	 */
	void enterRiscv_register(VParser.Riscv_registerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#riscv_register}.
	 * @param ctx the parse tree
	 */
	void exitRiscv_register(VParser.Riscv_registerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(VParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(VParser.Basic_typeContext ctx);
}