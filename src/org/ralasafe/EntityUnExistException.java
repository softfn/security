package org.ralasafe;


/**
 * Related to <code>EntityExistException</code>, the entity is not exist.
 * @author back
 *
 */
public class EntityUnExistException extends Exception {
	private Object entity;
	
	public EntityUnExistException( Object entity ) {
		this.entity = entity;
	}

	public Object getEntity() {
		return entity;
	}
}