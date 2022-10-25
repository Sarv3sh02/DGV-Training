package quiz_game;

import java.util.Comparator;

public class SortDisplay implements Comparator<QuizUser>{

	@Override
	public int compare(QuizUser quizUser1, QuizUser quizUser2) {
		return quizUser2.getMarks()-quizUser1.getMarks();
	}

}
