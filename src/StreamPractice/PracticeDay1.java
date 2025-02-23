package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeDay1 {

    static void filterOddEven() {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        List<Integer> odds = listOfIntegers.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        List<Integer> evens = listOfIntegers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        for (int i : odds){
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i : evens){
            System.out.print(i + ",");
        }
    }

    static void removeDuplicates(){
        
    }

    static void sumOfNaturalNos(int n){

        int sum = IntStream.range(1, 11).sum();

        System.out.println(sum);
    }

//    static void reverseArray(int[] arr){
//
//        List<Integer> nums = new ArrayList<>(Collections.singleton(arr)).stream()
//    }

    public static void main(String[] args) {
        filterOddEven();

        
    }
}
