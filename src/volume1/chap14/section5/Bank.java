package volume1.chap14.section5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private double[] accounts;
    private Lock lock;
    private Condition sufficientFunds;

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initialBalance;
        }
        lock = new ReentrantLock();
        sufficientFunds = lock.newCondition();
    }

//    // 第一个版本，不使用同步
//    public void transfer(int from, int to, double amount) {
//        System.out.print(Thread.currentThread());
//        if (accounts[from] - amount >= 0) {
//            accounts[from] -= amount;
//        }
//        System.out.printf(" %10.2f from %2d to %2d", amount, from, to);
//        accounts[to] += amount;
//        System.out.printf(" Total Balance: %10.2f\n", getTotalBalance());
//    }
//    // 第二个版本，使用ReentrantLock和Condition
//    public void transfer(int from, int to, double amount) throws InterruptedException {
//        lock.lock();
//        try {
//            while (accounts[from] < amount) {
//                sufficientFunds.await();
//            }
//            System.out.print(Thread.currentThread());
//            // 有可能在检查完余额之后被剥夺执行权而导致错误
//            if (accounts[from] - amount >= 0) {
//            // 在这里被剥夺执行权
//                accounts[from] -= amount;
//            }
//            accounts[to] -= amount;
//            System.out.printf(" %10.2f from %2d to %2d", amount, from, to);
//            accounts[to] += amount;
//            System.out.printf(" Total Balance: %10.2f\n", getTotalBalance());
//            sufficientFunds.signalAll();
//        } finally {
//            lock.unlock();
//        }
//    }
//    // 第二个版本
//    public double getTotalBalance() {
//        lock.lock();
//        try {
//            double sum = 0.0;
//            for (double a : accounts) {
//                sum += a;
//            }
//            return sum;
//        } finally {
//            lock.unlock();
//        }
//    }
    // 第三个版本，使用synchronized关键字
    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        while (accounts[from] < amount) {
            wait();
        }
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %2d to %2d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f\n", getTotalBalance());
        notifyAll();
    }
    // 第三个版本，使用synchronized关键字
    public synchronized double getTotalBalance() {
        double sum = 0.0;
        for (double a : accounts) {
            sum += a;
        }
        return sum;
    }
    public int size() {
        return accounts.length;
    }
}
