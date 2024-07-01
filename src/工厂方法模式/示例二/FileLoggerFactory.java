package 工厂方法模式.示例二;

public class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
