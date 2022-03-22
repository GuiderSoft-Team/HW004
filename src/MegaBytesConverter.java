public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mb = kiloBytes/1024;
        int kb2 = kiloBytes % 1024;

        if(kiloBytes< 0){

            System.out.println("Invalid Value");
            System.exit(-1);
        }
        System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb2 + " KB");
    }
}
