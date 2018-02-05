package volume2.chap1.section5;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int grade, Department department, double bonus) {
        super(name, grade, department);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return super.toString() + "[" + "bonus=" + bonus + "]";
    }
}
