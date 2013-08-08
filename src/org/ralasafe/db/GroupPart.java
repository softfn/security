package org.ralasafe.db;

/**
 * Group part of a sql.
 *
 * @author jbwang
 */
public class GroupPart {
    private String[] columnNames;

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }
}
