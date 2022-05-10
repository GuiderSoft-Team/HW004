public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(mperhour(55));
        printConversion(25.42);
    }

    public static long mperhour(double kmperhour){
        long a=Math.round(kmperhour/1.609);
        if(a>=0){
            return a;
        }else{
            return -1;
        }
    }
    public static void printConversion(double kmperhour){

        if(kmperhour>0){
            System.out.println(kmperhour+"km/h = "+ mperhour(kmperhour)+" mi/h");
        }else{
            System.out.println("GEÇERSİZ DEĞER");
        }
    }
}
