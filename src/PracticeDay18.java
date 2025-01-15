public class PracticeDay18 {

    static int binarySearch(int[] arr, int target){

        int mid = -1, low = 0, high = arr.length - 1;

        while (low <= high){
            mid = (low + high) / 2;

            if (target == arr[mid])
                return mid;
            else if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    static void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {13,46,24,52,20,9};
//        int[] nums = {7, 5, 9, 2, 8};

//        System.out.println(binarySearch(nums, 7));

        bubbleSort(nums);

        for (int i : nums){
            System.out.print(i + ",");
        }
    }
}
