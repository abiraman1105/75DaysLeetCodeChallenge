class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int l = 0;
        int maxLen = 0;
        char[] arr = s.toCharArray();
        for (char c : arr){
            while (window.contains(c)){
                window.remove(arr[l]);
                l += 1;
            }
            window.add(c);
            if (window.size() > maxLen) {maxLen = window.size();}
        }

        return maxLen;
    }
}