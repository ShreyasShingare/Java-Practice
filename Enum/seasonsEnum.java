package com.shreyas.Enum;

public class seasonsEnum {
	
	enum seasons {
		Summer(30,"hot"), 
		Spring(15,"warm"), 
		Winter(-5,"cold"), 
		Autumn(10,"plesant");
		
		int avgTemp;
		String feels;

		seasons(int temperature, String feels) {
			// TODO Auto-generated constructor stub
			this.avgTemp = temperature;
			this.feels = feels;
		}
		
		public int getTemp() {
			return avgTemp;
		}
		
		public String getFeels() {
			return feels;
		}
		
		};
	
	

}
