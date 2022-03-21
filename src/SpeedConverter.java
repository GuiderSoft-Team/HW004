import java.util.Random;

public class SpeedConverter {
    public static void main(String[] args) {
        Random rand = new Random();

        double[] inputs = {1.5, 10.25, -5.6, 25.42, 75.114};

        for (double input : inputs) {
            printConversion(input);
        }

    }

    private static long toMilesPerHour(double kilometersPerHour) {

        double milesPerHour = kilometersPerHour / 1.609;

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(milesPerHour);
        }
    }

    private static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
            ;
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
