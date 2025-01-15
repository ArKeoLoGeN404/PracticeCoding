import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeDay1 {

    //Given a list of integers, separate odd and even numbers?
    private static List<Integer> evenIntegers(List<Integer> integers){

        return integers.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> oddIntegers(List<Integer> integers){

        return integers.stream()
                .filter(s -> s % 2 != 0)
                .collect(Collectors.toList());
    }

    // remove duplicate
    private static List<String> distinctStrings(List<String> strings){

        return strings.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // find frequency of each character in a string
    private static void frequencyOfStrings(String string){

        String inputString = "Java Concept Of The Day";

        Map<Character, Long> charCountMap =
                inputString.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
    }

    static void reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    // find the largest number in an array
    static int largestNo(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        return largest;
    }

    // check if a given number is prime
    static void primeNo(int num){

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }


    static void primeNo2(int num){

//        boolean isPrime = true;
        if (num % 6 == 5 || num % 6 == 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        int[] intergers = {71, 18, 42, 21, 67, 32, 95, 14, 56, 87};

//        System.out.println("even: " + evenIntegers(listOfIntegers));
//        System.out.println("odd: " + oddIntegers(listOfIntegers));
//        System.out.println("distinct string: " + distinctStrings(listOfStrings));
//        reverseString("qwerty");
        for (int a : intergers) {
            primeNo(a);
        }

        System.out.println("---------------");

        for (int a : intergers) {
            primeNo2(a);
        }

        Double s = Math.sqrt(35);

        System.out.println(s.intValue());
    }
}
