class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Arrays.stream(weights).sum();
        int low=Arrays.stream(weights).max().getAsInt();
        int high=max;
        int res=0;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean result=daysNeeded(weights,mid,days);
            
            if(result){
                res=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return res;
    }
    
    public boolean daysNeeded(int[] weights, int k,int d){
        int days=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>k){
                days++;
                sum=weights[i];
            }
            else {
                sum+=weights[i];
            }
            
        }
        return days<=d;
    }
}