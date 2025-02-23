package StreamPractice;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeDay9 {

    static void summarizingStatistics(List<Integer> numbers){

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println(stats);
    }

    static void convertToUppercase(List<String> strings){

        List<String> res = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(res);
    }

    static void filterEmployees(List<Employee> employees){

        Map<String, Integer> resMap = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary,
        (oldValue, newValue) -> oldValue,LinkedHashMap::new));

        System.out.println(resMap);
    }


    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> strings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "New York", 1000));
        employees.add(new Employee(2, "Bob", "Los Angeles", 5000));
        employees.add(new Employee(3, "Charlie", "New York", 3000));
        employees.add(new Employee(4, "Diana", "Chicago", 4000));

//        summarizingStatistics(nums);
//        convertToUppercase(strings);
        filterEmployees(employees);
    }
}
