class Solution {
    public int maxProfit(int[] prices) {
        int maximum = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maximum = Math.max(maximum, prices[i]-minPrice);
        }
        return maximum;
    }
}
