package factoryPattern.exampleTwo;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("记录日志到数据库"+message);
    }
}
