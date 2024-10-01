class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet to store the characters in the current window
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        // Iterate over the string with the 'right' pointer
        for (int right = 0; right < s.length(); right++) {
            // If the character at 'right' is already in the set, remove characters from the 'left' pointer
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            set.add(s.charAt(right));
            // Update max length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
