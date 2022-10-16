package stock_market;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class StockController {
	
	ArrayList<Stock> stockData=new ArrayList<Stock>();
	
	public void ArraylistData() {
		stockData.add(new Stock("Tata Motors","Automotive",396,409,395, new double[] {345,234.7,567.8,543.9,502.6},15));
		stockData.add(new Stock("HDFC Bank","Banking",1439,1447,1415, new double[] {1345.0,1234.7,1567.8,1543.9,1502.6},14));
		stockData.add(new Stock("Jubilant Food","Consumer",597,616,595, new double[] {445.0,534.7,467.8,543.9,502.6},13));
		stockData.add(new Stock("Wipro","Information Technology",377,387,376, new double[] {245.0,334.7,267.8,243.9,302.6},11));
	}


	public void displayStocks() {
		
		System.out.println("Name		Category		Price     ROI");
		System.out.println();
		for(int i=0;i<stockData.size();i++) {
			System.out.println(stockData.get(i).getName()+"			"+stockData.get(i).getCategory()+"			"+stockData.get(i).getPrice()+"	      "+stockData.get(i).getRoi());
		}
	}
	 
	public void displayPerfomance() {
		
		System.out.println("Name		Category		Price    High52      Low52     ROI          Last 5 days perfomance");
		stockData.forEach((s)->
		{
			System.out.print(s.getName()+"   ");
			System.out.print(s.getCategory()+"   ");
			System.out.print(s.getPrice()+"    ");
			System.out.print(s.getHigh52()+"   ");
			System.out.print(s.getLow52()+"   ");
			System.out.print(s.getRoi()+"     ");
			for(double st : s.getLast5()) {
				System.out.print(st+" , ");
			}
			System.out.println();
		});
	}
	
	public void searchBasedPerfomance(String userString) {
		
		Optional<Stock> stockFound=stockData.stream().filter((n)->{
			return n.getName().equals(userString);
		}).findFirst();
		System.out.println("Name		Category	Price    High52     Low52    ROI          Last 5 days perfomance");
		System.out.print(stockFound.get().getName()+"   ");
		System.out.print(stockFound.get().getCategory()+"   ");
		System.out.print(stockFound.get().getPrice()+"   ");
		System.out.print(stockFound.get().getHigh52()+"   ");
		System.out.print(stockFound.get().getLow52()+"   ");
		System.out.print(stockFound.get().getRoi()+"    ");
		for(double sk : stockFound.get().getLast5()) {
			System.out.print(sk+" , ");
		}
		System.out.println();

	}
	
	public void sortStocks() {
		
		Collections.sort(stockData, new SortedStocks());
		this.displayStocks();
	}

	public void profitCalculator(String stockName,int time) {
		Optional<Stock> stockCalc=stockData.stream().filter((n)->{
			return n.getName().equals(stockName);
		}).findFirst();
//		
//		double value=stockCalc.get().getPrice();
		System.out.println("Your profit is  "+ stockCalc.get().getPrice()*(stockCalc.get().getRoi()/100)*time);
		
	}
}
