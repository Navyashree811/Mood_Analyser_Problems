package com.bridgelabz.moddanalysertest;

import org.junit.Test;

import com.bridgelabz.moddanalysermain.MoodAnalyserMain;

import junit.framework.Assert;

public class MoodAnalyserTest {

	@Test
	public void givenMoodShouldReturnHappy() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("happy");
		String mood = moodAnalyser.moodHappy();
		Assert.assertEquals("HAPPY", mood);

	}

	@Test
	public void givenMoodShouldReturnSad() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("sad");
		String mood = moodAnalyser.moodSad();
		Assert.assertEquals("SAD", mood);

	}

}
