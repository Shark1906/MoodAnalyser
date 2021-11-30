package moodanalyser.demo;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {
	
	public static MoodAnalyser analyser;
	public String testCase101 = "i am in Sad Mood";
	public String testCase102 = "i am in any Mood";
	
	@BeforeClass
	public static void init() {
		analyser = new MoodAnalyser();
	}
	
	@Test
	public void test_message_to_return_sad() {
		String result = analyser.analyseMood(testCase101);
		assertEquals(MoodAnalyser.first_mood, result);
	}
	
	@Test
	public void test_message_to_return_happy() {
		String result = analyser.analyseMood(testCase102);
		assertEquals(MoodAnalyser.second_mood, result);
	}
	

}