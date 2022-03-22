public class SpeedConverter {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour  (10.25));
        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        double x = kilometersPerHour / 1.609;

        if (kilometersPerHour<0) {
            System.exit(-1);
        }
        return Math.round(x);
    }


    public static void printConversion(double kilometersPerHour){
        toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour <= 0){
            System.err.println("Invalid Value");
        }
        System.out.println(kilometersPerHour + " km/h = " + Math.round(toMilesPerHour(kilometersPerHour)) + " mi/h" );
    }


}
