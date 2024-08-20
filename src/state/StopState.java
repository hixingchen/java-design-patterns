package state;

public class StopState implements ElevatorState{
    private Elevator elevator;

    public StopState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        System.out.println("电梯门已打开");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门正在关闭...");
        // 假设关门后电梯会开始移动，这里简化处理为直接切换到上升状态
        setElevatorState(new MoveState(elevator));
    }

    @Override
    public void move() {
        System.out.println("电梯在停止状态，不能移动");
    }

    @Override
    public void stop() {
        System.out.println("电梯处于停止状态");
    }

    @Override
    public void setElevatorState(ElevatorState elevatorState) {
        elevator.setState(elevatorState);
    }
}
