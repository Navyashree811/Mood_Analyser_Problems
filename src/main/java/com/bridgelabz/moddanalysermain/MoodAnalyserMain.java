package com.bridgelabz.moddanalysermain;

public class MoodAnalyserMain {
	private String message;

	public MoodAnalyserMain(String message) {
		this.message = message;
	}

	public String moodHappy() {
		if (message.contains("happy")) {
			return "HAPPY";
		} else {
			return "SAD";
		}
	}

	public String moodSad() {
		if (message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
