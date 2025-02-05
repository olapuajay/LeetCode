class Solution {
    public int fib(int n) {
        int res = fibonacci(n);
        return res;
    }
    public int fibonacci(int n) {
        if(n < 2) return n;
        int ans = fibonacci(n - 1) + fibonacci(n - 2);
        return ans;
    }
}