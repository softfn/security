package org.ralasafe.db.sql;

import java.util.Map;

import org.ralasafe.user.User;

public interface Value extends Operand, Parameter {
    /**
     * Indicate this value is for a LIKE operator or not?
     *
     * @param behind if true, for LIKE operator
     */
    public void setBehindLike(boolean behind);

    /**
     * Indicate this value is for a LIKE operator or not?
     *
     * @return return true if it's for LIKE operator
     */
    public boolean isBehindLike();

    public abstract Object getValue(User user, Map context);
}
