package com.srikandi.qlbind;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main...");

        QueryTree tree = new QueryTree();
        tree.setExpression("SELECT");
        tree.getLeft().setExpression("SELECT");
        tree.getLeft().getLeft().setExpression("*");
        tree.getLeft().getRight().setExpression("FROM");
        tree.getLeft().getRight().getLeft().setExpression("fields");
        tree.getRight().setExpression("FROM");
        tree.getRight().getLeft().setExpression("source");

        QueryBuilder builder = new QueryBuilder();
        builder.executeTree(tree);
    }
}
