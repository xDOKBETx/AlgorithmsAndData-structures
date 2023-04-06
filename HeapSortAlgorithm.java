public class HeapSortAlgorithm {
   public static void main(String[] args) {

       int[] arr = {1, 7, 15, 18, 3, 9, 11, 4, 13, 2};
       int len = arr.length;

       view_arr(arr);
       for (int i = len-1; i >= 0; i--) {
           HeapSort (arr, len, i);

       }

       view_arr(arr);

       // меняеем i0 и iend
       swap(arr, 0, len-1);

       while (len > 2) {
           len--;
           HeapSort (arr, len, 0);
           swap(arr, 0, len-1);
       }
       view_arr(arr);
   }

   static void HeapSort (int[] arr, int len, int i) {
       int max_i = i;

       if (i*2+1 <= len-1) {
           if (arr[i] < arr [i*2+1]) {
               max_i = i*2+1;
           }
           if (i*2+2 <= len-1) {
               if (arr[max_i] < arr [i*2+2]) {
                   max_i = i*2+2;
               }
           }
       }

       if (max_i != i) {
           swap(arr, i, max_i);
           HeapSort(arr, len, max_i);
       }

   }

   static void swap (int arr[],int i, int max_i) {
       int temp = arr [i];
       arr [i] = arr [max_i];
       arr [max_i] = temp;
   }

   static void view_arr (int arr[]) {
       for (int item : arr) {
           System.out.printf("%3d", item);
       }
       System.out.println();
   }


}