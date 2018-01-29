package volume1.chap14.section5;

public class TransferRunnable implements Runnable {
    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int DELAY = 10;

    public TransferRunnable(Bank bank, int fromAccount, double maxAmount) {
        this.bank = bank;
        this.fromAccount = fromAccount;
        this.maxAmount = maxAmount;
    }

    @Override
    public void run() {
        try {
            int toAccount = (int) (Math.random() * bank.size());
            double amount = maxAmount * Math.random();
            bank.transfer(fromAccount, toAccount, amount);
            Thread.sleep((int) Math.random() * DELAY);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
