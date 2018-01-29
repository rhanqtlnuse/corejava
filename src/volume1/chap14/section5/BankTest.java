package volume1.chap14.section5;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank(100, 1000);
        for (int i = 0; i < 100; i++) {
            TransferRunnable r = new TransferRunnable(bank, i, 1000);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
