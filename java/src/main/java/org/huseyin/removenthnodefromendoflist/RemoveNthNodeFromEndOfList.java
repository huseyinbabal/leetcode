/*
    Source: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    Author: Huseyin BABAL
    GitHub Profile: https://github.com/huseyinbabal

    ===

    Given the head of a linked list, remove the nth node from the end of the list and return its head.



    Example 1:


    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]
    Example 2:

    Input: head = [1], n = 1
    Output: []
    Example 3:

    Input: head = [1,2], n = 1
    Output: [1]


    Constraints:

    The number of nodes in the list is sz.
    1 <= sz <= 30
    0 <= Node.val <= 100
    1 <= n <= sz
 */
package org.huseyin.removenthnodefromendoflist;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,
            new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = new RemoveNthNodeFromEndOfList().removeNthFromEnd(listNode, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    /*
    Assume that Car 1 and Car 2 are trying to reach a destination. Car 2 is always ahead of Car 1 for n node.
    Whenever Car 2 reaches to destination, we need to stop Car 1 and just skip that node and reference to next one
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer = head;
        ListNode nPlusBiggerPointer = head;

        for (int i = 0; i < n; i++) {
            nPlusBiggerPointer = nPlusBiggerPointer.next;
        }

        if (nPlusBiggerPointer == null) return pointer.next;

        while (nPlusBiggerPointer.next != null) {
            pointer = pointer.next;
            nPlusBiggerPointer = nPlusBiggerPointer.next;
        }
        pointer.next = pointer.next.next;
        return head;
    }
}

class ListNode {

    int val;

    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
