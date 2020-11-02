package com.hibernaut.leetcode;

import static org.junit.Assert.*;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test() {
        assertEquals(new int[]{2, 3}, TwoSum.twoSum(new int[]{1, 4, 2, 8}, 6));
    }
}