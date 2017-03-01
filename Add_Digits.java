/*
569. Add Digits

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

*/

/*
Solution 1. Using loop
*/

public class Solution {
    /**
     * @param num a non-negative integer
     * @return one digit
     */
    public int addDigits(int num) {
        // Write your code here
        int sum = getNext(num);
        while (sum >= 10){
            sum = getNext(sum);
        }
        return sum;
    }
    
    
    public int getNext(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
