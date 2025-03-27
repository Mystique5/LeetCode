class Solution {
    public int maxProfit(int[] prices) {

        int profit=0;
        int buy=prices[0];

       /* for(int i=1;i<prices.length;i++)
        {
            buy=(prices[i]<buy)? prices[i] : buy;

            profit=Math.max(profit, (prices[i]-buy));
        }*/

        //Above approach runs some unnecessary lines

        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
                continue;
            }
            else if(prices[i]-buy >0)
            {
                profit=Math.max(profit, (prices[i]-buy));
            }
        }

        return profit;
        
    }
}