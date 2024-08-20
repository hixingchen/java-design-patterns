package state;

public interface ElevatorState {
    /**
     * 打开电梯门
     */
    void openDoor();

    /**
     * 关闭电梯门
     */
    void closeDoor();

    /**
     * 电梯移动
     */
    void move();

    /**
     * 停止电梯
     */
    void stop();

    /**
     * 设置电梯状态
     * @param elevatorState
     */
    void setElevatorState(ElevatorState elevatorState);
}
