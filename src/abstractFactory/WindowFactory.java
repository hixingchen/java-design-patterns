package abstractFactory;

public class WindowFactory implements SoftwareFactory{
    @Override
    public OperatingSystem createOperatingSystem() {
        return new WindowsOs();
    }

    @Override
    public Application createApplication() {
        return new ExcelApplication();
    }
}
