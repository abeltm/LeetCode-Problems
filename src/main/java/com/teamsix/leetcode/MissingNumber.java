package com.teamsix.leetcode;

public class MissingNumber {

	public static int missingNumber(int[] nums) {

//    	initialize a value that calculates total of the natural numbers 
//    	used the mathematical formula of n x (n+1) /2 to get the total summation
		int num1 = nums.length * (nums.length + 1) / 2;

//        initialize another value to store summation including all the elements in the array
		int num2 = 0;

//        use for loop to iterate and add total summation of elements
		for (int num : nums) {
			num2 += num;
		}

//        deduct the difference between the total natural number summation and summation of elements in the array
		return num1 - num2;
	}

	public static void main(String[] args) {
//    	list of arrays
		int[] nums = { 3, 0, 1 };

//        call the missing number method above to get the result of calculation 
		int missingNum = missingNumber(nums);
		System.out.println("The missing number is: " + missingNum);
	}
}