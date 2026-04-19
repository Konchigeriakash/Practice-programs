public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 9, 2, 6, 8, 1 };
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int k : arr) {
            System.out.print(k + "");
        }
    }

}
