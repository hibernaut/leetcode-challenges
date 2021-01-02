package com.hibernaut.leetcode;


/**
 * Merge two sorted linked lists and return it as a new sorted list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * Example 1:
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * <p>
 * Example 2:
 * Input: l1 = [], l2 = []
 * Output: []
 * <p>
 * Example 3:
 * Input: l1 = [], l2 = [0]
 * Output: [0]
 * <p>
 * Constraints:
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both l1 and l2 are sorted in non-decreasing order.
 */

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // "res" is head node of the resultant list
        ListNode res = null;
        ListNode prev = null;
        ListNode temp;

        // While both or one of lists exist
        while (l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                if(l1.val <= l2.val) {
                    // If both lists exist and first node non greater then second
                    // update temporary value and change pointer to the next node in the first list
                    temp = l1;
                    l1 = l1.next;
                }

                // Or if second node is greater then first
                // update temporary value and change pointer to the next node in the second list
                else {
                    temp = l2;
                    l2 = l2.next;
                }
            }

            // If at least the first node exists
            // update temporary value and change pointer to the next node in the first list
            else if(l1 != null) {
                temp = l1;
                l1 = l1.next;
            }

            // If at least the second node exists
            // update temporary value and change pointer to the next node in the second list
            else {
                temp = l2;
                l2 = l2.next;
            }

            // If this is the first node then set it as head of the resultant list
            if(res == null) {
                res = temp;
            }

            // If this is not the first node then connect it to the rest.
            else {
                prev.next = temp;
            }

            // Set prev for next insertion
            prev = temp;
        }

        // Return head of the resultant list
        return res;
    }
}
