package data_structures.MyLinkedList;

import utils.MyIndexOutOfBoundException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class MyLinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private Node findNode(int index) {
        if (index >= size || index < 0) {
            throw new MyIndexOutOfBoundException(String.valueOf(index));
        }
        Node iter = head;
        for (int i = 1; i < index; i++) {
            iter = iter.next;
        }
        return iter;
    }

    public MyLinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (head == null) {
            head = tail = new Node(o);
            size++;
            return true;
        }
        tail.next = new Node(tail, o);
        tail = tail.next;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0) {
            System.err.println("Incrorrect index");
            return null;
        }
        Node<T> iter = head;
        iter = findNode(index);
        return iter.value;
    }

    @Override
    public Object set(int index, Object element) {
        if (index >= size || index < 0) {
            System.err.println("Incorrect index");
            return null;
        }
        Node iter = head;
        iter = findNode(index);
        Object toReturn = iter.value;
        iter.value = element;
        return iter;
    }


    @Override
    public void add(int index, Object element) {


    }

    @Override
    public T remove(int index) {
        Node<T> iter = findNode(index);
        if (iter == head) {
            head = iter.next;

            if (iter.next == null) {
                head = tail = null;
            } else {
                head.previous = null;
                iter.next = null;
            }

        } else if (iter == tail) {
            tail = iter.previous;
            tail.next = null;
            iter.previous = null;
        } else {
            iter.previous.next = iter.next;
            iter.next.previous = iter.previous;
            iter.previous = null;
            iter.next = null;

        }
        size--;
        return iter.value;
    }

    @Override
    public int indexOf(Object o) {
        Node<T> iter = head;

        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (iter.value == null)
                    return i;
                iter = iter.next;
            }

        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(iter.value))
                    return i;
                iter = iter.next;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        //NOP
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        //NOP
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {


        return new Object[0];
    }

    private static class Node<T> {
        Node<T> next;
        Node<T> previous;
        T value;

        public Node() {
        }

        public Node(T o) {
            this.value = o;
        }

        public Node(Node next, Node previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        public Node(Node previous, T value) {
            this.previous = previous;
            this.value = value;
        }
    }

    private class MyIterator<T> implements Iterator<T> {

        Node<T> iterator;

/*        public MyIterator() {
            iterator = new Node<T>();
            iterator.next = head;
        }*/

        @Override
        public boolean hasNext() {
            return iterator.next != null;
        }

        @Override
        public T next() {
            iterator = iterator.next;
            return iterator.value;
        }

        @Override
        public void remove() {

        }
    }
}