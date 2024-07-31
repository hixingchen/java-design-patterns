package bridge;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    /**
     * 画图
     */
    abstract void draw();
}
