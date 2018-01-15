package hackerrankpro;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            long k = 0;
            for (int i = 0; i < n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    k += i;
                }
            }
            System.out.println(k);
        }
        
        System.out.println(2|4);
        System.out.println(2&4);
        System.out.println(2^4);
        System.out.println(3|5);
        System.out.println(3^5);
    }
    
    
}
