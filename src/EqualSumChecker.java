public class EqualSumChecker {
    public static void main(String[] args) {

        hasEqualsum(1,2,4);



    }

    public static boolean hasEqualsum(int a, int b, int c) {

        if (a +b == c){


            System.out.println("TRUE");
            return true;
        }
        else
        {
            System.out.println("FALSE");
            return false;

        }



    }

}
