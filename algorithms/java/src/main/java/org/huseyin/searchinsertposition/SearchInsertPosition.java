/*
  Source: https://leetcode.com/problems/search-insert-position/
  Author: Huseyin BABAL
  GitHub Profile: https://github.com/huseyinbabal

  ===

  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

  You must write an algorithm with O(log n) runtime complexity.



  Example 1:

  Input: nums = [1,3,5,6], target = 5
  Output: 2
  Example 2:

  Input: nums = [1,3,5,6], target = 2
  Output: 1
  Example 3:

  Input: nums = [1,3,5,6], target = 7
  Output: 4
  Example 4:

  Input: nums = [1,3,5,6], target = 0
  Output: 0
  Example 5:

  Input: nums = [1], target = 0
  Output: 0


  Constraints:

  1 <= nums.length <= 104
  -104 <= nums[i] <= 104
  nums contains distinct values sorted in ascending order.
  -104 <= target <= 104
 */

package org.huseyin.searchinsertposition;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int result = new SearchInsertPosition().searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 8);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
        return doSearchInsert(nums, 0, nums.length - 1, target);
    }

    private int doSearchInsert(int[] nums, int firstIndex, int lastIndex, int target) {
        if (lastIndex >= firstIndex) {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            }

            if (nums[middleIndex] > target) {
                return doSearchInsert(nums, firstIndex, middleIndex - 1, target);
            }
            else {
                return doSearchInsert(nums, middleIndex + 1, lastIndex, target);
            }
        }
        return firstIndex;
    }

}
