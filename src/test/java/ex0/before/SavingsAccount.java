package ex0.before;

public class SavingsAccount {

	private int balance = 0;

	public void credit(int amount) {
		int oldBalance = balance;
		int newBalance = oldBalance + amount;
		balance = newBalance;
	}

	public int currentBalance() {
		return balance;
	}

}
