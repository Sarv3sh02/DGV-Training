package currency_converter;

import java.util.Scanner;

public class Converter_Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int currencyChoice,toConvertCurrency,amount;
		Converter_Controller converterController=new Converter_Controller();
		converterController.addCurrencies();
		
		do {
			System.out.println("Enter the choice of currency you wish to convert");
			System.out.println("1. To choose United States Dollar(USD)");
			System.out.println("2. To choose UAE Dirham(UD)");
			System.out.println("3. To choose Russian Ruble(RR)");
			System.out.println("4. To choose Australian Dollar(AUD)");
			System.out.println("5. To choose Indian Rupees(INR)");
			System.out.println("0. To exit the game");
			currencyChoice=scanner.nextInt();
			
			System.out.println("Enter the currency in which you want to convert");
			toConvertCurrency=scanner.nextInt();
			
			System.out.println("Enter the amount of currency");
			amount=scanner.nextInt();
			
			converterController.convertCurrency(currencyChoice,toConvertCurrency,amount);
			
		}
		while(currencyChoice!=0);
		
		scanner.close();
		
		

	}

}
