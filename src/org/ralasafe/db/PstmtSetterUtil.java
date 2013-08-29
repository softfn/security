package org.ralasafe.db;


public class PstmtSetterUtil {
	public static PstmtSetter getSetter( String fieldClassName ) {
		if( "java.util.Date".equalsIgnoreCase( fieldClassName ) ) {
			return new PstmtSetter.JavaUtilDatePstmtSetter();
		} else {
			return new PstmtSetter.ObjectPstmtSetter();
		}
	}
}
