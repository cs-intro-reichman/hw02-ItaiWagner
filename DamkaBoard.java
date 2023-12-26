/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int inputNum = Integer.parseInt(args[0]);
		
		int line = 1;
		System.out.println();
		
		while (line <= inputNum) {
			int len = 1;
			// if the line is even the line will start with " "
			while (len <= inputNum) {
				if ((line % 2) == 0) {
					System.out.print(" *");
				} else {
					System.out.print("* ");
				}
				len++;
			}
			System.out.println();
			line++;
		}
	}
}
