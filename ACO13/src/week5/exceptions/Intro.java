package week5.exceptions;

import utils.MyCheckedException;

import java.sql.SQLException;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class Intro {
    public static void main(String[] args) throws MyCheckedException {
        a();

    }

    private static void a() {
        try {
            b();

        } catch (MyCheckedException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("finish a");
    }

    private static void b() throws MyCheckedException, SQLException {
        c();
        throw new SQLException();
    }

    private static void c() throws MyCheckedException {
        throw new MyCheckedException();

    }
}
