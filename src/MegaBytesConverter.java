import java.util.Scanner;

public class MegaBytesConverter {
    //TODO: Please open the readme.txt file and answer 3rd question.

    //1 MB = 1024 KB
    //1100 KB = 1MB + 76 KB
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("KB cinsinden giriş yapınız : ");
        int deger=input.nextInt();
        printMegaBytesAndKiloBytes(deger);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mb = kiloBytes/1024;

        int kalanDeger = kiloBytes%1024;
        if(kiloBytes<0) {
            System.out.println("Invalid");
        }else {
            System.out.println(kiloBytes+" KB = "+mb+" MB + "+kalanDeger+" KB' A EŞİTTİR.");

        }




    }


}
