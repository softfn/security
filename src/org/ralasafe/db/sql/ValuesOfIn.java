package org.ralasafe.db.sql;

import java.util.ArrayList;
import java.util.Iterator;

public class ValuesOfIn implements RightOfIn {
	private ArrayList values=new ArrayList();

	public String toSQL() {
		StringBuffer buf=new StringBuffer();
		buf.append( " (" );
		if( values.size()>0 ) {
			Iterator itr=values.iterator();
			Value value=(Value) itr.next();
			buf.append( value.toSQL() );
			while( itr.hasNext() ) {
				value=(Value) itr.next();
				buf.append( "," ).append( value.toSQL() );
			}
		}
		buf.append( ") " );
		return buf.toString();
	}

	public ArrayList getValues() {
		return values;
	}

	public void setValues( ArrayList values ) {
		this.values=values;
	}
}
