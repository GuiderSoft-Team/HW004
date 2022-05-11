public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,-1,0));
    }
    public static boolean hasEqualSum(int firstNum,int secondNum,int thirdNum){
        if (firstNum+secondNum==thirdNum){
            System.out.print("Equal\t\t-");
            return true;
        }else{
            System.out.print("Not equal\t-");
            return false;
        }
    }
}
