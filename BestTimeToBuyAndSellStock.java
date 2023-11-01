public class BestTimeToBuyAndSellStock{
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int curProfit = 0;
            int buyingPrice =  prices[0];
            for(int i=1;i<prices.length;i++){
                if(prices[i] < buyingPrice){
                    buyingPrice = prices[i];
                }else{
                    curProfit = prices[i] - buyingPrice;
                }

                if(curProfit > maxProfit){
                    maxProfit = curProfit;
                }
            }
            return maxProfit;
        }
}
