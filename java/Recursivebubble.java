import java.util.*;

class Recursivebubble {

    public static void bubble(int[] arr, int n) {
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
        }

        bubble(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 8, 6, 9, 2 };
        int n = arr.length;

        bubble(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}