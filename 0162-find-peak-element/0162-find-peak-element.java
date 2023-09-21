class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        //if the length of the array is 1 then that element is the peak element so return 0 index
        if(n==1) return 0;
        //if the first element is greater than the second element then return the first index because for the first element, we should treat the previous element as negative infinity.
        if(nums[0]>nums[1]) return 0;
        //if the last element is greater than the previous element then return the last index because for the last element, we should treat the next element as negative infinity.
        if(nums[n-1]>nums[n-2]) return n-1;
        
        //As we deal with the 0 and n-1 index so start the search with low as 1 and high as n-2;
        int low=1,high=n-2;
        
        while(low<=high){
            //find mid first
            int mid=low+(high-low)/2;
            //now check if mid is our peak element or not
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            //If not then we have to check whether we are in left half or right half according to the peak element
            
            //we are in the left half side of the peak element so we have to discard this part and search in the right half
            if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            // else //we are in the right half side of the peak element so we have to discard this part and search in the left half
            else {
                high=mid-1;
            }
        }
        //if no peak element is found then return -1;
        return -1;
    }
}