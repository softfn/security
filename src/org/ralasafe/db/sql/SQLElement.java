package org.ralasafe.db.sql;

public interface SQLElement {

    /**
     * Generate SQL.
     *
     * @return
     */
    public abstract String toSQL();
}
 
