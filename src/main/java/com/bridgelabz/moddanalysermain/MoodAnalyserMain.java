/*
 * UC 2 : Handle Exception if User Provides Invalid Mood.
 */
package com.bridgelabz.moddanalysermain;

public class MoodAnalyserMain {
	private String message;

	public MoodAnalyserMain(String message) {
		this.message = message;
	}

	public String moodSad() {
		try {
			if (message.contains("SSad")) {
				return "SAD";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
		return "HAPPY";
	}

}
