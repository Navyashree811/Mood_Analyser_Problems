package com.bridgelabz.moddanalysertest;

import org.junit.Test;

import com.bridgelabz.Exception.MoodAnalyserException;
import com.bridgelabz.moddanalysermain.MoodAnalyserMain;

import junit.framework.Assert;

public class MoodAnalyserTest {

	@Test
	public void givenNullMood_ShouldThrowMoodAnalysisException() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain(null);
		try {
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals("NULL MOOD", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenEmptyMood_ShouldThrowMoodAnalysisException() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("");
		try {
			String mood = moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals("EMPTY MOOD", e.getMessage());

		}
	}

}
