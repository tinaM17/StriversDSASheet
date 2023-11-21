class Solution {
    public void sortColors(int[] nums) {
        //Three Pointers Approach or Dutch National Flag Algorithm
        int low=0;
        int mid=0;
        int high=nums.length-1;
        
        while(mid<=high){
            if(nums[mid]>1){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else if(nums[mid]<1){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }
        
        
        //Using two pointer approach.
//         int i=0;
//         int j=0;
        
//         while(j<nums.length){
//             if(nums[j]==0){
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 i++;
//                 j++;
//             }
//             else {
//                 j++;
//             }
//         }
        
//         i=0;
//         j=0;
        
//         while(j<nums.length){
//             if(nums[j]==0 && nums[i]==0){
//                 i++;
//                 j++;
//             }
//             else if(nums[j]==1){
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 i++;
//                 j++;
//             }
//             else {
//                 j++;
//             }
//         }
    }
}