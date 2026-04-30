class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) { return false; }
        Map<Character,Integer> countOfS = new HashMap<>();
        Map<Character,Integer> countOfT = new HashMap<>();

        for (char c: s.toCharArray()){
            countOfS.put(c,countOfS.getOrDefault(c,0) + 1);
        }
        for (char c: t.toCharArray()){
            countOfT.put(c,countOfT.getOrDefault(c,0) + 1);
        }

        for (char key : countOfS.keySet()){
            if (!countOfT.containsKey(key)) { return false; }
            if  (!countOfS.get(key).equals(countOfT.get(key))) { return false; }
        }
        return true;
        
    }
}