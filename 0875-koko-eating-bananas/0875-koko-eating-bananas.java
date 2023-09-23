class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Arrays.stream(piles).max().getAsInt();
        
        int low=1;
        int high=max;
        
        while(low<=high){
            int mid=(low+high)/2;
            int totalTime=findTotalTime(piles,mid);
            if(totalTime<=h) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
    
    public int findTotalTime(int[] piles,int k){
        int time=0;
        
        for(int i=0;i<piles.length;i++){
            time+= Math.ceil((double)piles[i]/k);
        }
        return time;
    }
    
    //     public int minEatingSpeed(int[] piles, int h) {
//         int max=Arrays.stream(piles).max().getAsInt();
//         for(int i=1;i<=max;i++){
//             int totalTime=findTotalTime(piles,i);
//             if(totalTime<=h){
//                 return i;
//             }
//         }
//         return max;
//     }
}