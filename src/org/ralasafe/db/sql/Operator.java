package org.ralasafe.db.sql;

public abstract class Operator implements SQLElement{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue( String value ) {
		this.value=value;
	}
}
