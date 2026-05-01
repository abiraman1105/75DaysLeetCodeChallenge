class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        
        while (l < r){
            while(l < r && !Character.isLetterOrDigit(arr[l])){ l += 1; }
            while(l < r && !Character.isLetterOrDigit(arr[r])){ r -= 1; }

            if(arr[l] != (arr[r])){ return false;}
            l += 1;
            r -= 1;
        }

        return true;
    }
}