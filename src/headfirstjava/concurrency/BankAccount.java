package headfirstjava.concurrency;

public class BankAccount {
    public int balance = 100;
    public int getBalance() {
        return balance;
    }
    public void spend(int amount) {
        balance = balance - amount;
        if (balance < 0) {
            System.out.println("Overdrawn!");
        }
    }

}
