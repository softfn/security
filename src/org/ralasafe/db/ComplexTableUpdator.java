package org.ralasafe.db;

import org.ralasafe.EntityExistException;

public interface ComplexTableUpdator {
    public void setComplexTable(ComplexTable complexTable);

    public void setSingleValueAdapters(SingleValueTableAdapter[] adapters);

    public void setMultiValueAdapters(MultiValueTableAdapter[] adapters);

    public void update(Object o) throws EntityExistException, DBLevelException;
}
