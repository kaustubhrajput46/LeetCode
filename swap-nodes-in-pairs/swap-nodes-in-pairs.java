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
    public ListNode swapPairs(ListNode head) {
        //if list is empty or has 1 element
        if(head == null || head.next == null) return head;
        // swap first and second element
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        if(head.next == null)
            return temp;
        else
            helper(head);
        //temp is the new head after swapping
        return temp;
    }
    
    public static ListNode helper(ListNode prev){
        //if either of node in consideration is null, return
        if(prev.next == null || prev.next.next == null) return prev;

        //store the second node reference
        ListNode temp = prev.next.next;

        //point first node to second nodes next Node
        prev.next.next = temp.next;
        temp.next = prev.next;

        //point prev to the temp node
        prev.next = temp;

        if(temp.next == null) 
            return temp;
        else 
            return helper(temp.next);
    } 
    
}


// pseudo code

//exit case ... when head.next or head.next.next is 0;
//return case ... last line can return head

// swapping case ... 
// ---||





