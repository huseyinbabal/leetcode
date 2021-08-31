/*
    Source: https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===

    Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



    Example 1:

    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"
    Example 2:

    Input: s = "God Ding"
    Output: "doG gniD"


    Constraints:

    1 <= s.length <= 5 * 104
    s contains printable ASCII characters.
    s does not contain any leading or trailing spaces.
    There is at least one word in s.
    All the words in s are separated by a single space.
 */
package org.huseyin.reversewordsinstringiii;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInStringIii {

    public static void main(String[] args) {
        String s = new ReverseWordsInStringIii().reverseWords("Hello World");
        System.out.println(s);
    }

    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
            .map(wordChars -> new StringBuilder(wordChars).reverse())
            .collect(Collectors.joining(" "));
    }

}
