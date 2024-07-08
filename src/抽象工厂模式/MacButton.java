package 抽象工厂模式;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("渲染Mac风格的按钮");
    }
}
