/*

365. Count 1 in Binary

Count how many 1 in binary representation of a 32-bit integer.

*/



/*
Solution 1 
*/

public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        int count = 0;
        
        String bs = Integer.toBinaryString(num);
        for (int i = 0; i < bs.length(); i++){
            char c = bs.charAt(i);
            if ( c  == '1'){
                count++;
            }
        }
        return count;
    }
};
