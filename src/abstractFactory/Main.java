package abstractFactory;

public class Main {
    public static void main(String[] args) {
        SoftwareFactory windowsFactory = new WindowFactory();
        windowsFactory.createOperatingSystem().run();
        windowsFactory.createApplication().open();

        SoftwareFactory linuxFactory = new LinuxFactory();
        linuxFactory.createOperatingSystem().run();
        linuxFactory.createApplication().open();
    }
}
