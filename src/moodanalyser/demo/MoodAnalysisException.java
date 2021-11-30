package moodanalyser.demo;

public class MoodAnalysisException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	enum Errors{MOOD_IS_EMPTY, MOOD_IS_NULL}
	
	Errors error;
	
	public MoodAnalysisException(String message) {
		if(message == "") {
			error = Errors.MOOD_IS_EMPTY;
		}
		else if(message == null) {
			error = Errors.MOOD_IS_NULL;
		}
	}

	public String toString() {
		return ""+error;
	}


}
