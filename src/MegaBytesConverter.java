public class MegaBytesConverter {
    //Please open the readme.txt file and answer 3rd question.
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-2048);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes=kiloBytes/1024;
        int kalan=kiloBytes%1024;
        if (kiloBytes<0){
            System.out.println("Geçersiz deger girildi.");
        }else{
            System.out.println(megaBytes+" MB "+kalan+" KB ");
        }
    }

}
