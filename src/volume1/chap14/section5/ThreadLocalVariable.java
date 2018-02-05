package volume1.chap14.section5;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalVariable {
    private static int i = 0;
    private static final ThreadLocal<Integer> dateFormat = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return i++;
        }
    };

    public static void main(String[] args) {
        Runnable r = () -> System.out.println(dateFormat.get());
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

        Runnable r2 = () -> System.out.println(ThreadLocalRandom.current().nextInt());
        Thread t3 = new Thread(r2);
        Thread t4 = new Thread(r2);
        t3.start();
        t4.start();
    }
}
