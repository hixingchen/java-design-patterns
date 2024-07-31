package bridge;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing a square");
        color.applyColor();
    }
}
