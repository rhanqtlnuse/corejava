package chap5.section2;

public class CustomizedToString {
    public static void main(String[] args) {
        Employee e1 = new Employee("qi", "han", 3);
        Manager m1 = new Manager("chuxi", "zhong", 4, 50000.0);
        System.out.println(e1);
        System.out.println(m1);
    }
}
