/*
 * TC : 1.2 : Given "I am in Any Mood" message should return Happy .
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
