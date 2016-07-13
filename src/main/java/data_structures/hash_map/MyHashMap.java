package data_structures.hash_map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


/**
 * Created by DeBasser on 09.07.2016.
 */
public class MyHashMap<K, V> implements Map<K, V> {


    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private static final int DEFAULT_CAPACITY = 16;
    MyEntry<K, V>[] table;
    private double loadFactor;
    private int capacity;
    private int threshold;
    private int size;


    @SuppressWarnings({"rawtypes","unchecked"})
    public MyHashMap() {
        loadFactor = DEFAULT_LOAD_FACTOR;
        capacity = DEFAULT_CAPACITY;
        table = (MyEntry<K, V>[])new MyEntry[capacity];
        threshold = (int)(capacity * loadFactor);
    }
    @SuppressWarnings({"rawtypes","unchecked"})
    public MyHashMap(int capacity) {
        this.capacity = capacity;
        loadFactor = DEFAULT_LOAD_FACTOR;

        table = (MyEntry<K, V>[]) new MyEntry[capacity];
        threshold = (int)(capacity * loadFactor);

    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public MyHashMap(double loadFactor, int capacity) {
        this.loadFactor = loadFactor;
        this.capacity = capacity;
        table = (MyEntry<K, V>[])new MyEntry[capacity];
        threshold = (int)(capacity * loadFactor);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {

//        check k != null
//        findIdx
//        check for equal
//            if true -> rewrite
//            else -> put
//                    checkThreshold
//                          if place enough -> put
//                          else resize() -> transfer -> put


        if (key == null) {
//        todo put for null
            return value;
        }
        int position = findPosition(key);


        if (table[position] == null) {

            table[position] = new MyEntry<>(key, value);

        } else {
            MyEntry<K, V> iterator = table[position];
          MyEntry<K,V> parent;
            do {
               parent = iterator;
                if (key.equals(iterator.key)) {
                    V forReturn = iterator.getValue();
                    iterator.setValue(value);
                    return forReturn;
                }
                iterator = iterator.next;
            } while (iterator.next != null);
            iterator.next = new MyHashMap.MyEntry<>(key, value);
        }
        size++;
        return null;
    }

    private int findPosition(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    @Override
    public V remove(Object key) {

        return null;
    }


    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    public static class MyEntry<K, V> implements Entry<K, V> {

        K key;
        V value;
        MyEntry<K, V> next;

        public MyEntry(K key, V value) {
            this.key = key;
            this.value = value;
            //todo check constructor

        }


        @Override
        public K getKey() {
            return null;
        }

        @Override
        public V getValue() {
            return null;
        }

        @Override
        public V setValue(V value) {
            return null;
        }
    }
}
