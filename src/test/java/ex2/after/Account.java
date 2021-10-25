package ex2.after;

public class Account {

	private Euro balance = Euro.ZERO;

	public void withdraw(Euro amount) {
		if (!isWithdrawCovered(amount)) {
			String message = String.format("Amount %s cannot be withdrawn", amount);
			throw new IllegalArgumentException(message);
		}
		balance = balance.minus(amount);
	}

	public void deposit(Euro amount) {
		balance = balance.plus(amount);
	}

	public Euro getBalance() {
		return balance;
	}

	private boolean isWithdrawCovered(Euro amount) {
		return balance.compareTo(amount) <= 0;
	}
}
