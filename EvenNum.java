package com.group;
//Create a 2D array to store numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only
public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] []  twoDim = {{1,2,3},{4,5,6},{7,8,9}};
		evenNum(twoDim);

	}
	public static void evenNum (int [] [] arr) {
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ; j< arr[i].length ; j++ ) {
				if(arr[i][j] % 2 == 0)
					System.out.println(arr[i][j]);
			}
		}

	}

}
