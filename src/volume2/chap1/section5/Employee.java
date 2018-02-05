package volume2.chap1.section5;

import java.io.Serializable;

class Employee implements Serializable {
    private static final long serialVersionUID = 3377634253166698617L;

    private String name;
    private int grade;
    private Department department;
    private int age;

    public Employee(String name, int grade, Department department) {
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getClass().getName() + "[" + "name=" + name
                + ",grade=" + grade + ",department=" + department + "]";
    }
}
