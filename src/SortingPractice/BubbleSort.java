package SortingPractice;

public class BubbleSort {


    static void sort(int[] arr){

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }

    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sortRecursive(int[] arr, int n){

        if (n == 1) return;

        for (int j = 0; j < n - 1; j++) {

            if (arr[j] > arr[j+1]) {
                swap(arr, j, j + 1);
            }
        }

        sortRecursive(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
//        sort(arr);
        sortRecursive(arr, arr.length);

        for (int i : arr){
            System.out.print(i + ",");
        }
    }
}
