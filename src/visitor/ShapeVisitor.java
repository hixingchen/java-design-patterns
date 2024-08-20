package visitor;

public interface ShapeVisitor {
    /**
     * 访问圆形
     * @param circle
     */
    void visit(Circle circle);

    /**
     * 访问矩形
     * @param rectangle
     */
    void visit(Rectangle rectangle);
}
