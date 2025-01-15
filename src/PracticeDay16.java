import java.util.Stack;

public class PracticeDay16 {

    static void reverseArray(int[] arr){

        int start = 0, end = arr.length - 1;

        while (start < end) {

            swap(arr, start, end);
            start++;
            end--;
        }

        for (int i : arr){
            System.out.print(i + ", ");
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverseWords(String sentence){
        StringBuilder sb = new StringBuilder(sentence.length());
        String[] temp = sentence.split("\\s");

        int start = 0, end = temp.length - 1;

        while (start < end) {
            swap(temp, start, end);
            start++;
            end--;
        }

        for (String i : temp){
            sb.append(i);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }

    static void swap(String[] arr, int start, int end){
        String temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {

//        int[] a = {45, 12, 56, 15, 24, 75, 31, 89};
//        int[] b = {1, 2, 3, 4, 5, 6};
//
//        for (int i : a){
//            System.out.print(i + ", ");
//        }

        System.out.println();

//        reverseArray(a);

        reverseWords("Welcome to geeks for geeks");
    }
}
