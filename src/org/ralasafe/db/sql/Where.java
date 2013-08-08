package org.ralasafe.db.sql;

public class Where implements SQLElement {
    private ExpressionGroup expressionGroup = new ExpressionGroup();

    public String toSQL() {
        if (expressionGroup.getExpressions().size() == 0) {
            return "";
        }
        StringBuffer buf = new StringBuffer();
        buf.append("\n").append(" WHERE ").append(expressionGroup.toSQL()).append(" ");
        return buf.toString();
    }

    public ExpressionGroup getExpressionGroup() {
        return expressionGroup;
    }

    public void setExpressionGroup(ExpressionGroup expressionGroup) {
        this.expressionGroup = expressionGroup;
    }

    public Where lightCopy() {
        return new Where();
    }
}
