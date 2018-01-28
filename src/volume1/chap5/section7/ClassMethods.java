package chap5.section7;

import java.util.ArrayList;
import java.util.List;

public class ClassMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            String completeName = list.getClass().getName();
            // 只有在参数是类名或接口名时才能正常使用。否则会抛出Checked Exception
            Class c = Class.forName(completeName);
            System.out.println(c);
            Object o = c.newInstance();
            System.out.println(o.getClass().getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
//        /**
//         * 不能使用simple name如ArrayList来获取Class对象，而应该使用完整名称java.util.ArrayList
//         */
//        try {
//            String simpleName = list.getClass().getSimpleName();
//            Class c = Class.forName(simpleName);
//            System.out.println(c);
//            Object o = c.newInstance();
//            System.out.println(o.getClass().getName());
//        } catch (Exception ex) {
//            System.out.println("Cannot instantiate an object using simple class name");
//        }
        /**
         * Class表示一种类型而不是类
         */
        try {
            int i = 0;
            Class c = int.class;
            System.out.println(c);
            c.getName();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            Class c = Double[].class;
            System.out.println(c);
//            Object o = c.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
