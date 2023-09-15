class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); // Initialize a list to store the result triplets.
        int n = nums.length;
        Arrays.sort(nums); // Sort the input array in ascending order.

        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                // Skip duplicate elements to avoid duplicate triplets.
                continue;
            }
            int j = i + 1; // Pointer to the element after nums[i].
            int k = n - 1; // Pointer to the last element in the array.

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++; // If the sum is less than zero, move the left pointer to the right.
                } else if (sum > 0) {
                    k--; // If the sum is greater than zero, move the right pointer to the left.
                } else {
                    // If the sum is zero, we found a triplet.
                    List<Integer> triplets = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(triplets); // Add the triplet to the result list.
                    j++;
                    k--;

                    // Skip any duplicate elements to avoid duplicate triplets.
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return ans; // Return the list of unique triplets that sum to zero.
    }
}
