package chap5.section3;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(16);
        System.out.println("Before: " + list1.size());
        list1.add("0");
        System.out.println("After add first: " + list1.size());
        for (int i = 1; i < 17; i++) {
            list1.add(String.valueOf(i));
        }
        System.out.println("After: " + list1.size());

        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Default: " + list2.size());
        list2.ensureCapacity(16);
        System.out.println("After ensure: " + list2.size());
        list2.add("0");
        System.out.println("After add first: " + list2.size());
        for (int i = 1; i < 17; i++) {
            list2.add(String.valueOf(i));
        }
        System.out.println("After add 17 elements: " + list2.size());

        ArrayList<String> list3 = new ArrayList<>(10);
        System.out.println("Default: " + list3.size());
        list3.add("0");
        System.out.println("After add first: " + list3.size());
        for (int i = 1 ; i < 4; i++) {
            list3.add(String.valueOf(i));
        }
        list3.trimToSize();
        System.out.println("After trimming: " + list3.size());
    }
}
