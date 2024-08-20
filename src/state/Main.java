package state;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.openDoor();
        elevator.closeDoor();
        elevator.move();
        elevator.stop();
    }
}
