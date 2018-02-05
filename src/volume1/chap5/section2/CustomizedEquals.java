package volume1.chap5.section2;

public class CustomizedEquals {
    public static void main(String[] args) {
        Employee e1 = new Employee("qi", "han", 3);
        Employee e2 = new Employee("qi", "han", 3);
        Employee e3 = new Employee("chuxi", "zhong", 2);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));

        Manager m1 = new Manager("qi", "han", 4, 50000.0);
        Manager m2 = new Manager("qi", "han", 4, 50000.0);
        Manager m3 = new Manager("qi", "han", 4, 40000.0);
        Manager m4 = new Manager("chuxi", "zhong", 3, 50000.0);
        Manager m5 = new Manager("chuxi", "zhong", 3, 40000.0);
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(m4));
        System.out.println(m1.equals(m5));
    }
}
