public class SpeedConverter {
    // Please open the readme.txt file and answer 1st and 2nd questions.
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(-1));
        printConversion(10.25);
    }
    public static long toMilesPerHour (double kilometersPerHour){
        long yuvarla=Math.round(kilometersPerHour/1.609);
        if(yuvarla>0){
            return yuvarla;
        }else{
            return -1;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Geçersiz Değer");
        }else{
            System.out.println(kilometersPerHour+"km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }
}

