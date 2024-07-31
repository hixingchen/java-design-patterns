package builder;

public abstract class HouseBuilder {
    protected House house = new House();

    /**
     * 建造地基
     */
    public abstract void buildFoundation();

    /**
     * 建造结构
     */
    public abstract void buildStructure();

    /**
     * 建造内部
     */
    public abstract void buildInterior();

    /**
     * 建造屋顶
     */
    public abstract void buildRoof();

    public House getHouse() {
        return house;
    }
}
