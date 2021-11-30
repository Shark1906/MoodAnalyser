package moodanalyser.demo;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {
	
	public static MoodAnalyser analyser;
	public String message = "i am in Sad Mood";
	
	@BeforeClass
	public static void init() {
		analyser = new MoodAnalyser();
	}
	
	@Test
	public void test_message_to_return_sad() {
		String result = analyser.analyseMood(message);
		assertEquals(MoodAnalyser.first_mood, result);
	}
	

}
