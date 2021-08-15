package com.hibernaut.leetcode;

import java.util.Arrays;

/**
 * Given a list of non-negative integers nums, arrange them such that they form the largest number.
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * <p>
 * Example 1:
 * Input: nums = [10,2]
 * Output: "210"
 * <p>
 * Example 2:
 * Input: nums = [3,30,34,5,9]
 * Output: "9534330"
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: "1"
 * <p>
 * Example 4:
 * Input: nums = [10]
 * Output: "10"
 * <p>
 * Constraints:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 10/\9
 */

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        String result = "";
        String[] firstTestString;
        String[] secondTestString;
        int firstTestStringDigit;
        int secondTestStringDigit;
        int temp;

        //If there is one element in array, returns it.
        // If there are all zeros in array, returns zero.
        if (nums.length < 2) {
            return nums[0] + "";
        } else if (Arrays.stream(nums).sum() == 0) {
            return "0";
        }

        //Compares two combinations of a pair of adjacent numbers,
        // and changes the position of these numbers
        // so that the combination is the largest number.
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                firstTestString = (nums[j] + Integer.toString(nums[j + 1])).split("");
                secondTestString = (nums[j + 1] + Integer.toString(nums[j])).split("");

                for (int k = 0; k < firstTestString.length; k++) {
                    firstTestStringDigit = Integer.parseInt(firstTestString[k]);
                    secondTestStringDigit = Integer.parseInt(secondTestString[k]);

                    if (firstTestStringDigit > secondTestStringDigit) {
                        break;
                    } else if (secondTestStringDigit > firstTestStringDigit) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        break;
                    }
                }
            }
        }

        // Creates resultant string
        for (int number : nums) {
            result += number;
        }

        return result;
    }
}
