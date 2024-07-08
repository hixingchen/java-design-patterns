package 抽象工厂模式;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
