package com.hibernaut.leetcode;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets
 * [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = []
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [0]
 * Output: []
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> tripletsSet = new LinkedHashSet<>();
        int l, r;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            l = i + 1;
            r = nums.length - 1;

            while (l < r) {

                if (nums[i] + nums[l] + nums[r] == 0) {
                    tripletsSet.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return new ArrayList<>(tripletsSet);
    }
}
