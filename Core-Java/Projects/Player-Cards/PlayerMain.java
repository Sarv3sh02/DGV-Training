package Main;

import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		PlayerController p=new PlayerController();
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Add player");
			System.out.println("2.View players");
			System.out.println("3.Delete player");
			System.out.println("4.To sort according to no. of goals");
			System.out.println("5.Update player name");
			System.out.println("0.Exit");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				p.addPlayer();
				break;
			}
			case 2:{
				p.viewPlayer();
				break;
			}
			case 3:{
				System.out.println("Which player do you want to delete");
				p.viewPlayer();
				p.deletePlayer();
				p.viewPlayer();
				break;
			}
			case 4:{
				p.sortGoals();
				break;
			}
			case 5:{
				p.updatePlayer();
					break;
				}
			default :{
				System.out.println("You've Exited the game");
			}
			}
		}
		while(choice!=0);
		
		sc.close();
	}
}