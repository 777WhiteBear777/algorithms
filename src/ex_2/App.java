package ex_2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Tree tree = new Tree('G',
                new Tree('D', new Tree('B', new Tree('A'), new Tree('C')), new Tree('F', new Tree('E'), null)),
                new Tree('J', new Tree('I', new Tree('H'), null), new Tree('L', new Tree('K'), new Tree('M'))));

        System.out.println(tree.sumSymbolQueue(tree));// в ширину
        System.out.println(tree.sumSymbolStack());// в глубину

    }

}

class Tree {

    final char symbol;
    Tree left;

    public char getSymbol() {
        return symbol;
    }

    Tree right;

    public Tree(char symbol, Tree left, Tree right) {
        this.symbol = symbol;
        this.left = left;
        this.right = right;
    }

    public Tree(char symbol) {
        this.symbol = symbol;
    }

    public String sumSymbolQueue(Tree root) {

        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        StringBuilder sumLine = new StringBuilder();

        while (!queue.isEmpty()) {
            Tree node = queue.remove();
            sumLine.append(node.symbol).append(" ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }

        return sumLine.toString();
    }

    public String sumSymbolStack() {

        String sumLine = symbol + " ";

        if (left != null) {
            sumLine += left.sumSymbolStack();
        }

        if (right != null) {
            sumLine += right.sumSymbolStack();
        }

        return sumLine;
    }

//    public String sumSymbolStack(Tree root) {
//
//        Stack<Tree> stack = new Stack<>();
//        stack.add(root);
//
//        StringBuilder sumLine = new StringBuilder();
//
//        while (!stack.isEmpty()) {
//            Tree node = stack.pop();
//            sumLine.append(node.symbol).append(" ");
//
//            if (node.right != null) {
//                stack.push(node.right);
//            }
//            if (node.left != null) {
//                stack.push(node.left);
//            }
//
//        }
//
//        return sumLine.toString();
//    }

    @Override
    public String toString() {
        return "symbol= " + symbol + " ";
    }

}
