public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(5,4,3));
        System.out.println(hasEqualSum(1,7,9));
        System.out.println(hasEqualSum(7,-2,5));
    }

    public static boolean hasEqualSum(int x,int y, int z){
        return x + y == z;
    }

}
