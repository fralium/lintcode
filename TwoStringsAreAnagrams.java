/* 158 Two Strings Are Anagrams

Write a method anagram(s,t) to decide if two strings are anagrams or not.

*/

public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        int is[]= new int[256];
        int it[]= new int[256];
        boolean judge = true;
        
        //System.out.println(ss.charAt(1)-'a');

        for (int i = 0; i <s.length() ; i++) {
            is[s.charAt(i)]++;
        }
        for (int i = 0; i <t.length() ; i++) {
            it[t.charAt(i)]++;

        }
        for (int i = 0; i <256 ; i++) {
            
            if (is[i] != it[i]) {
                judge = false;
                return judge;
             }


        }
        return judge;
}
}
