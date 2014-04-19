package com.wizecommerce.hecuba.exceptions;

import me.prettyprint.hector.api.exceptions.HectorException;

/**
 * User: Samir Faci
 * Date: 4/18/14
 * Time: 10:07 PM
 */

public class HecubaException extends Exception {
	private String message;

	public HecubaException(Exception e ) {
		this.message = e.getMessage();
		this.setStackTrace(e.getStackTrace());
	}

	@Override
	public String getMessage() {
		return message;
	}
}
