package org.ralasafe.script;

public abstract class Operator implements Script {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue( String value ) {
		this.value=value;
	}
}
