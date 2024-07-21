class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        int sum = 0;
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum = (sum + nums[i])%k;
            
            if(sum<0) sum += k;

            count += mp.getOrDefault(sum, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
