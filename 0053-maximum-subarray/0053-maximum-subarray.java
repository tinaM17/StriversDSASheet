class Solution {
    public int maxSubArray(int[] nums) {
        //initialize currSum to be 0 and sum to be min value
        int currSum=0;
        int sum=Integer.MIN_VALUE;
        //runs a for loop from 0 to length of the array
        for(int i=0;i<nums.length;i++){
          //sum up the current elements with the previous sum
           currSum+=nums[i];
           //now find the max sum btw currSum and sum
           sum=Math.max(sum,currSum);
           //now main logic is if the currSum is negative so it will reduce our sum so this will not be a part of our max sum subarray so set the currSum=0
           if(currSum<0){
             currSum=0;
           }
        }
        //now return the sum
        return sum;
    }
}