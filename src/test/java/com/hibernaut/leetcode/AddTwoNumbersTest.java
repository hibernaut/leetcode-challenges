package com.hibernaut.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    @Test
    public void test() {
        assertEquals(new ListNode(9), AddTwoNumbers.addTwoNumbers(new ListNode(4), new ListNode(5)));
    }

}