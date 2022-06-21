public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,3,4));
        System.out.println(hasEqualSum(1,2,5));
    }
    public static boolean hasEqualSum (int a,int y,int z){
        if((a+y)==z){
            return true;
        }else{
            return false;
        }
    }
}

