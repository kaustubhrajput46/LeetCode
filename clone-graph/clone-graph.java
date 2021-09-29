/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        
        
        Node newNode = new Node(node.val);
        
        Queue<Node> queue = new LinkedList<>();
        Map<Node, Node> map = new HashMap<>();
        map.put(node, newNode);
        queue.offer(node);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            // System.out.println(n.val);
            for(Node neighbor : n.neighbors){
                if(!map.containsKey(neighbor)){
                    map.put(neighbor, new Node(neighbor.val));
                    queue.offer(neighbor);
                }
                
            }
        }
        for(Map.Entry<Node, Node> entry : map.entrySet()){
            Node duplicate = entry.getValue();
            List<Node> list = new ArrayList<>();
            for(Node neighbor : entry.getKey().neighbors){
                list.add(map.get(neighbor));
                }
            duplicate.neighbors = list;
        }
        
        return newNode;
    }
}