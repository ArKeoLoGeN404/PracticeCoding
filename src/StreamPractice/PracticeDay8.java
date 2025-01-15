package StreamPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeDay8 {

    static void findEven(int[] arr){

        List<Integer> evens = Arrays.stream(arr)
                .boxed()
                .filter(i -> i %2 == 0)
                .collect(Collectors.toList());

        System.out.println(evens);

    }

    static void filterStartWithOne(int[] arr){

        List<String> filtered = Arrays.stream(arr)
                .boxed()
                .map(i -> i + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(filtered);

    }

    static void findDuplicates(int[] arr){

        Set<Integer> set = new HashSet();
        List<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .filter(i -> !set.add(i))
                .collect(Collectors.toList());

        System.out.println(duplicates);
    }

    static void findMaxAndAndMin(int[] arr){

       int max = Arrays.stream(arr)
                .boxed()
                .max(Integer::compare)
                .get();

        int min = Arrays.stream(arr)
                .boxed()
                .min(Integer::compare)
                .get();

        System.out.println(max);
        System.out.println(min);
    }

    static void findNonRepeatedChar(String str){
        String input = "Java articles are Awesome";

        List<Character> chars = input.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .collect(Collectors.toList());

        System.out.println(chars);
    }

    static void printCurrentDateAndTime(){

        System.out.println("Current Local Date: " + java.time.LocalDate.now());

        //Used LocalDate API to get the date
        System.out.println("Current Local Time: " + java.time.LocalTime.now());
        //Used LocalTime API to get the time
        System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
        //Used LocalDateTime API to get both date and time
    }

    static void concatinateStreams(){

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> stream = Stream.concat(list1.stream(), list2.stream());

        List<String> mergedList = stream.collect(Collectors.toList());

        System.out.println(mergedList);

    }

    static void performCube(){
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);

        List<Double> res = integerList.stream()
                .map(i -> Math.pow(i, 3))
                .filter(i -> i > 50)
                .collect(Collectors.toList());

        System.out.println(res);
    }

    public static void main(String[] args) {

        int[] arr = {10,15,8,49,25,98,98,32,15};

//        findMaxAndAndMin(arr);

//        findNonRepeatedChar("");
//        printCurrentDateAndTime();
//        concatinateStreams();
        performCube();
    }
}
