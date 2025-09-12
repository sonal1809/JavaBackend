package LLD1.collections.TreeSet;

import java.util.TreeSet;

public class EmployeeWithComparableClient {
    public static void main(String[] args) {
        TreeSet<EmployeeWithComparable> set = new TreeSet<>();
        set.add(new EmployeeWithComparable(2, "Bob"));
        set.add(new EmployeeWithComparable(1, "Alice"));
        set.add(new EmployeeWithComparable(3, "Charlie"));

        System.out.println(set);
    }
}
