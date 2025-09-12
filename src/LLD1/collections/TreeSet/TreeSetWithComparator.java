package LLD1.collections.TreeSet;


import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {
    public static void main(String[] args) {

        // Sort employees by id
        TreeSet<Employee> employees = new TreeSet<>(Comparator.comparingInt(e -> e.id));

        // Sort employees by name
        TreeSet<Employee> employees1 = new TreeSet<>(Comparator.comparing(e -> e.name));

        // Sort by salary Descending
        TreeSet<Employee> employees2 = new TreeSet<>(Comparator.comparingDouble((Employee e) -> e.salary).reversed());


        employees.add(new Employee(3, "Charlie", 5000));
        employees.add(new Employee(1, "Alice", 7000));
        employees.add(new Employee(2, "Bob", 6000));

        System.out.println(employees);

        employees1.add(new Employee(1, "Charlie", 5000));
        employees1.add(new Employee(2, "Alice", 7000));
        employees1.add(new Employee(3, "Bob", 6000));

        System.out.println(employees1);

        employees2.add(new Employee(3, "Charlie", 8000));
        employees2.add(new Employee(1, "Alice", 2000));
        employees2.add(new Employee(2, "Bob", 6000));

        System.out.println(employees2);

    }
}
