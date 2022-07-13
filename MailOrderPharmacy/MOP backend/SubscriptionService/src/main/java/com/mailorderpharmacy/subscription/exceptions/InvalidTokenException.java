package com.mailorderpharmacy.subscription.exceptions;

/**Custom exception class*/

@SuppressWarnings("serial")
public class InvalidTokenException extends RuntimeException {

	/**
	 * @param message
	 */
	public InvalidTokenException(String message){
		super(message);
	}
}
