package chap5.section2;

public class DefaultEquals {
    public static void main(String[] args) {
        EmployeeWithDefaultEquals e1 = new EmployeeWithDefaultEquals("qi", "han", 3);
        EmployeeWithDefaultEquals e2 = new EmployeeWithDefaultEquals("qi", "han", 3);
        /**
         * 默认的equals直接用==比较引用
         */
        System.out.println(e1.equals(e2));
        System.out.println(e1 == e2);
    }
}

class EmployeeWithDefaultEquals {
    private String firstName;
    private String lastName;
    private int grade;

    public EmployeeWithDefaultEquals(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
}
