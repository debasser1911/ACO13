package week3.day2.MyLinkedList;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class Node {
    Node next;
    Node previous;
    Object value;

    public Node(Object o) {
        this.value = o;
    }

    public Node(Node next, Node previous, Object value) {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }

    public Node(Node previous, Object value) {
        this.previous = previous;
        this.value = value;
    }
}
