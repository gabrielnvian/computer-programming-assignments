public class SimpleHarmonicMotion {
    public static void main(String[] args) {
        final double W = Math.PI;               // Angular speed
        final int A = 3;                        // Amplitude
        final double PHI = Math.PI * 2 / 3;     // Initial angle
        int t = 2;                              // Time

        double x = A * Math.cos(W * t - PHI);

        System.out.println("The position at time t = 2 is: " + x);

        System.out.print("\nCOMPUTATION END");
    }
}
