package com.hibernaut.leetcode;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] targetArray = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++ ) {
                if ((nums[i] + nums[j]) == target) {
                    targetArray[0] = i;
                    targetArray[1] = j;
                }
            }
        }

        return targetArray;
    }
}
