package com.group;

import java.util.Arrays;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] listArr = {3423,332,11,1,2,3,34,56,0};
		String res = Arrays.toString(secondMax(listArr)); // 
		String[] element = res.split(",");
		System.out.println(Arrays.toString(element)); // Sort the array in a numerical order
		System.out.println("The second largest element wihin the array is " + element[element.length-2]);

	}
	public static int []secondMax(int[]arr) {
		 Arrays.sort(arr);
		return arr;
	} 
	
}
