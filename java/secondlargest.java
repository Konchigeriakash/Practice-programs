import java.util.*;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 4, 8, 9, 6 };
        int n = arr.length;

        if (n < 2) {
            System.out.println(-1);
            return;
        }

        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > large) {
                secondlarge = large;
                large = arr[i];
            } 
            else if (arr[i] < large && arr[i] > secondlarge) {
                secondlarge = arr[i];
            }
        }

        if (secondlarge == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println("Largest: " + large);
            System.out.println("Second Largest: " + secondlarge);
        }
    }
}