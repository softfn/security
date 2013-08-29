package org.ralasafe.script;

public class IsNullExpr implements Expr {
	private Variable variable;

	/**
	 * Script likes: v == null
	 */
	public String toScript() {
		StringBuffer buff=new StringBuffer();
		String v=variable.toScript();
		buff.append( v ).append( " == null" );
		return buff.toString();
	}

	public Variable getVariable() {
		return variable;
	}

	public void setVariable( Variable variable ) {
		this.variable=variable;
	}
}
