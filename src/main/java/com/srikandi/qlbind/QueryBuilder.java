package com.srikandi.qlbind;

public class QueryBuilder {

    public void executeTree(QueryTree queryTree) {
        if (queryTree == null) {
            return;
        }

        if (queryTree.getExpression() != null) {
            /**
             * TODO: Query-Process Mapping
             */

            executeTree(queryTree.getLeft());
            executeTree(queryTree.getRight());
        }
    }
}
