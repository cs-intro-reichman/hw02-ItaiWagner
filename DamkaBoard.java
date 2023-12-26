/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int inputNum = Integer.parseInt(args[0]);
		
		int line = 1;
		
		while (line <= inputNum) {
			int len = 1;
			System.out.println();
			// if the line is even the line will start with " "
			if ((line % 2) == 0) {
				System.out.print(" ");
			}
			while (len <= inputNum) {
				System.out.print("* ");
				len++;
			}
			line++;
		}
	}
}
