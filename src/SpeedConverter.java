public class SpeedConverter {
    // Please open the readme.txt file and answer 1st and 2nd questions.


    public static void main(String[] args) {

        System.out.println(ToMilesPerHour(214.457));
        printConver(45);
    }

    public static long ToMilesPerHour(double kilometrePerHour){
        long yuvarla=Math.round(kilometrePerHour/1.609);
        if(kilometrePerHour<0){
            return -1;
        }else{
            return yuvarla;
        }
    }

    public static void printConver(double kilometrePerHour){
        if(kilometrePerHour<0){
            System.out.println("Geçersiz Değer");
        }else{
            System.out.println(kilometrePerHour+"km/h = "+ToMilesPerHour(kilometrePerHour)+" mi/h");
        }
    }
}

           /*Giriş/çıkış örnekleri:
            *MilesPerHour(1.5); → 1 değerini döndürmeli
*MilesPerHour(10.25); → 6 değerini döndürmeli
*MilesPerHour(-5.6); → -1 değerini döndürmeli
*MilesPerHour(25.42); → 16 değerini döndürmeli
*MilesPerHour(75.114); → 47 değerini döndürmeli
*/