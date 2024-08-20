package state;

public class MoveState implements ElevatorState{
    private Elevator elevator;

    public MoveState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        System.out.println("电梯在移动状态，不能开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯在移动状态，已经关门");
    }

    @Override
    public void move() {
        System.out.println("电梯在移动状态");
    }

    @Override
    public void stop() {
        System.out.println("电梯正在停止...");
        setElevatorState(new StopState(elevator));
    }

    @Override
    public void setElevatorState(ElevatorState elevatorState) {
        elevator.setState(elevatorState);
    }
}
