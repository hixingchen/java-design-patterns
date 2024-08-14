package iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> items;
    private int index = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public T next() {
        if (hasNext()){
            return items.get(index++);
        }
        return null;
    }
}
