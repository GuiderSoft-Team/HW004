public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        System.out.println();

        System.out.println(1.5+" m/h = "+toMilesPerHour(1.5)+" mi/h");
        System.out.println(10.25+" m/h = "+toMilesPerHour(10.25)+" mi/h");
        System.out.println(-5.6+" m/h = "+toMilesPerHour(-5.6)+" mi/h");
        System.out.println(25.42+" m/h = "+toMilesPerHour(25.42)+" mi/h");
        System.out.println(75.114+" m/h = "+toMilesPerHour(75.114)+" mi/h");


    }

    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHours = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = "+ milesPerHours +" mi/h");

        }
    }

}