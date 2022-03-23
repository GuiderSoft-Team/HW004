import java.util.Scanner;

public class LeapYear {
    // Please open the readme.txt file and answer 4th question.
        public static void main(String[] args) {
            isLeapYear(true);
        }
    private static boolean isLeapYear(boolean artik){
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen yılı giriniz:");
       int yil=input.nextInt();
        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if(artik==true)
            System.out.println(yil + " artık yıldır.(366 günü vardır).");
        else
            System.out.println(yil + " artık yıl değildir.(365 günü vardır).");
        return artik;

    }

}

