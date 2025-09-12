package LLD1.collections.TreeSet.MoviesTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class client {
    public static void main(String[] args) {
        TreeSet<Movie> movies = new TreeSet<>(); // uses compareTo()

        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("Memento", 8.4, 2000));

        System.out.println("Movies sorted by year (Comparable):");
        for (Movie m : movies) {
            System.out.println(m);
        }


        TreeSet<Movie> moviesByName = new TreeSet<>(Comparator.comparing(Movie::getName));
        moviesByName.addAll(movies);

        System.out.println("\nMovies sorted by Rating (Comparator):");
        for (Movie m : moviesByName) {
            System.out.println(m);
        }

        TreeSet<Movie> moviesByRating = new TreeSet<>(Comparator.comparing(Movie::getRating));
        moviesByRating.addAll(movies);
    }
}
