package com.hibernaut.leetcode;

import java.util.List;

/**
 * Given a triangle array, return the minimum path sum from top to bottom.
 *
 * For each step, you may move to an adjacent number of the row below.
 * More formally, if you are on index i on the current row,
 * you may move to either index i or index i + 1 on the next row.
 *
 * Example 1:
 *
 * Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * Output: 11
 * Explanation: The triangle looks like:
 *    2
 *   3 4
 *  6 5 7
 * 4 1 8 3
 * The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
 *
 * Example 2:
 *
 * Input: triangle = [[-10]]
 * Output: -10
 *
 * Constraints:
 *
 *     1 <= triangle.length <= 200
 *     triangle[0].length == 1
 *     triangle[i].length == triangle[i - 1].length + 1
 *     -104 <= triangle[i][j] <= 104
 *
 *
 * Follow up: Could you do this using only O(n) extra space,
 * where n is the total number of rows in the triangle?
 */

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        /*
        Recursive approach:

        if (i == (triangle.size() - 1)) {
            return triangle.get(i).get(j);
        }

        return  triangle.get(i).get(j) + Math.min(minimumTotal(triangle, i + 1, j),
                minimumTotal(triangle, i + 1, j + 1));*/

        //Dynamic programming approach:

        int[][] sumArray = new int[triangle.size()][];
        sumArray[triangle.size() - 1] = new int[triangle.size()];

        for (int i = 0; i < sumArray.length; i++) {
            sumArray[triangle.size() - 1][i] = triangle.get(triangle.size() - 1).get(i);
        }

        for (int j = 0; j < sumArray.length - 1; j++) {
            sumArray[j] = new int[triangle.get(j).size()];
        }

        for (int k = sumArray.length - 2; k >= 0; k--) {
            for (int y = 0; y < sumArray[k].length; y++) {
                sumArray[k][y] = triangle.get(k).get(y) + Math.min(sumArray[k + 1][y], sumArray[k + 1][y + 1]);
            }
        }

        return sumArray[0][0];
    }
}
