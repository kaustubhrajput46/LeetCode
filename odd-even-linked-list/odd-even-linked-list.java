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
    public ListNode oddEvenList(ListNode head) {
        // if head is empty return empty
        if(head == null) return null;
        //oddref to be parsed
        ListNode odd = head;
        // if head.next is empty return head;
        if (odd.next == null) return odd;
        // evenref to be parsed
        ListNode even = odd.next;
        // evenref to be appended to odd after traversing completely
        ListNode evenRef = new ListNode(0);
        evenRef.next = even;
        // final oddref to be returned
        ListNode oddRef = odd;
        
        //parse list until odd or even points to null
        while(odd != null || even != null){
            if( odd.next != null && odd.next.next != null){
                odd.next = odd.next.next;
                odd = odd.next;
            }
            else{
                odd.next = null;
            }
            
            if(even.next != null && even.next.next != null){
                even.next = even.next.next;
                even = even.next;
            }
            else{
                even.next = null;
                break;
            }
        }

        //append evenRef to to odd
        odd.next = evenRef.next;
        return oddRef;
    }
}