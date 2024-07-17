package 原型模式;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape cloneCircle = circle.clone();
        cloneCircle.draw();

        Shape rectangle = new Rectangle();
        Shape cloneRectangle = rectangle.clone();
        cloneRectangle.draw();
    }
}
