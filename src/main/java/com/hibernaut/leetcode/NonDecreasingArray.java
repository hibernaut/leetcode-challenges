package com.hibernaut.leetcode;

/**
 * Given an array with n integers, your task is to check
 * if it could become non-decreasing by modifying at most 1 element.
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 */

public class NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        int countChanges = 0;
        boolean isNonDecreasing = true;

        if (nums.length > 1 && nums[0] > nums[1]) {
            nums[0] = nums[1];
            countChanges += 1;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i + 1]) {
                if (nums[i] < nums[i - 1]) {
                    nums[i] = nums[i - 1];
                    countChanges += 1;
                } else if (nums[i] > nums[i + 1]) {
                    nums[i] = nums[i - 1];
                    countChanges += 1;
                }
            } else if (nums[i - 1] > nums[i + 1]) {
                if (nums[i] <= nums[i + 1]) {
                    nums[i] = nums[i - 1];
                    countChanges += 1;
                } else if (nums[i] >= nums[i - 1]) {
                    nums[i + 1] = nums[i];
                    countChanges += 1;
                }
            } else {
                if (nums[i] > nums[i - 1]) {
                    nums[i] = nums[i - 1];
                    countChanges += 1;
                } else if (nums[i] < nums[i - 1]) {
                    nums[i] = nums[i - 1];
                    countChanges += 1;
                }
            }
        }

        if (nums.length > 1 && nums[nums.length - 1] < nums[nums.length - 2]) {
            countChanges += 1;
        }

        if (countChanges > 1) {
            isNonDecreasing = false;
        }

        return isNonDecreasing;
    }
}
