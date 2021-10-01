class MyStack {
    Queue<Integer> queue;
    int top;
    public MyStack() {
        queue = new LinkedList<>();
        top = 0;
    }
    
    public void push(int x) {
        queue.offer(x);
        top = x;
    }
    
    public int pop() {
        int ele = top;
        while(true){
            int x = queue.poll();
            if (x == ele){
                return x;
            }
            queue.offer(x);
            top = x;
        }
        
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */