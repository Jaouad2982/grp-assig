package com.group;

import java.util.Scanner;

public class PrimeOrNot {
static boolean isPrime = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter  a number to check");
		int num = s.nextInt();
		primeNum(num);
		if(isPrime)
			System.out.println(num + " is a prime number");
		else 
			System.out.println(num + " is not a prime number");

	}
	
	public static void primeNum(int num) {
		for(int i = 2 ; i < num /2 ; i++) {
			if(num % i == 0 ) {
				isPrime = false;
				break;
			}
		}
	}
}
