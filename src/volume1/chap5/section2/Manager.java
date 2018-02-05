package volume1.chap5.section2;

import java.util.Objects;

public class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, int grade, double bonus) {
        super(firstName, lastName, grade);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object thatObject) {
        if (!super.equals(thatObject)) {
            return false;
        } else {
            Manager that = (Manager) thatObject;
            return this.bonus == that.bonus;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGrade(), bonus);
    }

    /**
     * 由于父类toString方法使用动态绑定，所以此处复用很容易，直接调用super.toString()
     * @return Manager对象的描述
     */
    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
