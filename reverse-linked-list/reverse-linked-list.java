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
    public ListNode reverseList(ListNode head) {
        
        //temp to set head pointer to null.
        ListNode temp = head;

        //The reverse list
        ListNode revList = null;
        
        while (temp != null ){
            //get the next node in temporary node
            ListNode itr = temp.next;

            //set the next pointer to revList
            temp.next = revList;
            
            //set the itr pointer as new reverse list 
            revList = temp;

            temp = itr;
        }
        return revList;
    }
}