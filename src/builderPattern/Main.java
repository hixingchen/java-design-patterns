package builderPattern;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.setSize("大").addCheese().addPepperoni().addBacon().build();
        System.out.println(pizza);
    }
}
