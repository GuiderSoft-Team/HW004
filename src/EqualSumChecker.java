public class EqualSumChecker {
    //TODO: Please open the readme.txt file and answer 5th question.
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,5));
    }


    public static boolean hasEqualSum(int sayi1,int sayi2,int sayi3){
        int sum=sayi1+sayi2;
        boolean flag=false;
        if(sum==sayi3){
            flag=true;
        }
        return flag;
    }




}
