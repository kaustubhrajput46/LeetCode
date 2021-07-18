public class Solution {
    public ListNode detectCycle(ListNode head) {
        //if the list is empty
        if (head == null) return null;
        //slow and fast pointer
        ListNode slow = head;
        ListNode fast = head;
        //index to get the cycle entrance.
        // int index = 0;
        while(true) {
            if (fast.next != null && fast.next.next != null){
                //one step jump
                slow = slow.next;
                //two step jump
                fast = fast.next.next;
            }else
                return null;
            if (fast == slow){
                //if they both meet at a point start 2 more pointers
                //these pointers when they match will be on the entrance of the cycle.
                ListNode ptr1 = slow;
                ListNode ptr2 = head;
                while (ptr1 != ptr2){
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                    }
                //return the entrance.
                return ptr1;
            }
        }
    }
}     
                
                
                
                
                
                
                
                
                
//                 ListNode slow = head;
//                 ListNode fast = head;
        
//                 while (fast!=null && fast.next!=null){
//                     fast = fast.next.next;
//                     slow = slow.next;
                    
//                     if (fast == slow){
//                         ListNode slow2 = head; 
//                         while (slow2 != slow){
//                             slow = slow.next;
//                             slow2 = slow2.next;
//                         }
//                         return slow;
//                     }
//                 }
//                 return null;
        //     }
        // }