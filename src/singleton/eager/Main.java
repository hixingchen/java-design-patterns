package singleton.eager;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("这是一条日志信息");
    }
}
