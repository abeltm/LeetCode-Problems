package com.teamsix.leetcode;

import java.util.Arrays;

public class SquaresOfSortedArrays {

	public static int[] sortedSquares(int[] nums) {

//		initialize a new variable to store the squared result from the new arrays
		int[] result = new int[nums.length];

//		initialize values for beginning and ending of arrays
		int num1 = 0;
		int num2 = nums.length - 1;

//		initialize value to get array list from the ending position
		int i = nums.length - 1;

//		use a while loop to loop through elements to compare values until the value starting from left side is greater than the right side
		while (num1 <= num2) {

//			square the value of the left pointer
			int x = nums[num1] * nums[num1];

//			square the value of the right pointer
			int y = nums[num2] * nums[num2];

//			use if condition to compare squared values of left and right values

//			if the left squared value is greater than the right, increment the index
			if (x > y) {
				result[i] = x;
				num1++;

//			if the right squared value is greater than the left, decrement the index

			} else {
				result[i] = y;
				num2--;
			}

//			decrement the value of index by one to move to the next largest value while running the loop
			i--;
		}

//		returns the result of the squared list of arrays

		return result;
	}

	public static void main(String[] args) {
//		list of arrays
		int[] nums = { -4, -1, 0, 3, 10 };
//		calling the result from the above method
		int[] result = sortedSquares(nums);
		System.out.println("The sorted list of the squared arrays are: " + Arrays.toString(result));
	}
}