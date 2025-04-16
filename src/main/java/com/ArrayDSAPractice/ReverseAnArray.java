package com.ArrayDSAPractice;

/*
 * Logic:
Initialize two pointers: start at the beginning of the array and end at the last index.Swap the elements at start and end.
Move start forward and end backward until they meet in the middle, reversing the array.
 */

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

	}

}
