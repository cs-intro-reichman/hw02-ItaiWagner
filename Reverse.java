/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args) {
		String s = args[0];
		
		int stringLength = s.length();
		// Loop through the entire string length TODO: thank you captain Obvious
		for (int i = (stringLength - 1); i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		// checks if the string lenhth is even or odd to find the middle character
		if ((stringLength % 2) == 0) {
			int midIndex = (stringLength - 1) / 2;
			System.out.println();
			System.out.println("The middle character is " + s.charAt(midIndex));
		} else {
			int midIndex = stringLength / 2;
			System.out.println();
			System.out.println("The middle character is " + s.charAt(midIndex));
		}	
	}
}
