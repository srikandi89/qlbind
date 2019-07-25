package com.srikandi.qlbind;

public class QueryTree {
    private String expression;
    private QueryTree left;
    private QueryTree right;

    public QueryTree() {}

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public QueryTree getLeft() {
        if (left == null) {
            left = new QueryTree();
        }
        return left;
    }

    public QueryTree getRight() {
        if (right == null) {
            right = new QueryTree();
        }
        return right;
    }
}
