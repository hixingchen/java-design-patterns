package 单例模式.懒汉单例;

public class Logger {
    private static Logger instance;

    private Logger(){};

    //懒汉单例多线程可能有问题，所以使用synchronized保证安全
    public static synchronized Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("日志记录:"+message);
    }
}
