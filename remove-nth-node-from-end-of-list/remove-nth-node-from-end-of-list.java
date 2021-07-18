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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        int len = 0;
        while(first!= null){
            len++;
            first = first.next;
        }
        int delete = len - n + 1;
        first = dummy;
        for(int i = 0; i < delete - 1; i++){
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}