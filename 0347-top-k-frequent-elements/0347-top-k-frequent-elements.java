class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] count = new List[nums.length + 1];
        for (int key: map.keySet()){
            if(count[map.get(key)] == null){
                count[map.get(key)] = new ArrayList<>();
            }
            count[map.get(key)].add(key);
        }
        int[] result = new int[k];
        int counter = 0;
        for(int i = nums.length; i >= 0 && counter < k; i--){
            if (count[i] != null ){
                for (int j : count[i]){
                    result[counter++] = j;
                    if (counter == k) { break; }
                }
            }
        }

        return result;

        }

    }