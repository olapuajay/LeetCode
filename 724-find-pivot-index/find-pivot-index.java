class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        for(int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;

        for(int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

        // int[] psum = new int[nums.length];
        // psum[0] = nums[0];
        // for(int i = 1; i < nums.length; i++) {
        //     psum[i] = psum[i-1] + nums[i];
        // }

        // int[] suf = new int[nums.length];
        // suf[nums.length - 1] = nums[nums.length - 1];
        // for(int i = nums.length - 2; i >= 0; i--) {
        //     suf[i] = suf[i+1] + nums[i];
        // }
        
        // for(int i = 0; i < nums.length; i++) {
        //     if(psum[i] == suf[i]) return i;
        // }
        // return -1;
    }
}