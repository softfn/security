package org.ralasafe.db;

/**
 * WARN!!!!
 * We will deprecate it later.
 */
public class LWhereElement {
	public static final String AND_LINK_TYPE="AND";
	public static final String OR_LINK_TYPE="OR";
	
	
	private String linkerType;
	private WhereElement whereElement;
	
	public String getLinkType() {
		return linkerType;
	}
	public void setLinkType( String linkerType ) {
		this.linkerType = linkerType;
	}
	public WhereElement getWhereElement() {
		return whereElement;
	}
	public void setWhereElement( WhereElement whereElement ) {
		this.whereElement = whereElement;
	}	
}
