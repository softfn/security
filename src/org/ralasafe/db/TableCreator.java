package org.ralasafe.db;

public interface TableCreator {
    /**
     * Does table exist in a datasource?
     *
     * @param table
     * @return
     * @see {@link org.ralasafe.db.DBPower#getConnection(long)}
     */
    public boolean exist(Table table) throws DBLevelException;

    /**
     * Create it.
     *
     * @param table
     */
    public void create(Table table) throws DBLevelException;
}
