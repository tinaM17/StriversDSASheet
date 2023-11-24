class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        int tempMaxSum=0;
        int tempMinSum=0;
        
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
            tempMaxSum+=nums[i];
            
            if(tempMaxSum>maxSum){
                maxSum=tempMaxSum;
            }
            if(tempMaxSum<0){
                tempMaxSum=0;
            }
            tempMinSum+=nums[i];
            if(tempMinSum<minSum){
                minSum=tempMinSum;
            }
            if(tempMinSum>0){
                tempMinSum=0;
            }
        }
        
        if(totalSum==minSum){
            return maxSum;
        }
        return Math.max(maxSum,(totalSum-minSum));
    }
}