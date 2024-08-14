package command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();

        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.pressButton();
    }
}
