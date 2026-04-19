public class largestelement {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 9, 8, 2, 4 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.println("largest=" + largest);
    }

}
