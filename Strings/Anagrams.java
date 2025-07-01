// package Problems;

import java.util.Arrays;

public class Anagrams {


     public static boolean areAnagramNaive(String s1, String s2) {
       
        if (s1.length() != s2.length()) {
            return false;
        }
       
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);
       
        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String (a2);
       
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        String s1 = "abaac";
        String s2 = "aacba";

        System.out.println(areAnagramNaive(s1, s2));
    }
}

  
//     Input: s1 = "listen"
// s2 = "silent"
// Output: Yes
// Explanation: Both the string have same characters with same frequency. So, they are anagrams.

// Input: s1 = "aab"
// s2 = "bab"
// Output: No
// Explanation: Characters in both the strings are not same, so they are not anagrams.

    

