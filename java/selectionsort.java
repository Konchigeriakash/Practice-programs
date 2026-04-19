public class selectionsort {

    public void selectionsorta(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k : arr) {
            System.out.print(arr);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 5, 1, 6, 7 };
        for (int i : arr) {
            System.out.print(arr);
        }

        selectionsorta(arr);
    }

}
