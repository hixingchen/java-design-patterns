package visitor;

public interface Shape {
    /**
     * 接受访问者
     * @param visitor
     */
    void accept(ShapeVisitor visitor);
}
