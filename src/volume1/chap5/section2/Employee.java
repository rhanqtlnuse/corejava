package chap5.section2;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int grade;

    public Employee(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) {
            return true;
        }
        if (thatObject == null) {
            return false;
        }
        if (this.getClass() != thatObject.getClass()) {
            return false;
        } else {
            Employee that = (Employee) thatObject;
            return Objects.equals(this.firstName, that.firstName)
                    && Objects.equals(this.lastName, that.lastName)
                    && this.grade == that.grade;
        }
    }

//    /**
//     × 调用Objects.hashCode(Object o)来获取字段的散列码
//     × null安全：null时返回0
//     * 否则返回字段的散列码
//     */
//    @Override
//    public int hashCode() {
//        return 7 * Objects.hashCode(firstName)
//                + 11 * Objects.hashCode(lastName)
//                + 13 * Objects.hashCode(grade);
//    }

    /**
     * 自动组合每个字段的散列码（由Objects.hashCode(Object O)得到）
     * @return 对象的散列码
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, grade);
    }

    /**
     * 使用getClass().getName()而避免将类名硬编码写入方法便于复用
     * @return 对象的描述
     */
    @Override
    public String toString() {
        return getClass().getName() + "[firstName=" + firstName
                + ",lastName=" + lastName + ",grade=" + grade + "]";
    }
}
