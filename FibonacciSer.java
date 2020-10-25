package com.group;

import java.util.Scanner;

public class FibonacciSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// x n = x n-1 + x n -2;
		// x 5 = x 4 + x 3
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = s.nextInt();
		System.out.println(numFinbo(num));
	}
	
	public static int numFinbo(int num) {
		
		if(num <=1) {
			return num;
		}
		return numFinbo(num -1 ) + numFinbo(num -2);
		
	}

}
