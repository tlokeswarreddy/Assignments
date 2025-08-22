package com.Assignments;

public class Assignments10 {

	public static void main(String[] args) {
	/*	Best Time to Buy and Sell Stock
		You are given an array prices where prices[i] is the price of a given stock on the i
		th day.
		You want to maximize your profit by choosing a single day to buy one stock and choosing
		a different day in the future to sell that stock.
		Return the maximum profit you can achieve from this transaction. If you cannot achieve
		any profit, return 0.

		Example 1:
		Input: prices = [7,1,5,3,6,4]
		Output: 5
		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
		Note that buying on day 2 and selling on day 1 is not allowed because you must buy
		before you sell.
		Example 2:
		Input: prices = [7,6,4,3,1]
		Output: 0
		Explanation: In this case, no transactions are done and the max profit = 0.*/
		
		int[] prices = {7,18,5,3,6,4};

		//int[] prices = {7,6,4,3,1};
        int invest = prices[0]; // Minimum price so far (buy price)
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;
        int minIndex = 0; // Track index of minimum price

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < invest) {
                invest = prices[i];
                minIndex = i; // Update index of the minimum price
            } 
            else {
                int profit = prices[i] - invest;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyDay = minIndex;
                    sellDay = i;
                }
            }
        }

        if (maxProfit > 0) {
            System.out.println("Buy on day " + buyDay + " (price = " + prices[buyDay] + ")");
            System.out.println("Sell on day " + sellDay + " (price = " + prices[sellDay] + ")");
            System.out.println("Maximum profit is: " + maxProfit);
        } else {
            System.out.println("No profitable transaction possible.");
        }

	}

}
