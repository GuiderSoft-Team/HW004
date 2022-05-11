public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(2048);
        printMegaBytesAndKiloBytes(-4563);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int overKiloBytes = (kiloBytes % 1024);
        if (kiloBytes < 0) {
            System.out.println("Invalid Value!");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB" + (overKiloBytes != 0 ? " and " + overKiloBytes + " KB":""));
        }

    }
}
