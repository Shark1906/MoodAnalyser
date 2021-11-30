package moodanalyser.demo;

public class MoodAnalyser {
	
	static final String first_mood = "SAD"; 
	static final String second_mood = "HAPPY";
	String message;

	public MoodAnalyser() {	
	}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
		if(message == "" | message == null) {
		throw new MoodAnalysisException();	
		}else if(message.toLowerCase().contains("sad")) {
			return first_mood;
		}else {
			return second_mood;
		}
		}catch(MoodAnalysisException ex) {
			 return "Exception : "+ex;
		}
	}

}
