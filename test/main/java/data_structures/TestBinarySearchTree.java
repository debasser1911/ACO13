package data_structures;

import org.junit.After;
import org.junit.Before;
import java.util.Set;

/**
 * Created by debasser on 02.07.16.
 */

public class TestBinarySearchTree {
    private Set<String> set;

    @Before
    public void setUP(){
        System.out.println("Before");
    }
   @After
    public void clean(){
       System.out.println("After");
   }
}
