package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.cost() + ", Description: " + coffee.description());

        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: $" + coffee.cost() + ", Description: " + coffee.description());

        coffee = new SugarDecorator(coffee);
        System.out.println("Cost: $" + coffee.cost() + ", Description: " + coffee.description());
    }
}
