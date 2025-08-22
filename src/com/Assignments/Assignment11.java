package com.Assignments;

public class Assignment11 {

	/*
	 * Example 1: Input: x = 2.00000, n = 10 Output: 1024.00000
	 */
	/*
	 * Example 2: Input: x = 2.10000, n = 3 Output: 9.26100
	 */
	/*
	 * Example 3: Input: x = 2.00000, n = -2 Output: 0.25000 Explanation: 2(-2) =
	 * 1/22 = 1/4 = 0.25
	 */
	
	

	public static void main(String[] args) {
		double input = 2.00000;
		int power = -2;
		double output = 1;

		if (power > 0) {

			for (int i = 1; i <= power; i++) {

				output *= input;

			}
		} else {

			power = -(power);

			for (int i = 1; i <= power; i++) {

				output *= input;

			}
			output = 1 / output;
		}

		System.out.println(output);

	}

}
