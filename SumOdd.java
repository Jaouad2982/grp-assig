package com.group;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] []  twoDim = {{1,1,1},{1,1,3},{1,1,1}};
		sumOdd(twoDim);
	}
	public static void sumOdd (int [] [] arr) {
		int sum = 0;
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ; j< arr[i].length ; j++ ) {
				if(arr[i][j] % 2 !=0)
				sum = sum + arr[i][j];
			}
		}
		System.out.println("The sum of all numbers is  " + sum);

	}

}
