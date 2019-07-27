package com.srikandi.qlbind;

public class QueryBuilder {

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
        }
    }
}
