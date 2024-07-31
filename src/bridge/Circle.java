package bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
        color.applyColor();
    }
}
