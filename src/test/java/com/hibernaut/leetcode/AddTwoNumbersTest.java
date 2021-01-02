package com.hibernaut.leetcode;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    @Test
    public void test1() {
        // First list
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(2, node2);

        // Second list
        ListNode node6 = new ListNode(4);
        ListNode node5 = new ListNode(6, node6);
        ListNode node4 = new ListNode(5, node5);


        // Summing list
        ListNode sumNode3 = new ListNode(8);
        ListNode sumNode2 = new ListNode(0, sumNode3);
        ListNode sumNode1 = new ListNode(7, sumNode2);

        // Initialize temporary variables
        ListNode temp1 = sumNode1;
        ListNode temp2 = AddTwoNumbers.addTwoNumbers(node1, node4);

        // Checking loop
        while(temp1 != null && temp2 != null) {
            assertEquals(temp1.val, temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
    }

    @Test
    public void test2() {
        // First list
        ListNode node2 = new ListNode(0);

        // Second list
        ListNode node1 = new ListNode(0);

        // Summing list
        ListNode sumNode1 = new ListNode(0);

        // Initialize temporary variables
        ListNode temp1 = sumNode1;
        ListNode temp2 = AddTwoNumbers.addTwoNumbers(node1, node2);

        // Checking loop
        while(temp1 != null && temp2 != null) {
            assertEquals(temp1.val, temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
    }

    @Test
    public void test3() {
        // First list
        ListNode node7 = new ListNode(9);
        ListNode node6 = new ListNode(9, node7);
        ListNode node5 = new ListNode(9, node6);
        ListNode node4 = new ListNode(9, node5);
        ListNode node3 = new ListNode(9, node4);
        ListNode node2 = new ListNode(9, node3);
        ListNode node1 = new ListNode(9, node2);

        // Second list
        ListNode node11 = new ListNode(9);
        ListNode node10 = new ListNode(9, node11);
        ListNode node9 = new ListNode(9, node10);
        ListNode node8 = new ListNode(9, node9);


        // Summing list
        ListNode sumNode8 = new ListNode(1);
        ListNode sumNode7 = new ListNode(0, sumNode8);
        ListNode sumNode6 = new ListNode(0, sumNode7);
        ListNode sumNode5 = new ListNode(0, sumNode6);
        ListNode sumNode4 = new ListNode(9, sumNode5);
        ListNode sumNode3 = new ListNode(9, sumNode4);
        ListNode sumNode2 = new ListNode(9, sumNode3);
        ListNode sumNode1 = new ListNode(8, sumNode2);


        // Initialize temporary variables
        ListNode temp1 = sumNode1;
        ListNode temp2 = AddTwoNumbers.addTwoNumbers(node1, node8);

        // Checking loop
        while(temp1 != null && temp2 != null) {
            assertEquals(temp1.val, temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
    }
}
