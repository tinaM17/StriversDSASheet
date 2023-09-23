class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find the maximum pile size to set the upper bound for binary search.
        int max = Arrays.stream(piles).max().getAsInt();
        
        // Initialize low and high for binary search.
        int low = 1;
        int high = max;
        
        // Perform binary search.
        while (low <= high) {
            int mid = (low + high) / 2;
            
            // Calculate the total time required to eat all piles at the current speed.
            int totalTime = findTotalTime(piles, mid);
            
            // Adjust the search space based on the total time.
            if (totalTime <= h) {
                // If the total time is within the allowed hours, reduce the upper bound.
                high = mid - 1;
            } else {
                // If the total time exceeds the allowed hours, increase the lower bound.
                low = mid + 1;
            }
        }
        
        // The lowest speed at which it's possible to eat all piles in 'h' hours.
        return low;
    }
    
    // Function to calculate the total time required to eat all piles at a given speed 'k'.
    public int findTotalTime(int[] piles, int k) {
        int time = 0;
        
        for (int i = 0; i < piles.length; i++) {
            // Calculate the time required to eat the current pile at speed 'k' and round up to the nearest integer.
            time += Math.ceil((double) piles[i] / k);
        }
        
        return time;
    }
}

//function for brute force approach
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