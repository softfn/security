package org.ralasafe.script;

public class Variable implements Script {
	private String name;
	public String toScript() {
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name=name;
	}
}
