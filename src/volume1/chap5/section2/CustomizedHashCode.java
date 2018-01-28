package chap5.section2;

public class CustomizedHashCode {
    public static void main(String[] args) {
        Employee e1 = new Employee("qi", "han", 3);
        Employee e2 = new Employee("qi", "han", 3);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode() + " " + e2.hashCode());
        Employee e3 = new Employee("chuxi", "zhong", 3);
        System.out.println(e1.equals(e3));
        System.out.println(e1.hashCode() + " " + e3.hashCode());
    }
}