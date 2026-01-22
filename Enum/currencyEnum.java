package com.shreyas.Enum;

public class currencyEnum {
	
	enum Currency{
		USD ("$"),
		INR ("rupees"),
		EUR ("euro"),
		GBP ("pound"),
		JPY ("yen");
		
		private String symbol;
		
		Currency(String symbol){
			this.symbol = symbol;
		}
		
		public String getSymbol() {
			return symbol;
		}
	}

}
