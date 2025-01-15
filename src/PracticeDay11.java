import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PracticeDay11 {

    static int removeDuplicates(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);
        }

//        set.forEach(System.out::println);
        int newSize = set.size();
        int j = 0;

        for (int i : set){
            arr[j++] = i;
        }

        return newSize;
    }

    static int removeDuplicatesOptimize(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return n;

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    static void printPattern(){

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printPattern2(){

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void printPattern3(){

        int start = 1;
        for (int i = 1; i <= 5; i++) {

            start = i % 2 == 0 ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void printPattern4(){

        int start = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(start+ " ");
                start++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,1,2,3,3,2,1,5};
        int[] arr2 = {1, 2, 2, 3, 4, 4, 4, 5, 5};

//        int k = removeDuplicatesOptimize(arr2);
//
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr2[i] + " ");
//        }

        printPattern4();
    }
}
