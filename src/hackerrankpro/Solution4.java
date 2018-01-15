package hackerrankpro;

//import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> Array = new ArrayList<>();
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            int arr[] = new int[(int) n];
            int toZero = 0;
            int justNumb = 0;
            int keepInteger = 1;
            for (int i = 0; i < n; i++) {
                if (i <= 0) {
                    arr[i] = keepInteger;
                } else {
                    arr[i] = keepInteger;
                    keepInteger += arr[i - 1];
                    //System.out.println(keepInteger);
                }
            }
            System.out.println(keepInteger);
        }

    }
}
/*
BigInteger a = new BigInteger("0");
BigInteger arr[] = new BigInteger[(int) n];
 */
