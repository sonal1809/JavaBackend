package LLD1.collections.Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class AlternateIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int cursor;
    private int lastReturened = -1;

    public AlternateIterator(List<T> list , boolean startWithEven){
        this.list = list;
        this.cursor = startWithEven ? 0 : 1;
    }

    @Override
    public boolean hasNext(){
        return cursor < list.size();
    }

    @Override
    public T next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        lastReturened = cursor;
        cursor += 2;
        return list.get(lastReturened);
    }

    @Override
    public void remove(){
        if(lastReturened == -1){
            throw new IllegalArgumentException("next() not called or element already removed");
        }
        list.remove(lastReturened);

        // adjust cursor because list has shifted left
        if(lastReturened < cursor){
            cursor -= 1;
        }
        // reset lastReturned so remove() cannot be called twice consecutively
        lastReturened = -1;
    }

}
