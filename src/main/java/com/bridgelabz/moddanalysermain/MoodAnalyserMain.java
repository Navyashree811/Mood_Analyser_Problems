/*
 * UC 3 : Inform user if entered Invalid Mood.
 */
package com.bridgelabz.moddanalysermain;

import com.bridgelabz.Exception.MoodAnalyserException;

public class MoodAnalyserMain {
	private String message;

	public MoodAnalyserMain(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyserException {
		try {
			if (message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,
					"Please enter proper message");

		}
	}

}
