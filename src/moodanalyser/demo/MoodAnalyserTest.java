package moodanalyser.demo;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {
	
	public static MoodAnalyser analyser;
	public String testCase101 = "i am in Sad Mood";
	public String testCase102 = "i am in Happy Mood";
	
	@BeforeClass
	public static void init() {
		analyser = new MoodAnalyser();
	}
	
	@Test
	public void test_message_to_return_sad_after_refactor() {
		analyser = new MoodAnalyser(testCase101);
		String result = analyser.analyseMood();
		assertEquals(MoodAnalyser.first_mood, result);
	}
	
	@Test
	public void test_message_to_return_happy_after_refactor() {
		analyser = new MoodAnalyser(testCase102);
		String result = analyser.analyseMood();
		assertEquals(MoodAnalyser.second_mood, result);
	}
}
