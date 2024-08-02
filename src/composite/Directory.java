package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{

    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.displayInfo();
        }
    }
}
