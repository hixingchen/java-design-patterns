package memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        System.out.println("Current state: " + originator.getState());

        caretaker.setMemento(originator.createMemento());

        originator.setState("State 2");
        System.out.println("Current state: " + originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println("Current state: " + originator.getState());
    }
}
