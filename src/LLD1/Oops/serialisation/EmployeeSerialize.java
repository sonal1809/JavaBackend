package LLD1.Oops.serialisation;

import java.io.Serializable;

public class EmployeeSerialize implements Serializable {
    private static final long serialVersionId = 1L;    // Version control

    private String name;
    private int age;
    private transient String password;

    // transient keyword → Excludes a field from serialization.
   //  Static fields are not serialized (since they belong to the class, not the object).

    public EmployeeSerialize(String name , int age , String password){
        this.name = name;
        this.age = age;
        this.password = password;
    }

}
