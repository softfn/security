package org.ralasafe.db;

import java.sql.Connection;

import org.ralasafe.EntityExistException;

/**
 * Update entity operations to database.
 *
 * @author back
 */
public interface TableUpdator {
    /**
     * Table definition.
     *
     * @param mapping
     */
    public void setTable(Table mapping);

    /**
     * Update an entity.
     * If it doesn't exist, throw no exception;
     * If update operation would violate some constraints, throw EntityExistException
     *
     * @param newValue
     * @throws org.ralasafe.EntityExistException
     *
     */
    public void updateByIdColumns(Object newValue) throws EntityExistException;

    public void updateByIdColumns(Connection conn, Object newValue) throws EntityExistException;
}
