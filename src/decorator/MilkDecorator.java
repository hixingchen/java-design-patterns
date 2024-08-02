package decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double cost() {
        return super.cost() + 1.0;
    }
    @Override
    public String description() {
        return super.description() + " with Milk";
    }
}
