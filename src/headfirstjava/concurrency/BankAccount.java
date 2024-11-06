package headfirstjava.concurrency;

public class BankAccount {
    public int balance = 100;

    public void spend(int amount) {
        synchronized (balance) {
            balance = balance - amount;
            if (balance < 0) {
                System.out.println("Overdrawn!");
            }
        }
    }
}
