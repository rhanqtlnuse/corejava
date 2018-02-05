package volume1.chap5.section7;

import volume1.chap5.section2.Employee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodPointer {
    public static void main(String[] args) {
        try {
            Method method = Math.class.getMethod("sqrt", double.class);
            for (int i = 1; i <= 10; i++) {
                double y = (Double) method.invoke(null, i);
                System.out.printf("%10.4f | %10.4f\n", (double) i, y);
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        try {
            Employee e1 = new Employee("qi", "han", 3);
            Employee e2 = new Employee("chuxi", "zhong", 3);
            Method method = Employee.class.getMethod("getFirstName");
            // 此处与上面Math不同，Math不能实例化，所以对象是null，这里必须要传入一个对象
            System.out.println(method.invoke(e1));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
