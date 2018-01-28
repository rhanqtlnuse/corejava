package chap13.section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CheckedView {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List rawList = strings;
        rawList.add(new Date());
        try {
            String s = (String) rawList.get(0);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

        List<String> safeStrings = new ArrayList<>();
        List checkedRawList = Collections.checkedList(safeStrings, String.class);
        try {
            checkedRawList.add(new Date());
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }
}
