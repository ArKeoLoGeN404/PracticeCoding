package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeDay2 {

    static void removeDuplicates(){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> filteredList = listOfStrings.stream()
                .distinct()
                .collect(Collectors.toList());

        filteredList.forEach(System.out::println);
    }

    static void findFrequencyInString(){
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> countMap = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);
    }

    static void findFrequencyInArray(){
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> countMap = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);
    }

    public static void main(String[] args) {

        findFrequencyInArray();
    }
}
