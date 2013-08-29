package org.ralasafe.db;

public interface TableCreator {
	/**
	 * Does table exist in a datasource?
	 * @see {@link DBPower#getConnection(long)}
	 * @param table
	 * @return
	 */
	public boolean exist( Table table ) throws DBLevelException;
	
	/**
	 * Create it.
	 * @param table
	 */
	public void create( Table table ) throws DBLevelException;
}
