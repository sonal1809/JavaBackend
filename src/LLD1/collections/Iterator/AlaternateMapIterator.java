package LLD1.collections.Iterator;

import java.util.*;

class AlternateMapIterator<K, V> implements Iterator<Map.Entry<K, V>> {
    private final List<Map.Entry<K, V>> entries;
    private int index;

    public AlternateMapIterator(Map<K, V> map, boolean startFromEven) {
        this.entries = new ArrayList<>(map.entrySet());
        this.index = startFromEven ? 0 : 1;
    }

    @Override
    public boolean hasNext() {
        return index < entries.size();
    }

    @Override
    public Map.Entry<K, V> next() {
        if (!hasNext()) throw new NoSuchElementException();
        Map.Entry<K, V> entry = entries.get(index);
        index += 2;
        return entry;
    }
}

