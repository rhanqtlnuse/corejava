package chap13.section3;

import java.util.*;

public class BulkOperation {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        Set<Integer> b = new HashSet<>();
        b.add(2);
        b.add(3);
        b.add(5);
        b.add(7);
        Set<Integer> res = new HashSet<>(a);
        System.out.println(res);
        res.retainAll(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(res);

        Integer[] array = a.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, String.valueOf(i));
        }
        map.keySet().retainAll(b);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
