class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else {
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return i+1;
        
//         int temp[]=new int[nums.length];
//         int index=0;
//         temp[index]=nums[0];
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]){
//                 continue;
//             }
//             else {
//                 index++;
//                 temp[index]=nums[i];
//             }
//         }
        
//         for(int i=0;i<=index;i++){
//             nums[i]=temp[i];
//         }
        
//         return index+1;
    }
}