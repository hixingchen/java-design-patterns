package strategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setMathOperation(new Addition());
        System.out.println(calculator.calculate(1, 2));

        calculator.setMathOperation(new Subtraction());
        System.out.println(calculator.calculate(3, 2));

        calculator.setMathOperation(new Multiplication());
        System.out.println(calculator.calculate(1, 2));
    }
}
