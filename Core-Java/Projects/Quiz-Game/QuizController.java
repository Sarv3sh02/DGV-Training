package quiz_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizController {

	Scanner scanner=new Scanner(System.in);
	ArrayList<QuizUser> quizUsers=new ArrayList<QuizUser>();
	
	public void userData() {
		quizUsers.add(new QuizUser("Sarvesh", 70));
		quizUsers.add(new QuizUser("Devansh", 65));
		quizUsers.add(new QuizUser("Parth", 75));
		quizUsers.add(new QuizUser("Ayush", 80));
		quizUsers.add(new QuizUser("Sujeet", 90));
	}
	
	public void playQuiz(String Name) {
		
		int score=0;
		int answer;
		//1
		System.out.println("Q) 1. What is the capital of India");
		System.out.println("1) Sikkim    2) Kerela");
		System.out.println("3) Delhi      4) Orissa ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==3) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//2
		System.out.println("Q) 2. What is the capital of USA");
		System.out.println("1) Ohio               2) California");
		System.out.println("3) Las Vegas      4) Washington DC ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==4) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//3
		System.out.println("Q) 3. What is the answer of 22*7");
		System.out.println("1) 154      2) 145");
		System.out.println("3) 89        4) 45 ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==1) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//4
		System.out.println("Q) 4. What is the answer of 12*12");
		System.out.println("1) 24    2) 144");
		System.out.println("3) 56      4) 141 ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==2) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//5
		System.out.println("Q) 5. What is the answer of 13*13");
		System.out.println("1) 196     2) 222");
		System.out.println("3) 169      4) 272 ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==3) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//6
		System.out.println("Q) 6. Who is called as the father of the nation");
		System.out.println("1) Narendra Modi    2) Mahatma Gandhi");
		System.out.println("3) Jawarlal Nehru      4) Bhagat Singh ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==2) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//7
		System.out.println("Q) 7. Who the man of the match of the most recent INDvsPAK cricket match");
		System.out.println("1) Arshdeep Singh    2) Md. Shami");
		System.out.println("3) Virat Kohli              4) Rohit Sharma ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==3) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//8
		System.out.println("Q) 8. What is answer of 2+2");
		System.out.println("1) 11    2) 4");
		System.out.println("3) 6      4) 3 ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==2) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//9
		System.out.println("Q) 9. What is answer of 3*9");
		System.out.println("1) 15    2) 81");
		System.out.println("3) 72      4) 27 ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==4) {
			score+=10;
		}
		else score-=5;
		
		scanner.nextLine();
		
		//10
		System.out.println("Q) 10. Who is the current UFC lightweight champion");
		System.out.println("1) Islam Makachev        2) Charles Olivera");
		System.out.println("3) Conor McGregor      4) Tony Ferguson ");
		System.out.println("Type the option you feel is correct");
		answer=scanner.nextInt();
		if(answer==1) {
			score+=10;
		}
		else score-=5;
		
	
		quizUsers.add(new QuizUser(Name, score));
		
		System.out.println("Your score is  "+score);
	}
	
	public void displayTop5() {
		Collections.sort(quizUsers, new SortDisplay());
		System.out.println("Top 5 scorers");
		System.out.println();
		
		for(int i=0;i<quizUsers.size();i++) {
			System.out.println(quizUsers.get(i).getName()+"  "+quizUsers.get(i).getMarks());
		}
	}
	
	
}
