class Solution {
    public boolean isSubsequence(String s, String t) {
        // Calculate the lengths of the input strings.
        int lengthOfT = t.length();
        int lengthOfS = s.length();
        
        // Create a StringBuilder to store matching characters from t.
        StringBuilder string = new StringBuilder();
        
        // Initialize indices for iterating through t and s.
        int i = 0;
        int j = 0;
        
        // Iterate through t and s.
        while (i < lengthOfT && j < lengthOfS) {
            // Extract characters at the current positions.
            char ch1 = t.charAt(i);
            char ch2 = s.charAt(j);
            
            // Compare characters.
            if (ch1 == ch2) {
                // Append matching character to the result.
                string.append(ch1);
                
                // Move to the next characters in both strings.
                i++;
                j++;
            } else {
                // If characters don't match, only increment i to search for the next character in t.
                i++;
            }
        }
        
        // Check if the result string is equal to s.
        if (string.toString().equals(s)) {
            return true; // s is a subsequence of t.
        }
        
        return false; // s is not a subsequence of t.
    }
}
