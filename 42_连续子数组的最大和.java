class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
        }
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if (res < dp[i]) {
                res = dp[i];
            }
        }
        return res;
    }
}
