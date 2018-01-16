package hackerrankpro;

public class Sorting {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 6, -1, 11, 0, 8};
        int yeniArr[] = arr;
        int temp;
        for (int k = 0; k < arr.length; k++) {
            for (int i = 1, j = 0; i < arr.length; j++, i++) {

                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
        for (int a : yeniArr) {
            System.out.print(a + " ");
        }
    }
}
