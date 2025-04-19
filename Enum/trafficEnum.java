package com.shreyas.Enum;

public class trafficEnum {
	
	enum TrafficSign{
		Red ("Stop"),
		Yellow ("Ready"),
		Green ("Go");
		
		String value;
		
		TrafficSign(String value) {
			this.value = value;
		}
		
		public String getTrafficValue() {
			return value;
		}
		
		
	}

}
