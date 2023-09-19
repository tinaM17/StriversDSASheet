public class Solution {
    public int findDuplicate(int[] nums) {
        int array[] = new int[nums.length + 1]; // Create an auxiliary array.

        // Iterate through the elements of the input array.
        for (int i = 0; i < nums.length; i++) {
            array[nums[i]] = array[nums[i]] + 1; // Count the occurrences of each number.
        }

        // Iterate through numbers from 1 to the length of the array.
        for (int i = 1; i <= nums.length; i++) {
            // If the count of a number is greater than or equal to 2, it's a duplicate.
            if (array[i] >= 2) {
                return i; // Return the duplicate number.
            }
        }

        // If no duplicate is found, return -1.
        return -1;
    }
}
