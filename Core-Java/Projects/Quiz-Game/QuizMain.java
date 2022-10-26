package quiz_game;

import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int userChoice;
		QuizController quizControl=new QuizController();
		quizControl.userData();
		quizControl.QuestionDataSet();
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Play the quiz");
			System.out.println("2. Display top5 ranking");
			System.out.println("0. Exit the game");
			userChoice=scanner.nextInt();
			
			scanner.nextLine();
			 
			switch(userChoice) {
			case 1:{
				System.out.println("What is your name");
				 String name=scanner.nextLine();
				quizControl.playQuiz(name);
				break;
			}
			case 2:{
				quizControl.displayTop5();
				break;
			}
			default:{
				System.out.println("You've exited");
				break;
			}
			}
		}while(userChoice!=0);
		
		scanner.close();
		
	}

}
