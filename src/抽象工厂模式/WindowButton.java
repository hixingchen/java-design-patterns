package 抽象工厂模式;

public class WindowButton implements Button{
    @Override
    public void render() {
        System.out.println("渲染windows风格的按钮");
    }
}
