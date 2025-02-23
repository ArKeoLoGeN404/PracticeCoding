package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeDay10 {

    static void countWords(List<String> strings){
        Map<String, Long> resMap = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(resMap);

    }

    static void findDuplicateWords(List<String> strings){
        Map<String, Long> resMap = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(resMap);

    }

    static void countCharacter(String str){

        Map<String, Long> resMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(resMap);
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        String s = "aabbccd";
        countCharacter(s);

    }
}
