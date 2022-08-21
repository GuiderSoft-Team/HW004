public class LeapYearCalculator {
    public static void main(String[] args) {
        int Year = 0;

        isLeapYear(1600);



    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
             System.out.println(year+" is nat a leap year");
            return false;

        } else if (year % 4 != 0) {

             System.out.println(year + " is nat a leap year");
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
              System.out.println(year+ "artik yil");
            return true;
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
             System.out.println(year+ "artik yil");
            return true;


        }else {
             System.out.println(year +" is nat a leap year");
            return false;
            }


        }

    }






