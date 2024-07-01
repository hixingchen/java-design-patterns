package 工厂方法模式.示例二;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("记录日志到文件："+message);
    }
}
