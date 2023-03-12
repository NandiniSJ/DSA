package LinkedList;

public class SinglyLinkedList<T> {

    Node<T> head;

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void insert(T data){
        Node<T> newNode = new Node<>(data,null);
        if(head == null){
            head = newNode;
            return;
        }

        Node<T> current = head;
        while(current.getNext() != null){
            current.setNext(current);
        }
        current.setNext(newNode);
    }

    public void insertFirst(T data){
        Node<T> newNode = new Node<>(data,null);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.setNext(head);
        head = newNode;
    }

    public int countNumOfRepetition(T data){
        int count = 0;
        Node<T> current = head;
        while(current.getNext() != null){
            if(current.getData() == data){
                count++;
            }
        }

        return count;
    }
}

class Node<T>{

   private T data;
    private Node<T> next;

    public Node(T data, Node<T> next){
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
