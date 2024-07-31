package abstractFactory;

public class LinuxOs implements OperatingSystem{
    @Override
    public void run() {
        System.out.println("Linux OS is running");
    }
}
