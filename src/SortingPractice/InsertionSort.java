package SortingPractice;

public class InsertionSort {

    static void insertionSort(int[] arr){

        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {

            for (int j = i; j > 0; j--) {
                if (arr[j-1] > arr[j])
                    swap(arr, j, j-1);
            }
        }
    }

    static void sort(int[] arr, int n){
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sortRecursive(int[] arr, int i, int n){

        if (n == i) return;

        for (int j = i; j > 0; j--) {
            if (arr[j-1] > arr[j])
                swap(arr, j, j-1);
        }

        sortRecursive(arr, i + 1, n);
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};
//        insertionSort(arr);
        sortRecursive(arr, 0, arr.length);

        for (int i : arr){
            System.out.print(i + ",");
        }
    }
}
