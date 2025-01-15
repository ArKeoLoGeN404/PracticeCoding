import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeDay14 {

    static void mergeArray(int[] arr1, int[] arr2){

        int[] arr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .distinct()
                .toArray();

        for (int i : arr){
            System.out.println(i);
        }
    }

    static void findMaxAndMin() {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream()
                .max(Comparator.naturalOrder())
                .get();

        int min = listOfIntegers.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(max);
        System.out.println(min);

    }

    static void findThreeMaxAndThreeMin() {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> max = listOfIntegers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        List<Integer> min = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(max);
        System.out.println(min);

    }

    static void checkAnagrams(){
        String s1 = "listen";
        String s2 = "silent";

        s1 = Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        s2 = Stream.of(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        System.out.println(s1.equals(s2));
    }

    static void sumOfAllDigits(){
        int i = 12345;

        int s = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(s);
    }

    static void findSecondLargest(){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int secondMax = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondMax);
    }

    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 5, 1};

        int[] b = new int[] {8, 1, 9, 5};

        sumOfAllDigits();
    }
}
