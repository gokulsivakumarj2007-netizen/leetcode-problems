import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    // O(n) time complexity
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        
        // Rotate the queue so the newly added element comes to the front
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
    }
    
    // O(1) time complexity
    public int pop() {
        return queue.remove();
    }
    
    // O(1) time complexity
    public int top() {
        return queue.peek();
    }
    
    // O(1) time complexity
    public boolean empty() {
        return queue.isEmpty();
    }
}
