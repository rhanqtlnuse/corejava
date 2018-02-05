package volume2.chap1.section5;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("src/volume2/chap1/section5/employee.ser"))) {
            Department department = new Department("dept1");
            Employee e = new Employee("e1", 3, department);
            Manager m = new Manager("m1", 4, department, 5000.0);
            System.out.println(e);
            System.out.println(m);
            oout.writeObject(e);
            oout.writeObject(m);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream("src/volume2/chap1/section5/employee.ser"))) {
            Employee e = (Employee) oin.readObject();
            Manager m = (Manager) oin.readObject();
            System.out.println(e);
            System.out.println(e.getAge());
            System.out.println(m);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
