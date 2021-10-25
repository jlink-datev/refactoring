package ex2.before;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Ex2 Before: Euro tests")
public class EuroTests {

	@Test
	public void euroHasAValue() {
		assertEquals(new Euro(1).value(), 1);
		assertEquals(new Euro(23).value(), 23);
		assertEquals(Euro.ZERO.value(), 0);
	}

	@Test
	public void euroCannotBeNegative() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Euro(-1);
		});
	}

	@Test
	public void equality() {
		assertFalse(new Euro(4).equals(null));
		assertFalse(new Euro(4).equals(new Object()));
		assertTrue(new Euro(3).equals(new Euro(3)));
		assertFalse(new Euro(4).equals(new Euro(3)));
	}

	@Test
	public void addition() {
		assertEquals(new Euro(20), new Euro(3).plus(new Euro(17)));
		assertEquals(new Euro(17), new Euro(0).plus(new Euro(17)));
	}

	@Test
	public void subtraction() {
		assertEquals(new Euro(16), new Euro(33).minus(new Euro(17)));
		assertEquals(new Euro(17), new Euro(17).minus(new Euro(0)));
	}

	@Test
	public void compareEurosByValue() {
		assertEquals(0, new Euro(1).compareTo(new Euro(1)));
		assertEquals(1, new Euro(1).compareTo(new Euro(2)));
		assertEquals(-1, new Euro(3).compareTo(new Euro(2)));
	}
}
