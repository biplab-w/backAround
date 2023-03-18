package com.backAround;

public class BackAroundString {
	public static void main(String[] args) {
		
//Given a string, take the last char and return a new string 
//with the last char added at the front and back, so "cat" yields "tcatt". 
//The original string will be length 1 or more.
//
//
//				backAround("cat") → "tcatt"
//				backAround("Hello") → "oHelloo"
//				backAround("a") → "aaa"
		
		BackAroundString ba = new BackAroundString();
		System.out.println(ba.backAround("cat"));
		System.out.println(ba.backAround("Hello"));
		System.out.println(ba.backAround("a"));
		
		
	}
	
	public String backAround(String str) {
		 //Get the last character
		String last = str.substring(str.length()-1);
		//Add and return last character + the string itself + the last character
		return last + str + last;
	}
}
