package data_structures.binary_search_tree;

import java.util.*;

/**
 * Created by debasser on 02.07.16.
 */
public class BinarySearchTree<E> extends AbstractSet<E> implements NavigableSet<E>, Set<E>, Iterable<E> {
    private Node<E> root;
    private int size;
    private Comparator<? super E> comparator;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Comparator<? super E> comparator) {
        this.comparator = comparator;
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
        Node<E> search = null;

        if (comparator != null) {
            //todo search with comparator
        } else {
            search = findNode(o);

        }
        return search != null;
    }

    private Node<E> findNode(Object o) {
        if (o == null) throw new NullPointerException();
        Node<E> iter = root;
        int compare;
        @SuppressWarnings("unchecked")
        Comparable<? super E> comparable = (Comparable<? super E>) o;
        while (iter != null) {
            compare = comparable.compareTo(iter.value);
            if (compare > 0) iter = iter.rightChild;
            else if (compare < 0) iter = iter.leftChild;
            else return iter;
        }
        return null;
    }


    @Override
    public E lower(E e) {
        return null;
    }

    @Override
    public E floor(E e) {
        return null;
    }

    @Override
    public E ceiling(E e) {
        return null;
    }

    @Override
    public E higher(E e) {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyBinaryTreeIterator();
    }

    @Override
    public NavigableSet<E> descendingSet() {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    @Override
    public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
        return null;
    }

    @Override
    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
        return null;
    }

    @Override
    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
        return null;
    }

    @Override
    public Comparator<? super E> comparator() {
        return null;
    }

    @Override
    public SortedSet<E> subSet(E fromElement, E toElement) {
        return null;
    }

    @Override
    public SortedSet<E> headSet(E toElement) {
        return null;
    }

    @Override
    public SortedSet<E> tailSet(E fromElement) {
        return null;
    }

    @Override
    public E first() {
        if (isEmpty()) throw new NoSuchElementException("size = 0");
        Node<E> iter = root;
        return findLeft(iter);

    }

    private E findLeft(Node<E> iter) {
        return iter.leftChild != null ? findLeft(iter.leftChild) : iter.value;
    }

    @Override
    public E last() {
        if (isEmpty()) throw new NoSuchElementException("size = 0");
        Node<E> iter = root;
        return findRight(iter);
    }

    private E findRight(Node<E> iter) {
        return iter.rightChild != null ? findRight(iter.rightChild) : iter.value;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (root == null) {
            canCompare(e, e);
            root = new Node<>(e);
            size++;
            return true;

        }

        if (comparator != null) {
            // TODO: 02.07.16 compare with comparator
        } else if (e != null) {

            Comparable<? super E> eComparable = (Comparable<? super E>) e;

            Node<E> iter = root;
            Node<E> parent = root;
            int compareResult;


            do {
                parent = iter;
                compareResult = eComparable.compareTo(iter.value);

                if (compareResult > 0) {
                    iter = iter.rightChild;
                } else if (compareResult < 0) {
                    iter = iter.leftChild;
                } else {
                    return false;
                }
            } while (iter != null);
            if (compareResult > 0) {
                parent.rightChild = new Node<E>(e, parent);
            } else {
                parent.leftChild = new Node<E>(e, parent);
            }
            size++;
            return true;

        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private int canCompare(E element1, E element2) {

        return comparator != null ? comparator.compare(element1, element2) : ((Comparable<? super E>) element1).compareTo(element2);

    }

    @Override
    public boolean remove(Object o) {
        Node<E> current = findNode(o);
        if (current == null) return false;
        size--;

        if (current.rightChild == null && current.rightChild == null) {
            if (current == root) root = null;
            else if (current == current.parent.leftChild) current.parent.leftChild = null;
            else current.parent.leftChild = null;

            current.parent = null;

        } else if (current.rightChild == null) { //has only left child
            if (current == root) {
                root = current.leftChild;
                root.parent = null;
            } else if (current == current.parent.leftChild) {
                current.parent.leftChild = current.leftChild;
                current.leftChild.parent = current.parent;
                current.parent = null;

            } else {
                current.parent.rightChild = current.leftChild;
                current.leftChild.parent = current.parent;
                current.parent = null;
            }

        } else if (current.leftChild == null) { // has only righr child
            if (current == root) {
                root = current.rightChild;
                root.parent = null;
            } else if (current == current.parent.leftChild) {
                current.parent.leftChild = current.rightChild;
                current.rightChild.parent = current.parent;
                current.parent = null;

            } else {
                current.parent.rightChild = current.leftChild;
                current.rightChild.parent = current.parent;
                current.parent = null;
            }
        } else { //has both children
            Node<E> successor = findSuccessor(current);
            if (current == root) {
                root = successor;
                root.leftChild.parent = successor;
            } else if (current.parent.leftChild == current) {
                current.parent.leftChild = successor;

            } else {
                current.parent.rightChild = successor;
            }
            successor.parent = current.parent;
            successor.leftChild = current.leftChild;
            current.leftChild.parent = successor;

        }

        return true;
    }

    private Node<E> findSuccessor(Node<E> current) {
        Node<E> successor = current.rightChild;
        while (successor.leftChild != null) {
            successor = successor.leftChild;
        }
        if (successor.parent != current) {
            successor.parent.leftChild = successor.rightChild;
            successor.rightChild.parent = successor.parent;
            successor.rightChild = current.rightChild;
            current.rightChild.parent = successor;
        }
        return successor;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    private static class Node<T> {
        T value;
        Node<T> parent;
        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> parent) {
            this.value = value;
            this.parent = parent;
        }
    }

    private class MyBinaryTreeIterator<E> implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
