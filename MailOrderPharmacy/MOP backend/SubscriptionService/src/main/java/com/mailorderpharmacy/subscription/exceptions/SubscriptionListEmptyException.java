package com.mailorderpharmacy.subscription.exceptions;

/**Custom exception class*/

@SuppressWarnings("serial")
public class SubscriptionListEmptyException extends RuntimeException {

	/**
	 * @param message
	 */
	public SubscriptionListEmptyException(String message){
		super(message);
	}
}
