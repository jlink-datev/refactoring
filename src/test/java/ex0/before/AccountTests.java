package ex0.before;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Ex0 Before: Account tests")
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
	public void depositMoneyInSavingsAccount() throws Exception {
		SavingsAccount konto = new SavingsAccount();
		konto.credit(50);
		assertEquals(50, konto.currentBalance());
		konto.credit(30);
		assertEquals(80, konto.currentBalance());
	}
}
