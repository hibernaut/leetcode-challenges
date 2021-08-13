package com.hibernaut.leetcode;

import java.util.List;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 * <p>
 * Example 2:
 * Input: head = []
 * Output: []
 * <p>
 * Example 3:
 * Input: head = [1]
 * Output: [1]
 * <p>
 * Constraints:
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 * Follow up: Can you solve the problem without modifying the values in the list's nodes?
 * (i.e., Only nodes themselves may be changed.)
 */

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode res = null;
        ListNode prev = null;

        while (temp != null && temp.next != null) {

            if (res == null) {
                res = temp.next;
                temp.next = res.next;
                res.next = temp;
            } else {
                prev.next = temp.next;
                prev = temp.next;
                temp.next = prev.next;
                prev.next = temp;
            }

            prev = temp;
            temp = temp.next;
        }

        if (res == null) {
            return temp;
        }

        return res;
    }
}
