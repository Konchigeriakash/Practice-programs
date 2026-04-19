import java.lang.reflect.Array;
import java.util.*;

public class mergesort {

    public void mergesrt(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else
                temp.add(arr[right++]);

        }
        while (left <= mid)
            temp.add(arr[left++]);

        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    }

    public void merge(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;

        merge(arr, low, mid);
        merge(arr, mid + 1, high);

        mergesrt(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int[] arr = { 9, 3, 6, 8, 2, 5 };
        int low = 0;
        int high = arr.length - 1;

        mergesort sol = new mergesort();
        sol.merge(arr, low, high);

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}