package chap11.section2;

public class ReturnInFinally {
    public static int f() {
        try {
            return 0;
        } finally {
            // 覆盖了try中的返回值啊在
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}
