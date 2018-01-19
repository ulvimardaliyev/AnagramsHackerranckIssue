package hackerrankpro;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next().toLowerCase();
        String b = scanner.next().toLowerCase();
        scanner.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        ArrayList<Character> list = new ArrayList<>();
        
        return true;
    }
}
