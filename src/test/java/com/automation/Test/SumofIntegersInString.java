package com.automation.Test;

public class SumofIntegersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "39rudjee842392";
		
		int sum = 0;
		for(int i =0 ; i<input.length();i++) {
			char c = input.charAt(i);
			if(Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);
			}
		}
		System.out.println("The sum of digits is "+sum);
	}

}
