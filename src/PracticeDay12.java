import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeDay12 {

    static void findFrequency(){

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> countElements = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countElements);
    }

    static void sortDecimalReverse(){

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> sorted = decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }

    static void joinStrings(){

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joined = listOfStrings.stream()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(joined);
    }

    static void printMultiples(){

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> result = listOfIntegers.stream()
                .filter(i -> i % 5 == 0)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    static void findMaxAndMin(){

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream()
                .max(Comparator.naturalOrder()).get();

        int min = listOfIntegers.stream()
                .min(Comparator.naturalOrder()).get();

        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {

        findMaxAndMin();
    }
}
