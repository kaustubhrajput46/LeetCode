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
        //handle the edge cases
        if(head == null) return null;
        //construct the revList using below pointer
        ListNode revList = null;
        return helper(head, revList);
    }
    
    public ListNode helper(ListNode head, ListNode revList){
        //if reached end of list, return the reversed list
        if(head == null) return revList;
        //get the reference of next node in list
        ListNode temp = head.next;

        //assign present node as head of revList
        head.next = revList;
        revList = head;
        
        //proceed recursively until end of list
        return helper(temp, revList);
        
    }
}

/***Below is iterative solution***/
// class Solution {
//     public ListNode reverseList(ListNode head) {
        
//         //temp to set head pointer to null.
//         ListNode temp = head;

//         //The reverse list
//         ListNode revList = null;
        
//         while (temp != null ){
//             //get the next node in temporary node
//             ListNode itr = temp.next;

//             //set the next pointer to revList
//             temp.next = revList;
            
//             //set the itr pointer as new reverse list 
//             revList = temp;

//             temp = itr;
//         }
//         return revList;
//     }
// }