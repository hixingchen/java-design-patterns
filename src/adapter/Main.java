package adapter;

public class Main {
    public static void main(String[] args) {
        RectangleAdapter rectangleAdapter = new RectangleAdapter(new LegacyRectangle());
        rectangleAdapter.draw(10, 10, 100, 100);
    }
}
