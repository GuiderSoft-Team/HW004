public class LeapYear {
    public static void main(String[] args) {

        int[] inputs = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600,
                1600, 2000, 2400,
                -1600, 1600, 2017, 2000};

        for (int input : inputs) {
            System.out.println(isLeapYear(input));
        }
    }

    private static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
