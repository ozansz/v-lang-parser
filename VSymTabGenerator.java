import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.IOException;

public class VSymTabGenerator extends VBaseListener {
    public static void main(String[] args) {
        CharStream cs;

        if (args.length == 0) {
            System.out.println("[!] No input file specified");
            return;
        }

        try {
            cs = fromFileName(args[0]); 
        } catch (IOException e) {
            System.out.println("Error occured while reading source file:" + e);
            return;
        }
        
        VLexer lexer = new VLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VParser parser = new VParser(tokens); 

        ParseTree tree = parser.program();
        VSymTabGenerator listener = new VSymTabGenerator();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    @Override public void exitProgram(VParser.ProgramContext ctx) {
        System.out.println("</SymbolTable>");
    }

    @Override public void enterProgram(VParser.ProgramContext ctx) {
        System.out.println("<SymbolTable>");

        for (VParser.DeclContext decl_ctx : ctx.decl_list().decl()) {
            for (VParser.Variable_declContext var_ctx : decl_ctx.variable_decl_list().variable_decl()) {
                System.out.print("    <VariableDecl");
                System.out.print(" id='" + var_ctx.ID().getText() + "'");
                System.out.print(" scope='global'");
                System.out.print(" type='" + var_ctx.variable_type_decl().getText() + "'");
                System.out.print(" />\n");
            }
        }
    };

    @Override public void enterFunc_decl(VParser.Func_declContext ctx) {
        int param_count = 0;
        int var_count = 0;

        System.out.print("    <FunctionDecl");
        System.out.print(" id='" + ctx.ID().getText() + "'");
        System.out.print(" return-type='" + ctx.basic_type().getText() + "'");
        System.out.print(" params=[");

        for (VParser.Variable_param_listContext var_ctx: ctx.func_param_list().variable_param_list()) {
            for (VParser.Variable_paramContext v_ctx: var_ctx.variable_param()) {
                if (param_count > 0)
                    System.out.print(", ");

                System.out.print("'" + v_ctx.variable_type().getText() + "'");

                param_count++;
            }
        }

        System.out.print("] />\n");

        for (VParser.DeclContext decl_ctx : ctx.func_body().decl_list().decl()) {
            for (VParser.Variable_declContext var_ctx : decl_ctx.variable_decl_list().variable_decl()) {
                System.out.print("    <VariableDecl");
                System.out.print(" id='" + ctx.ID().getText() + "__" + var_ctx.ID().getText() + "'");
                System.out.print(" scope='local_" + ctx.ID().getText() + "'");
                System.out.print(" type='" + var_ctx.variable_type_decl().getText() + "'");
                System.out.print(" />\n");

                var_count++;
            }
        }
    }
}