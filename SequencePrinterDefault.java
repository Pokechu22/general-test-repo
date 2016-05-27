import java.math.BigInteger;

/**
 * Prints out the Fibonacci sequence.
 */
public class SequencePrinterDefault extends SequencePrinter {
	/**
	 * Main format string, used when printing out the numbers of the fibonacci sequence.
	 * 
	 * See http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
	 * for information on syntax used here.
	 */
	public static final String FORMAT = "Term %d: %d%n";

	/**
	 * Prints out the given numbers in this sequence.
	 *
	 * In the Fibonacci sequence, the initial values of 0 and 1 are used
	 * (sometimes 1 and 10, and then each following term in the sequence is
	 * calculated by adding the two previous terms to eachother.
	 * 
	 * @param count Number of terms to print from the fibonacci sequence
	 */
	@Override
	public void printNumbers(int count) {
		// First term of the fibonacci sequence
		BigInteger currentTerm = new BigInteger("0");
		// Second term of the fibonacci sequence
		BigInteger nextTerm = new BigInteger("1");

		// Loop through the terms of the fibonacci sequence
		for (int termNumber = 0; termNumber < count; termNumber++) {
			// Print that term of the fibonacci sequence
			System.out.printf(FORMAT, termNumber, currentTerm);

			// Calculate the fibonacci sequence's next term
			BigInteger temp = currentTerm.add(nextTerm);
			currentTerm = nextTerm;
			nextTerm = temp;
		}
	}
}