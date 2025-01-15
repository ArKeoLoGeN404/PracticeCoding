package StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeDay3 {

    static void countFrequency(){

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> countMap = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);
    }

    static void sortNumbers(){

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> sortedList = decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }

    static void joinStrings(){

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedStr = listOfStrings.stream()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(joinedStr);
    }

    static void printMultiples(){

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream()
                .filter(i -> i % 5 == 0)
                .forEach(System.out::println);
    }

    static void findMaxAndMin(){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        long max = listOfIntegers.stream()
                .max(Comparator.naturalOrder())
                .get();

        long min = listOfIntegers.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(max);
        System.out.println(min);
    }

    static void findThreeMaxAndMin(){

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> max = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        List<Integer> min = listOfIntegers.stream()
                .sorted(Comparator.naturalOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {

        findThreeMaxAndMin();
    }
}
