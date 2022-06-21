public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int kb=kiloBytes%1024;
        int mb=kiloBytes/1024;

        if(kiloBytes<0){
            System.out.println(" Gerçersiz Değer");
        }else {
            System.out.println(kiloBytes+"KB = "+mb+" MB ve "+kb+" KB");
        }
    }
}
