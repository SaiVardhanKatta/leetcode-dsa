class Solution {
    public int maxProfit(int[] prices) {
        int minimumPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;
        for (int currentDayPrice = 0; currentDayPrice < prices.length; currentDayPrice++) {
            if (prices[currentDayPrice] < minimumPrice) {
                minimumPrice = prices[currentDayPrice];
            } else if (prices[currentDayPrice] - minimumPrice > maximumProfit) {
                maximumProfit = prices[currentDayPrice] - minimumPrice;
            }
        }
        return maximumProfit;
    }
}
