class Solution {
    public int findDuplicate(int[] nums) {
        int array[]=new int[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            array[nums[i]]=array[nums[i]]+1;
        }
        
        for(int i=1;i<=nums.length;i++){
            if(array[i]>=2){
                return i;
            }
        }
        return -1;
    }
}