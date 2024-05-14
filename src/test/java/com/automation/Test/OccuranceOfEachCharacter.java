package com.automation.Test;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "djkq9eemwwksj jdmdsml sks";
		
		Map<Character ,Integer> charMap = new HashMap<Character,Integer>();
		
		char [] charArr = name.toCharArray();
		
		for(char c : charArr) {
			if(!String.valueOf(c).isBlank()) {
				if(charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c)+1);
				}
				else {
					charMap.put(c, 1);
				}
			}
		}
		System.out.println(name + ":"+charMap);
		
	}

}
