package chap13.section2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.WeakHashMap;

public class ListIteratorTest {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        for (int i = 9; i >= 0; i--) {
            list1.add(String.valueOf(i+1));
        }
        ListIterator<String> listItr1 = list1.listIterator();
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(String.valueOf(i+1));
        }
        ListIterator<String> listItr2 = list2.listIterator();
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        // ConcurrentModificationException
//        listItr1.next();
//        listItr1.remove();
//        listItr2.next();

        while (listItr1.hasNext()) {
            listItr2.add(listItr1.next());
        }
        listItr2 = list2.listIterator();
        System.out.println(list2);

        while (listItr2.hasNext()) {
            listItr2.next();
            if (listItr2.hasNext()) {
                listItr2.next();
                listItr2.remove();
            }
        }
        System.out.println(list2);

        list2.removeAll(list1);
        System.out.println(list2);
    }
}
