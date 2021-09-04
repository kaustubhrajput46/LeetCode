class MyCircularQueue {
    int[] queue;
    int head;
    int tail;
    int size;
    public MyCircularQueue(int k) {
        queue = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }
    
    public boolean enQueue(int value) {
        //check if the queue is full, if yes return false;
        if(isFull()) return false;
        //check if inserting the first element
        if(isEmpty()) {
            queue[++head] = value;
            tail++;
            return true;
        } else {
            tail = (tail + 1)%size;
            queue[tail] = value;
            return true;
        } 
        
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        else 
        //if after dequeue, queue is found empty, set head and tail as -1
        if(head == tail) {
            head = -1;
            tail = -1;
            return true;
        } else {
            head = (head+1)%size;
            return true;
        }
        
        
    }
    
    public int Front() {
        if (head == -1) return -1;
        else
            return queue[head];
    }
    
    public int Rear() {
        if (tail == -1) return -1;
        else
            return queue[tail];
    }
    
    public boolean isEmpty() {
        if ((head == -1) && (tail == -1)) return true;
        else return false;
    }
    
    public boolean isFull() {
        // if((tail%size - head%size) == 1) return true;
        if((tail + 1)%size == head) return true;
        else return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */