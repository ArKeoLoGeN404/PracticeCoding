package StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeDay4 {

    static void checkAnagram(){
        String s1 = "Race Car";
        String s2 = "Car Race";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if (s1.equals(s2)){
            System.out.println("Given strings are anagram");
        }else {
            System.out.println("Given strings are not anagram");
        }
    }

    static void sumOfDigits(){
        int i = 15623;

        int sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        int sum2 = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sum);
        System.out.println(sum2);
    }

    static void secondLargest(){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int secondMax = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondMax);
    }

    static void sortStrings(){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> sortedList = listOfStrings.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }

    static void findCommonElements(){
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> common = list1.stream().filter(list2::contains).collect(Collectors.toList());

        System.out.println(common);
    }

    static void reverseWord(){

        String str = "Java Concept Of The Day";

        String joined = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(joined);
    }

    public static void main(String[] args) {

        reverseWord();
    }

}
