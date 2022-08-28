public class EqualSumChecker {
    public static void main(String[] args) {

        hasEgualSumChecker(1,1,1);
        System.out.println(hasEgualSumChecker(1,1,2));
    }

    public static boolean hasEgualSumChecker(int number1, int number2, int number3) {
        if ((number1 + number2) == number3) {
            return true;

        }else {
            return false;
        }



    }
}







