package chap6.section4;

public class AnonymousClass {
    public static void main(String[] args) {
        // 静态方法中得到外部类的方法
        System.out.println(new Object() {}.getClass().getEnclosingClass());
    }
}
