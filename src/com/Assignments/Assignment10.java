package com.Assignments;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given values are 12 ,34,11,36,87,98,93.
//		Store the values in Array and Print second and third largest number from the above values without using collections and default sort methods

		int[] num = {305, 1, 205, 300, 12, 34, 100,1000, 150, 160, 11, 36,  87, 99, 93, 200, 9, 201, 210,0 };

		int highestnum = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;
		int thirdhighest = Integer.MIN_VALUE;
		int lowestnum = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i]>highestnum) {
				
				thirdhighest = secondhighest;
				secondhighest = highestnum;
				highestnum = num[i];
				

			} 
			else if (num[i] > secondhighest && num[i] != highestnum) {
				// shift down
				thirdhighest = secondhighest;
				secondhighest = num[i];
			} 
			else if (num[i] > thirdhighest && num[i] != secondhighest && num[i] != highestnum) {
				thirdhighest = num[i];
			}

			if (lowestnum > num[i]) {

				lowestnum = num[i];

			}

		}
		System.out.println("highestnumber - " + highestnum);
		System.out.println("secondhighest - " + secondhighest);
		System.out.println("thirdhighest - " + thirdhighest);
		System.out.println("lowestnumber - " + lowestnum);

	}

}
