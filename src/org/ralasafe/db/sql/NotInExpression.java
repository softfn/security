package org.ralasafe.db.sql;

public class NotInExpression implements Expression {
    private LeftOfIn left;
    private RightOfIn right;

    public String toSQL() {
        StringBuffer buf = new StringBuffer();
        buf.append(" ");
        if (left instanceof Query) {
            buf.append("(").append(left.toSQL()).append(")");
        } else {
            buf.append(left.toSQL());
        }
        buf.append(" NOT IN ");
        if (right instanceof Query) {
            buf.append("(").append(right.toSQL()).append(")");
        } else {
            buf.append(right.toSQL());
        }
        buf.append(" ");
        return buf.toString();
    }

    public LeftOfIn getLeft() {
        return left;
    }

    public void setLeft(LeftOfIn left) {
        this.left = left;
    }

    public RightOfIn getRight() {
        return right;
    }

    public void setRight(RightOfIn right) {
        this.right = right;
    }
}
