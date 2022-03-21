import java.util.Arrays;

public class EqualSumChecker {
    public static void main(String[] args) {

        int[][] inputs = {{1, 1, 1}, {1, 1, 2}, {1, -1, 0}, {5, 5, 10}};

        for (int i = 0; i < inputs.length; i++) {
            System.out.println(hasEqualSum(inputs[i][0], inputs[i][1], inputs[i][2]));
        }
    }

    private static boolean hasEqualSum(int fNum, int sNum, int tNum) {
        if (fNum + sNum == tNum) return true;
        return false;
    }
}