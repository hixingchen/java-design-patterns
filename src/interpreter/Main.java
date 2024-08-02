package interpreter;

public class Main {
    public static void main(String[] args) {
        AddExpression addExpression = new AddExpression(new NumberExpression(1), new SubtractExpression(new NumberExpression(3), new NumberExpression(2)));
        int res = addExpression.interpret();
        System.out.println(res);
    }
}
