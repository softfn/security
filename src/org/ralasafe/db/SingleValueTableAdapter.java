package org.ralasafe.db;

import org.ralasafe.ObjectNewer;

public interface SingleValueTableAdapter {
	//public void setComplexTable( ComplexTable table );
	public Object extract( Object o );
	public Object extractEvenNoValueExist( Object o );
	public void combine( Object o, Object extractValue );
	public ObjectNewer getObjectNewer();
}
