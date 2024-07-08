package 抽象工厂模式;

public class Client {
    public static void main(String[] args) {
        GUIFactory windowGUIFactory = new WindowsGUIFactory();
        Button windowButton = windowGUIFactory.createButton();
        TextField windowsText = windowGUIFactory.createTextField();

        GUIFactory macFactory = new MacGUIFactory();
        Button macButton = macFactory.createButton();
        TextField macTextField = macFactory.createTextField();

        windowButton.render();
        windowsText.display();

        macButton.render();
        macTextField.display();
    }
}
