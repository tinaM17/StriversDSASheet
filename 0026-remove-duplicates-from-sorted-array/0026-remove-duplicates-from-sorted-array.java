class Solution {
    public int removeDuplicates(int[] nums) {
        int temp[]=new int[nums.length];
        int index=0;
        temp[index]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else {
                index++;
                temp[index]=nums[i];
            }
        }
        
        for(int i=0;i<=index;i++){
            nums[i]=temp[i];
        }
        
        return index+1;
    }
}