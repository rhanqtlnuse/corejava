package chap5.section7;

import chap5.section2.Employee;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class ManipulateObject {
    public static void main(String[] args) {
        Employee e = new Employee("qi", "han", 3);
        Class cl = e.getClass();
        try {
            Field f = cl.getDeclaredField("firstName");
            // 如果没有这条语句会报IllegalAccessException，因为反射默认受到访问控制
            f.setAccessible(true);
            Object v = f.get(e);
            System.out.println(v.getClass().getName());
            System.out.println(v);
            Field f2 = cl.getDeclaredField("grade");
            f2.setAccessible(true);
            int grade = f2.getInt(e);
            Object boxedGrade = f2.get(e);
            System.out.println(grade);
            System.out.println(boxedGrade);
            f2.set(e, 4);
            int grade2 = f2.getInt(e);
            System.out.println(grade2);
        } catch (NoSuchFieldException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
        try {
            Employee e2 = new Employee("chuxi", "zhong", 2);
            Field[] fields = e2.getClass().getDeclaredFields();
            // 快捷方法
            AccessibleObject.setAccessible(fields, true);
            for (Field f : fields) {
                System.out.println(f.get(e2));
            }
        } catch (Exception ex) {

        }
    }
}
