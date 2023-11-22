class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        
        int low=0;
        int high=height.length-1;
        
        while(low<high){
            int width=high-low;
            int minHeight=Math.min(height[low],height[high]);
            int area=width*minHeight;
            maxArea=Math.max(maxArea,area);
            
            if(height[low]>=height[high]) high-- ;
            else low++;
        }
        
        return maxArea;
    }
}