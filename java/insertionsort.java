public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 0, 9 };

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
        for (int k : arr) {
            System.out.println(k + " ");
        }
    }
}