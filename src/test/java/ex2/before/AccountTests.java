package ex2.before;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Ex2 Before: Account tests")
public class AccountTests {

	private final Account account = new Account();

	@Test
	public void initialBalanceIsZero() {
		assertEquals(0, account.getBalance());
	}

	@Test
	public void depositingMoney() {
		account.deposit(50);
		assertEquals(50, account.getBalance());
		account.deposit(20);
		assertEquals(70, account.getBalance());
	}

	@Test
	public void withdrawingCoveredAmounts() {
		account.deposit(50);
		account.withdraw(30);
		assertEquals(20, account.getBalance());
		account.withdraw(20);
		assertEquals(0, account.getBalance());
	}

	@Test
	public void withdrawingUncoveredAmountsFails() {
		account.deposit(1);
		assertThrows(IllegalArgumentException.class, () -> {
			account.withdraw(2);
		});
	}
}
