public class Main {
	public static void main(String[] args) {
		SequencePrinter fibonacciSequence = new SequencePrinterFibonacci();
		fibonacciSequence.printNumbers(100);
		SequencePrinter lucasSequence = new SequencePrinterLucas();
		lucasSequence.printNumbers(100);
	}
}