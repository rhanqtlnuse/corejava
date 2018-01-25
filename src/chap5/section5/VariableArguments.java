package chap5.section5;

public class VariableArguments {
    public static double max(double... args) {
        // 实际上是一个数组
        System.out.println(args.length);

        double max = Double.MIN_VALUE;
        for (double d : args) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

//    /**
//     * 可变参数列表必须是最后一个参数
//     */
//    public static int min(int... args, int b) {
//
//    }
    public static void print(String s, String... args) {
        System.out.println(s);
        for (String str : args) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        System.out.println(VariableArguments.max());
        System.out.println(VariableArguments.max(40.5, -30.1, 2, 56, 73.9));
        // 冗余，无需创建数组
        System.out.println(VariableArguments.max(new double[]{40.5, -30.1, 2, 56, 73.9}));
        // 虽然实际上是数组，但不允许这种形式
//        System.out.println(VariableArguments.max({40.5, -30.1, 2, 56, 73.9}));

        print("");
        print("", "a");
        print("", "a", "b");
    }
}
