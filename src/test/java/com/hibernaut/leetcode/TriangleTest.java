package com.hibernaut.leetcode;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void basicTests() {
        List<List<Integer>> triangleOne = new ArrayList<>();
        List<List<Integer>> triangleTwo = new ArrayList<>();
        List<List<Integer>> triangleThree = new ArrayList<>();
        List<List<Integer>> triangleFour = new ArrayList<>();

        int[][] arrayOne = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
        int[][] arrayTwo = {{-2}, {-58, 45}, {-12, -104, 89}, {104, 69, -45, -88}};
        int[][] arrayThree = {{-10}};
        int[][] arrayFour = {{-1}, {2, 3}, {1, -1, -3}};

        arrayFill(4, arrayOne, triangleOne);
        arrayFill(4, arrayTwo, triangleTwo);
        arrayFill(1, arrayThree, triangleThree);
        arrayFill(3, arrayFour, triangleFour);

        assertEquals(11, Triangle.minimumTotal(triangleOne));
        assertEquals(-209, Triangle.minimumTotal(triangleTwo));
        assertEquals(-10, Triangle.minimumTotal(triangleThree));
        assertEquals(-1, Triangle.minimumTotal(triangleFour));
    }

    private static void arrayFill(int size, int[][] initial, List<List<Integer>> target) {
        for (int i = 0; i < size; i++) {
            target.add(new ArrayList<>());

            for (int j = 0; j < (i + 1); j++) {
                target.get(i).add(initial[i][j]);
            }
        }
    }
}
