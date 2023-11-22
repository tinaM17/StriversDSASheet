class Solution {
    public int trap(int[] height) {
        int water=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            int leftMaxHeight=0;
            int rightMaxHeight=0;
            
            for(int j=i;j>=0;j--){
                leftMaxHeight=Math.max(leftMaxHeight,height[j]);
            }
            for(int k=i;k<n;k++){
                rightMaxHeight=Math.max(rightMaxHeight,height[k]);
            }
            water+= Math.min(leftMaxHeight,rightMaxHeight)-height[i];
        }
        return water;
    }
}