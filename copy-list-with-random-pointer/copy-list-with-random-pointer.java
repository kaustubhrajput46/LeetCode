/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //handle edge cases
        if(head == null) return null;
        //Maintain Hashet to maintain the original and copy nodes mapping!
        Map<Node, Node> map = new HashMap<>();
        //create copy of head;
        Node copyHead = new Node(head.val);
        //ref to travel copy list
        Node copyItr = copyHead;
        //reference to travel original list
        Node itr = head;
        //mapping head to copy head
        map.put(head, copyHead);
        
        //traverse original list and generate copy list and assign val and next pointer.
        while(itr.next != null){
            //go to next node as it is needed to create copy of it and to assign copy pred to it.
            itr = itr.next;
            //create a copy of itr node
            Node copyNode = new Node(itr.val);
            //assign the mapping
            map.put(itr, copyNode);
            //assign next pointer to prev node
            copyItr.next = copyNode;
            // System.out.println(copyNode.val); //remove
            //move to next node
            copyItr = copyNode;
        }
        
        //Lets assign random to new List based on original list
        //reference to travel original list
        itr = head;
        //ref to travel copy list
        copyItr = copyHead;
        copyItr.random = map.get(itr.random);
        while(itr.next != null){
            // System.out.println(copyNode.val); //remove
            itr = itr.next;
            copyItr = copyItr.next;
            copyItr.random = map.get(itr.random);
        }        
                
        return copyHead;
    }
}