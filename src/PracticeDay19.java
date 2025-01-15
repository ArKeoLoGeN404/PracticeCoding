import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeDay19 {

    static void sortByLength(){

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        List<String> sortedList = listOfStrings.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }

    static void findSumAndAvg(int[] nums){

        int sum = Arrays.stream(nums).sum();
        double avg = Arrays.stream(nums).average().getAsDouble();

        System.out.println(sum);
        System.out.println(avg);
    }

    static void findSumAndAvg(List<Integer> nums){

        int sum = nums.stream().mapToInt(Integer::intValue).sum();

        double avg = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.println(sum);
        System.out.println(avg);
    }

    static void findCommonElements(){

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> commonElements = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        commonElements.forEach(System.out::println);
    }

    static void reverseWord(){
        String str = "Java";

        String reversed = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversed);
    }

    public static void main(String[] args) {
        int[] a = {45, 12, 56, 15, 24, 75, 31, 89};
        List<Integer> nums = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

//        findSumAndAvg(a);
//        findSumAndAvg(nums);

        reverseWord();
    }
}
