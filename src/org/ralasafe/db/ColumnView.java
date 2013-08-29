package org.ralasafe.db;

/**
 * Class for ui, display sql table column.
 */
public class ColumnView {
	private String name;
	private String sqlType;

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name=name;
	}

	public String getSqlType() {
		return sqlType;
	}

	public void setSqlType( String sqlType ) {
		this.sqlType=sqlType;
	}
}
