package com.hibernaut.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {
    @Test
    public void test1() {
        // Create first list
        ListNode node3 = new ListNode(4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        // Create second list
        ListNode node6 = new ListNode(4);
        ListNode node5 = new ListNode(3, node6);
        ListNode node4 = new ListNode(1, node5);

        // Create summing list
        ListNode sumNode6 = new ListNode(4);
        ListNode sumNode5 = new ListNode(4, sumNode6);
        ListNode sumNode4 = new ListNode(3, sumNode5);
        ListNode sumNode3 = new ListNode(2, sumNode4);
        ListNode sumNode2 = new ListNode(1, sumNode3);
        ListNode sumNode1 = new ListNode(1, sumNode2);

        //Call main test code
        mainTest(node1, node4, sumNode1);
    }

    @Test
    public void test2() {
        // Create first list
        ListNode node1 = null;

        // Create second list
        ListNode node2 = null;

        // Create summing list
        ListNode sumNode1 = null;

        //Call main test code
        mainTest(node1, node2, sumNode1);
    }

    @Test
    public void test3() {
// Create first list
        ListNode node1 = null;

        // Create second list
        ListNode node2 = new ListNode();

        // Create summing list
        ListNode sumNode1 = new ListNode();

        //Call main test code
        mainTest(node1, node2, sumNode1);
    }

    public static void mainTest(ListNode firstListNode, ListNode secondListNode, ListNode sumNode) {
        // Initialize temporary variables
        ListNode temp1 = sumNode;
        ListNode temp2 = MergeTwoSortedLists.mergeTwoLists(firstListNode, secondListNode);

        // Checking loop
        while (temp1 != null && temp2 != null) {
            assertEquals(temp1.val, temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
    }
}
