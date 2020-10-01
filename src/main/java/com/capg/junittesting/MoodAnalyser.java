package com.capg.junittesting;

public class MoodAnalyser {
	private String msg;
	
	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String msg) {
		this.msg =msg;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser");
		
	}
	
	public String analyseMood() throws MoodException {
		try {
			if(msg.isEmpty()) {
				throw new MoodException(MoodException.expectedType.EMPTY_EXCEPTION, "Empty Exception");			
				}
			if(msg.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
			}catch (NullPointerException e) {
				throw new MoodException(MoodException.expectedType.NULL_EXCEPTION, "Null Exception");			

			}
		
	}

}