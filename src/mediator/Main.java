package mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteChatMediator();
        User user1 = new User("Tom", mediator);
        User user2 = new User("Mary", mediator);
        User user3 = new User("Sam", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hi All");
    }
}
