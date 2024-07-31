package builder;

public class ConcreteHouseBuilder extends HouseBuilder{
    @Override
    public void buildFoundation() {
        house.setFoundation("Standard Foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Standard Structure");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Standard Interior");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Standard Roof");
    }
}
