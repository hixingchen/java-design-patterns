package 工厂方法模式.示例一;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape("circle");
        circle.draw();
        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();
    }
}
