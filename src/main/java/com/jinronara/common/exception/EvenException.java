package com.jinronara.common.exception;

public class EvenException extends Exception {
	private Integer number = null;

	public EvenException(String message, Throwable cause) {
		super(message, cause);
	}

	public EvenException(int number) {
		this.number = number;
	}

	@Override
	public String getMessage() {
		String message;

		if (number == null) {
			message = "Even number";
		} else {
			message = Integer.toString(number) + " is Even number";
		}

		return message;
	}

}