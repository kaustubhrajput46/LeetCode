/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == headB) return headA;
        if(headA == null || headB == null) return null;

        while(headA != null){
            ListNode TraverseB = headB;
            while(TraverseB != null){
                if(TraverseB == headA)
                    return headA;
                TraverseB = TraverseB.next;
            }
            headA = headA.next;
        }
        return null;
    }
}