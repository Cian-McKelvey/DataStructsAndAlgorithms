package DataStructures.LinkedList;

public class Queue <T> {

    private MyNode<T> front, rear;
    private int size = 0;

    // Adds a node to the rear of the queue
    public void enqueue(T data) {
        MyNode<T> node = new MyNode<>(data);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        size++;
    }

    // Removes a node from the front of a queue
    public T dequeue() {
        if (front == null) return null;
        else {
            T returnedValue = front.getData();
            front = front.getNext();
            size--;

            if (front == null) {
                rear = null;
                size = 0;
            }

            return returnedValue;
        }
    }

    // Clears the queue
    public void clear() {
        this.front = null;
        this.rear = null;
        size = 0;
    }

    // Prints queue
    public void inspectQueue() {
        MyNode<T> n = front;
        while (n != null) {
            System.out.print(n.getData() + " ");
            n = n.getNext();
        }
        System.out.println();
    }


    public int size() {
        return this.size;
    }

}
