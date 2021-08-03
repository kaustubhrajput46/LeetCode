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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         // if head is null
//         if (head == null) return null;
//         if (head.next == null && n == 1) return null;
//         ListNode slow = head;
//         ListNode fast = head;
//         int slowIndex = 1, fastIndex = 1, prev = -1;
//         while(slow != null ){

//             if(fast!= null && fast.next!=null ) {
//                 fast = fast.next;
//                 fastIndex++;
//                 // System.out.println("fastIndex "+fastIndex);
//             }
//             else {
//                 if (prev == -1){
//                 //first occurance where fast == null
//                 // set the prev node value here
//                     prev = fastIndex - n;
//                     // System.out.println(prev);
//                 }
//             }
            
            
//             if(fast!= null && fast.next!=null ) {
//                 fast = fast.next;
//                 fastIndex++;
//                 // System.out.println("fastIndex "+fastIndex);
//             }
//             else {
//                 if (prev == -1){
//                 //first occurance where fast == null
//                 // set the prev node value here
//                     prev = fastIndex - n;
//                     // System.out.println(prev);

//                 }
//             }
//             if(slowIndex == prev){
//                 // this is the prev element of the element to be removed.
//                 // remove element and return head. 
//                 slow.next = slow.next.next;
//                 return head;
//             }
//             if (slow != null && slow.next != null){
//                 slow = slow.next;
//                 slowIndex++;
//                 // System.out.println("slowIndex "+slowIndex);

//             }


//         }
//         // We should not reach here
//         return head;
//     }
// }
// Below is not a single pass solution.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if head is null
        if (head == null) return null;
        if (head.next == null && n == 1) return null;
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