package strategy;

public class Multiplication implements MathOperation{
    @Override
    public int operation(int a, int b) {
        return a * b;
    }
}
