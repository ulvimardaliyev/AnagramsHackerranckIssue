package hackerrankpro;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<String> stringKeeper = new ArrayList<>();
        String input = scanner.next().toLowerCase();
        int count = scanner.nextInt();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            list.add(ch);
        }
        int iKeeper = 0, lKeeper = 0, kKeeper = count;
        for (int j = 0; j < input.length(); j++) {

            for (int l = lKeeper, i = iKeeper, k = kKeeper; l < input.length(); l++, i += count, k += count) {
                if (i > input.length() || k > input.length()) {
                    break;
                } else {
                    if (!stringKeeper.contains(input.substring(i, k))) {
                        stringKeeper.add(input.substring(i, k));
                    }
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
        String arr[] = new String[stringKeeper.size()];
        for (int i = 0; i < stringKeeper.size(); i++) {
            arr[i] = stringKeeper.get(i);
        }

        for (int i = 1, y = 0, keepZero = 0; i < arr.length; y++, i++) {

            if (list.indexOf(arr[i].charAt(keepZero)) > list.indexOf(arr[y].charAt(keepZero))) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }

        }
    }
}
//            System.out.println(i + " " + y);
//            System.out.println("i " + i + " " + list.indexOf(arr[i].charAt(keepZero)) + " " + arr[i].charAt(0));
//            System.out.println("y " + y + " " + list.indexOf(arr[y].charAt(keepZero)) + " " + arr[y].charAt(0));
