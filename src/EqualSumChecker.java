public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(2,2,4));
        System.out.println(hasEqualSum(1,2,5));
    }
    public static boolean hasEqualSum (int a,int b,int c){
            if((a+b)==c){
                return true;
            }else{
                return false;
            }
    }
}
