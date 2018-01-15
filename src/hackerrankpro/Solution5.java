package hackerrankpro;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<String> stringKeeper = new ArrayList<>();
        String input = scanner.next();
        int count = scanner.nextInt();
        for (char ch = 'a'; ch < 'z'; ch++) {
            list.add(ch);
        }
        for (int j = 0; j < input.length(); j++) {

            for (int l = 0, i = 0, k = count; l < input.length(); l++, i += count, k += count) {
                if (i > input.length() || k > input.length()) {
                    break;
                } else {
                    stringKeeper.add(input.substring(i, k));
                }
            }
            System.out.println(stringKeeper);
        }
        int i = 0, k = 0, l = 0;
        while (i < input.length()) {
            while (l < input.length()) {
                
            }
        }
    }
}
