class Solution {
    public int maxProfit(int[] prices) {
        
         if (prices == null || prices.length == 0) {
            return 0;
        }

        int buy1 = Integer.MIN_VALUE, sell1 = 0;
        int buy2 = Integer.MIN_VALUE, sell2 = 0;

        for (int price : prices) {
            // First transaction
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);

            // Second transaction
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }

        return sell2;
//         // Get the length of the prices array
//         int n = prices.length;
        
//         // Create an array to store the maximum profit for each day
//         int pass[] = new int[n];
        
//         // Initialize variables to track buying, selling, and overall profit
        
//         int buy = Integer.MAX_VALUE;  // Initialize buy to a large value to ensure it gets updated on the first day
        
//         int sell = 0;  // Initialize sell to 0, as there are no profits initially
//         int prof = 0;  // Initialize overall profit to 0
        
//         // Pass 1: Forward iteration through the prices array
//         for(int i = 0; i < n; i++) {
//             // Check if the current price is a better buying opportunity
//             if(buy > prices[i]) {
//                 buy = prices[i];
//                 sell = prices[i];  // If buying, reset the selling price
//             }
            
//             // Update the maximum selling price
//             sell = Math.max(sell, prices[i]);
            
//             // Calculate and store the maximum profit for the current day
//             pass[i] = Math.max(prof, sell - buy);
            
//             // Update the overall maximum profit
//             prof = Math.max(prof, sell - buy);
//         }

//         // Pass 2: Reversed iteration through the prices array
//         int res = pass[n - 1];  // Initialize result with the maximum profit from the last day
//         sell = prof = 0;  // Reset selling price and overall profit for the second pass
//         buy = Integer.MAX_VALUE;  // Reset buying price for the second pass
        
//         // Iterate backward from the second-to-last day to the first day
//         for(int i = n - 1; i > 0; --i) {
//             // Check if the current price is a better selling opportunity
//             if(sell < prices[i]) {
//                 sell = prices[i];
//                 buy = prices[i];  // If selling, reset the buying price
//             } 
            
//             // Update the minimum buying price
//             buy = Math.min(buy, prices[i]);
            
//             // Calculate the total profit for the current day and update the result 
//             res = Math.max(res, pass[i - 1] + sell - buy);
//         }
        
//         // Return the final result,the maximum profit
//         return res;
    }
}
