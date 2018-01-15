package hackerrankpro;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<String> stringKeeper = new ArrayList<>();
        String input = scanner.next();
        int count = scanner.nextInt();
        for (char ch = 'a'; ch < 'z'; ch++) {
            list.add(ch);
        }
        int iKeeper = 0, lKeeper = 0, kKeeper = count;
        for (int j = 0; j < input.length(); j++) {

            for (int l = lKeeper, i = iKeeper, k = kKeeper; l < input.length(); l++, i += count, k += count) {
                if (i > input.length() || k > input.length()) {
                    break;
                } else {
                    stringKeeper.add(input.substring(i, k));
                }
            }
            //l count-a beraber olanda break, break olmasa, o eyni substringleri
            // add edecek
            if (lKeeper == count) {
                break;
            }
            iKeeper++;
            lKeeper++;
            kKeeper = count + iKeeper;

        }
        System.out.println(stringKeeper);
    }
}
