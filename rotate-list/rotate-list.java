/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // handle the edge cases
        if (head == null) return null;
        //iterating pointer
        ListNode itr = head;
        //length of list
        int len = 1;
        //get the length of the list and set last nodes pointer to head.
        while(itr.next != null){
            len++;
            itr = itr.next;
        }
        //set the pointer to head
        itr.next = head;
        //reset pointer
        itr = head;
        //mathematical formula to determine where the head should be pointing
        int headpointer = len + 1 - (k%len);
        //travel to the node previous to headpointer
        for(int i = 1; i < headpointer -1; i++){
            itr = itr.next;
        }
        //set the curr node as head node and prev nodes next pointer to null to break the cycle.
        head = itr.next;
        itr.next = null;
        return head;
    }
}