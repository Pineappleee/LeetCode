public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        else {
            int profit = 0, lowest = prices[0];
            for (int cur : prices) {
                lowest = Math.min(lowest, cur);
                profit = Math.max(profit, cur - lowest);
            }
            return profit;
        }
        
    }
}