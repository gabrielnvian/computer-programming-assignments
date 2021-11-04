import java.util.Scanner;

public class SkilledCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("########################################################");
        System.out.println("####               Skilled Calculator               ####");
        System.out.println("########################################################");
        System.out.println();

        System.out.print("Numbers (w, h, l) : ");
        String[] strings = scanner.nextLine().split(" ");

        int w = Integer.parseInt(strings[0]);
        int h = Integer.parseInt(strings[1]);
        int l = Integer.parseInt(strings[2]);

        float sum = w + h + l;
        float avg = sum / 3;
        float product = w * h * l;

        System.out.println("The average is: \t" + avg);
        System.out.println("The sum is: \t\t" + sum);
        System.out.println("The product is: \t" + product);
        System.out.println("The attractivity score is: \t" + ac(w, h, l));
    }

    static double ac(int w, int h, int l) {
        final double y = 0.001;

        double a = (w - l) / Math.pow(l + 1, 5);
        double b = (2 * Math.pow(y, 2) * h) / (h + 1);

        return a - b;
    }
}
