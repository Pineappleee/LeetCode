public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        else {
            int profit = 0;
            int cur , next;
            for (int i = 0; i< prices.length-1; i++) {
                cur = prices[i];
                next = prices[i+1];
                if (cur < next) {
                    profit = next - cur + profit;
                }
            }
            return profit;
        }
    }
}