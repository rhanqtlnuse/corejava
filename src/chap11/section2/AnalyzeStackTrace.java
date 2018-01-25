package chap11.section2;

import java.io.PrintWriter;
import java.io.StringWriter;

public class AnalyzeStackTrace {
    public static int factorial(int n) {
        System.out.println("factorial" + "(" + n + ")");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement frame : frames) {
            System.out.println(frame);
        }
        int r;
        if (n <= 1) {
            r = 1;
        } else {
            r = n * factorial(n-1);
        }
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
//        Throwable t = new Throwable();
//        StringWriter out = new StringWriter();
//        t.printStackTrace(new PrintWriter(out));
//        String description = out.toString();
//        System.out.println(description);
//
//        Throwable t2 = new Throwable();
//        StackTraceElement[] frames = t2.getStackTrace();
//        for (StackTraceElement frame : frames) {
//            System.out.println(frame.getClassName() + ", " + frame.getFileName() + ", " + frame.getLineNumber());
//        }
        factorial(3);
    }
}
