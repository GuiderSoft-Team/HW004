import java.util.Scanner;

public class EqualSumChecker {
    // Please open the readme.txt file and answer 5th question.
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
    public static boolean hasEqualSum (int a,int b,int c){
        if(a+b==c){
            return true;
        }
        else if((a+(-b))+((-a)*1+b)!=0) {
            return true;
        }
        else{
            return false;
        }
    }
}
