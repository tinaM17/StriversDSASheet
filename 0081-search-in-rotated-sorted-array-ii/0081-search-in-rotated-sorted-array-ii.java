class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0; // Initialize the low index.
        int high = nums.length - 1; // Initialize the high index.

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index.

            // Check if the middle element equals the target.
            if (target == nums[mid]) {
                return true; // Target found, return true.
            }

            // Check if there are duplicates at the low, middle, and high positions.
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++; // Move the low index to skip the duplicate.
                mid++; // Move the middle index to maintain consistency.
                continue; // Continue to the next iteration.
            }

            // Check if the left half (low to mid) is sorted.
            if (nums[low] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[low]) {
                    high = mid - 1; // Target is in the left half.
                } else {
                    low = mid + 1; // Target is in the right half.
                }
            } else {
                // The right half (mid to high) is sorted.
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1; // Target is in the right half.
                } else {
                    high = mid - 1; // Target is in the left half.
                }
            }
        }

        return false; // Target not found, return false.
    }
}
