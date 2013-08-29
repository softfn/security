package org.ralasafe.db;

public abstract class AbstractComparator implements Comparator {
	private String type;

	public String getType() {
		return type;
	}

	public void setType( String type ) {
		this.type = type;
	}

	public boolean equals( Object obj ) {
		if( obj != null && obj instanceof AbstractComparator ) {
			return type.equals( ( ( AbstractComparator ) obj ).getType() ); 
		} else {
			return false;
		}
	}
	
}
