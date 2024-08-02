package proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        // 图像未加载，直到调用display()方法
        image.display();

        // 图像已加载，无需再次创建
        image.display();
    }
}
