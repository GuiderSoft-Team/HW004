public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.25));
        printConversion(-100);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long roundedValue=Math.round((kilometersPerHour/1.609));
        if (roundedValue>=0){
            return roundedValue;
        }else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }

}
