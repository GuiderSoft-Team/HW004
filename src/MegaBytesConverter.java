public class MegaBytesConverter {
    public static void main(String[] args) {

        int[] inputs = {2500,-1024,5000};

        for (int input:inputs) {
            printMegaBytesAndKiloBytes(input);
        }
    }

    private static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes=kiloBytes/1024;
        int remainingKiloBytes=kiloBytes%1024;

        if(kiloBytes<0){
            System.out.println("\"Invalid Value\" because parameter is less than 0.");
        }else{
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");
        }
    }
}