package iterator;

public interface Iterator<T> {
    /**
     * 是否有下一个元素
     * @return boolean
     */
    boolean hasNext();

    /**
     * 下一个元素
     * @return T
     */
    T next();
}
