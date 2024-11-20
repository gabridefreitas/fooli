package br.unisinos;

import br.unisinos.fooli.antlr.FOOLIBaseVisitor;
import br.unisinos.fooli.antlr.FOOLILexer;
import br.unisinos.fooli.antlr.FOOLIParser;

import org.antlr.v4.runtime.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Ler o programa de entrada
            // CharStream input = CharStream.getText(inputFile);
            CharStream charStream = CharStreams.fromFileName("input.fooli");

            // Inicializar lexer e parser
            FOOLILexer lexer = new FOOLILexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FOOLIParser parser = new FOOLIParser(tokens);

            // Parsear a entrada
            FOOLIParser.ProgramContext tree = parser.program();

            // Ações semânticas
            FOOLICustomVisitor visitor = new FOOLICustomVisitor();
            visitor.visit(tree);

            // Imprimir tabela de símbolos
            System.out.println("Tabela de Símbolos:");
            visitor.symbolTable.forEach((key, value) -> System.out.println(key + " : " + value));

            // Imprimir TACs
            System.out.println("\nThree Address Codes (TAC):");
            visitor.tacList.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class FOOLICustomVisitor extends FOOLIBaseVisitor<Void> {
    public Map<String, String> symbolTable = new HashMap<>();
    public List<String> tacList = new ArrayList<>();

    @Override
    public Void visitClassDeclaration(FOOLIParser.ClassDeclarationContext ctx) {
        symbolTable.put(ctx.IDENTIFIER().getText(), "class");
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Void visitFieldDeclaration(FOOLIParser.FieldDeclarationContext ctx) {
        String type = ctx.type().getText();
        String name = ctx.IDENTIFIER().getText();
        symbolTable.put(name, type);
        return super.visitFieldDeclaration(ctx);
    }

    @Override
    public Void visitMethodDeclaration(FOOLIParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        String returnType = ctx.type().getText();
        symbolTable.put(methodName, "method: " + returnType);
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public Void visitAssignment(FOOLIParser.AssignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        String expression = ctx.expression().getText();
        tacList.add(varName + " = " + expression + ";");
        return super.visitAssignment(ctx);
    }

    @Override
    public Void visitMethodExecution(FOOLIParser.MethodExecutionContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        String params = ctx.parameters() != null ? ctx.parameters().getText() : "";
        tacList.add("CALL " + methodName + " " + params);
        return super.visitMethodExecution(ctx);
    }

    @Override
    public Void visitWhileStatement(FOOLIParser.WhileStatementContext ctx) {
        String condition = ctx.expression().getText();
        tacList.add("WHILE " + condition + " DO ...");
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Void visitIfStatement(FOOLIParser.IfStatementContext ctx) {
        String condition = ctx.expression().getText();
        tacList.add("IF " + condition + " THEN ...");
        return super.visitIfStatement(ctx);
    }

    @Override
    public Void visitReturnStatement(FOOLIParser.ReturnStatementContext ctx) {
        String returnValue = ctx.expression() != null ? ctx.expression().getText() : "void";
        tacList.add("RETURN " + returnValue);
        return super.visitReturnStatement(ctx);
    }
}
