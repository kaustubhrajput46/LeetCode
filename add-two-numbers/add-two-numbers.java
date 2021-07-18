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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //Setup node with dummy head for new list
        ListNode head = new ListNode(-1);
        //pointer to traverse new list
        ListNode itr = head;
        //get values of l1, l2, carry and newlist;
        int l1val = 0, l2val = 0, newval = 0, carry = 0;
        while(true){
            // get l1val
            if (l1 != null) {
                l1val = l1.val;
                l1 = l1.next;
            }
            else
                l1val = 0;
            
            //get l2 val
            if (l2 != null){
                l2val = l2.val;
                l2 = l2.next;
            }
            else
                l2val = 0;
            
            // sum up the l1 and l2 values with prev carry
            newval = l1val + l2val + carry;
            
            //setup new carry if any
            carry = newval / 10;
            newval = newval % 10;
            
            //get new node with newval
            itr.next = new ListNode(newval);
            itr = itr.next;
            
            //check if both the list have been completely traversed and come out of while loop
            if (l1 == null && l2 == null)
                break;
        }
        //check if a carry still remains?
        if (carry != 0 )
            itr.next = new ListNode(carry);
        
        //return the head of new list without dummy head;
        return head.next;
        
        
        
//pseudo code
//         1. while true
//             l1val = 0;
//             l2val = 0;
//             l3val = 0;
        
//         2. if l1 ! null -> l1val = l1.val;
//         2. if l2 ! null -> l2val = l2.val;
        
//         3. l3val = l1val + l2val + carry;
//              // here need to check if l3val is 2 digit.
//             // if yes set carry to move forward in next iteration else carry = 0;
//         4. carry = 0;
//         5. New node(l3val)
//         6. while loop end
//         7. if carry !=0;
//         8. add new node(carry) to the end of new list.
            
        
        
        
        
        
        
        
//         long num1 = 0; 
//         long num2 = 0;
        
//         //number to be returned in a reverse order
//         long num3 = 0;
        
//         while(l1 != null){
//             num1 = num1*10 + l1.val;
//             l1 = l1.next;
//         }
//         System.out.println(num1);
        
//         while(l2 != null){
//             num2 = num2*10 + l2.val;
//             l2 = l2.next;
//         }
        
//         //reverse the two numbers
//         long num1rev = 0;
//         long num2rev = 0;
//         int rem = 0;
//         if(num1 == 0){
//             num1rev =num1;
//         } else {
//             while(num1!=0){
//                 rem = (int)(num1%10);
//                 num1rev = num1rev*10 + rem;
//                 num1 = num1/10;
//             }
//         }
//         System.out.println(num1rev);
//         if(num2 == 0){
//             num2rev =num2;
//         } else {
//             while(num2!=0){
//                 rem = (int)(num2%10);
//                 num2rev = num2rev*10 + rem;
//                 // System.out.println(num2rev+"  "+num2); // 999999999  19
//                 num2 = num2/10;
//             }
//         }        
//         System.out.println(num2rev);
        
//         num3 = num1rev + num2rev;
//         System.out.println(num3);
//         if(num3 == 0) return new ListNode(0);
        
//         //to be returned in the end
//         ListNode head = new ListNode(0);
//         //to be traversed
//         ListNode ref = head;
//         rem = 0;
//         while(num3 != 0){
//             rem = (int)(num3 % 10);
//             // System.out.println(rem);
//             ListNode remNode = new ListNode(rem);
//             num3 = num3/10;
//             ref.next = remNode;
//             ref = ref.next;
//         }
//         return head.next;
    }
}