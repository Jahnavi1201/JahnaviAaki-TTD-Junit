package com.epam;

public class RemovalOfAInFirstTwoChar {
	public String removeAInFirst2Char(String str) {
		String resultantString="";
		if(str.length()<=2) {
			resultantString=str.replace("A", "");
		}
		else {
			String firstTwoChar=str.substring(0,2).replace("A", "");
			resultantString=firstTwoChar+str.substring(2);
		}
		return resultantString;
	}
}
