class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=Arrays.stream(nums).sum();
        int n=nums.length;
        int target=sum-x;
        if(target<0)
            return -1;
        if(target==0)
            return n;
        
        int count=Integer.MAX_VALUE;
        int left=0, right=0,currSum=0;
        
        while(right<n){
            currSum+=nums[right];
            right++;
            while(currSum>target && left<n){
                currSum-=nums[left];
                left++;
            }
            if(currSum==target)
                count=Math.min(count,n-(right-left));
        }
        return (count==Integer.MAX_VALUE) ?-1 : count;
    }
}