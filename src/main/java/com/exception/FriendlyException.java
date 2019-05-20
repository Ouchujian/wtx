package com.exception;

/**
 * 友好异常
 * @author ouchujian
 *
 */
public class FriendlyException extends RuntimeException {
	 
	private static final long serialVersionUID = 1L;

	public FriendlyException(String message) {
		super(message);
	}
}
