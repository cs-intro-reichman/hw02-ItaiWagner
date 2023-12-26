/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int inputNum = Integer.parseInt(args[0]);
		
		// Sets an initial string
		String outStr = inputNum + " is a perfect number since " + inputNum + " = 1";
		int d = 1;
		int sumCheck = 1;
		while (d < inputNum) {
			if (((inputNum % d) == 0) && (d != 1)) {
				outStr = outStr + " + " + d ;
				sumCheck = sumCheck + d;
			}
			d++;
		}
		if (sumCheck == inputNum) {
			System.out.println(outStr);
		} else {
			System.out.println(inputNum + " is not a perfect number");
		}
		
	}
}
