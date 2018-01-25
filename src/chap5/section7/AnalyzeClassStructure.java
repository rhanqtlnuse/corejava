package chap5.section7;

import java.lang.reflect.*;

public class AnalyzeClassStructure {
    public static void print(String className) {
        try {
            Class c = Class.forName(className);

            System.out.print(Modifier.toString(c.getModifiers()));
            System.out.print(" " + "class" + " " + c.getName());
            Class superClass = c.getSuperclass();
            if (superClass != null) {
                System.out.print(" " + "extends" + " " + superClass.getName());
            }
            System.out.println(" " + "{");

            printFields(c.getDeclaredFields());
            printConstructors(c.getDeclaredConstructors());
            printMethods(c.getDeclaredMethods());

            System.out.println("}");
        } catch (Exception ex) {
            System.out.println("Class Not Found");
        }
    }
    private static void printFields(Field[] fields) {
        for (Field f : fields) {
            System.out.print("\t" + Modifier.toString(f.getModifiers()));
            String type = f.getType().getName();
            if (type.startsWith("[")) {
                System.out.print(" " + type.substring(2, type.indexOf(';')) + "[]");
            } else {
                System.out.print(" " + type);
            }
            System.out.println(" " + f.getName() + ";");
        }
        System.out.println();
    }
    private static void printConstructors(Constructor[] constructors) {
        for (Constructor con : constructors) {
            System.out.print("\t");
            String modifiers = Modifier.toString(con.getModifiers());
            if (!modifiers.equals("")) {
                System.out.print(modifiers);
            }
            System.out.print(" " + con.getName() + "(");
            parameterFormatter(con.getParameters());
            System.out.println(");");
        }
        System.out.println();
    }
    private static void printMethods(Method[] methods) {
        for (Method m : methods) {
            System.out.print("\t");
            String modifiers = Modifier.toString(m.getModifiers());
            if (!modifiers.equals("")) {
                System.out.print(modifiers + " ");
            }
            String returnType = m.getReturnType().getName();
            if (returnType.startsWith("[")) {
                System.out.print(returnType.substring(2, returnType.indexOf(';')) + "[]");
            } else {
                System.out.print(returnType);
            }
            System.out.print(" " + m.getName() + "(");
            parameterFormatter(m.getParameters());
            System.out.println(");");
        }
    }
    private static void parameterFormatter(Parameter[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            String parameterType = parameters[i].getType().getName();
            if (parameterType.startsWith("[")) {
                System.out.print(parameterType.substring(2, parameterType.indexOf(';')) + "[]");
            } else {
                System.out.print(parameterType);
            }
            if (i != parameters.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        print("java.util.ArrayList");
    }
}
