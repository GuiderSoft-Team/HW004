public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("INVALID VALUE");
        }else{
            int girilenKB=kiloBytes;
            int megaB=girilenKB/1024;
            int kalanKB=girilenKB%1024;
            System.out.println(girilenKB+" KB = "+megaB+" MB and "+kalanKB+" KB");

        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
