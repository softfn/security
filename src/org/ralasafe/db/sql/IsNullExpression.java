package org.ralasafe.db.sql;

public class IsNullExpression implements Expression {
	private Column column;

	public String toSQL() {
		StringBuffer buf=new StringBuffer();
		buf.append( " " ).append( column.toSQL() ).append( " IS NULL " );
		return buf.toString();
	}

	public Column getColumn() {
		return column;
	}

	public void setColumn(Column column) {
		this.column = column;
	}
}
