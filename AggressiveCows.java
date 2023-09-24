import java.util.Arrays;

public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        // Sort the array of stalls.
        Arrays.sort(stalls);
        int n = stalls.length;
        
        // Initialize the search space boundaries.
        int low = 1;
        int high = stalls[n - 1] - stalls[0];

        // Perform binary search to find the maximum minimum distance.
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if it's possible to place 'k' cows with a minimum distance of 'mid'.
            if (isPossible(mid, stalls, k)) {
                // If possible, increase the minimum distance.
                low = mid + 1;
            } else {
                // If not possible, decrease the minimum distance.
                high = mid - 1;
            }
        }
        
        // The maximum minimum distance at which 'k' cows can be placed.
        return high;
    }

    public static boolean isPossible(int minDist, int[] stalls, int k) {
        int cows = 1;
        int distance = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - distance >= minDist) {
                cows++;
                distance = stalls[i];
            }
            
            // If the required number of cows 'k' is placed, return true.
            if (cows >= k) {
                return true;
            }
        }
        
        // If it's not possible to place 'k' cows with the given minimum distance.
        return false;
    }
}
