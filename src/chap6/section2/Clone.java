package chap6.section2;

import java.util.Date;

public class Clone {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("qi", "han", 20, new Address("china", "inner mongo", "tongliao", "jiaotong", "028000"));
            Person p2 = p1.clone();
            System.out.println("original: " + p1);
            System.out.println("  cloned: " + p2);
            p2.setFirstName("xu");
            p2.setAge(21);
            p2.setAddress("china", "jiangsu", "nanjing", "xianlin", "210046");
            System.out.println("after p2 modified: ");
            System.out.println("      p1: " + p1);
            System.out.println("      p2: " + p2);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}
