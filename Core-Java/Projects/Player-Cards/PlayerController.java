package Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class sortPlayer implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		
		return p1.getGoals()-p2.getGoals();
	}
	
}
public class PlayerController {
	
	Player[] players=new Player[5];
	Scanner sc=new Scanner(System.in);
	int count=0;
	
	public void addPlayer() {
		count++;
		int index=0;
		for(int i=0;i<5;i++) {
			if(players[i]==null) {
				index=i;
				break;
			}
		}
		System.out.println("Enter name,goals,age,club,country");
		String name=sc.nextLine();
		int goals=sc.nextInt();
		int age=sc.nextInt();
		sc.nextLine();
		String club=sc.nextLine();
		String country=sc.nextLine();
		players[index]=new Player(name,goals,age,club,country);
	}
	
	public void viewPlayer() {
		for(int i=0;i<5;i++) {
			if(players[i]!=null) {
				System.out.println(players[i]);
			}
			else break;
		}
	}
	public void viewPlayerProperty() {
		for(int i=0;i<5;i++) {
			if(players[i]!=null) {
				System.out.println((i+1)+" "+players[i].getName());
			}
			else break;
		}
	}
	
	public void deletePlayer() {
		count--;
		  int  c=sc.nextInt();
			if(players[c]==null) {
				System.out.println("You cannot delete");
			}
			else if(c-1==players.length) {
				players[c-1]=null;
			}
		for(int i=c-1;i<players.length-1;i++) {
			if(players[i]==null) {
				break;
			}
			players[i]=players[i+1];
		}
	}
	
	public void sortGoals() {
		Player[] sortArray=new Player[count];
		for(int i=0;i<count;i++) {
			sortArray[i]=players[i];
		}
		Arrays.sort(sortArray, new sortPlayer());
		
		for(int i=0;i<sortArray.length;i++) {
			if(sortArray[i]!=null) {
				System.out.println(sortArray[i]);
			}
	}	
  }
	
	public void updatePlayer() {
		int choosePlayer;
		int playerProperty;
		this.viewPlayerProperty();
		
		System.out.println("Enter player no. you want to update");
		choosePlayer=sc.nextInt();
		
		System.out.println("Enter player property you want to update");
		System.out.println("1. To update name");
		System.out.println("2. To update goals");
		System.out.println("3. To update age");
		System.out.println("4. To update club");
		System.out.println("5. To update country");
		playerProperty=sc.nextInt();
		 switch(playerProperty) {
		 case 1:{
			 System.out.println("Enter updated name");
			 String name=sc.nextLine();
			 players[choosePlayer-1].setName(name);
			 break;
		 }
		 case 2:{
			 System.out.println("Enter updated goals");
			 int goals=sc.nextInt();
			 players[choosePlayer-1].setGoals(players[choosePlayer-1].getGoals()+goals);
			 break;
		 }
		 case 3:{
			 System.out.println("Enter updated age");
			 int age=sc.nextInt();
			 players[choosePlayer-1].setAge(age);
			 break;
		 }
		 case 4:{
			 System.out.println("Enter updated club");
			 String club=sc.nextLine();
			 players[choosePlayer-1].setClub(club);
			 break;
		 }
		 case 5:{
			 System.out.println("Enter updated country");
			 String country=sc.nextLine();
			 players[choosePlayer-1].setCountry(country);
			 break;
		 }
		 default:{
			 System.out.println("Property does not exist");
		 }
		 
		 }
		
	}
}
