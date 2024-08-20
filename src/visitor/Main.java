package visitor;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(2);
        circle.accept(areaCalculator);

        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.accept(areaCalculator);

        System.out.println(areaCalculator.getArea());
    }
}
