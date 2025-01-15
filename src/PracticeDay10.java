import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeDay10 {

    static void filterOdd(List<Integer> integers){

        List<Integer> odds = integers.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        odds.forEach(System.out::println);
    }

    static void filterEven(List<Integer> integers){

        List<Integer> odds = integers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        odds.forEach(System.out::println);

    }

    static void removeDuplicates(){

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> filteredStrings = listOfStrings.stream()
                .distinct()
                .collect(Collectors.toList());

        filteredStrings.forEach(System.out::println);
    }

    static void findFrequency(){

        String inputString = "Java Concept Of The Day";

        Map<Character, Long> countChar = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countChar);
    }

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

//        filterEven(listOfIntegers);

        findFrequency();
    }
}
