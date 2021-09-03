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
    public ListNode deleteDuplicates(ListNode head) {
        //handle edge cases
        if (head == null) return head;
        //set to contain unique node values
        Set<Integer> set = new HashSet<>();
        //iteravtive pointer 
        ListNode itr = head;
        set.add(head.val);
        while(itr.next != null ){
            
            if(set.contains(itr.next.val)) {
                ListNode temp = itr;
                while(set.contains(itr.val)){
                    // itr.next = itr.next.next;
                    itr = itr.next;
                    if (itr == null) {
                        temp.next = null;
                        break;
                    }
                }
                if (itr == null) {
                    temp.next = null;
                    break;
                }
                temp.next = itr;
                itr = temp;
                
            }
            else {
                set.add(itr.next.val);
                itr = itr.next;
            }
        }
        
            
        return head;
    }
}


// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         //handle edge cases
//         if (head == null) return head;
//         //set to contain unique node values
//         Set<Integer> set = new HashSet<>();
//         //iteravtive pointer 
//         ListNode itr = head;
//         set.add(head.val);
//         while(itr.next != null ){
//             if(set.contains(itr.next.val)) {
//                 itr.next = itr.next.next;
//                 itr = itr.next;
//                 if (itr == null) break;
//             } else {
//                 set.add(itr.next.val);
//                 itr = itr.next;
//             }
//         }
        
            
//         return head;
//     }
// }