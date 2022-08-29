/*
 * TC : 1.1 : Given "I am in Sad Mood" message should return SAD .
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
