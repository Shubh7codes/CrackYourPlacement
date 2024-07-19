class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairID = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(pairID.containsKey(target-num)){
                return new int[] { i, pairID.get(target - num)};
            }
            pairID.put(num, i);
        }
        return new int[] {}; 
    }
}
