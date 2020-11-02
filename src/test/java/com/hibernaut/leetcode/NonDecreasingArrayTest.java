package com.hibernaut.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonDecreasingArrayTest {
    @Test
    public void test() {
        assertEquals(true, NonDecreasingArray.checkPossibility(new int[]{1}));
        assertEquals(true, NonDecreasingArray.checkPossibility(new int[]{4, 2, 1}));
        assertEquals(true, NonDecreasingArray.checkPossibility(new int[]{2, 3, 3, 2, 4}));
        assertEquals(true, NonDecreasingArray.checkPossibility(new int[]{3, 4, 2, 3}));
        assertEquals(true, NonDecreasingArray.checkPossibility(new int[]{4, 2, 3}));
        assertEquals(true, NonDecreasingArray.checkPossibility(new int[]{-1, 4, 2, 3}));
        assertEquals(true, NonDecreasingArray.checkPossibility(new int[]{3, 3, 2, 2}));
        assertEquals(true, NonDecreasingArray.checkPossibility(new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1}));
    }
}