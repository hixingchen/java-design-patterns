package builder;

public class LuxuryHouseBuilder extends HouseBuilder{
    @Override
    public void buildFoundation() {
        house.setFoundation("Luxury Foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Luxury Structure");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Luxury Interior");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Luxury Roof");
    }
}
