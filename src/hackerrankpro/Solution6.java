package hackerrankpro;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {
        //for input
        Scanner scanner = new Scanner(System.in);
        //to keep all letters including big and little case
        ArrayList<Character> list = new ArrayList<>();
        //keep substrings of input
        ArrayList<String> stringKeeper = new ArrayList<>();
        String input = scanner.next();
        //to indicate how many times we should subtring a String
        int count = scanner.nextInt();

        //adding big case letters to list
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            list.add(ch);
        }
        //adding little case letters to list
        for (char ch = 'a'; ch <= 'z'; ch++) {
            list.add(ch);
        }
        // int lKeeper and j is for counting and cutting a String
        //int iKeeper is first char of String
        //int kKeeper count-a beraber olmaqla hem i hem de k count qeder artir ki,
        //string-in count defe novbeti tekrar olmayan hisselerini her defe kesib goture bilsin
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
            //1-ci char-dan basla, sonra kec 2-ci chardan basla, sonra kec3-cu chardan basla
            iKeeper++;
            //ikinci chardan baslayanda l artir cunki artiq birinci yoxlamisq
            lKeeper++;
            //kkeeper-i de count qeder ve evvelki ozu qederin cemi ile artirirq ki, 
            // novbeti stringleri kesib gotursun
            kKeeper = count + iKeeper;

        }
        //yeni array yaradiriq ki Stringlerin char-lari ile rahat isleyek
        String arr[] = new String[stringKeeper.size()];
        //array-i initialize edirik substringle
        for (int i = 0; i < stringKeeper.size(); i++) {
            arr[i] = stringKeeper.get(i);
        }
        //evvelceden kesilmis arraydaki substringlerin ilk ve novbeti charlarini elde etmekcundur
        int counter = 0;
        //bu ise Bubble sorting-dir ki biz herfleri muqayise ederek herf indeksi 
        //en boyuk olanla en kicik olan stringi array-da siraliyaq
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1, k = 0; j < arr.length; k++, j++) {
                //eger 0-ci substringin ilk char 1-ci substringin ilk char-nin indeksinden boyukdurse
                //0-ci ile 1-cinin yerin deyis
                if (list.indexOf(arr[k].charAt(counter)) > list.indexOf(arr[j].charAt(counter))) {
                    String temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    counter = 0;
                    //eger 0-ci substringin ilk chari ile 1-ci substringin ilk chari beraberdirse
                    //eyni substringlerin novbeti charlarini muqayise etmekcundur ve bu qayidir ilk if-e
                } else if ((list.indexOf(arr[k].charAt(counter)) == list.indexOf(arr[j].charAt(counter)))) {
                    k--;
                    j--;
                    counter++;
                    //eger 0-ci stringin ilk char-i 1-ci stringin ilk charindan balacadirsa, prosese davam ele
                } else if (list.indexOf(arr[k].charAt(counter)) < list.indexOf(arr[j].charAt(counter))) {
                    counter = 0;
                    continue;
                }
            }
        }
        //kicik ve boyuk indeksli substringleri print ele
        System.out.println(arr[0] + "\n" + arr[arr.length - 1]);
    }
}
