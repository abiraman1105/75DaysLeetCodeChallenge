class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                int index = c - 'a';
                count[index] += 1;
            }
            String key = Arrays.toString(count);
            if (!map.containsKey(key)) { map.put(key,new ArrayList<>()); }
            map.get(key).add(s);
        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> v : map.values()){
            res.add(v);
        }
        return res;
    }
}