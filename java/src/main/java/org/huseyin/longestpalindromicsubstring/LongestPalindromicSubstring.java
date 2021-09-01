/*
    Source: https://leetcode.com/problems/longest-palindromic-substring/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===

    Given a string s, return the longest palindromic substring in s.



    Example 1:

    Input: s = "babad"
    Output: "bab"
    Note: "aba" is also a valid answer.
    Example 2:

    Input: s = "cbbd"
    Output: "bb"
    Example 3:

    Input: s = "a"
    Output: "a"
    Example 4:

    Input: s = "ac"
    Output: "a"


    Constraints:

    1 <= s.length <= 1000
    s consist of only digits and English letters.
 */
package org.huseyin.longestpalindromicsubstring;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String result = new LongestPalindromicSubstring().longestPalindrome("babad1237321");
        System.out.println(result);
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        char[] chrs = s.toCharArray();
        String longestPalindrome = "";
        String longestWord = "";
        for (int i = 0; i < chrs.length; i++) {
            String oddSizedPalindrome = palindrome(s, chrs, i, i);
            String evenSizedPalindrome = palindrome(s, chrs, i, i + 1);
            longestWord = oddSizedPalindrome.length() > evenSizedPalindrome.length()? oddSizedPalindrome: evenSizedPalindrome;
            if (longestWord.length() > longestPalindrome.length()) {
                longestPalindrome = longestWord;
            }
        }
        return longestPalindrome;
    }

    private String palindrome(String s, char[] chars, int startIndex, int endIndex) {
        while (startIndex >= 0 && endIndex < chars.length && chars[startIndex] == chars[endIndex]) {
            startIndex--;
            endIndex++;
        }
        return s.substring(startIndex + 1, endIndex);
    }
}
