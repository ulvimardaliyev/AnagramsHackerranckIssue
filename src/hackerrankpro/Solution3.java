package hackerrankpro;

import java.math.*;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            BigInteger a = new BigInteger("0");

            BigInteger arr[] = new BigInteger[(int) n];
            BigInteger big = new BigInteger("0");
            BigInteger bolunen = new BigInteger("2");
            BigInteger zero = new BigInteger("0");
            for (int i = 0; i < n; i++) {
                //at first we must increase a's value
                //if i<=0 then a = 1 a[0] = 1
                if (i <= 0) {
                    a = a.add((BigInteger.valueOf(1)));

                    arr[i] = a;
                }// if i>0
                else {
                    //arr-in elementlerini a-nin qiymeti artmamis teyin et
                    arr[i] = a;
                    //bir element evvelki deyeri a-nin uzerine gel
                    //a += arr[i - 1];
                    a = a.add(arr[i - 1]);
                    //System.out.println("a beraberdir " + a);
                    //System.out.println("bolunen budurL " + a.remainder(bolunen).equals(zero));
                    if (a.remainder(bolunen).equals(zero)) {
                        big = big.add(a);
                    }
                }

            }
            System.out.println(big);
        }
    }
}
/*
    a= 0;
    eger 0<=0 => a=1, arr[0] = 1;
    eger 1>0 => arr[1] = 1, a = a+arr[0] => 1+1=2  a = 2, arr[1] = 1;
    eger 2>0 => arr[2] = 2, a = a + arr[1] => 2+1 = 3
    eger 3>0 => arr[3] = a=3, a = a+ arr[2] => 3+2 = =5  a= 5,  arr[3] = 3;

 */
