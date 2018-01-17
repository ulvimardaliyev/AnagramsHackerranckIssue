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
            // add edecek, yeni count bitenden sonra tekrarlanma olacaq
            if (lKeeper == count) {
                break;
            }
            iKeeper++;
            lKeeper++;
            kKeeper = count + iKeeper;

        }
        //System.out.println(stringKeeper);
        String arr[] = new String[stringKeeper.size()];
        for (int i = 0; i < stringKeeper.size(); i++) {
            arr[i] = stringKeeper.get(i);
        }
        int counter = 0;
//        for (String klo : arr) {
//            System.out.println(klo);
//        }
        //System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1, k = 0; j < arr.length; k++, j++) {
//                System.out.println(arr[k].charAt(counter) + " " + arr[j].charAt(counter));
//                System.out.print(list.indexOf(arr[k].charAt(counter)) + " " + list.indexOf(arr[j].charAt(counter)));
//                System.out.println("");
                if (list.indexOf(arr[k].charAt(counter)) > list.indexOf(arr[j].charAt(counter))) {
                    String temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    counter = 0;
                } else if ((list.indexOf(arr[k].charAt(counter)) == list.indexOf(arr[j].charAt(counter)))) {
                    k--;
                    j--;
                    counter++;

                } else if (list.indexOf(arr[k].charAt(counter)) < list.indexOf(arr[j].charAt(counter))) {
                    counter = 0;
                    continue;
                }
            }
            //System.out.println("");
        }
//        for (String kl : arr) {
//            System.out.print(kl + " ");
//        }
        //System.out.println("");
        //System.out.println(arr.length);
        System.out.println(arr[0] + "\n" + arr[arr.length - 1]);
    }
}
