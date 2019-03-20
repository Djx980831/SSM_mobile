package com.oracle.vo;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static String getRandom() {
		Random r = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		int a = 0;
		for(int i = 0 ; i < 10 ;i++) {
			a = r.nextInt(9);
			sb.append(a);
		}
		
		return sb.toString();
	}
	
}
