class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        
        while(j<nums.length){
            if(nums[j]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        
        i=0;
        j=0;
        
        while(j<nums.length){
            if(nums[j]==0 && nums[i]==0){
                i++;
                j++;
            }
            else if(nums[j]==1){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
    }
}