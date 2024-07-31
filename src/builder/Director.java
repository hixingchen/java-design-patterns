package builder;

public class Director {
    private HouseBuilder houseBuilder;
    public Director(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse(){
        houseBuilder.buildFoundation();
        houseBuilder.buildInterior();
        houseBuilder.buildRoof();
        houseBuilder.buildStructure();
        return houseBuilder.getHouse();
    }
}
