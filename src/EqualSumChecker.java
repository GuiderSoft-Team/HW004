public class EqualSumChecker {
    public static void main(String[] args) {
        double milesPerHour=0;
        double kilometersPerHour=0;
        milesPerHour=Math.round(kilometersPerHour / 1.609);
        System.out.println("...."+"mi/h = "+"km/h= "+ toMilesPerHour (-5.6));

    }

    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("invalued value");
            return -1;
        }else {
        }
        return Math.round(kilometersPerHour / 1.609);
        }


    }







