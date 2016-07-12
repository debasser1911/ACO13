package utils;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class MyIndexOutOfBoundException extends RuntimeException {
    public MyIndexOutOfBoundException() {
    }

    public MyIndexOutOfBoundException(String message) {
        super(message);
    }
}
