class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE; // Initialize the answer as positive infinity.
        int low = 0; // Initialize the low index.
        int high = nums.length - 1; // Initialize the high index.

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index.

            // Check if the array segment from low to high is already sorted.
            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]); // Update the answer with the minimum element.
                break; // Since the array is sorted, we can exit the loop.
            }

            // Check if the left half of the array (low to mid) is sorted.
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]); // Update the answer with the minimum element in the left half.
                low = mid + 1; // Move the low index to the right of mid.
            } else {
                ans = Math.min(ans, nums[mid]); // Update the answer with the minimum element in the right half.
                high = mid - 1; // Move the high index to the left of mid.
            }
        }

        return ans; // Return the minimum element.
    }
}
