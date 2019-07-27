package com.srikandi.qlbind;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main...");

        QueryTree tree = new QueryTree();
        tree.setExpression("+");
        tree.getLeft().setExpression("+");
        tree.getLeft().getRight().setExpression("1");
        tree.getLeft().getLeft().setExpression("3");
        tree.getRight().setExpression("*");
        tree.getRight().getLeft().setExpression("3");
        tree.getRight().getRight().setExpression("5");

        QueryBuilder builder = new QueryBuilder();
        builder.buildTree(tree);

        builder.printTotal();
    }
}
