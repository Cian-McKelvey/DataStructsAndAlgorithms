package DataStructures.LinkedList;

public class MyNode <T> {

    private T data;
    private MyNode<T> next;

    public MyNode(T data) {
        this.next = null;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
