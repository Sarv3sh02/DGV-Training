package stock_market;

import java.util.Scanner;

public class StockMain {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int choice;
		StockController stockControl=new StockController();
		stockControl.ArraylistData();
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1. To display stocks");
			System.out.println("2. To display stock perfomance ");
			System.out.println("3. To display perfomance based on search");
			System.out.println("4. To sort stocks");
			System.out.println("5. To calculate profit deliverd by the stock");
			 choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:{
				stockControl.displayStocks(); 
				break;
			}
			case 2:{
				stockControl.displayPerfomance();
				break;		
			}
			case 3:{
				stockControl.displayPerfomance();
				System.out.println("Enter the name of stock you want to search");
				String userString=scanner.nextLine();
				stockControl.searchBasedPerfomance(userString);
				break;
			}
			case 4:{
				stockControl.sortStocks();
				break;
			}
			case 5:{
				System.out.println("Enter the stock you want to see profit for");
				String stockName=scanner.nextLine();
				System.out.println("Enter the no. of months you want to see the profit for");
				int time=scanner.nextInt();
				stockControl.profitCalculator(stockName, time);
				break;
		    }
			default:{
				System.out.println("You've Exited");
				break;
			}

			}
			
		}
		while(choice!=0);
		
		scanner.close();
		
	}
}
