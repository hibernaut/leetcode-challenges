package com.hibernaut.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {
    @Test
    public void shouldCompareEvenList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        ListNode testNode1 = new ListNode(1);
        ListNode testNode2 = new ListNode(2);
        ListNode testNode3 = new ListNode(3);
        ListNode testNode4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        testNode2.next = testNode1;
        testNode1.next = testNode4;
        testNode4.next = testNode3;

        ListNode resultList = SwapNodesInPairs.swapPairs(node1);
        ListNode testList = testNode2;

        assertEquals(resultList.val, testList.val);

        while (resultList.next != null) {
            assertEquals(resultList.val, testList.val);
            resultList = resultList.next;
            testList = testList.next;
        }
    }

    @Test
    public void shouldCompareOddList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        ListNode testNode1 = new ListNode(1);
        ListNode testNode2 = new ListNode(2);
        ListNode testNode3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        testNode2.next = testNode1;
        testNode1.next = testNode3;

        ListNode resultList = SwapNodesInPairs.swapPairs(node1);
        ListNode testList = testNode2;

        assertEquals(resultList.val, testList.val);

        while (resultList.next != null) {
            assertEquals(resultList.val, testList.val);
            resultList = resultList.next;
            testList = testList.next;
        }
    }

    @Test
    public void shouldCompareSingleElementList() {
        ListNode node1 = new ListNode(1);

        ListNode testNode1 = new ListNode(1);

        ListNode resultList = SwapNodesInPairs.swapPairs(node1);
        ListNode testList = testNode1;

        assertEquals(resultList.val, testList.val);
    }

    @Test
    public void shouldCompareEmptyList() {
        ListNode node1 = null;
        ListNode resultList = SwapNodesInPairs.swapPairs(node1);

        assertEquals(resultList, null);
    }
}
