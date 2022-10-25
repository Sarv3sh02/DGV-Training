package currency_converter;

import java.util.Scanner;

public class Converter_Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int currencyChoice;
		Converter_Controller converterController=new Converter_Controller();
		
		do {
			System.out.println("Enter the choice of currency you wish to convert");
			System.out.println("1. To choose United States Dollar(USD)");
			System.out.println("2. To choose UAE Dirham(UD)");
			System.out.println("3. To choose Russian Ruble(RR)");
			System.out.println("4. To choose Australian Dollar(AUD)");
			System.out.println("5. To choose Indian Rupees(INR)");
			System.out.println("0. To exit the game");
			currencyChoice=scanner.nextInt();
			
			switch(currencyChoice) {
			case 1:{
				System.out.println("Enter the amount you want to convert");
				double amount=scanner.nextInt();
				System.out.println("Enter the choice of currency you wish to convert it to");
				int curChoice=scanner.nextInt();
				converterController.convertUSD(amount, curChoice);
				break;
			}
			case 2:{
				System.out.println("Enter the amount you want to convert");
				double amount=scanner.nextInt();
				System.out.println("Enter the choice of currency you wish to convert it to");
				int curChoice=scanner.nextInt();
				converterController.convertDirham(amount, curChoice);
				break;
			}
			case 3:{
				System.out.println("Enter the amount you want to convert");
				double amount=scanner.nextInt();
				System.out.println("Enter the choice of currency you wish to convert it to");
				int curChoice=scanner.nextInt();
				converterController.convertRuble(amount, curChoice);
				break;
			}
			case 4:{
				System.out.println("Enter the amount you want to convert");
				double amount=scanner.nextInt();
				System.out.println("Enter the choice of currency you wish to convert it to");
				int curChoice=scanner.nextInt();
				converterController.convertAusDol(amount, curChoice);
				break;
			}
			case 5:{
				System.out.println("Enter the amount you want to convert");
				double amount=scanner.nextInt();
				System.out.println("Enter the choice of currency you wish to convert it to");;
				int curChoice=scanner.nextInt();
				converterController.convertINR(amount, curChoice);
				break;
			}
			default:{
				System.out.println("You've exited the app");
			}
			}
		}
		while(currencyChoice!=0);
		
		scanner.close();
		
		

	}

}
