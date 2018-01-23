package hackerrankpro;

import java.util.Scanner;

public class BubbleSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        System.out.println("Array is sorted in " + num(a) + " swaps."
                + "\n" + "First Element: " + a[0]
                + "\n" + "Last Element: " + a[n - 1]);
    }

    public static int num(int[] arr) {
        //Sorting time = count
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
