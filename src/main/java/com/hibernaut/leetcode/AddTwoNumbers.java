package com.hibernaut.leetcode;


/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * Constraints:
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */


public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // res is head node of the resultant list
        ListNode res = null;
        ListNode prev = null;
        ListNode temp = null;
        int sum;
        int carry = 0;

        // while both lists exist
        while(l1 != null || l2 != null) {
            // Calculate value of next
            // digit in resultant list.
            // The next digit is sum
            // of following things
            // (i)  Carry
            // (ii) Next digit of first
            // list (if there is a next digit)
            // (ii) Next digit of second
            // list (if there is a next digit)
            sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

            // update carry for next calculation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            temp = new ListNode(sum);

            // if this is the first node then set
            // it as head of the resultant list
            if(res == null){
                res = temp;
            }

            // If this is not the first
            // node then connect it to the rest.
            else {
                prev.next = temp;
            }

            // Set prev for next insertion
            prev = temp;

            // Move first and second pointers
            // to next nodes
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(carry > 0) {
            temp.next = new ListNode(carry);
        }

        // return head of the resultant list
        return res;
    }
}
