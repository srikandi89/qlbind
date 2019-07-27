package com.srikandi.qlbind;

import java.util.Stack;

public class ArithmeticBuilder {
    int total = 0;
    Stack<Integer> stack = new Stack<>();

    public void buildTree(QueryTree queryTree) {
        if (queryTree == null) {
            return;
        }

        if (queryTree.getExpression() != null) {
            /**
             * TODO: Query-Process Mapping
             */

            buildTree(queryTree.getRight());
            buildTree(queryTree.getLeft());

            String expr = queryTree.getExpression();

            switch (expr) {
                case "+":
                    if (!stack.empty()) {
                        while (!stack.empty()) {
                            total += stack.pop();
                        }
                    }
                    break;
                case "-":
                    if (!stack.empty()) {
                        while (!stack.empty()) {
                            total -= stack.pop();
                        }
                    }
                    break;
                case "*":
                    if (!stack.empty()) {
                        if (total == 0 && !stack.empty()) {
                            total = 1;
                        }

                        while (!stack.empty()) {
                            total *= stack.pop();
                        }
                    }
                default:
                    try {
                        int operand = Integer.parseInt(expr);
                        stack.push(operand);
                    }
                    catch (Exception e) {

                    }
                    break;
            }
        }
    }

    public void printTotal() {
        System.out.println(total);
    }
}
