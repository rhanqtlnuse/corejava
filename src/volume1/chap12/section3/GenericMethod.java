package chap12.section3;

public class GenericMethod {
    public static <T> T middle(T... args) {
        if (args == null || args.length == 0) {
            return null;
        }
        return args[args.length/2];
    }

    public static void main(String[] args) {
        System.out.println(GenericMethod.<String>middle("a", "b", "c"));
        System.out.println(GenericMethod.middle("a", "b", "c"));
    }
}
