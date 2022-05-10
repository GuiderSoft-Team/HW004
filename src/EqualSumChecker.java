public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(5,7,9));
        System.out.println(hasEqualSum(2,3,4));
    }
    public static boolean hasEqualSum (int num1,int num2,int num3){
        if((num1+num2)==num3){
            return true;
        }else{
            return false;
        }
    }
}

