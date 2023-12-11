class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int pass[] = new int[n];
        int buy=Integer.MAX_VALUE;
        int sell=0;
        int prof=0;
        // Pass 1: Forward
        for(int i=0; i<n; i++) {
            if(buy>prices[i]) {
                buy=prices[i];
                sell=prices[i];
            }
            sell=Math.max(sell, prices[i]);
            pass[i]=Math.max(prof, sell-buy);
            prof=Math.max(prof, sell-buy);
        }

        // Pass 2: Reversed
        int res=pass[n-1];
        sell=prof=0;
        buy=Integer.MAX_VALUE;
        for(int i=n-1; i>0; --i) {
            if(sell<prices[i]) sell=buy=prices[i];
            buy=Math.min(buy, prices[i]);
            res=Math.max(res, pass[i-1]+sell-buy);
        }
        return res;
    }
    
    
}