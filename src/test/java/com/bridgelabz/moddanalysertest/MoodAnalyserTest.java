package com.bridgelabz.moddanalysertest;

import org.junit.Test;

import com.bridgelabz.moddanalysermain.MoodAnalyserMain;

import junit.framework.Assert;

public class MoodAnalyserTest {

	@Test
	public void givenMoodShouldReturnSad() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am In a Sad Mood");
		String mood = moodAnalyser.moodSad();
		Assert.assertEquals("SAD", mood);

	}

	@Test
	public void givenMoodShouldReturnHappy() {
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I am in any Mood");
		String mood = moodAnalyser.moodSad();
		Assert.assertEquals("HAPPY", mood);

	}

}
