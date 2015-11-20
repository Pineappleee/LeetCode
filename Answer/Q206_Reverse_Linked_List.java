/*
Q206 Reverse Linked List
Reverse a singly linked list
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode n1 = head;
        ListNode n2 = head.next;
        head.next = null;
        while (n1 != null && n2 != null) {
            ListNode temp = n2.next;
            n2.next = n1;
            n1 = n2;
            if (temp == null) break;
            else
                n2 = temp;
        }
        return n2;
    }
}