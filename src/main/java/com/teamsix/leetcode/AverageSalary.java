package com.teamsix.leetcode;

public class AverageSalary {

	// created a method that is used to perform calculations for the average salary

	public static double averageSalary(int[] salary) {

//			initialized total summation of salaries
		int total = 0;

//			initialized minimum salary
		int min = salary[0];

//			initialized maximum salary
		int max = salary[0];

//			used for loop to iterate through the list of arrays and used if condition to filter the minimum and maximum values
		for (int i = 0; i < salary.length; i++) {

//				loop through the list to find the minimum value
			if (salary[i] < min) {
				min = salary[i];
			}

//				loop through the list to find the maximum value
			if (salary[i] > max) {
				max = salary[i];
			}
		}

//			after filtering the minimum and maximum values above, loop through the list again then calculate the total values to sum and divide the total to find the average
		for (int i = 0; i < salary.length; i++) {

//				use if condition to exclude min and max values
			if (salary[i] != min && salary[i] != max) {

//					add the remaining values
				total += salary[i];
			}
		}

//			calculate the average value
		double averageSalary = total / (salary.length - 2);
		return averageSalary;

	}

//		main method
	public static void main(String[] args) {
//			add values to the array list
		int[] salary = { 4000, 3000, 1000, 2000 };

//			take the average result from the above method in the calculation
		double sum = averageSalary(salary);
		System.out.println("Average Salary is: " + sum);
	}

}
