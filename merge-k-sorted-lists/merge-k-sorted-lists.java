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
    public ListNode mergeKLists(ListNode[] lists) {
        int len  = lists.length;
        if (len == 0 ) return null;
        //Merged List to be returned
        ListNode mergeList = new ListNode(0);
        //Pointer to traverse the list
        ListNode pointer = mergeList; 
        
        int allNull = 0;
            
        
        while (allNull != len){
            allNull = 0;
            ListNode minNode = new ListNode(Integer.MAX_VALUE);
            int index = -1;
            //traverse the head node of all the LinkedLists
            for(int i  = 0; i < len; i++){
                if(lists[i] == null) {
                    allNull++;
                    continue;
                }
                // System.out.println(lists[i].val + "  " + minNode.val + "  " + index  + "  " + i);
                if(lists[i].val <= minNode.val){
                    minNode = lists[i];
                    index = i;
                }
                
                // System.out.println(lists[i].val);
            }
            //we have the Node to be added in MergeList
            if (minNode.val != Integer.MAX_VALUE){
                pointer.next = minNode;
                pointer = pointer.next;
                
            }
            
            // pointer.val
            
            if(allNull == len) break;
            //remove the added node from original list
            lists[index] = lists[index].next;
            
            //remove
            System.out.println(allNull);
            // allNull = len;
        }
        pointer= null;
        
        
        return mergeList.next;
    }
}


//length of lists (len)= number of linkedLists 
//no of pointers to be mainted = len
//need array of length len to maintain pointers


//how to traverse all linkedList?
//1. Get the heads of all the linkedList
//2. Find the least in size and add in the mergedList
//3. Remove that node from the original list
//4. Proceed
//5. care for the null pointers
//6. Maintain a pointer indicating how many lists have become null, once it is equal to len, we can stop and return the list