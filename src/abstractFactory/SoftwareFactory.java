package abstractFactory;

public interface SoftwareFactory {

    /**
     * 创建操作系统
     * @return OperatingSystem
     */
    OperatingSystem createOperatingSystem();

    /**
     * 创建应用程序
     * @return Application
     */
    Application createApplication();
}
