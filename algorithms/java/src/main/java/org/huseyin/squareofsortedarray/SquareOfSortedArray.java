/*
  Source: https://leetcode.com/problems/squares-of-a-sorted-array/
  Author: Huseyin BABAL
  GitHub Profile: https://github.com/huseyinbabal

  ===

  Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



  Example 1:

  Input: nums = [-4,-1,0,3,10]
  Output: [0,1,9,16,100]
  Explanation: After squaring, the array becomes [16,1,0,9,100].
  After sorting, it becomes [0,1,9,16,100].
  Example 2:

  Input: nums = [-7,-3,2,3,11]
  Output: [4,9,9,49,121]


  Constraints:

  1 <= nums.length <= 104
  -104 <= nums[i] <= 104
  nums is sorted in non-decreasing order.


  Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
package org.huseyin.squareofsortedarray;

import java.util.Arrays;

public class SquareOfSortedArray {

    public static void main(String[] args) {
        int[] result = new SquareOfSortedArray().sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(Arrays.toString(result));
    }

    public int[] sortedSquares(int[] nums) {
        /*
        Even though nums is sorted, the absolute value in lower
        index may be greater than the absolute value in higher index.
        For this reason, we use 2 pointers to track which part is used
        to have a sorted index. Example; [-7, 5], since |-7| > 5, then
        last element of squares should be pow(-7, 2)
         */
        int lowIndex = 0, highIndex = nums.length - 1;
        int currentIndex = nums.length - 1;
        int[] squares = new int[nums.length];
        for (int i = 0; i< nums.length; i++) {
            if (Math.abs(nums[lowIndex]) >= Math.abs(nums[highIndex])) {
                squares[currentIndex] = nums[lowIndex] * nums[lowIndex];
                lowIndex++;
            } else {
                squares[currentIndex] = nums[highIndex] * nums[highIndex];
                highIndex--;
            }
            currentIndex--;
        }
        return squares;
    }

}
