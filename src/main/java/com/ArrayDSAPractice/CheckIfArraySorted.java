package com.ArrayDSAPractice;

/*
 * Logic:
    Assume the array might be sorted.
    Traverse the array and:
        Check if elements follow ascending order
        Check if elements follow descending order
    If either condition is true for the full array, it's sorted. Otherwise, it's not sorted.
 */

public class CheckIfArraySorted {

	public static void main(String[] args) {
		int[] arr = { 12, 4, 8, 15, 20 }; // Try changing values to test

		boolean isAscending = true;
		boolean isDescending = true;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				isAscending = false;
			}
			if (arr[i] > arr[i - 1]) {
				isDescending = false;
			}
		}

		if (isAscending) {
			System.out.println("The array is sorted in ascending order.");
		} else if (isDescending) {
			System.out.println("The array is sorted in descending order.");
		} else {
			System.out.println("The array is not sorted.");
		}
	}

}
