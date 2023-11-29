class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles).max().getAsInt();
        
        int low=1;
        int high=max;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalHour=hourNeeded(piles,mid);
            if(totalHour<=h){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
    
    public int hourNeeded(int[] piles, int k){
        int hour=0;
        for(int i=0;i<piles.length;i++){
            hour+=Math.ceil((double) piles[i]/k);
        }
        return hour;
    }
}