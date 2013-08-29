package org.ralasafe.db;

import org.ralasafe.EntityExistException;


public interface ComplexTableSaver {
	public void setComplexTable( ComplexTable complexTable );
	public void setSingleValueAdapters( SingleValueTableAdapter[] adapters );
	public void setMultiValueAdapters( MultiValueTableAdapter[] adapters );
	public void save( Object o ) throws DBLevelException, EntityExistException;
}