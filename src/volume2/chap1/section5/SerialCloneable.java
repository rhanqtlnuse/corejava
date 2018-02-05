package volume2.chap1.section5;

import java.io.*;

public class SerialCloneable implements Serializable {
    public static void main(String[] args) {
        Employee e = new Employee("e1", 3, new Department("dept1"));
        Employee e2 = (Employee) clone(e);
        e2.setDepartment(new Department("dept2"));
        System.out.println(e);
        System.out.println(e2);
    }

    public static Object clone(Object obj) {
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream oout = new ObjectOutputStream(bout);
            oout.writeObject(obj);
            oout.close();

            ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
            ObjectInputStream oin = new ObjectInputStream(bin);
            Object cloned = oin.readObject();
            oin.close();

            return cloned;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
