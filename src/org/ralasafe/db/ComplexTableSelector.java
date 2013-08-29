package org.ralasafe.db;

import java.util.Collection;

public interface ComplexTableSelector {
	public void setComplexTable( ComplexTable complexTable );
	public void setSingleValueAdapters( SingleValueTableAdapter[] adapters );
	public void setMultiValueAdapters( MultiValueTableAdapter[] adapters );
	public Object selectByIdColumns( Object o ) throws DBLevelException;
	public Object selectByUniqueColumns( Object o ) throws DBLevelException;
	public Collection select( SelectCondition cdtn, Object hint ) throws DBLevelException;
	public Collection selectByPage( SelectCondition cdtn, 
			Object hint,
			int startIndex, int pageSize ) throws DBLevelException;
	
	public int selectCount() throws DBLevelException;
	public int selectCount( SelectCondition cdtn, Object hint ) throws DBLevelException;
}
