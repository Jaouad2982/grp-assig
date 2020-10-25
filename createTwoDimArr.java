package com.group;
//Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers
public class createTwoDimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] []  twoDim = {{1,2,3},{4,5,6},{7,8,9}};
		sumArr(twoDim);
	}
	public static void sumArr (int [] [] arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ; j< arr[i].length ; j++ ) {
				sum = sum + arr[i][i];
			}
		}
		System.out.println("The sum of all numbers is  " + sum);

	}
}
