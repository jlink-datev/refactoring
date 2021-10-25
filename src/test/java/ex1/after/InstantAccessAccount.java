package ex1.after;

public class InstantAccessAccount extends Account {

	private final int minimumBalance;

	public InstantAccessAccount(int initialBalance, int minimumBalance) {
		super(initialBalance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	protected boolean isWithdrawCovered(int amount) {
		return amount <= balance - minimumBalance;
	}

}
