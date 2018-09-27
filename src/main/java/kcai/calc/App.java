package kcai.calc;

import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.TerminalBuilder;
import org.jline.terminal.Terminal;
import org.jline.reader.EndOfFileException;

// for GUI astree visual
//import javax.swing.JFrame;
//import org.antlr.v4.gui.TreeViewer;

public class App 
{
    public static void main (String[] args) throws Exception {
        /******************************************************************************
         * There are some weird problems... 
         * ex. 1. States missing 'NEWLINE' at the end of every expression
         *     2. Some expressions will print the expression when returning answer
         *     Everything works with no problem without jline, 
         *     but when added jline code, the problems come up.
         ******************************************************************************/
        LineReader read = LineReaderBuilder.builder().build();
        String equation = "Enter your math problem or expression: ";
        while (read != null) {
            String line = null;
            try {
                line = read.readLine(equation);
                calculatorParser parser = createParser(line);
                ParseTree ptree = parser.prog();
                visitor visit = new visitor();
                Double result = visit.visit(ptree);
                if (result != null) System.out.println(result);
            } catch (UserInterruptException e) {
                return;
            } catch (EndOfFileException e) {
                return;
            }
        }    
        
        /***************************************************************************************************
         //*  Code used to draw out the astree, helped me to visualize where errors were coming from
         //***************************************************************************************************
        
        String expression = "2 + 2 * 5 * 4 / 2";
        
        CharStream stream = CharStreams.fromString(expression);
        calculatorLexer lex = new calculatorLexer(stream);
        TokenStream tks = new CommonTokenStream(lex);
        
        calculatorParser prsr = new calculatorParser(tks);
        ParseTree tree = prsr.expr();
        System.out.println("String tree = " + tree.toStringTree());

        JFrame frame = new JFrame("AST for expression: " + expression);
        TreeViewer treeViewer = new TreeViewer(Arrays.asList(prsr.getRuleNames()), tree);
        treeViewer.setScale(1.5);
        frame.add(treeViewer);
        frame.setSize(640, 480);
        frame.setVisible(true);
        //************************************************************************************/
    }
    
    static calculatorParser createParser(String expression) {
        CodePointCharStream stream = CharStreams.fromString(expression);
        calculatorLexer lexer = new calculatorLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new calculatorParser(tokens);
    }
    
}
