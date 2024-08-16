package mediator;

public interface ChatMediator {
    /**
     * 发送消息
     * @param message
     * @param user
     */
    void sendMessage(String message, User user);

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);
}
