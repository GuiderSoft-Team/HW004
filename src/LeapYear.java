
public class LeapYear {
    public static void main(String[] args) {

        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1600));
    }
    public static boolean isLeapYear(int yil){

        if(yil>=1 && yil<=9999){
            if(yil%4==0){
                if(yil%100==0){
                    if(yil%400==0){
                        System.out.println(yil+  "=Bu yıl artık yıl ve 366 gün ");
                        return true;
                    }else {
                        System.out.println(yil+  "=Bu yıl artık yıl değildir ve 365 gün ");
                    }
                }else return false;
            }else return false;
        }
        return false;
    }
}