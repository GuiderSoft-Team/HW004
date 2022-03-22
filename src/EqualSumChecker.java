public class EqualSumChecker {
    //Please open the readme.txt file and answer 5th question.

    public static void main(String[] args) {
        System.out.println((hasEqualSum(5,6,11)));
        System.out.println(hasEqualSum(7,7,6));
        System.out.println();
        System.out.println("HAYIRLI ÇALIŞMALAR");
    }

    public static boolean hasEqualSum(int x,int y,int z){
            if(x+y==z){
                return true;
            }else{
                return false;
            }
    }


}
