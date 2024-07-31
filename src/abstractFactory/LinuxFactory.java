package abstractFactory;

public class LinuxFactory implements SoftwareFactory{
    @Override
    public OperatingSystem createOperatingSystem() {
        return new LinuxOs();
    }

    @Override
    public Application createApplication() {
        return new WordApplication();
    }
}
