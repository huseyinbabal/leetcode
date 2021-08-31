/*
    Source: https://leetcode.com/problems/reverse-string/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===

    Write a function that reverses a string. The input string is given as an array of characters s.



    Example 1:

    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
    Example 2:

    Input: s = ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]


    Constraints:

    1 <= s.length <= 105
    s[i] is a printable ascii character.


    Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
package org.huseyin.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        char[] str = new char[]{'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(str);
        System.out.println(str);
    }

    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;

        while (low <= high) {
            char tmp = s[high];
            s[high] = s[low];
            s[low] = tmp;
            low++;
            high--;
        }
    }

}
