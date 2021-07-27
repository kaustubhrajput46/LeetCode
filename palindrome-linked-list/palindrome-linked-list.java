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
public boolean isPalindrome(ListNode head) {
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    if (fast != null) { // odd nodes: let right half smaller
        slow = slow.next;
    }
    slow = reverse(slow);
    fast = head;
    
    while (slow != null) {
        if (fast.val != slow.val) {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
    }
    return true;
}

public ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}    
//     public boolean isPalindrome(ListNode head) {
//         if(head == null) return false;
//         if(head.next == null) return true;
//         ListNode itr = head;
//         //traverse the LinkedList to get the length of linkedList
//         int len = 0;
//         while(itr != null){
//             len++;
//             itr = itr.next;
//         }
//         System.out.println("len: "+len);//remove

//         // Use Startlist to traverse list forward when comparing
//         int startList, StartArr;
//         // int start;
//         // int mid = len/2;
//         if(len%2 == 0){
//             startList = len/2+1;
//             StartArr = len/2;
//         } else{
//             StartArr = len/2;
//             startList = len/2+2;
//         }

//         System.out.println("startList: "+startList);//remove
//         System.out.println("StartArr: "+StartArr);//remove
        
//      //traverse first pointer until midpoint and store the data
//         // ListNode itr = head;
//         itr = head;
//         int traverse = 0;
//         int[] arr = new int[StartArr];
//         while( traverse != startList){
//         System.out.println("lol");//remove
            
//             if(traverse < StartArr){
//                 System.out.println(traverse);//remove
                
//                 arr[traverse] = itr.val;
//                 itr = itr.next;
//             }
//                 traverse++;
//                 // traverse++;
//         }
//         traverse--;
        
//         // System.out.println(traverse);//remove
        
//         for(int a: arr) System.out.println(a);
//         //compare the data as you traverse other half of the linkedList
//         while(itr != null || StartArr == -1){
//             System.out.println("itrval: "+itr.val);
//             System.out.println("arr val"+arr[StartArr-1]);
//             if(itr.val != arr[StartArr-1]) return false;
//             itr = itr.next;
//             StartArr--;
//         }
            
//         //since we were able to traverse entire while loop and no mismatching elements found, list is palindrome
//         return true;
//     }
}


// 1 2  2 1
    
// 1 2 3 2 1    



