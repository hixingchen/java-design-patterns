package 抽象工厂模式;

public class WindowsTextField implements TextField{
    @Override
    public void display() {
        System.out.println("显示windows风格的文本框");
    }
}
