package ex2.before;

public class Euro implements Comparable<Euro> {

	public static final Euro ZERO = new Euro(0);
	private final int value;

	public Euro(int value) {
		checkNotNegative(value);
		this.value = value;
	}

	private void checkNotNegative(int value) {
		if (value < 0) {
			String message = String.format("Value %s must be >= 0", value);
			throw new IllegalArgumentException(message);
		}
	}

	public int value() {
		return value;
	}

	@Override
	public String toString() {
		return value + " EUR";
	}

	@Override
	public int hashCode() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Euro other = (Euro) obj;
		return value == other.value;
	}

	public Euro plus(Euro addend) {
		return new Euro(value + addend.value);
	}

	public Euro minus(Euro subtrahend) {
		return new Euro(value - subtrahend.value);
	}

	@Override
	public int compareTo(Euro other) {
		if (this.equals(other))
			return 0;
		if (value > other.value)
			return -1;
		return 1;
	}

}
