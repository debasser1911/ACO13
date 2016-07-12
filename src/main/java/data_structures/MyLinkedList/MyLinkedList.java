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

    private void invalidIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index input!!!");
        }
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
        Node<T> iter = head;
        while (iter != null && !o.equals(iter.value)) iter = iter.next;
        return (iter != null);

    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        T[] result = (T[]) new Object[size];
        int i = 0;
        for (Node<T> iter = head; iter != null; iter = iter.next)
            result[i++] = iter.value;
        return result;
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
        int index = indexOf(o);
        if (index != -1) {
            remove(index);
            return true;
        } else return false;
    }


    @Override
    public boolean addAll(Collection c) {
        int addsize = c.size();
        for (Object o : c) {
            add(o);
            size = size + addsize;
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        if (isEmpty()) {
            return;
        }
        for (Node<T> iter = head; iter != null; ) {
            Node<T> next = iter.next;
            iter.value = null;
            iter.next = null;
            iter.previous = null;
            iter = next;
        }
        head = tail = null;
        size = 0;
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
        invalidIndex(index);
        Node<T> newNode = new Node<>((T) element);
        // inserting in an empty list
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }
        // inserting at the beginning list != empty
        else if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        // inserting at the end (list != empty)
        else if (index == size()) {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        // inserting somewhere in the middle
        else {
            if (index >= 1) ;
            Node<T> nodeBefore = findNode(index - 1);
            newNode.next = nodeBefore.next;
            newNode.next.previous = newNode;
            newNode.previous = nodeBefore;
            nodeBefore.next = newNode;
        }
        size++;

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
        int index = size;
        Node<T> iter;
        if (o == null) {
            for (iter = tail; iter != null; iter = iter.previous) {
                index--;
                if (iter.value == null) return index;
            }
        } else {
            for (iter = tail; iter != null; iter = iter.previous) {
                index--;
                if (o.equals(iter.value)) return index;
            }
        }
        return -1;
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
        if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid index input!!!");
        }
        MyLinkedList<T> newLinkedList = new MyLinkedList<>();
        int i = 0;
        for (Node<T> iter = head; iter != null && i <= toIndex; iter = iter.next) {
            if (i >= fromIndex && i <= toIndex) {
                newLinkedList.add(iter.value);
            }
            i++;
        }
        return newLinkedList;
    }

    @Override
    public boolean retainAll(Collection c) {
        MyLinkedList tmpList = new MyLinkedList();
        for (Object o : this) {
            if (!c.contains(o)) tmpList.add(o);
        }
        return this.removeAll(tmpList);
    }

    @Override
    public boolean removeAll(Collection c) {
        if (c.isEmpty()) return false;
        boolean change = false;
        for (Object o : c) {
            while (contains(o)) {
                remove(o);
                change = true;
            }
        }
        return change;
    }


    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c) {
            if (!this.contains(o)) return false;
        }
        return true;
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