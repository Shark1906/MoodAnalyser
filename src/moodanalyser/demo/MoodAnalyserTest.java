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
	public void test_null_message_to_return_happy() {
		analyser = new MoodAnalyser();
		String result = analyser.analyseMood();
		assertEquals(MoodAnalyser.second_mood, result);
	}
}
