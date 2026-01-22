package com.shreyas.Enum;

import com.shreyas.Enum.WeekEnum.Days;
import com.shreyas.Enum.currencyEnum.Currency;
import com.shreyas.Enum.seasonsEnum.seasons;
import com.shreyas.Enum.trafficEnum.TrafficSign;

public class Main {
	
	//enum Days {Monday, Tuesday, Wednesday};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(Days day : Days.values()){
			System.out.println(day);
		}
		
		System.out.println("----------------");
		
		for(seasons season : seasons.values()) {
			System.out.println(season.name() +" - "+ season.getTemp());
		}
		
		System.out.println("The temperature in "+seasons.Winter+ " drop to "+seasons.Winter.getTemp());
		
		System.out.println("The weather in "+seasons.Winter+ " feels like "+seasons.Winter.getFeels());
		
		System.out.println("----------------");
		
		for(TrafficSign ts : TrafficSign.values()) {
			System.out.println(ts);
		}
		
		System.out.println("The value of "+TrafficSign.Green+" is "+TrafficSign.Green.value);
		
		TrafficSign ts = TrafficSign.Red;
		
		switch(ts) {
		case Red: System.out.println("STOP!"); break;
		case Green: System.out.println("GO!");break;
		case Yellow: System.out.println("Ready!");break;
		default: System.out.println("Invalid option"); break;
		}
		
		System.out.println("----------------");
		
		System.out.println("The symbol for " + Currency.EUR + " is " + Currency.EUR.getSymbol());
		
		String mymoney = "INR";
		
		switch(mymoney) {
			case "INR" : System.out.println("your money is "+Currency.valueOf(mymoney));break;
			case "USD" : System.out.println("your money is "+Currency.valueOf(mymoney));break;
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
