/*
2. Trailing Zeros

Write an algorithm which computes the number of trailing zeros in n factorial.

*/


class Solution {
    /*
     * param n: As desciption
     * return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here
        long num = 0;
        for (int i = 1; Math.pow(5, i) <= n; i++){
            num = num + n / (long) Math.pow(5, i);
        }
        return num;
    }
};
