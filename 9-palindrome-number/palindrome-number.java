class Solution {
    public boolean isPalindrome(int x) {
        int reverse_number = 0, temp;
        temp = x;
        while(x > 0) {
            int remainder = x % 10;
            reverse_number = reverse_number * 10 + remainder;
            x /= 10;
        }
        if(temp == reverse_number) {
            return true;
        }
        return false;
    }
}