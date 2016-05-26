import java.math.BigInteger;

/**
 * Prints out the Lucas sequence.
 */
public class SequencePrinterLucas extends SequencePrinter {
	/**
	 * Main format string, used when printing out the numbers of the lucas sequence.
	 * 
	 * See http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
	 * for information on syntax used here.
	 */
	public static final String FORMAT = "Term %d: %d%n";

	/**
	 * Prints out the given numbers in this sequence.
	 * 
	 * In the lucas sequence, the initial values of 2 and 1 are used, and then
	 * each subsequent term is obtained by adding the previous two terms
	 * together.
	 *
	 * @param count Number of terms of the lucas sequence to print
	 */
	@Override
	public void printNumbers(int count) {
		// Lucas sequence's first value
		BigInteger currentTerm = new BigInteger("2");
		// Lucas sequence's second value
		BigInteger nextTerm = new BigInteger("1");

		// Loop through each term in the lucas sequence
		for (int termNumber = 0; termNumber < count; termNumber++) {
			// Print this value of the lucas sequence
			System.out.printf(FORMAT, termNumber, currentTerm);

			// Calculate the next term in the lucas sequence
			BigInteger temp = currentTerm.add(nextTerm);
			currentTerm = nextTerm;
			nextTerm = temp;
		}
	}
}