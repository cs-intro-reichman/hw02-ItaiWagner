/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
        // Setting the upper bound and creating and printing the first random number
		int upperBound = 10;
        int currentNumber = (int) (Math.random() * upperBound);

        System.out.print(currentNumber + " ");
		
		// as long as the last number that was printed is less than the upperbound 
		// the loop keeps running
        while (currentNumber < upperBound) {
            // generating the next number TODO: no need this comment, it's easy to understand from the code
			int nextNumber = (int) (Math.random() * upperBound);
			
			// if the the next number and the last number form a non-decreasing sequence it prints the next number
			// if not, it breaks the loop by setting the last number to the upper bound
            if (nextNumber >= currentNumber) {
                System.out.print(nextNumber + " ");
                currentNumber = nextNumber;
			} else {
				currentNumber = upperBound;
			}
		}
	}
}
