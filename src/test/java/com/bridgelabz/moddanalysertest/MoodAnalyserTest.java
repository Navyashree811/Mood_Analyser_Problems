package com.bridgelabz.moddanalysertest;

import org.junit.Test;

import com.bridgelabz.moddanalysermain.MoodAnalyserMain;

import junit.framework.Assert;

public class MoodAnalyserTest {

	@Test
	public void givenMoodShouldReturnHappy() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain(null);
		String mood = moodAnalyser.moodSad();
		Assert.assertEquals("HAPPY", mood);

	}

}
