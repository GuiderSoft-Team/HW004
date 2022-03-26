public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }


        public static void main (String[]args){

            int[] years={-1600,1600,2017,2000};
            for (int i = 0; i < years.length; i++) {
                if(isLeapYear(years[i])) {
                    System.out.println(years[i]+" is a leap year (it has 366 days).");
                }else{
                    System.out.println(years[i]+" is not a leap year (it has 366 days).");
                }
            }

        }

}