class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }
        int swapIndex=-1;
        for(int i=index+1;i<n && index!=-1;i++){
            if(nums[i]>nums[index]){
                swapIndex=i;
            }
        }
        swap(nums,index,swapIndex);
        reverse(nums,index+1,n-1);
    }
    
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    private void reverse(int[] nums,int start,int end){
        int i=start;
        int j=end;
        
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
    }
}