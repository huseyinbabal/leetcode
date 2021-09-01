/*
    Source: https://leetcode.com/problems/generate-parentheses/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===

    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.



    Example 1:

    Input: n = 3
    Output: ["((()))","(()())","(())()","()(())","()()()"]
    Example 2:

    Input: n = 1
    Output: ["()"]


    Constraints:

    1 <= n <= 8
 */
package org.huseyin.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> result = new GenerateParentheses().generateParenthesis(5);
        System.out.println(result);
    }

    public List<String> generateParenthesis(int n) {
        List<String> parenthesesCombinations = new ArrayList<>();
        doGenerateParentheses(parenthesesCombinations, "", n, 0, 0);
        return parenthesesCombinations;
    }

    private void doGenerateParentheses(List<String> parenthesesCombinations, String parentheses, int n, int openedCount, int closedCount) {
        if (parentheses.length() == n * 2) {
            parenthesesCombinations.add(parentheses);
            return;
        }

        if (openedCount < n) {
            doGenerateParentheses(parenthesesCombinations, parentheses + "(", n, openedCount + 1, closedCount);
        }

        if (closedCount < openedCount) {
            doGenerateParentheses(parenthesesCombinations, parentheses + ")", n, openedCount, closedCount + 1);
        }
    }
}
