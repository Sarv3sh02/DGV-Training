package tic_tac_toe;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int choice;
		GameController gameControls=new GameController();
		System.out.println("Player1 enter your name");
		String name1=scanner.nextLine();
		
		System.out.println("Player2 enter your name");
		String name2=scanner.nextLine();
		 
		do {
			
			System.out.println("Enter your choice");
			System.out.println("1) To play game");
			System.out.println("2) To view ranking");
			System.out.println("0) To exit ");
			choice =scanner.nextInt();
			
			switch(choice) {
			case 1:{
				gameControls.playGame(name1, name2);				
				break;
			}
			case 2:{
				gameControls.displayStreak();
				break;
			}
			default:{
				System.out.println("You've  exited");
				break;
			}
			}
		}
		while(choice!=0);
	scanner.close();
	}
}