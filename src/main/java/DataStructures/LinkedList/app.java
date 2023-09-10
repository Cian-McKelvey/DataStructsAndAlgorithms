package DataStructures.LinkedList;

public class app {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        System.out.println("[1,2,3,4,5] added");

        System.out.println("Queue Size = " + myQueue.size());

        //myQueue.printQueue(); broken as it alters the actual queue

        System.out.println();

        myQueue.inspectQueue();


        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println("[1,...,5 dequeued");


        myQueue.enqueue(5);
        myQueue.enqueue(6);
        System.out.println("[5, 6] added");

        myQueue.inspectQueue();
        System.out.println("Queue Size = " + myQueue.size());

        System.out.println();
        System.out.println(myQueue.dequeue());
        System.out.println("Queue Size = " + myQueue.size());

    }
}