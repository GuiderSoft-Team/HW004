public class MegaBytesConverter {
    //TODO: Please open the readme.txt file and answer 3rd question.
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int kb= kiloBytes%1024;
        int mb= kiloBytes/1024;

        if (kiloBytes<0){
            System.out.println("INVALID VALUE");
        }else {
            System.out.println(kiloBytes+"KB = "+mb+" MB and "+kb+" KB");
        }
    }
}
