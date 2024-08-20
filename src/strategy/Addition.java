package strategy;

public class Addition implements MathOperation{
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}
