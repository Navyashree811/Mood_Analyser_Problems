/*
 * Refactor : Refactor the code to take the mood message in constructor. .
 */
package com.bridgelabz.moddanalysermain;

public class MoodAnalyserMain {
	private String message;

	public MoodAnalyserMain(String message) {
		this.message = message;
	}

	public String moodSad() {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
	
}
