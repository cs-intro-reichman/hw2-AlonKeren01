// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String crowd = args[0].toUpperCase();
            int n = Integer.parseInt(args[1]);
            String give = "Give me a";
            char chr;
            char[] chars = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R','S','X'};
            boolean x = false;

            for (int i = 0; i < crowd.length(); i++){
                chr = crowd.charAt(i);
                for (int j = 0; j < 12; j++){
                    if (chr == chars[j]) {
                        x = true;
                        break;
                    }
                }
                if (x) System.out.println(give + "n " + chr + ": " + chr + "!");
                else System.out.println(give + "  " + chr + ": " + chr + "!");
                x = false;
            }

            System.out.println("What does that spell?");
            for(int s = 0; s < n; s++) System.out.println(crowd + "!!!");
        }
}
