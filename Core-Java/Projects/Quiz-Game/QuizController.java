package quiz_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizController {

	Scanner scanner=new Scanner(System.in);
	ArrayList<QuizUser> quizUsers=new ArrayList<QuizUser>();
	
	public void userData() {
		quizUsers.add(new QuizUser("Sarvesh", 60));
		quizUsers.add(new QuizUser("Devansh", 65));
		quizUsers.add(new QuizUser("Parth", 75));
		quizUsers.add(new QuizUser("Ayush", 80));
		quizUsers.add(new QuizUser("Sujeet", 90));
	}
	ArrayList<QuizQuestions> questionData=new ArrayList<QuizQuestions>();
	
	public void QuestionDataSet() {
		questionData.add(new QuizQuestions("Q) 1. What is the capital of India", "1) Delhi ", "2) Kerela", 1));
		questionData.add(new QuizQuestions("Q) 2. What is the capital of USA","1) California ","2) Washington DC",2));
		questionData.add(new QuizQuestions("Q) 3. What is the answer of 22*7","1) 154 ","2) 145",1));
		questionData.add(new QuizQuestions("Q) 4. What is the answer of 12*12","1) 56 " ,"2) 144",2));
		questionData.add(new QuizQuestions("Q) 5. Who the man of the match of the most recent INDvsPAK cricket match","1) Arshdeep Singh","2) Virat Kohli",2));
		questionData.add(new QuizQuestions("Q) 6. What is answer of 2+2","1) 11","2) 4",2));
		questionData.add(new QuizQuestions("Q) 7. Who is the current UFC lightweight champion","1) Islam Makachev ","2) Charles Olivera",1));
	}
	
	public void playQuiz(String Name) {
		int score=0;
		for(int i=0;i<questionData.size();i++) {
			System.out.println(questionData.get(i).getQuestion());
			System.out.println(questionData.get(i).getOption1()+"   "+questionData.get(i).getOption2());
			int answer=scanner.nextInt();
			if(questionData.get(i).getCorrectAnswer()==answer) {
				score+=10;
			}else score-=5;
		}
		quizUsers.add(new QuizUser(Name, score));
		System.out.println("Your score is "+score);
	}
	
	public void displayTop5() {
		Collections.sort(quizUsers, new SortDisplay());
		System.out.println("Top 5 scorers");
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.println(quizUsers.get(i).getName()+"  "+quizUsers.get(i).getMarks());
		}
	}
}
