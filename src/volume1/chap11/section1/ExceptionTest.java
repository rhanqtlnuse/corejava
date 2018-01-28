package chap11.section1;

import java.io.IOException;
import java.util.Random;

public class ExceptionTest {
    public void f() {
        System.out.println("before calling g()");
        try {
            g();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("after calling g()");
    }
    public void g() throws IOException {
        final int threshold = 5000;
        final int rand = new Random().nextInt(10000);
        if (rand >= threshold) {
            throw new IOException("an exception");
        }
    }

    public static void main(String[] args) {
        new ExceptionTest().f();
    }
}
