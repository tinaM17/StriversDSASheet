class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> slidingWindow=new HashSet<>();
        
        if(k==0) return false;
        
        for(int i=0;i<nums.length;i++){
            if(slidingWindow.contains(nums[i])){
                return true;
            }
            if(i>=k)
            {
                slidingWindow.remove(nums[i-k]);
            }
            slidingWindow.add(nums[i]);
        }
        return false;
    }
}