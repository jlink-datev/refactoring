package ex2.before;

public class Account {
	private int balance;

	public void withdraw(int amount) {
		if (!isWithdrawCovered(amount)) {
			String message = String.format("Amount %s cannot be withdrawn", amount);
			throw new IllegalArgumentException(message);
		}
		balance -= amount;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public int getBalance() {
		return balance;
	}

	private boolean isWithdrawCovered(int amount) {
		return balance - amount >= 0;
	}
}
