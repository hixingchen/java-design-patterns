package composite;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory dir = new Directory("dir");
        File file = new File("file");
        root.addComponent(dir);
        root.addComponent(file);
        root.displayInfo();
    }
}
