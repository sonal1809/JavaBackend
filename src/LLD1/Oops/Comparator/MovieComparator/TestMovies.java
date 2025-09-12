package LLD1.Oops.Comparator.MovieComparator;

import java.util.*;

public class TestMovies {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Interstellar", 2014, 8.6));
        movies.add(new Movie("Inception", 2010, 8.8));
        movies.add(new Movie("Dunkirk", 2017, 7.9));
        movies.add(new Movie("Tenet", 2020, 7.5));
        movies.add(new Movie("Memento", 2000, 8.4));
        movies.add(new Movie("Inception", 2020, 9.0)); // duplicate year to test name sort

        Collections.sort(movies, new MovieComparator());

        System.out.println("Sorted Movies:");
        for (Movie m : movies) {
            System.out.println(m);
        }

        // Stream
//        movies.sort(
//                Comparator.comparing(Movie::getYear).reversed()
//                        .thenComparing(Movie::getName)
//        );

    }
}

