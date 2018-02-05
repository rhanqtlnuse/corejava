package volume2.chap1.section5;

import java.io.Serializable;

class Department implements Serializable {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return getClass().getName() + "[" + "name=" + name + "]";
    }
}
