package org.ralasafe;

public class RalasafeException extends RuntimeException {
	public RalasafeException() {
		super();
	}

	public RalasafeException( String message, Throwable cause ) {
		super( message, cause );
	}

	public RalasafeException( String message ) {
		super( message );
	}

	public RalasafeException( Throwable cause ) {
		super( cause );
	}	
}
