package org.ralasafe;


/**
 * The entity requested is already exist.
 * <p/>
 * <p>Just like when you add a user(already exist user) to db, Then raise <code>EntityExistException</code>.
 *
 * @author back
 */
public class EntityExistException extends Exception {

    private Object entity;

    public EntityExistException(Object entity) {
        this.entity = entity;
    }

    public Object getEntity() {
        return entity;
    }
}
