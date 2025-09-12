package LLD1.collections.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Range implements Iterable<Integer> {
    private final int start;
    private final int end;

    public Range(int start, int end) {
        if (end < start) throw new IllegalArgumentException("End must be >= start");
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = start;

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                if (!hasNext()) throw new NoSuchElementException();
                return current++;
            }
        };
    }
}

