package hackerrankpro;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            //n--;
            //BigInteger convertN = new BigInteger(Integer.toString(n));
            //BigInteger bolunen = new BigInteger("1");

            BigInteger bolen = new BigInteger("3");
            BigInteger zero = new BigInteger("0");
            BigInteger sum = new BigInteger("0");
            BigInteger five = new BigInteger("5");
            // BigInteger plusOne = new BigInteger("1");
            BigInteger integer;
            for (int i = 1; i < n; i++) {
                integer = new BigInteger(Integer.toString(i));
                if (integer.remainder(bolen).equals(zero) || integer.remainder(five).equals(zero)) {
                    sum = sum.add(integer);
                    // System.out.println("sum" + sum);
                }
            }
            System.out.println(sum);
        }
    }
}
