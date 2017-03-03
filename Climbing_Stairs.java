/*
111. Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

/*
Solution 1
*/

public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
       if (n == 0 || n == 1) { return 1; }
        int[] f = new int[n + 1];
        
        f[0] = 1;
        f[1] = 1;
        
        for (int i = 2; i <= n; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        
        return f[n];
                
    }
}
