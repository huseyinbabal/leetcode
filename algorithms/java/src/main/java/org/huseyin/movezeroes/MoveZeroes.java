/*
    Source: https://leetcode.com/problems/move-zeroes/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===

    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.



    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:

    Input: nums = [0]
    Output: [0]


    Constraints:

    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1


    Follow up: Could you minimize the total number of operations done?
 */
package org.huseyin.movezeroes;

public class MoveZeroes {

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12, 4, 0});
    }

    public void moveZeroes(int[] nums) {
        int nonZeroCountIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroCountIndex] = nums[i];
                nonZeroCountIndex++;
            }
        }
        for (int j = nonZeroCountIndex; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

}
