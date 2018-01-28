package chap11.section1;

import java.io.IOException;

public class CustomizedExceptionTest {
    public static void f() throws CustomizedException {
        throw new CustomizedException();
    }
    public static void g(String gripe) throws CustomizedException {
        throw new CustomizedException(gripe);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (CustomizedException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            g("gripe");
        } catch (CustomizedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class CustomizedException extends IOException {
    public CustomizedException() {
        super();
    }

    public CustomizedException(String gripe) {
        super(gripe);
    }
}
