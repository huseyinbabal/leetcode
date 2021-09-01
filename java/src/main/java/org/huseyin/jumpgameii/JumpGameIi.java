/*
    Source: https://leetcode.com/problems/jump-game-ii/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===


    Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

    Each element in the array represents your maximum jump length at that position.

    Your goal is to reach the last index in the minimum number of jumps.

    You can assume that you can always reach the last index.



    Example 1:

    Input: nums = [2,3,1,1,4]
    Output: 2
    Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
    Example 2:

    Input: nums = [2,3,0,1,4]
    Output: 2


    Constraints:

    1 <= nums.length <= 104
    0 <= nums[i] <= 1000
 */
package org.huseyin.jumpgameii;

public class JumpGameIi {

    public static void main(String[] args) {
        int jump = new JumpGameIi().jump(new int[]{2, 3, 1, 1, 4});
        System.out.println(jump);
    }

    /*
    This can be solved via sliding window technique
    1. Start from 0th index and create next window based on nearest and farthest boundries.
    2. Once you shift to next window, change starting pointers and do #1
     */
    public int jump(int[] nums) {
        int steps = 0;
        int left = 0, right = 0;

        while (right < nums.length - 1) {
            int farthest = 0;
            for (int i = left; i <= right; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            left = right + 1;
            right = farthest;
            steps++;
        }
        return steps;

    }

}
