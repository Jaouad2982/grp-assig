package com.group;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] listArr = {1,2,3,34,56,0};
		min(listArr);
		max(listArr);
	}
	
	public static void min(int[]arr) {
		int min = arr[0];
		for(int i = 0 ; i < arr.length ;i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println(min);
	}
	public static void max(int[]arr) {
		int max = arr[0];
		for(int i = 0 ; i < arr.length ;i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);
	}
}
