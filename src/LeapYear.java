public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }
    public static boolean isLeapYear(int year){
        if(year>0 && year<9999){
            if(year%4==0 & year%100==0 & year%400==0){
                System.out.print("it has 366 days.\t-");
                return true;
            }else {
                System.out.print("it has 365 days.\t-");
                return false;
            }
        }else{
            System.out.print("Invalid Value!\t\t-");
            return false;
        }
    }
}
