class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if (numsMap.containsKey(need)){
                return new int[] {numsMap.get(need),i};
            }
            numsMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}