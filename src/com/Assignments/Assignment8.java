package com.Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bank Transactions

		List<Integer> bankTransctions = new ArrayList<Integer>();
		bankTransctions.add(50000);
		bankTransctions.add(-2000);
		bankTransctions.add(3000);
		bankTransctions.add(-15000);
		bankTransctions.add(-200);
		bankTransctions.add(-300);
		bankTransctions.add(4000);
		bankTransctions.add(-3000);
		bankTransctions.add(-12000);
		bankTransctions.add(12000);

		// 1. Print total number of credit and debit transactions completed
		// 2. Print the total amount credited and debited in account
		// 3. Print total amount remaining at the end in Bank Account
		// 4. If any transaction limist exceeds +/- 10000 then print the message
		// “Suspicious credit/ debit
		// Transaction with Amount” and also print total number of suspicious
		// transactions
		int creditcount = 0;
		int debitcount = 0;
		int creditamount = 0;
		int debitamount = 0;
		int limitexceedsdebitcount = 0;
		int limitexceedscreditcount = 0;

		for (int i = 0; i < bankTransctions.size(); i++) {

			if (bankTransctions.get(i) > 0) {

				creditcount = creditcount + 1;

				creditamount += bankTransctions.get(i);

				if (bankTransctions.get(i) > 10000) {
					System.out.println("Credit Limit is exceeded with " + bankTransctions.get(i));
					limitexceedscreditcount = limitexceedscreditcount + 1;

				}

			} else {

				debitcount = debitcount + 1;
				debitamount += bankTransctions.get(i);

				if (bankTransctions.get(i) < -10000) {
					System.out.println("Debit Limit is exceeded with " + bankTransctions.get(i));
					limitexceedsdebitcount = limitexceedsdebitcount + 1;

				}
			}

		}
		int totalamountremiaining = creditamount + debitamount;

		System.out.println("1. Total number of credits = " + creditcount);
		System.out.println("2. Total number of debits = " + debitcount);
		System.out.println("3. Total credited amount = " + creditamount);
		System.out.println("4. Total debited amount = " + debitamount);
		System.out.println("5. Total amount Remaining  = " + totalamountremiaining);
		System.out.println("6. Total number of limitexceedsdebitcount = " + limitexceedsdebitcount);
		System.out.println("6. Total number of limitexceedscreditcount = " + limitexceedscreditcount);

	}

}
