package composite;

public class File implements FileSystemComponent{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("File: " + name);
    }
}