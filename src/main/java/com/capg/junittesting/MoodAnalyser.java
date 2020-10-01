package com.capg.junittesting;

public class MoodAnalyser {

	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser");
	}
	
	public String analyseMood(String msg) {
		if(msg.contains("sad"))
				return "SAD";
		else
			return "HAPPY";
		
	}

}