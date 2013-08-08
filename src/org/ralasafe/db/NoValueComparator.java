package org.ralasafe.db;

/**
 * WARN!!!!
 * We will deprecate it later.
 */
public class NoValueComparator extends AbstractComparator {
    private NoValueComparator(String type) {
        setType(type);
    }

    public static final NoValueComparator IS_NULL =
            new NoValueComparator("IS NULL");
    public static final NoValueComparator NOT_NULL =
            new NoValueComparator("IS NOT NULL");
}
