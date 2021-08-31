/*
    Source: https://leetcode.com/problems/rotate-array/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===

    Given an array, rotate the array to the right by k steps, where k is non-negative.



    Example 1:

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:

    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]


    Constraints:

    1 <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1
    0 <= k <= 105


    Follow up:

    Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
    Could you do it in-place with O(1) extra space?
 */
package org.huseyin.rotatearray;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        new RotateArray().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int rotateCount = k % nums.length;
        if (rotateCount == 0) {
            return;
        }
        // [array] := [subarray1..., subarray2...] e.g. [2,3,6,4,9,12] and if k = 3
        // flip(subarray2) => [2,3,6,12,9,4] which means subarray [4,9,12] is flipped
        flip(nums, nums.length - rotateCount, nums.length - 1);
        // flip(subarray1) => [6,3,2,12,9,4] which means subarray [2,3,6] is flipped
        flip(nums, 0, nums.length - rotateCount - 1);
        // flip([subarray1..., subarray2...]) => [4,9,12,2,3,6] which means [6,3,2,12,9,4] is flipped
        flip(nums, 0, nums.length - 1);
    }

    private void flip(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++,j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
