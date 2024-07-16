class Solution {
    public int minMoves2(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        int mid = n/2;
        for(int i = 0; i < n; i++){
            count += (Math.abs(nums[i]-nums[mid]));
        }
        return count;
    }
}
