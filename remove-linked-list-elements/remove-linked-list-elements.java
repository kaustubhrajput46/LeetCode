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
    public ListNode removeElements(ListNode head, int val) {
        
        //current node reference
        ListNode curr = head;
        
        //dummy node to maintain predessor
        ListNode pred = new ListNode(0);
        
        //refernce its next node to current node
        pred.next = curr;
        
        //refernece to pred's head as it is to be returned
        ListNode removeElements = pred;

        while(curr != null){
            //check
            if(curr.val == val){
                //go to next node
                curr = curr.next;
                //change the references
                pred.next = curr;
            }
            else{
                //set pred as curr and curr to go on next element.
                curr = pred.next.next;
                pred = pred.next;
            }
        }
        
        //remove the dummy node before returning the final list;
        return removeElements.next;
    }
}





