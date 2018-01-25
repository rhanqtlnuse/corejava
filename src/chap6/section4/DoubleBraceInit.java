package chap6.section4;

import java.util.ArrayList;
import java.util.List;

public class DoubleBraceInit {
    public static void f(List<String> list) {
        if (list == null) {
            throw new NullPointerException();
        } else {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        f(new ArrayList<String>() {
            {
                add("s1");
                add("s2");
            }
        });
    }
}
