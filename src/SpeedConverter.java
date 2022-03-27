public class SpeedConverter {
    //TODO: Please open the readme.txt file and answer 1st and 2nd questions.

    public static void main(String[] args) {

        //toMilesPerHour(25.42);
        printConversion(100);
    }



    public static void toMilesPerHour(double kilometersPerHour){
//milePerHour=kilometersPerHour/1.609
        double milePerHour=kilometersPerHour/1.609;
        if(kilometersPerHour<0){
            System.out.println(-1);
        }else{
            System.out.println(Math.round(milePerHour));
        }
    }

    public static void printConversion(double kilometersPerHour ){
        double milePerhour=kilometersPerHour/1.609;
        int mileRounded= (int) Math.round(milePerhour);
        if(kilometersPerHour<0) {
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour+" km/h = "+mileRounded+" mil/h");
        }
    }




}
