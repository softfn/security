package org.ralasafe.db.sql;

import java.util.Collection;
import java.util.Iterator;

public class ColumnsOfIn implements LeftOfIn {
	private Collection columns;

	public String toSQL() {
		StringBuffer buf=new StringBuffer();
		buf.append( " (" );
		if( columns.size()>0 ) {
			Iterator itr=columns.iterator();
			Column column=(Column) itr.next();
			buf.append( column.toSQL() );
			while( itr.hasNext() ) {
				column=(Column) itr.next();
				buf.append( "," ).append( column.toSQL() );
			}
		}
		buf.append( ") " );
		return buf.toString();
	}

	public Collection getColumns() {
		return columns;
	}

	public void setColumns( Collection columns ) {
		this.columns=columns;
	}
}
