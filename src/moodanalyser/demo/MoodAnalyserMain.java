package moodanalyser.demo;

public class MoodAnalyserMain {

	public static void main(String[] args) {

		MoodAnalyser analyser = new MoodAnalyser("i am mad");
		System.out.println(analyser.analyseMood());
	}

}
