package chap12.section4;

import java.util.ArrayList;

public class GenericBound {
    public static <T extends Comparable> T min(T... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        T smallest = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i].compareTo(smallest) < 0) {
                smallest = args[i];
            }
        }
        return smallest;
    }

    // 报错
//    public static <T extends Comparable & ArrayList> T f() {
//
//    }
    // 类必须是第一个，且最多有一个
    public static <T extends ArrayList & Comparable> T f() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(GenericBound.min("c", "a", "b", "d"));
        // 不允许，因为没有实现Comparable接口
//        System.out.println(GenericBound.min(new Dummy(), new Dummy(), new Dummy()));
    }
}

class Dummy {

}