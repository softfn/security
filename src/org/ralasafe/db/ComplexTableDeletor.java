package org.ralasafe.db;

public interface ComplexTableDeletor {
	public void setComplexTable( ComplexTable complexTable );
	public void delete( Object o ) throws DBLevelException;
}
