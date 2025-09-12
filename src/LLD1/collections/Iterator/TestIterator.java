package LLD1.collections.Iterator;

import java.util.Arrays;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

        // Even-index elements
        AlternateIterator<Integer> evenItr = new AlternateIterator<>(numbers, true);
        System.out.print("Even-indexed: ");
        while (evenItr.hasNext()) {
            System.out.print(evenItr.next() + " ");
        }

        // Odd-index elements
        AlternateIterator<Integer> oddItr = new AlternateIterator<>(numbers, false);
        System.out.print("\nOdd-indexed: ");
        while (oddItr.hasNext()) {
            System.out.print(oddItr.next() + " ");
        }
    }
}


