package decorator;

public interface Coffee {
    /**
     * 获取咖啡价格
     * @return double
     */
    double cost();

    /**
     * 获取咖啡描述
     * @return String
     */
    String description();
}
