/**
 * Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if (fast == slow) return true;
        }
        
        
        // while (true){
            // if(fast.next == null){
            //     return false;
            // }
            // slow = slow.next;
            // if(fast.next.next == null)
            //     return false;
            // else
            //     fast = fast.next.next;
            // if( slow == fast) {
            //     return true;
            // }

        // }
        //reached end of list
        return false;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//     public boolean hasCycle(ListNode head) {
//         ListNode slow = head;//0
//         ListNode fast = head;//0
//         while(true){
//             if (head == null) return false;
//             if(fast.next != null) 
//                 fast = fast.next;//1 3 5
//             else 
//                 return false;
            
//             if (fast == slow ) //1, 0 | 3, 1 | 5 2|
//                 return true;
            

//             if(slow.next != null) 
//                 slow = slow.next; //1 2
//             else 
//                 return false;
            
//             if(fast.next != null) {
//                 fast = fast.next; //2 4
//             }
//             else 
//                 return false;

//         }
        
//     }
// }