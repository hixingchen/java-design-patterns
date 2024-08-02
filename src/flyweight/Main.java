package flyweight;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
        for (int i = 0; i < 20; i++) {
            Color randomColor = colors[(int) (Math.random() * colors.length)];
            Shape circle = ShapeFactory.getCircle(randomColor);
            circle.draw(i * 10, i * 10);
        }
    }
}
