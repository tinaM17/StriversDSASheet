public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // Create a HashMap to store element frequencies.
        List<Integer> result = new ArrayList<>(); // Create a list to store the majority elements.

        // Iterate through the input array and count the frequencies of each element.
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int n = nums.length / 3; // Calculate the threshold for majority elements.

        // Iterate through the HashMap entries to find majority elements.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) { // Check if the frequency is greater than ⌊n / 3⌋.
                result.add(entry.getKey()); // Add the majority element to the result list.
            }
        }
        return result; // Return the list of majority elements.
    }
}
