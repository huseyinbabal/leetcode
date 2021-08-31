/*
    Source: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===

    Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

    Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

    The tests are generated such that there is exactly one solution. You may not use the same element twice.



    Example 1:

    Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
    Example 2:

    Input: numbers = [2,3,4], target = 6
    Output: [1,3]
    Example 3:

    Input: numbers = [-1,0], target = -1
    Output: [1,2]


    Constraints:

    2 <= numbers.length <= 3 * 104
    -1000 <= numbers[i] <= 1000
    numbers is sorted in non-decreasing order.
    -1000 <= target <= 1000
    The tests are generated such that there is exactly one solution.
 */
package org.huseyin.twosumiiinputarraysorted;

import java.util.Arrays;

public class TwoSumIIInputArraySorted {

    public static void main(String[] args) {
        int[] result = new TwoSumIIInputArraySorted().twoSum(new int[]{-1, 0}, -1);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] numbers, int target) {
        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        int[] pairs = new int[2];
        // Check low and high index one by one and increment or decrement based on target comparison
        while(lowIndex < highIndex) {
            int localSum = numbers[lowIndex] + numbers[highIndex];
            if (localSum == target){
                pairs = new int[]{lowIndex + 1, highIndex + 1};
                break;
            } else if (localSum > target) {
                highIndex--;
            } else {
                lowIndex++;
            }
        }
        return pairs;
    }
}
