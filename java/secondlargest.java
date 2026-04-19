import java.util.*;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 4, 8, 9, 6 };
        int n=arr.length;

         if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1); 
            
            return;
        }

       int large=Integer.MIN_VALUE;
       int secondlarge=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
       large=Math.max(large,arr[i]);

       if(arr[i]>secondlarge && arr[i]!=large){
        secondlarge=arr[i];
       }
}
        System.out.println(large);
        System.out.println(secondlarge);
    }
}