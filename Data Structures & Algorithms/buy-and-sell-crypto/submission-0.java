class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;

        if (n<2) {
            return 0;
        }

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int profit = prices[j]-prices[i];
                max = Math.max(profit, max);
            }
        }

        if (max < 0) {
            return 0;
        }

        return max;
    }
}
