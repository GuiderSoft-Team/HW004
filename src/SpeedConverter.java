public class SpeedConverter {
    public static void main(String[] args) {
    }
    public static long toMilesPerHour (double kilometersPerHour) {
        long roundedValue = Math.round(kilometersPerHour/1.609);
        if(roundedValue>=0) {
            return roundedValue;
        }else{
            return -1;
        }
    }
    public static void PrintConversion (double kilometersPerHour) {
        if(kilometersPerHour<0){
            System.out.println("INVALID VALUE");
        }else{
            System.out.println(kilometersPerHour+"km/h = "+toMilesPerHour(kilometersPerHour)+"mi/h");
        }
    }
}
