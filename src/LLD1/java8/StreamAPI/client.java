package LLD1.java8.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class client {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rahul", 31, 2000));
        employees.add(new Employee("Shanu", 29, 1500));
        employees.add(new Employee("Gita", 28, 1800));


        List<Employee> sortedEmployeeOnSalary = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        sortedEmployeeOnSalary.forEach(employee -> System.out.println(employee.getName()));
        System.out.println(sortedEmployeeOnSalary);

        employees.forEach(emp ->
                emp.setSalary(emp.getSalary() * (1.1))
        );
        System.out.println(employees);

        Employee empWithMaxSal = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No Employee found"));

        System.out.println(empWithMaxSal);


        Employee emp = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Employee found"));


        Optional<Employee> empOpt = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst();

        empOpt.ifPresent(System.out::println);


        // create a new list of employee with increased salary
        double incrementPercent = 10.0; // Example 10%

        List<Employee> incremented = employees.stream()
                .map(emp1 -> new Employee(
                        emp1.getName(),
                        emp1.getAge(),
                        emp1.getSalary() * (1 + incrementPercent / 100)
                ))
                .toList();

        System.out.println("After Increment: " + incremented);


        // Print the names of employee whose salary is above 2000

        employees.stream()
                .filter(employee -> employee.getSalary() > 2000)
                .map(Employee::getName)
                .forEach(System.out::println);


    }
}
