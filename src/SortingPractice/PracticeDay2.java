package SortingPractice;

public class PracticeDay2 {

    static void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    min = j;
            }

            swap(arr, i, min);
        }
    }

    static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j-1, j);
                j--;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        insertionSort(arr);

        for (int i : arr){
            System.out.print(i + ", ");
        }
    }
}
