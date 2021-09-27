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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //create a dummy node for new sorted linkedlist
        ListNode head = new ListNode(-101);
        //traverse the list as we keep adding nodes to it.
        ListNode ref = head;
        // traverse the two lists
        while(true){

            if(l1 == null)
                if(l2 == null){
                    return ref.next;
                } else {
                    head.next = l2;
                    head = head.next;
                    l2 = l2.next;
                    continue;
                }
            if(l2 == null)
                if(l1 == null){
                    return ref.next;
                } else {
                    head.next = l1;
                    head = head.next;
                    l1 = l1.next;
                    continue;
                }
            if(l1.val <= l2.val){

                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }
            else{
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }
    }
}


