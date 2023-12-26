/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int inputNumber = Integer.parseInt(args[0]);
		int d = 1;
		while (d <= inputNumber) {
			if ((inputNumber % d) == 0) {
				System.out.println(d);
			}
			d++;
		}
	}
}
