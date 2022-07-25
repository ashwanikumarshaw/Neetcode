package SlidingWindow;

public class BestTimeToBuyAndSellStock_121 {

	/*
	 * 
	 * You are given an array prices where prices[i] is the price of a given stock
	 * on the ith day.
	 * 
	 * You want to maximize your profit by choosing a single day to buy one stock
	 * and choosing a different day in the future to sell that stock.
	 * 
	 * Return the maximum profit you can achieve from this transaction. If you
	 * cannot achieve any profit, return 0.
	 */
	static public int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;
		int pastPrice = prices[0];
		int result = 0;

		for (int i = 1; i < prices.length; i++) {
			result = Math.max(result, prices[i] - pastPrice);//max profit
			pastPrice = Math.min(pastPrice, prices[i]);//new past price
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
		System.out.println(maxProfit(new int[] {7,6,4,3,1}));
		System.out.println(maxProfit(new int[] {7}));
	}

}
