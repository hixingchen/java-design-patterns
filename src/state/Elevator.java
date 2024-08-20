package state;

public class Elevator {
    private ElevatorState elevatorState;

    public Elevator() {
        elevatorState = new StopState(this);
    }

    public void openDoor() {
        elevatorState.openDoor();
    }

    public void closeDoor() {
        elevatorState.closeDoor();
    }

    public void move() {
        elevatorState.move();
    }

    public void stop() {
        elevatorState.stop();
    }

    public void setState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }
}
