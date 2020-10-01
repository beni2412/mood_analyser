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
		MoodAnalyser m = new MoodAnalyser(null);
		String mood =m.analyseMood();
		System.out.println(mood);
	}
	
	public String analyseMood() {
		try {
		if(msg.contains("sad"))
				return "SAD";
		else
			return "HAPPY";
		}catch (NullPointerException e) {
			System.out.println("Null pointer Exception");
			return "HAPPY";
		}
		
	}

}