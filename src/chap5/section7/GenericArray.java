package chap5.section7;

import java.lang.reflect.Array;

public class GenericArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = (int[]) copyOf(a, 10);
        System.out.println(b.length);
        for (int i : b) {
            System.out.println(i);
        }
    }

    public static Object copyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) {
            return null;
        } else {
            Class componentType = cl.getComponentType();
            int length = Array.getLength(a);
            Object newArray = Array.newInstance(componentType, newLength);
            System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
            return newArray;
        }
    }
}
