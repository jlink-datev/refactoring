package ex1.after;

public class SavingsAccount extends Account {

	public SavingsAccount(int anfangsSaldo) {
		super(anfangsSaldo);
	}

	@Override
	protected boolean isWithdrawCovered(int amount) {
		return amount <= balance;
	}

}
