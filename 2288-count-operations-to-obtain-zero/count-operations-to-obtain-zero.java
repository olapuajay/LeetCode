class Solution {
    public int countOperations(int num1, int num2) {
        return helper(num1, num2, 0);
    }
    private int helper(int num1, int num2, int oper) {
        if(num1 == 0 || num2 == 0) return oper;

        if(num1 >= num2) {
            return helper(num1 - num2, num2, oper + 1);
        } else {
            return helper(num1, num2 - num1, oper + 1);
        }
    }
    // public int countOperations(int num1, int num2) {
    //     int oper = 0;
    //     while(num1 > 0 && num2 > 0) {
    //         if(num1 >= num2) {
    //             num1 = num1 - num2;
    //         } else {
    //             num2 = num2 - num1;
    //         }
    //         oper++;
    //     }
    //     return oper;
    // }
}