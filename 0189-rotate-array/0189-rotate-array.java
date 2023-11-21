class Solution {
    public void rotate(int[] nums, int k) {
    
        //This approach is using an temp extra space array
        // int length=nums.length;
        // int temp[]=new int[length];
        // for(int i=0;i<length;i++){
        //     temp[(i+k)%length]=nums[i];
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=temp[i];
        // }
        
        // Optimised approach without using extra space
        
        k=k%nums.length;
        int n=nums.length;
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
        
    }
    
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}