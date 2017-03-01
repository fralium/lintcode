/*

488. Happy Number

Write an algorithm to determine if a number is happy.

A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. 

Those numbers for which this process ends in 1 are happy numbers.

*/


/*
Solution 1: Using LinkedList.
*/
public class Solution {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // Write your code here
        int temp = n;
        LinkedList<Integer> evalist = new LinkedList<Integer>();
        evalist.add(temp);
        while (true) {
            temp = getNext(temp);
            if (temp == 1) {
                return true;
            } else if (evalist.contains(temp)) {
                return false;
            }
            evalist.add(temp);
        }
    }  
    
    int getNext(int num) {
    
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10) * (num % 10);
            num = num / 10;
        }
            
        return sum;
    }
    
}
