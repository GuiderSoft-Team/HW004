public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1600));
    }
    public static boolean isLeapYear(int year){

        if(year>=1 && year<=9999){
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        System.out.println("Artık yıl 366 gün ");
                        return true;
                    }else {
                        System.out.println("Artık yıl değil 365 gün");
                    }
                }else return false;
            }else return false;
        }
        return false;
    }
}
