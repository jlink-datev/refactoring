package ex0.after;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Ex0 After: Account tests")
class AccountTests {

	@Test
	public void depositMoneyInCheckingAccount() {
		CheckingAccount konto = new CheckingAccount();
		konto.deposit(50);
		assertEquals(50, konto.getBalance());
		konto.deposit(30);
		assertEquals(80, konto.getBalance());
	}

	@Test
	public void depositMoneyInSavingsAccount() {
		SavingsAccount konto = new SavingsAccount();
		konto.deposit(50);
		assertEquals(50, konto.getBalance());
		konto.deposit(30);
		assertEquals(80, konto.getBalance());
	}
}
