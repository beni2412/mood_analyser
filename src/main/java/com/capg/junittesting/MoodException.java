package com.capg.junittesting;

public class MoodException extends Exception {
	public enum expectedType{
		NULL_EXCEPTION, EMPTY_EXCEPTION
	}
	
	public MoodException(expectedType type , String message) {
		super(message);
		System.out.println(type);
	}
}
