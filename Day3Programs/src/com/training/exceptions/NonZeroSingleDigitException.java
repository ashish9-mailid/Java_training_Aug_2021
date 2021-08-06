package com.training.exceptions;

public class NonZeroSingleDigitException extends Exception {

	private String message;
	public NonZeroSingleDigitException(String message) {
		this.message=message;
	}
	
	public String getMessage()
	{
		return message;
	}

	public String toString()
	{
		return message;
	}
}
