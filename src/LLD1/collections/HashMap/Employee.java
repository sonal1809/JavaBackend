package LLD1.collections.HashMap;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    public Employee(int id , String name){
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;          // same object reference
        if (o == null || getClass() != o.getClass()) return false; // null or diff class

        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name); // combine fields
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
