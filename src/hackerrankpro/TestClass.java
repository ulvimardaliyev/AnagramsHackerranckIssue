package hackerrankpro;

import java.math.BigInteger;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        BigInteger k = new BigInteger("0");
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            for (int i = 3, j = 5; i < n; i += 3, j += 5) {
                if (i % 5 != 0) {
                    k = k.add(BigInteger.valueOf(i));
                }
                if (j < n) {
                    k = k.add(BigInteger.valueOf(j));
                }
            }
            System.out.println(k);
        }

    }
}
