package chap13.section3;

import java.util.ArrayList;
import java.util.List;

public class SubListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        List<Integer> subList = list.subList(10, 50);
        System.out.println(list.size() + " " + subList.size());
        subList.clear();
        System.out.println(list.size() + " " + subList.size());
        System.out.println(list.contains(39));
    }
}
