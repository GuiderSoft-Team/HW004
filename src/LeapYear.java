public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year is a leap year (it has 366 days).");
                        return true;
                    }
                } else {
                    System.out.println("The year is not a leap year (it has 365 days).");
                    return false;
                }
            } else {
                System.out.println("The year is not a leap year (it has 365 days).");
                return false;
            }
            return true;
        } else {
            System.out.println("the parameter is not in range (1-9999)");
            return false;
        }
    }


        public static void main (String[]args){
            System.out.println(isLeapYear(-1600));
            System.out.println(isLeapYear(1600));
            System.out.println(isLeapYear(2017));
            System.out.println(isLeapYear(2000));
        }

}