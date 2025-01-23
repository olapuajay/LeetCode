class Solution {
    public int reverse(int x) {
        long reverse_num = 0;
        if(x == 0) {
            return 0;
        }
        while(x != 0) {
            int remainder = x % 10;
            reverse_num = reverse_num * 10 + remainder;
            x /= 10;
        }
        if(reverse_num > Integer.MAX_VALUE || reverse_num < Integer.MIN_VALUE) return 0;
        // if(reverse_num < 0) {
        //     return 0;
        // }
        return (int)reverse_num;
    }
}