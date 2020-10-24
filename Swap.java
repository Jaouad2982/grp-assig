package com.group;
//Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swappingElement(3,4);
		swappingElement("Elephant","Dog");
		
	}
	public static void swappingElement(int a, int b) {
		  a = a + b; 
		  b = a - b; 
		  a = a - b;
		System.out.println("a is "+ a + " b is " + b);
	}
	public static void swappingElement(String a, String b) {
	
		
	}

}
 