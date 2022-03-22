public class LeapYear {

    public static void main(String[] args) {

        isLeapYear(8);


    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 & year <= 9999) {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0){
                        System.out.println("True");
                        return true;
                    }
                    System.out.println("False");
                    return false;
                }
                System.out.println("True");
                return true;
            }
            System.out.println("False");
            return false;
        }
        System.out.println("False");
        return false;
    }
}






