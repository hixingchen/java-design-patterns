package strategy;

public class Calculator {
    private MathOperation mathOperation;

    public void setMathOperation(MathOperation mathOperation){
        this.mathOperation = mathOperation;
    }

    public int calculate(int a, int b){
        if (mathOperation != null){
            return mathOperation.operation(a, b);
        }
        throw new IllegalStateException("No operation set");
    }
}
