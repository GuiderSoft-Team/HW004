public class LeapYear {
    //TODO: Please open the readme.txt file and answer 4th question.

        public static void main(String[] args) {
            System.out.println(isLeapYear(-1600));
            System.out.println(isLeapYear(1600));
            System.out.println(isLeapYear(2017));
            System.out.println(isLeapYear(2000));
        }
        public static boolean isLeapYear(int year){

            if(year>=1 && year<=9999){
                if(year%4==0){
                    if(year%100==0){
                        if(year%400==0){
                            System.out.println("This year is a leap year and it has 366 days ");
                            return true;
                        }else {
                            System.out.println("This year is not a leap year.Since it has 365 days ");
                        }
                    }else return false;
                }else return false;
            }
            return false;
        }
    }