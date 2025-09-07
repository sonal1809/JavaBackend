package LLD1.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();

        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(1, "John"); // logically same as e1

        map.put(e1, "Developer");
        map.put(e2, "Manager");

        System.out.println(map.size()); // ✅ Output: 1
        System.out.println(map);        // {Employee{id=1, name='John'}=Manager}
    }
}
