/*
28. Search a 2D Matrix

Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

*/



/*
Solution 1
*/

public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        
        if (matrix.length == 0){
            return false;
        }
        
        int i = 0; 
        int j = matrix[0].length - 1;
        int cur = 0;
        while (i < matrix.length && j >= 0){
            cur = matrix[i][j];
            if (cur == target){
                return true;
            } else if (cur < target){
                i++;
            } else {
                j--;
            }
        }
        
        return false;
    }
}
