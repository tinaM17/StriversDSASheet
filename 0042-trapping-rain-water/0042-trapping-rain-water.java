class Solution {
    public int trap(int[] height) {
        
        int trappedWater=0;
        int left=0;
        int right=height.length-1;
        int leftMaxHeight=0;
        int rightMaxHeight=0;
        
        while(left<=right){
            if(height[left]<height[right]){
                if(height[left]>leftMaxHeight){
                    leftMaxHeight=height[left];
                }
                else {
                    trappedWater+=leftMaxHeight-height[left];
                }
                left++;
            }
            else {
                if(height[right]>rightMaxHeight){
                    rightMaxHeight=height[right];
                }
                else {
                    trappedWater+=rightMaxHeight-height[right];
                }
                right--;
            }
        }
        return trappedWater;
//         int water=0;
//         int n=height.length;
//         int left[]=new int[n];
//         int right[]=new int[n];
//         left[0]=height[0];
//         right[n-1]=height[n-1];
        
//         for(int i=1;i<n;i++){
//             left[i]=Math.max(height[i],left[i-1]);
//         }
        
//         for(int i=n-2;i>=0;i--){
//             right[i]=Math.max(height[i],right[i+1]);
//         }
//         for(int i=0;i<n;i++){
//             water+= Math.min(left[i],right[i])-height[i];
//         }
//         return water;
    }
}