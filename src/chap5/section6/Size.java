package chap5.section6;

public enum Size {
    // 实际上是一个类，其中有4个实例
    // 后面的参数列表用于构造函数，应该与枚举类中定义的属性一一对应
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
