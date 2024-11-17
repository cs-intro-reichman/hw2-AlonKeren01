// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		Double approx = 1.0;
		Double divisor = 3.0;
		boolean action = false;

		for (int i = 0; i < n; i++){
			if (!action){
				approx = approx - (1 / divisor);
				action = true;
			}
			else {
				approx = approx + (1 / divisor);
				action = false;
			}
			divisor = divisor + 2;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approx * 4.0);
	}
}