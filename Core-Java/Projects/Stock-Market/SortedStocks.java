package stock_market;

import java.util.Comparator;

public class SortedStocks implements Comparator<Stock> {

	@Override
	public int compare(Stock stock1, Stock stock2) {
		return Double.compare(stock2.getPrice(), stock1.getPrice());
	}
	

}
