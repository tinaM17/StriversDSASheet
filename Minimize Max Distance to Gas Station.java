//Minimize Max Distance to Gas Station

public class Solution {
    // Function to find the minimum maximum distance given an array and a number K.
    public static double MinimiseMaxDistance(int []arr, int K){
         int n = arr.length; // Get the size of the array
        double low = 0; // Initialize the lower bound of binary search
        double high = 0; // Initialize the upper bound of binary search

        // Find the maximum distance between consecutive elements in the array:
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, (double)(arr[i + 1] - arr[i])); // Calculate and update the maximum distance
        }

        // Apply Binary Search to find the minimum maximum distance:
        double diff = 1e-6 ; // A small value to determine when to stop the binary search
        while (high - low > diff) {
            double mid = (low + high) / (2.0); // Calculate the middle distance to check
            int cnt = numberOfGasStationsRequired(mid, arr); // Count the number of gas stations required for this distance
            if (cnt > K) {
                low = mid; // If more gas stations are required, update the lower bound
            } else {
                high = mid; // If fewer or equal gas stations are required, update the upper bound
            }
        }
        return high; // Return the minimum maximum distance        
    }

    // Function to calculate the number of gas stations required for a given distance
    public static int numberOfGasStationsRequired(double dist, int[] arr) {
        int n = arr.length; // Get the size of the array
        int cnt = 0; // Initialize a counter for gas stations
        for (int i = 1; i < n; i++) {
            // Calculate the number of gas stations needed between two consecutive points
            int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
            // Check if the distance is exactly divisible by dist, if so, subtract one from the count
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween; // Add the number of gas stations needed between these points
        }
        return cnt; // Return the total number of gas stations required
    }
}
