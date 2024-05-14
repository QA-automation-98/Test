package com.automation.Test;

import java.util.Random;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int sum =0;
		System.out.println(rand.nextInt(100));
		int [] intArray = new int[4];
		for ( int i =0 ;i < intArray.length; i++) {
			intArray[i] = rand.nextInt(100);
			sum = sum + intArray[i];
		}
		
		
		
		for(int in:intArray) {
			System.out.println(in);
		}
		System.out.println((100 -sum));
	}

}
