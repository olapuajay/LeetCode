class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int res = 0;
        while(start < end) {
            if(height[start] >= height[end]) {
                int currRes = (height[end])*(end - start);
                if(currRes > res)
                    res = currRes;
                end--;
            } else {
                int currRes = (height[start])*(end - start);
                if(currRes > res)
                    res = currRes;
                start++;
            }
        }
        return res;
    }
}