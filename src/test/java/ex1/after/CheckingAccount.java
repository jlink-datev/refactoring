package ex1.after;

public class CheckingAccount extends Account {

	private final int overdraft;

	public CheckingAccount(int initialBalance, int overdraft) {
		super(initialBalance);
		this.overdraft = overdraft;
	}

	@Override
	protected boolean isWithdrawCovered(int amount) {
		return amount <= balance + overdraft;
	}

}
