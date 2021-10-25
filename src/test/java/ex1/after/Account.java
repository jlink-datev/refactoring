package ex1.after;

public abstract class Account {

	protected int balance;

	public static Account newCheckingAccount(int initialBalance, int overdraft) {
		return new CheckingAccount(initialBalance, overdraft);
	}

	public static Account newSavingsAccount(int initialBalance) {
		return new SavingsAccount(initialBalance);
	}

	public static Account newInstantAccessAccount(int initialBalance, int minimumBalance) {
		return new InstantAccessAccount(initialBalance, minimumBalance);
	}

	protected Account(int initialBalance) {
		balance = initialBalance;
	}

	public void withdraw(int amount) {
		if (!isWithdrawCovered(amount)) {
			String message = String.format("Amount %s cannot be withdrawn", amount);
			throw new IllegalArgumentException(message);
		}
		balance -= amount;
	}

	public int getBalance() {
		return balance;
	}

	protected abstract boolean isWithdrawCovered(int amount);
}
