package currency_converter;

import java.util.ArrayList;

public class Converter_Controller {
	
	ArrayList<CurrencyObject> currencyData=new ArrayList<CurrencyObject>();
	
	public void addCurrencies() {
		currencyData.add(new CurrencyObject (new double[] {1, 3.67, 61.41, 1.61, 83}));             		//usd
		currencyData.add(new CurrencyObject (new double[] {0.27, 1, 16.72, 0.44, 22.61}));     		//ud
		currencyData.add(new CurrencyObject (new double[] {0.016, 0.6, 1, 0.026, 1.35}));        		//rr
		currencyData.add(new CurrencyObject (new double[] {0.62, 2.28, 38.27, 1, 51.6}));       		//aud
		currencyData.add(new CurrencyObject (new double[] {0.012, 0.044, 0.74, 0.019, 1})); 			//inr
	}			
	
	public void convertCurrency(int currencyChoice, int toConvertCurrency, int amount) {
		if(currencyChoice>=1) {
			System.out.println("Your converted amount is " + (currencyData.get(currencyChoice-1).getCurrency() [toConvertCurrency-1])*amount);
		}
		
	}
	

}
