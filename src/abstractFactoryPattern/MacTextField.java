package abstractFactoryPattern;

public class MacTextField implements TextField{
    @Override
    public void display() {
        System.out.println("渲染Mac风格的文本框");
    }
}
