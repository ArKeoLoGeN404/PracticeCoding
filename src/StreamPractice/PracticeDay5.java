package StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeDay5 {


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "New York"));
        employees.add(new Employee(2, "Bob", "Los Angeles"));
        employees.add(new Employee(3, "Charlie", "New York"));
        employees.add(new Employee(4, "Diana", "Chicago"));


        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> "New York".equalsIgnoreCase(employee.getCity()))
                .collect(Collectors.toList());

        System.out.println(filteredEmployees);
    }
}
