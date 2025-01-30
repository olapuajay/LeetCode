class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int leftProd = 1, rightProd = 1;
        for(int i = 0; i < nums.length; i++) {
            leftProd = leftProd == 0 ? 1 : leftProd;
            rightProd = rightProd == 0 ? 1 : rightProd;

            leftProd *= nums[i];
            rightProd *= nums[nums.length - 1 - i];

            max = Math.max(max, Math.max(leftProd, rightProd));
        }
        return max;
    }
}