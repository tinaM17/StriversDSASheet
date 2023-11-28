class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=findFirstPos(nums,target);
        ans[1]=findlastPos(nums,target);
        return ans;
    }
    
    public int findFirstPos(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int pos=-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                pos=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            
        }
        return pos;
    }
    public int findlastPos(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int pos=-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                pos=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            
        }
        return pos;
    }
}