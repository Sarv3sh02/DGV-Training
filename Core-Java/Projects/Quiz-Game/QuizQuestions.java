package quiz_game;

public class QuizQuestions {
	private String question;
	private String option1;
	private String option2;
	private int correctAnswer;
	
	
	public QuizQuestions(String question, String option1, String option2, int correctAnswer) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.correctAnswer = correctAnswer;
	}

	public String getQuestion() {
		return question;
	}

	public String getOption1() {
		return option1;
	}

	public String getOption2() {
		return option2;
	} 
	
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	
	
}
