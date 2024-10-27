class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n - 1;
        for(int i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        if (goal == 0) return true;
        return false;
    }
}