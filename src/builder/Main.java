package builder;

public class Main {
    public static void main(String[] args) {
        Director director;
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        director = new Director(concreteHouseBuilder);
        System.out.println(director.constructHouse());

        HouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        director = new Director(luxuryHouseBuilder);
        System.out.println(director.constructHouse());
    }
}
