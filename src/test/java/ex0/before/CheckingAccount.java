package ex0.before;

public class CheckingAccount {

	private int balance = 0;

	public void deposit(int amount) {
		balance += amount;
	}

	public int getBalance() {
		return balance;
	}

}
