//Copy and paste from original commit and recommit
//prior to next git workshop
public class Fixme {
    public static void main(String[] args) {
        final int NUM_FACTS = 5;

        for(int i = 0; i < NUM_FACTS; i++) {
        	System.out.println( i + "! is " + factorial(i));
        	System.out.println("Calculation done");
	}
    }

    public static int factorial(int n) {
        int result = 1;
        for(int i = 2; i <= n; i++)	result *= i;

        return result;
    }
}
