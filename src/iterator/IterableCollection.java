package iterator;

public interface IterableCollection<T> {
    /**
     * 创建迭代器
     * @return
     */
    Iterator<T> createIterator();
}
