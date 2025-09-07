package LLD1.java8.StreamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDeptClient {
    public static void main(String[] args) {
        List<EmployeeDept> employees = Arrays.asList(
                new EmployeeDept("Alice", "Engineering", 30),
                new EmployeeDept("Bob", "Engineering", 20),
                new EmployeeDept("Charlie", "HR", 15),
                new EmployeeDept("David", "Sales", 25),
                new EmployeeDept("Eva", "Sales", 40)
        );


        // How would you determine the department with the highest number of commits given a
        // class of Employee objects with commit history?

        // Step 1: Group by department and sum commits
        Map<String, Integer> deptCommits = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDept::getDepartment,
                        Collectors.summingInt(EmployeeDept::getCommits)
                ));

        // Step 2: Find department with max commits
        String topDept = deptCommits.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No Department");

        System.out.println("Department with highest commits: " + topDept);



        // Sum of even numbers

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)    // keep only even numbers
                .mapToInt(Integer::intValue) // convert to IntStream
                .sum();
    }
}
