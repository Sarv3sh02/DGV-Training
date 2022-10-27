package tic_tac_toe;

import java.util.Scanner;

public class GameController {
	Scanner scanner=new Scanner(System.in);
	int streak1=0;
	int streak2=0;
	int win=0;
	String[] game=new String[9];
	
	//User Objects
	GameUser player1=new GameUser();
	GameUser player2=new GameUser();

	//Array printing
	public void displayArray() {
		int cnt=0;
		for(int i=0;i<game.length;i++) {
			cnt++;
			System.out.print(game[i]+" ");
			if(cnt%3==0) {
			System.out.println();
			}	
		}
	}
	
	//Winner logic
	public void checkWinner(int userChoice) {
      if(game[0] ==  game[1] && game[1] == game[2] || 
    	  game[3] ==  game[4] && game[4] == game[5] ||
    	  game[6] ==  game[7] && game[7] == game[8] ||
    	  game[0] ==  game[3] && game[3] == game[6] ||
    	  game[1] ==  game[4] && game[4] == game[7] ||
    	  game[2] ==  game[5] && game[5] == game[8] ||
    	  game[0] ==  game[4] && game[4] == game[8] ||
    	  game[2] ==  game[4] && game[4] == game[6]) 
        {
    	  if(game[userChoice]=="X") {
    		  System.out.println("Player1 is the winner");
    		  streak1++;
    	  }
    	  else {
    		  System.out.println("Player2 is the winnner");
    		  streak2++;
    	  }
    	  win=0;	
		}
		
	}
	
	//Playing game
	public void playGame(String name1, String name2) {	
		game=new String[] {"1","2","3","4","5","6","7","8","9"};
		player1.setName(name1);
		player2.setName(name2);
		this.displayArray();
		
		do {
			win=1;
		System.out.println("Enter  the place where you wan to add X");
		int userChoice1=scanner.nextInt();
		game[userChoice1-1]="X";
		this.checkWinner(userChoice1-1); 
		player1.setStreak(streak1);
		if(win==0) {
			break;
		}
		this.displayArray();
		
		System.out.println("Enter  the place where you wan to add O");
		int userChoice2=scanner.nextInt();
		game[userChoice2-1]="O";
		this.checkWinner(userChoice2-1);
		player1.setStreak(streak2);
		this.displayArray();
		}
		while(win!=0);
	}
	
	//Displaying streak
	public void displayStreak() {
		System.out.println("Here is the streak as follows");
		System.out.println(player1.getName()+" "+ player1.getStreak());
		System.out.println(player2.getName()+" "+ player2.getStreak());
	}
}