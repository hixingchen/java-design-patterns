package prototype;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Circle");

        Shape cloneShape = shape.clone();
        cloneShape.setType("Cloned Circle");

        System.out.println("Original Shape Type: "+shape.getType());
        System.out.println("Cloned Shape Type: "+cloneShape.getType());
    }
}
