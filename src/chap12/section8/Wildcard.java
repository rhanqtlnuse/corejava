package chap12.section8;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public void f(List<? extends Person> list) {
        System.out.println("f()");
    }
    public void g(List<? super Student> list) {
        System.out.println("g()");
    }

    public static void main(String[] args) {
        new Wildcard().f(new ArrayList<Person>() {
            {
                add(new Person("hanqi", 20));
            }
        });
        new Wildcard().f(new ArrayList<Student>() {
            {
                add(new Student("hanqi", 20, "nju", 2));
            }
        });
        new Wildcard().g(new ArrayList<Student>() {
            {
                add(new Student("hanqi", 20, "nju", 2));
            }
        });
        new Wildcard().g(new ArrayList<Person>() {
            {
                add(new Person("hanqi", 20));
            }
        });
        new Wildcard().g(new ArrayList<Object>() {
            {
                add(new Object());
            }
        });
    }
}
