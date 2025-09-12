package LLD1.Oops.Comparator.StudentComparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1 , Student s2){

        // First compare marks (ascending)
        if (s1.getMarks() < s2.getMarks()) {
            return -1;
        } else if (s1.getMarks() > s2.getMarks()) {
            return 1;
        }

        // If marks are same, compare age (ascending)
        if (s1.getAge() < s2.getAge()) {
            return -1;
        } else if (s1.getAge() > s2.getAge()) {
            return 1;
        }

        // If both same, compare name (ascending)
        return s1.getName().compareTo(s2.getName());
    }
}
