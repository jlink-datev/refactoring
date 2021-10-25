package ex2.after;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Ex2 After: Account tests")
public class AccountTests {

	private final Account account = new Account();

	@Test
	public void initialBalanceIsZero() {
		assertEquals(new Euro(0), account.getBalance());
	}

	@Test
	public void depositingMoney() {
		account.deposit(new Euro(50));
		assertEquals(new Euro(50), account.getBalance());
		account.deposit(new Euro(20));
		assertEquals(new Euro(70), account.getBalance());
	}

	@Test
	public void withdrawingCoveredAmounts() {
		account.deposit(new Euro(50));
		account.withdraw(new Euro(30));
		assertEquals(new Euro(20), account.getBalance());
		account.withdraw(new Euro(20));
		assertEquals(new Euro(0), account.getBalance());
	}

	@Test
	public void withdrawingUncoveredAmountsFails() {
		account.deposit(new Euro(1));
		assertThrows(IllegalArgumentException.class, () -> {
			account.withdraw(new Euro(2));
		});
	}
}
