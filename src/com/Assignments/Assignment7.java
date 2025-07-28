package com.Assignments;

public class Assignment7 {

	public static void main(String[] args) {
		
		
		// Print if user is eligible for loan or not 

		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		if (creditScore >= 750) {

			System.out.println(
					customerName + " Your are eligible for loan because of your creditScore is greater than 750");

		}

		else if (creditScore >= 650 && creditScore <= 750) {

			if (income >= 50000) {

				if (isEmployed) {

					if (debtToIncomeRatio <= 40.0) {
						System.out.println(customerName
								+ " Your are eligible for loan because of your debtToIncomeRatio is greater than 40%");

					} else {
						System.out
								.println(customerName + " Your loan is Denied due to debtToIncomeRatio  less than 40%");

					}
				} else {

					System.out.println(customerName + " is not employed & loan is denied");

				}

			} else {

				System.out.println("Your loan is Denied due to income less than 50000");
			}

		}

		else {

			System.out.println("Your loan is Denied due to creditScore less than 650");

		}

	}

}
