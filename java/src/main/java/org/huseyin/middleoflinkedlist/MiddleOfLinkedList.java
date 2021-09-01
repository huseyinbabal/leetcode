/*
Source: https://leetcode.com/problems/middle-of-the-linked-list/
Author: Huseyin BABAL
GitHub Profile: https://github.com/huseyinbabal

===

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.



Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
 */
package org.huseyin.middleoflinkedlist;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,
            new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = new MiddleOfLinkedList().middleNode(listNode);
        System.out.println(result);
    }

    /*
    Assume that 2 cars are racing. Car 1 goes 50km/hr and Car 2 goes 100km/hr.
    From Point A to Point B, whenever Car 2 reches to destination, also stop Car 1.
    And this will be the middle of LinkedList
     */
    public ListNode middleNode(ListNode head) {
        ListNode pointer = head;
        ListNode twoTimesFasterPointer = head;

        while (twoTimesFasterPointer.next != null) {
            pointer = pointer.next;
            if (twoTimesFasterPointer.next.next != null) {
                twoTimesFasterPointer = twoTimesFasterPointer.next.next;
            } else {
                twoTimesFasterPointer = twoTimesFasterPointer.next;
            }
        }
        return pointer;
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
