package main.java.data_structures;

import data_structures.binary_search_tree.BinarySearchTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class TestBinarySearchTree {


    private BinarySearchTree<String> set;

    @Before
    public void setUp() {
        this.set = new BinarySearchTree<>();
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("D");
    }

    @After
    public void clean() {
        set.clear();
        set = null;
    }

    @Test
    public void test_size_after_first_add() {
        set = new BinarySearchTree<>();
        set.add("A");
        assertTrue(set.size() == 1);

    }

    @Test
    public void test_size_after_few_adds() {
        assertTrue(set.size() == 4);

    }

    @Test
    public void test_size_after_adding_not_unique_value() {
        set.add("C");
        assertTrue(set.size() == 4);

    }

    @Test
    public void test_adding_not_unique_value() {
        assertFalse(set.add("C"));
    }

    @Test(expected = NullPointerException.class)
    public void test_adding_null_value_when_root_not_null() {
        set.add(null);
    }

    @Test(expected = NullPointerException.class)
    public void test_adding_null_value_when_root_null() {
        set = new BinarySearchTree<>();
        set.add(null);
    }


    @Test
    public void test_contains_false() {
        assertFalse(set.contains("Z"));
    }

    @Test
    public void test_contains_true() {
        assertTrue(set.contains("A"));
    }

    @Test(expected = NullPointerException.class)
    public void test_contains_null() {
        set.contains(null);
    }

    @Test(expected = NullPointerException.class)
    public void test_contains_null_when_root_null() {
        set = new BinarySearchTree<>();
        set.contains(null);
    }


    @Test(expected = NoSuchElementException.class)
    public void test_first_when_root_null() {
        set = new BinarySearchTree<>();
        set.first();
    }

    @Test(expected = NoSuchElementException.class)
    public void test_last_when_root_null() {
        set = new BinarySearchTree<>();
        set.last();
    }

    @Test
    public void test_last() {
        assertEquals("D", set.last());
    }

    @Test
    public void test_first() {
        assertEquals("A", set.first());
    }

    @Test(expected = NullPointerException.class)
    public void test_remove_null() {
        set.remove(null);
    }

    @Test
    public void test_remove_when_root_and_have_no_children() {
        set = new BinarySearchTree<>();
        set.add("A");
        assertTrue(set.remove("A"));
    }

    @Test
    public void test_remove_when_root_and_have_one_child() {
        set = new BinarySearchTree<>();
        set.add("A");
        set.add("B");
        assertTrue(set.remove("A"));
    }

    @Test
    public void test_size_after_remove_when_root_and_have_no_children() {
        set = new BinarySearchTree<>();
        set.add("A");
        set.remove("A");
        assertTrue(set.size() == 0);
    }

    @Test
    public void test_size_after_remove_when_root_and_have_one_child() {
        set = new BinarySearchTree<>();
        set.add("A");
        set.add("B");
        set.remove("A");
        assertTrue(set.size() == 1);
    }

    @Test
    public void test_remove_if_contains_element_with_one_child() {
        assertTrue(set.remove("C"));
    }

    @Test
    public void test_remove_if_contains_element_with_no_one_child() {
        assertTrue(set.remove("D"));
    }

    @Test
    public void test_remove_root_if_contains_element_with_two_children() {
        assertTrue(set.remove("B"));
    }

    @Test
    public void test_remove_not_root_if_contains_element_with_two_children() {
        set.add("G");
        set.add("E");
        set.add("K");
        assertTrue(set.remove("G"));
    }

    @Test
    public void test_remove_if_doesnt_contains_element() {
        assertFalse(set.remove("Z"));
    }
}