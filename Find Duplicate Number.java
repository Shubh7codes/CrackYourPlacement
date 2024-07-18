class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int Hash[] = new int[n+1];
        for(int i = 0; i < n; i++){
            Hash[nums[i]]++;
        }
        for(int i = 0; i <= n; i++){
            if(Hash[i] > 1) return i;
        }
        return -1;
    }
}
