package org.ralasafe.db;

import org.ralasafe.RalasafeException;

public class DBLevelException extends RalasafeException {
    public DBLevelException() {
        super();
    }

    public DBLevelException(String message, Throwable cause) {
        super(message, cause);
    }

    public DBLevelException(String message) {
        super(message);
    }

    public DBLevelException(Throwable cause) {
        super(cause);
    }
}
