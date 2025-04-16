package com.ArrayDSAPractice;

/*
 * Logic:
1.	Initialize two variables (max and min) to store the largest and smallest elements, respectively.
2.	Traverse the array and compare each element with max and min.
3.	Update max and min whenever a larger or smaller element is found.

 */

public class FindMinMaxInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 25, 8, 15, 45, 67, -1 };
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Max: " + max + ", Min: " + min);
	}

}
