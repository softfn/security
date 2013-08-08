package org.ralasafe.db;

import java.sql.Connection;

import org.ralasafe.EntityExistException;

/**
 * Delete entity operations from database.
 */
public interface TableDeletor {
    /**
     * Table definition
     *
     * @param mapping
     */
    public void setTable(Table mapping);

    /**
     * Delete this entity from database. If doesn't exist, throw no exceptions.
     *
     * @param o
     * @throws org.ralasafe.EntityExistException
     *
     */
    public void deleteByIdColumns(Object o);

    public void deleteByIdColumns(Connection conn, Object o);

    public void delete(WhereElement emt, Object o);

    public void delete(Connection conn, WhereElement emt, Object o);
}
