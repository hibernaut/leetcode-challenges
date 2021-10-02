package com.hibernaut.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class ThreeSumTest {

    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        int[] inputNumbers = {-1, 0, 1, 2, -1, -4};
        result.add(new ArrayList<>(Arrays.asList(-1, -1, 2)));
        result.add(new ArrayList<>(Arrays.asList(-1, 0, 1)));

        assertEquals(result, ThreeSum.threeSum(inputNumbers));
    }

    @Test
    public void test2() {
        List<List<Integer>> result = new ArrayList<>();
        int[] inputNumbers = {};

        assertEquals(result, ThreeSum.threeSum(inputNumbers));
    }

    @Test
    public void test3() {
        List<List<Integer>> result = new ArrayList<>();
        int[] inputNumbers = {0};

        assertEquals(result, ThreeSum.threeSum(inputNumbers));
    }

    @Test
    public void test4() {
        List<List<Integer>> result = new ArrayList<>();
        int[] inputNumbers = {-2, 0, 1, 1, 2};
        result.add(new ArrayList<>(Arrays.asList(-2, 0, 2)));
        result.add(new ArrayList<>(Arrays.asList(-2, 1, 1)));

        assertEquals(result, ThreeSum.threeSum(inputNumbers));
    }

    @Test
    public void test5() {
        List<List<Integer>> result = new ArrayList<>();
        int[] inputNumbers = {0, 0, 0, 0};
        result.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        assertEquals(result, ThreeSum.threeSum(inputNumbers));
    }

    @Test
    public void test6() {
        List<List<Integer>> result = new ArrayList<>();
        int[] inputNumbers = {0, 0};

        assertEquals(result, ThreeSum.threeSum(inputNumbers));
    }

    @Test
    public void test7() {
        List<List<Integer>> result = new ArrayList<>();
        int[] inputNumbers = {-1, 0, 1, 0};
        result.add(new ArrayList<>(Arrays.asList(-1, 0, 1)));

        assertEquals(result, ThreeSum.threeSum(inputNumbers));
    }
}
