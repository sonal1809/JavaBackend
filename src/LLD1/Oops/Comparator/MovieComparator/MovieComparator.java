package LLD1.Oops.Comparator.MovieComparator;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {

        int compareYear = Integer.compare(m2.getYear() , m1.getYear());
        if(compareYear != 0){
            return compareYear;
        }

//        String implements Comparable<String>, so it has a natural ordering (lexicographical).
//        That’s why we can call compareTo() directly on String to compare names in ascending order.
        // If years are same → compare by name (ascending)
        return m1.getName().compareTo(m2.getName());
    }
}
