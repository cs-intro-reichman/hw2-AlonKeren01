// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
	    String mode = args[1]; // “v” (verbose) or “c” (concise).
		boolean voc = true; //true is v, false is c
		int steps = 1;
		int j = 0;

		if (mode.equals("c")) voc = false;

		for (int i = 1; i < n + 1; i++){
			j = i;
			if (voc) System.out.print(j + " ");

			while (true){
				if (j % 2 == 0) j = j / 2;
				else j = (j * 3) + 1;
				steps += 1;

				if (j == 1) {
					if (voc) System.out.print(j + " ");
					break;
				}
				else if (voc) System.out.print(j + " ");
			}

			if (voc) System.out.println("(" + steps + ")");
			steps = 1;
		}

		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
