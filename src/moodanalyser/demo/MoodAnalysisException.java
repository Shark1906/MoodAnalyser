package moodanalyser.demo;

public class MoodAnalysisException extends Exception {
	private static final long serialVersionUID = 1L;
	String error;
	
	public MoodAnalysisException() {
	 error = "Empty or Invalid Mood";
	}
	
	public String toString() {
		return ""+error;
	}


}
