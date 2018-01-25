package chap6.section4;

public class StaticInnerClass {
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        int getFirst() {
            return first;
        }
        int getSecond() {
            return second;
        }
    }

    public static Pair minmax(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : a) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return new Pair(min, max);
    }

    public static void main(String[] args) {
        // 或者直接Pair
        StaticInnerClass.Pair p = minmax(new int[]{6, 3, 7, 2, 4, 1, 5});
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}
