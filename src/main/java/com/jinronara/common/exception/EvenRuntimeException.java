package com.jinronara.common.exception;

public class EvenRuntimeException extends RuntimeException {
	private Integer number = null;

	public EvenRuntimeException() {
	}

	public EvenRuntimeException(int number) {
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