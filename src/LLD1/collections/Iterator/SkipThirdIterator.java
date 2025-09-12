package LLD1.collections.Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SkipThirdIterator<T> implements Iterator<T> {
    private List<T> list;
    private int cursor = 0;
    private int count = 0;

    public SkipThirdIterator(List<T> list){
        this.list = list;
    }

    @Override
    public boolean hasNext(){
        // Move cursor forward if next element is 3rd
        while (cursor < list.size() && (count + 1) % 3 == 0) {
            cursor++;
            count++; // skip this element
        }
        return cursor < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) throw new NoSuchElementException();
        T element = list.get(cursor);
        cursor++;
        count++;
        return element;
    }
}

