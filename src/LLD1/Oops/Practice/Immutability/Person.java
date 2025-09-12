package LLD1.Oops.Practice.Immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

final class Person {
    private final String name;
    private final Address address;
    private final List<Department> departments;
    private final Date dob;
    private final List<String> degrees;

    public Person(String name,
                  Address address,
                  List<Department> departments,
                  Date dob,
                  List<String> degrees) {
        this.name = name;

        // Deep copy for mutable fields
        this.address = new Address(address.getCity(), address.getState());

        this.departments = new ArrayList<>();
        for (Department d : departments) {
            this.departments.add(new Department(d.getDeptName()));
        }

        this.dob = new Date(dob.getTime()); // Defensive copy

        this.degrees = Collections.unmodifiableList(new ArrayList<>(degrees));
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getState()); // defensive copy
    }

    public List<Department> getDepartments() {
        List<Department> copy = new ArrayList<>();
        for (Department d : departments) {
            copy.add(new Department(d.getDeptName()));
        }
        return Collections.unmodifiableList(copy);
    }

    public Date getDob() {
        return new Date(dob.getTime()); // defensive copy
    }

    public List<String> getDegrees() {
        return degrees; // already unmodifiable
    }
}