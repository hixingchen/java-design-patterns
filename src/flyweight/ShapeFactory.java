package flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<Color, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(Color color) {
        Shape circle = circleMap.get(color);

        if(circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }
}
