package chap12.section8;

class Student extends Person {
    private String school;
    private int grade;

    public Student(String name, int age, String school, int grade) {
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
