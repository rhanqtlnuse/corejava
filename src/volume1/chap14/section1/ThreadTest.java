package volume1.chap14.section1;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("thread1");
                }
            }
        });
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("thread2");
                }
            }
        });
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("thread3");
                }
            }
        });
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
    }
}
