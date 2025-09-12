package LLD1.collections.TreeSet;


public class EmployeeWithComparable implements Comparable<EmployeeWithComparable> {
    int id;
    String name;

    public EmployeeWithComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(EmployeeWithComparable otherEmployee) {
        return this.id - otherEmployee.id;
    }
}

