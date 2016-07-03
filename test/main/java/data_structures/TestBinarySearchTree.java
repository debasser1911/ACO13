package main.java.data_structures;

import main.java.data_structures.binary_search_tree.BinarySearchTree;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by debasser on 02.07.16.
 */

public class TestBinarySearchTree {
    BinarySearchTree set = new BinarySearchTree();

    @Before
    public void setUP() {
        this.set = new BinarySearchTree();
        set.add("A");
        set.add("B");
        set.add("C");
    }

    @After
    public void clean() {
        set.clear();
    }

    @Test
    public void test_size_after_first_add() {
        set.add("a");
        Assert.assertTrue(set.size() == 1);
    }

    @Test
    public void test_size_after_few_add() {
        set.add("a");
        set.add("b");
        set.add("c");
        Assert.assertTrue(set.size() == 3);
    }

    @Test
    public void test_size_after_not_unique_add() {
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        Assert.assertFalse(set.size() == 3);
    }

}
