package factoryPattern.exampleTwo;

public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
