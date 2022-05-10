public class MegaBytesConverter {
    public static void main(String[] args) {
        printMbAndKb(2000);
    }
    public static void printMbAndKb(int kb){

        kb = kb % 1024;
        int mb=kb/1024;

        if(kb<0){
            System.out.println("GEÇERSİZ DEĞER");
        }else {
            System.out.println(kb+"KB = "+mb+" MB ve "+kb+" KB");
        }
    }
}
