package DataStructures.StackBased;

import java.util.Stack;

public class StackQueue {
    int size;
    Stack<Integer> stack;

    public StackQueue() {
        stack = new Stack<>();
        size = 0;
    }

    public void enqueue(Integer n) {
        stack.add(0, n);
        size++;
    }

    public int dequeue() {
        Integer n = stack.remove(size-1);
        size--;
        return n;
    }

    public void clear() {
        stack.clear();
        size = 0;
    }

}
