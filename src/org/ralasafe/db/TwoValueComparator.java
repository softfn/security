package org.ralasafe.db;

public class TwoValueComparator extends AbstractComparator {
	private TwoValueComparator( String type ) {
		setType( type );
	}
	
	public static final TwoValueComparator BETWEEN =
		new TwoValueComparator( "BETWEEN" );
	public static final TwoValueComparator NOT_BETWEEN =
		new TwoValueComparator( "NOT BETWEEN" );
}
