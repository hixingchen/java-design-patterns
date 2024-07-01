package 工厂方法模式.示例一;

public class ShapeFactory {
    public Shape createShape(String shapeType){
        if ("circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if ("rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }
        return null;
    }
}
