package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int numThrows = 1000000;  
        int dartsInCircle = 0;

        for (int i = 0; i < numThrows; i++) {
            
            double x = Math.random();
            double y = Math.random();

            // Check if the dart is inside the quarter circle using x^2 + y^2 <= 1
            double distanceFromOrigin = Math.sqrt(x * x + y * y);
            if (distanceFromOrigin <= 1) {
                dartsInCircle++;
            }
        }

        // Pi is approximately 4 * (darts in circle / total darts)
        double piEstimate = 4.0 * dartsInCircle / numThrows;
        System.out.println("Estimated value of Pi: " + piEstimate);

	}

}
