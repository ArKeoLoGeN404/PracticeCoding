import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeDay2 {

    static void filterOdds(List<Integer> integers){
        System.out.println("Odd nos ====");

        integers.stream()
                .filter(i -> i % 2 != 0)
                .forEach(i -> System.out.print(i + " "));
    }

    static void filterEvens(List<Integer> integers){

        System.out.println("\n\nEven nos ====");

        integers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.print(i + " "));
    }

    static void removeDuplicates(List<String> strings){

        System.out.println("Remove duplicates :-");

        strings.stream()
                .distinct()
                .forEach(s -> System.out.print(s + ", "));
    }

    static void countFrequency(List<String> strings){

        System.out.println("Count Frequency :-");

        Map<String, Long> frequencies = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencies.forEach((k, v) -> {
            System.out.println(k + " :- " + v);
        });
    }

    static void joinStrings(List<String> strings){


        String joinedString = strings.stream()
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);
    }

    static void findManAndMin(List<Integer> integers){

        Optional<Integer> max = integers.stream()
                .max(Comparator.naturalOrder());

        Optional<Integer> min = integers.stream()
                .min(Comparator.naturalOrder());

        System.out.println(max.get());
        System.out.println(min.get());
    }


    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> listOfStrings2 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        findManAndMin(listOfIntegers);
    }
}
