public class LeapYear {
    public static void main(String[] args) {

        System.out.println(artikyıllar(1700));

        System.out.println(artikyıllar(1600));
    }
    public static boolean artikyıllar(int years){

        if(years>=1 && years<=9999){
            if(years%4==0){

                if(years%100==0){

                    if(years%400==0){
                        System.out.println("Bu yıl artık bir yıldır. "+"("+years+")");

                        return true;
                    }else {

                        System.out.println("Bu yıl artık yıl değildir. "+"("+years+")");
                    }
                }
                else return false;
            }
            else return false;
        }
        return false;
    }
}
