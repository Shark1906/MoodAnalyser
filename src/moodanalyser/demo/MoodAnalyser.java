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
		if(message.toLowerCase().contains("sad")) {
			return first_mood;
		}else {
			return second_mood;
		}
		}catch(Exception ex) {
			System.out.println(ex);
			return "Empty String";
		}
	}

}
