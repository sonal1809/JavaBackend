package LLD1.java8;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplier {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);

        Supplier<String> uuidSupplier = () -> UUID.randomUUID().toString();
        System.out.println(uuidSupplier.get());

    }
}


    public class ConsumerExample {
        public static void main(String[] args) {
            List<LLD1.java8.StreamAPI.Employee> employees = Arrays.asList(
                    new LLD1.java8.StreamAPI.Employee("John", 1500),
                    new LLD1.java8.StreamAPI.Employee("Alice", 2500)
            );

            Consumer<LLD1.java8.StreamAPI.Employee> raiseSalary = e -> e.salary *= 1.1;
            Consumer<LLD1.java8.StreamAPI.Employee> printEmployee = e -> System.out.println(e.name + " : " + e.salary);

            employees.forEach(raiseSalary.andThen(printEmployee));
        }
    }

    public class Employee{
        int salary;
        String name;

        public Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

