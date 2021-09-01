/*
    Source: https://leetcode.com/problems/jump-game/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===


    You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

    Return true if you can reach the last index, or false otherwise.



    Example 1:

    Input: nums = [2,3,1,1,4]
    Output: true
    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
    Example 2:

    Input: nums = [3,2,1,0,4]
    Output: false
    Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


    Constraints:

    1 <= nums.length <= 104
    0 <= nums[i] <= 105

 */
package org.huseyin.jumpgame;

public class JumpGame {

    public static void main(String[] args) {
        boolean result = new JumpGame().canJump(new int[]{2, 3, 1, 1, 4});
        boolean result2 = new JumpGame().canJump(new int[]{3,2,1,0,4});
        System.out.println(result);
        System.out.println(result2);
    }

    /*
    Starting from destination, decrement index one by one and on each iteration check if jump can reach at \
    new destination. If success, update destination
     */
    public boolean canJump(int[] nums) {
        int destIndex = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= destIndex) {
                destIndex = i;
            }
        }
        return destIndex == 0;
    }

}
