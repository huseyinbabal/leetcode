/*
  Source: https://leetcode.com/problems/first-bad-version/
  Author: Huseyin BABAL
  GitHub Profile: https://github.com/huseyinbabal

  ===

  You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

  Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

  You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.



  Example 1:

  Input: n = 5, bad = 4
  Output: 4
  Explanation:
  call isBadVersion(3) -> false
  call isBadVersion(5) -> true
  call isBadVersion(4) -> true
  Then 4 is the first bad version.
  Example 2:

  Input: n = 1, bad = 1
  Output: 1


  Constraints:

  1 <= bad <= n <= 231 - 1
 */

package org.huseyin.firstbadversion;

public class FirstBadVersion extends VersionControl {

    public static void main(String[] args) {
        int result = new FirstBadVersion().firstBadVersion(Double.valueOf(Math.pow(2, 31) - 1).intValue());
        System.out.println(result);
    }

    public int firstBadVersion(int n) {
        int firstVersion = 1;
        int lastVersion = n;
        int firstBadVersion = -1; // There is no bad version yet
         while (firstVersion <= lastVersion) {
             int middleVersion = firstVersion + (lastVersion - firstVersion) / 2;
             boolean isMiddleVersionBad = isBadVersion(middleVersion);
             if (isMiddleVersionBad) { // if it is bad, then we need to go down unitl to find true
                 lastVersion = middleVersion - 1;
                 firstBadVersion = middleVersion;
             } else { // if it is not bad, then we need to go up until bad version
                 firstVersion = middleVersion + 1;
             }
         }
         return firstBadVersion;
    }
}

/**
 * This class is just an example to simulate LeetCode's hidden VersionControl class
 */
class VersionControl {

    public boolean isBadVersion(int n) {
        return n > Double.valueOf(Math.pow(2, 30)).intValue();
    }
}
